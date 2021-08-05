package com.espiritu.BD2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static final String URL="jdbc:mysql://localhost:3306/transporte_2021";
	public static final String USER="vespertino";
	public static final String PASSWORD="123456";


	public static void main(String[] args) {
		
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
			Statement st = con.createStatement();
			
			String consulta = "SELECT * from transportes";
			ResultSet rs = st.executeQuery(consulta);
			while(rs.next()) {
				System.out.println(	"\n   Id: "		+ rs.getInt("id")+
									"    Año: "		+ rs.getInt("anio")+
								 	"    Asientos: "+ rs.getInt("asientos")+
								 	"    Marca: "	+ rs.getString("marca")+
								 	"    Placa: "	+ rs.getString("placa"));

			}
			rs.close();
			con.close();

		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		//System.out.println("conectado XD");
	}

		
		

	}

