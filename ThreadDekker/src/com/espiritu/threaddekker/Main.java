package com.espiritu.threaddekker;



public class Main {

	public static void main(String[] args) {
		
		Turno t= new Turno();
		
		Hilo1 h1 = new Hilo1(t);
		Hiolo2 h2 = new Hiolo2(t);
		
		Thread t1 = new Thread(h1, "pos");
		Thread t2 = new Thread(h2, "neg");
		
		t1.start();
		t2.start();

	}

}
