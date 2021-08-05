package com.espiritu.ventana;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	public JButton bt = new JButton("mostrar texto");
	public JTextField textf = new JTextField();
	public JLabel label= new JLabel("................");
	
	
	public Ventana(String titulo,int x,int y,int ancho ,int alto){
		super("---mi segunda ventaña---");
		this.setBounds(x,y,ancho,alto);
		this.setLayout(null);
		
		label.setBounds(150,130,100,30);
		bt.setBounds(150,200,150,30);
		textf.setBounds(150,70,100,30);
		
		GestionBoton gb = new GestionBoton(this);// con el this enviamos toda la ventana
		this.add(bt);
		this.add(textf);
		this.add(label);
		
		
		//visualizar el contenedor
		this.setVisible(true);
		
		
		
		
	}


	



}
