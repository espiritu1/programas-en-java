
public class Reflexion2 {
	
	public static void main(String[] args) {
		Reflexion2 r2 = new Reflexion2();
		
		Class p =Profesor.class;
		r2.printClase(p);
		
	}
	
	public void printClase (Class xc) {
		System.out.println("el nmobre de las clase es "+ xc.getName());
		System.out.println("el nmobre de las clase es "+ xc.getSuperclass().getName());
		
	}
	
	
	
	

}
