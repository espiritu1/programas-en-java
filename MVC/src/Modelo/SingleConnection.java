package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
private static Connection con = null;
	
	private SingleConnection() {
		
	}
	
	public static Connection getInstance() {
		
		if (con == null) {
			
			try {
			// hacer una instance del objeto
			String URL ="jdbc:mysql://localhost:3306/transporte_2021";
			String USER ="vespertino";
			String PASSWORD ="123456";
			
			Class.forName ("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			
			}catch(Exception e) {
				System.out.print(e);
				
			}
			System.out.print("Conectado");
			
		}
		
		return con;
		
		
	}

}
