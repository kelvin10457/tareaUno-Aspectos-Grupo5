package main.java.com.example;

public class Singleton {

    private static Singleton instance;
    //atributoos propios 

    private Singleton(){
        System.out.println("Creando instancia única");
    }

    public static Singleton getInstance(){

        if(instance == null) {
            instance = new Singleton();

        }

        return instance;
    }

    //metodos propios

}