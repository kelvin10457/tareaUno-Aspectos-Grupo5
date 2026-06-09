package com.example;

public class Main {
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        Adaptador adaptador = new Adaptador(servicio);
        Client cliente = new Client(adaptador);

        System.out.println("Iniciando prueba del patrón Adapter:");
        cliente.doRequest();
    }
}