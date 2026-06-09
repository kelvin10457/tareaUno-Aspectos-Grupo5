package com.example;

public class Prueba {
    public static void main(String[] args) {
        
        //modulo 1 
        Singleton instancia1 = Singleton.getInstance();

        //modulo2
        Singleton instancia2 = Singleton.getInstance();

        //comprobamos que son la misma 
        if(instancia1==instancia2){
            System.out.println("Son el mismo objeto");
        }
    }
}