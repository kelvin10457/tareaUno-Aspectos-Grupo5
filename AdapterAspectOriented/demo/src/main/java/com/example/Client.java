package com.example;

public class Client {
    // El cliente hace una petición marcada con @Adapt; el aspecto la interceptará y la adaptará
    @Adapt
    public void doRequest() {
        System.out.println("Client: doRequest ejecutado (cuerpo opcional)");
    }
}
