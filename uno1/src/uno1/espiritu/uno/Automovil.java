package uno1.espiritu.uno;

public class Automovil {
	
	
	private String marca;
	private String modelo;
	private int anio;
	private int numSerie;
	private int precio;

	public Automovil(){

	}
	
	public Automovil(String marca,String modelo,int anio,int numSerie,int precio) {
		
		this.marca =marca;
		this.modelo =modelo;
		this.anio =anio ;
		this.numSerie= numSerie;
		this.precio= precio;
	}

	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		
		return 
		"\n::autos::" + 
		"\n marca:   "+getMarca()+
		"\n modelo:   "+getModelo()+
		"\n anio:   "+getAnio()+
		"\n nomero de serie:   "+getNumSerie()+ 
		"\n precio:   "+getPrecio();
		
		
	}
	
	

}
