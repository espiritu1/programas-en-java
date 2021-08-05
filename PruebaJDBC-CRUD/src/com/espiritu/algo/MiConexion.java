package com.espiritu.algo;


import java.awt.BorderLayout;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Vector;



public class MiConexion {

	
	public Vector getDataVector() {
		
		Vector clientes = null;
		
		try {
			Connection con = SingleConection.getInstance();
			clientes = new Vector();
		
			Statement st = con.createStatement();
		
			String consulta =" SELECT *  from transportes";
		
			ResultSet rs =st.executeQuery(consulta);
		
		while(rs.next()) {
			Vector aux = new Vector();
			aux.addElement(rs.getInt("id"));
			aux.addElement(rs.getInt("anio"));
			aux.addElement(rs.getInt("asientos"));
			aux.addElement(rs.getString("marca"));
			aux.addElement(rs.getString("placa"));
			
			
			clientes.add(aux);
		}
	
		
		//CRUD Create Read Update Delete 
		

	}
	catch (SQLException e) {
	
		e.printStackTrace();
	} 	
		return clientes;
	}
	
	public Vector getNombres() {
		
		Vector nombres = new Vector();
		
		nombres.add("id:");
		nombres.add("anio:");
		nombres.add("asientos:");
		nombres.add("marca");
		nombres.add("placa");
		
		return nombres;
	}

}
