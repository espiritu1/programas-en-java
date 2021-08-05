package  com.espiritu.algo;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConection {
	
private static Connection con = null;

	private SingleConection() {	
	}

	public static Connection getInstance() {
		if (con == null) {
			try {
				// hacer una instance del objeto
				String URL ="jdbc:mysql://localhost:3306/transporte_2021"; //transporte_2021 es el nmobre de la base de datos
				String USER ="vespertino";// nombre de usuario creado por mi podrias ocupar root
				String PASSWORD ="123456"; // password qeu yo le asisne a usuario y podrias dejarlo vacio""
				Class.forName ("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(URL,USER,PASSWORD);
				if (con != null) {
					System.out.println("Se establecio la coneccion");
				}
			
			}catch(Exception e) {
				System.out.print(e);
				//e.printStackTrace(); para el debug
				
			}
			System.out.print("Conectado");	
		}
		return con;
	}

}
