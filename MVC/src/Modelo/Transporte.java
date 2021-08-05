package Modelo;

public class Transporte {
	private int id;
	private int anio;
	private int asientos;
	private String marca;
	private String placa;
	
	public Transporte () {
		
	}
	
	public Transporte (int id, String placa) {
		this.id =id;
		this.placa = placa;
		
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
	
	
	public String toString() {
		return placa;
		
	}
	
	
	

}
