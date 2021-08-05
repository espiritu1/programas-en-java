package com.espiritu.algo;


public class Carro {
	private int id;
	private int anio;
	private int asientos;
	private String marca;
	private String placa;
	
	public Carro() {
		
	}
	
	public Carro(int id,int anio,int asientos,String marca,String placa) {
		this.id =id;
		this.anio =anio;
		this.asientos =asientos;
		this.marca =marca;
		this.placa =placa;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public int getAsientos() {
		return asientos;
	}


	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		
		return"\n ::CARRO::"+
			"\n id: "		+	getId()+
			"\n añio: "	+	getAnio()+
			"\n asientos: "+ 	getAsientos()+
			"\n marca: "	+	getMarca()+
			"\n placa: "	+	getPlaca();
		
		
	}
	
	
	
	
}












