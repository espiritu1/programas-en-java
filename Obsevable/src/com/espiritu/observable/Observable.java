package com.espiritu.observable;

public class Observable {
	
	public abstract void addOnserver(Observer o);
	
	public abstract void removeOnserver(Observer o);
	
	public abstract void notifyOnserver();
	
	

}
