package com.espiritu.threandsimplements;

public class Hilo1 implements Runnable{
	
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
