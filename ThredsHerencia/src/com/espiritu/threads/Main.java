package com.espiritu.threads;

public class Main {

	public static void main(String[] args) {
		Hilo1 h1= new Hilo1("positivo");
		Hilo2 h2= new Hilo2("negativo");
		
		h1.start();
		h2.start();

	}

}
