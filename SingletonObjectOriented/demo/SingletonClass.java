package main.java.com.example;

public class SingletonClass {

    private static SingletonClass instance;
    //atributoos propios 

    private SingletonClass(){
        System.out.println("Creando instancia única");
    }

    public static SingletonClass getInstance(){

        if(instance == null) {
            instance = new SingletonClass();

        }

        return instance;
    }

    //metodos propios

}
