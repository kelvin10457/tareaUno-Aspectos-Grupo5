package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AdapterAspect {

    @Around("@annotation(com.example.Adapt)")
    public Object adapt(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("AdapterAspect: interceptando llamada y adaptando a Servicio...");

        // Aquí se realiza la adaptación: traducir la petición genérica a la petición específica
        Servicio servicio = new Servicio();
        servicio.peticionEspecifica();

        // No llamar a pjp.proceed() para evitar la ejecución del método original si se desea
        return null;
    }
}
