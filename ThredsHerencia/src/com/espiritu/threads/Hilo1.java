package com.espiritu.threads;


public class Hilo1 extends Thread {
	
	public Hilo1 (String nombre) {
		super (nombre);
	}
	
	public void run() {
		for(int i =0 ; i<100; i++) {
			System.out.println (i+ " : "+ Thread.currentThread().getName());
			try {
				Thread.sleep(200);
				
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
			
			
		}
		
	}

}
