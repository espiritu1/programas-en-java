package Modelo;

import java.awt.BorderLayout;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class MiConexion {


	/*public static void main(String[] args) {
		
		
		JFrame ventana = new JFrame("Mi JTable");
		ventana.setBounds(100, 100, 800, 400);
		ventana.setLayout(new BorderLayout())  ;
		
		MiConexion mc = new MiConexion();
		
		JTable jt = new JTable(mc.getDataVector(),mc.getNombres());
		JScrollPane sp = new JScrollPane(jt);
		ventana.add(sp, BorderLayout.CENTER);
		ventana.add(new JLabel("Datos Clientes"), BorderLayout.NORTH);
		
		ventana.setVisible(true);
		
	}
	public Vector getDataVector() {
		
		Vector clientes = null;
		
		try {
		
		Connection con = SingleConnection.getInstance();
		clientes = new Vector();
		
		Statement st = con.createStatement();
		
		String consulta =" SELECT * from transportes";
		
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
		
		rs.close();
		
		con.close();
		
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
	}*/

}
