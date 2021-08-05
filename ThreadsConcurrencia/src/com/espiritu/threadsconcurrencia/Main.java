package com.espiritu.threadsconcurrencia;

public class Main {
	public static void main(String[] args) {
		
		Tarea t1 = new Tarea();
		Thread h1 = new Thread(t1,"hilo1");
		Thread h2 = new Thread(t1,"hilo2");
		Thread h3 = new Thread(t1,"hilo3");
		Thread h4 = new Thread(t1,"hilo4");
		Thread h5 = new Thread(t1,"hilo5");
		Thread h6 = new Thread(t1,"hilo6");
		
		h1.start();
		h2.start();
		h3.start();	
		h4.start();	
		h5.start();	
		h6.start();	
	}

}
