package singletonJDBC;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main{
	
	
	
public static void main(String[] args) {
		
		
		JFrame ventana = new JFrame("Mi JTable");
		ventana.setBounds(100, 100, 800, 400);
		ventana.setLayout(new BorderLayout());
		MiConexion mc = new MiConexion();
		
		JTable jt = new JTable(mc.getDataVector(),mc.getNombres());
		JScrollPane sp = new JScrollPane(jt);
		ventana.add(sp, BorderLayout.CENTER);
		ventana.add(new JLabel("Datos Clientes"), BorderLayout.NORTH);
		
		ventana.setVisible(true);
		
	}
	
}

