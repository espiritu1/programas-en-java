
public class Alumno extends Persona {

	private String matricula;
	private double calif;
	
	
	private Alumno() {}
	
	private Alumno(int edad, String nombre, double calif, String matricula) {
		
		super(edad, nombre);
		this.calif=calif;
		this.matricula=matricula;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getCalif() {
		return calif;
	}

	public void setCalif(double calif) {
		this.calif = calif;
	}
	
	public String toString() {
		return super.toString +" matricula: "+this.matricula+" calificaciones: "+ this.calif;
	}
	
	
	
	
}
