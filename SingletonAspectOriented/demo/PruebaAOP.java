package main.java.com.example;

public class PruebaAOP {
    public static void main(String[] args) {
        TestClass instance1 = new TestClass();
        TestClass instance2 = new TestClass();

        //comprobamos que son la misma 
        if(instance1==instance2){
            System.out.println("Son el mismo objeto");
        }
    }
}
