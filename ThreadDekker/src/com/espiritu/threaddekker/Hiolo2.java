package com.espiritu.threaddekker;

public class Hiolo2 implements Runnable{
	
	Turno t;
	
	public Hiolo2(Turno t) {
		
		this.t=t;
		
	}
	
	public void run() {
		
		while(true) {
			while(this.t.getTurno()==1)
				regionCritica();
						
		}
	}	
	
	public void regionCritica() {
		
		for(int i = 0 ; i > - 100; i--) {
			
			System.out.println (i+ " : "+ Thread.currentThread().getName());
			
			
		}
		this.t.setTurno(0);
				
	}
}
