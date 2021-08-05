 import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Reflexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// tener un ubjeto class
		Class c = Persona.class;
		
		
		// conocer los campos de la clase
		
		for ( Field f : c.getDeclaredFields()) {
		
			System.out.println("for --1--"+f.getName());
			
		}
		
		for(Constructor con : c.getDeclaredConstructors()) {
			System.out.println("for---2---" +con.getName()+
					"el nombre de parametros es:  "+
					con.getParameterCount());
		}
		
		
		for (Constructor m: c.getDeclaredMethods()) {
			System.out.println("for--3--"+"Nombre: "+ m.getName()+
						" dato retures: "+ m.getReturnType().getTypeName());
		}
		

	}
}
