package com.espiritu.observable;

public class ConcreteObservable implements Observable {
	
	private Observer observers[] = new Observer[3];
	
	
	
	public void addOnserver (Observer ox) {
		//agregar observers al areglo 
	
	}
	public void removeOnserver (Observer oa) {
		
		//quitarobservers al areglo
		
	}
	public void notifyOnserver () {
		
		//ciclo que recorreo el areglo observers[] y mand a ejecutar el matodo
		// HandleEvent de cada objeto observador
		
	}

}
