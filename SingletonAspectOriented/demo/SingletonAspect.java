package main.java.com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SingletonAspect {

    private static TestClass instance;

    @Around("call(main.java.com.example.TestClass.new(..))")
    public Object getInstance(ProceedingJoinPoint pjp) throws Throwable {

        if (instance == null) {
            instance = (TestClass) pjp.proceed();
        } 

        return instance;
    }
}