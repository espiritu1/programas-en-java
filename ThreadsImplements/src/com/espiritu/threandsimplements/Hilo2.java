package com.espiritu.threandsimplements;

public class Hilo2 implements Runnable{
	
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
