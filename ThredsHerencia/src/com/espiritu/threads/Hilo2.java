package com.espiritu.threads;

public class Hilo2 extends Thread {
	
	public Hilo2 (String nombre) {
		super (nombre); // darle nombe al hilo
	}
	
	public void run() {
		for(int i =0 ; i>-100; i--) {
			System.out.println (i+ " : "+ Thread.currentThread().getName());
			
			try {
				Thread.sleep(20);
				
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
		}
		
	}

}
