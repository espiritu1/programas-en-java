package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;


import Modelo.Modelo;

import javax.swing.JScrollPane;

public class Ventana  extends JFrame{
	
	JTable JTAutos;
	JComboBox jcCliente;
	
	public Ventana () {

		super("Tabla Carros para rentar"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setBounds(200,200,800,500);
		
		JTAutos = new JTable ();
		JScrollPane sp = new JScrollPane(JTAutos);
		Modelo m = new Modelo();
		
		jcCliente = new JComboBox(m.getTransportes());  
		
		
		
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(new JLabel ("Transsportes XD"));
		jp.add(jcCliente);
		
		this.add(jp,BorderLayout.NORTH);
		this.add(sp,BorderLayout.CENTER);
		this.setVisible(rootPaneCheckingEnabled);
		
		
		
		
	}

}

