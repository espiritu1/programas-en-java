
public class Profesor extends Persona{
	private int NumPersonal;
	private double salario =10.5;
	
	public Profesor() {
		
	}
	public Profesor(int edad, String nombre,int NumPersonal) {
		super(edad, nombre);
		this.NumPersonal=NumPersonal;
	}
	
	
	
	public int getNumPersonal() {
		return NumPersonal;
	}
	public void setNumPersonal(int numPersonal) {
		NumPersonal = numPersonal;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	private String metodoprivado() {
		return "el salario del maestro"+super.getNombre()+"es: " this.salario;
	}
	
	private String metodoprivado2(int num String cadena) {
		retur num+ cadena
		
	}
	

}
