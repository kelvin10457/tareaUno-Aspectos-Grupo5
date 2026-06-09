package main.java.com.example;

public class Adaptador implements Comportamiento {
    Servicio servicio;

    public Adaptador(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public void peticion() {
        System.out.println("Adaptador: adaptando petición y llamando al servicio...");
        servicio.peticionEspecifica();
    }
}
