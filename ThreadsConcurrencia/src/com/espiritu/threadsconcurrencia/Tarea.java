package com.espiritu.threadsconcurrencia;

public class Tarea implements Runnable {
	
	Acceso ac;
	
	public Tarea(){
		ac = new Acceso();
	}
	
	public void run() {
		
		synchronized (ac) {// sincroniza los accesso empezando por el hilo1 
			int vActual = ac.getCont();
			vActual++;
			ac.setCont(vActual);
			
			System.out.println("Total de accesso "+
								ac.getCont() /*+vActual*/
								+" por : "+ Thread.currentThread().getName());
		}
	}			
}
		


