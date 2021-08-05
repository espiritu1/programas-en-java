package com.espiritu.threaddekker;

public class Turno {
	
	int v= 0;

	

	public void setTurno(int v) {
		this.v = v;
	}
	
	public int getTurno() {
		return v;
	}
	
	public String toString(){
		return this.v+"_mm";
	}
	


}
