package com.espiritu.threaddekker;

public class Hilo1 implements Runnable{
	
	Turno t;
	public Hilo1 (Turno t) {
		this.t=t;
		
	}
	
	public void run() {
		
		while(true) {
			
			while(this.t.getTurno()==0)
				regionCritica();
				
		}
	}	
	
	public void regionCritica() {
		
		for(int i =0 ; i<100; i++) {
			
			System.out.println (i+ " : "+ Thread.currentThread().getName());
			
		}
		this.t.setTurno(1);
		
	}

}
