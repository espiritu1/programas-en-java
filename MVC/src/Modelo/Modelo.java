package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
public class Modelo {

	
	public ResultSet getResultSrollabel (int id) {
		
	
		ResultSet r = null;
		Connection c = null;
		 
		try {
			c = SingleConnection.getInstance();
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String query = "Select * FROM transporte_2021.transportes WHERE ="+id;
			
			r = s.executeQuery(query);
			
		}catch(SQLException e){
			
		}
		
		return r;
		
	}
	
	public Vector getTransportes() {
		
		Vector transportes = null;
		Connection c = null;
		c = SingleConnection.getInstance();
		
		transportes = new Vector();
		transportes.add(new Transporte(-1,"selecciona el placa"));
		
		try {
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM transporte_2021.transportes ");
			
			while(rs.next());
				transportes.add(new Transporte(rs.getInt("id"), rs.getString("placa")));	
				
			
			}catch(SQLException e) {
			
		}
		
		return transportes;
	}
	
	
}
