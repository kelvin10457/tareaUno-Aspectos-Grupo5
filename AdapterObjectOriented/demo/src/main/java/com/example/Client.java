package main.java.com.example;

public class Client {
	private Comportamiento comportamiento;

	public Client(Comportamiento comportamiento) {
		this.comportamiento = comportamiento;
	}

	public void doRequest() {
		System.out.println("Client: solicitando acción al comportamiento...");
		comportamiento.peticion();
	}
}
