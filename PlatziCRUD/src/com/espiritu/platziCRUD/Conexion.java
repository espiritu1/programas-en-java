package com.espiritu.platziCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	
	public Connection getConnection() {
		Connection conection = null;
		try {
			conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transporte_2021","vespertino","123456");
			
			if(conection != null){
				System.out.println("se conecto ");
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		return conection;
		
	}

}
