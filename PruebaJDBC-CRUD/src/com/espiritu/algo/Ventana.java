package com.espiritu.algo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class Ventana extends JFrame{
	 JPanel panelWest = new JPanel();
	 JPanel panelEast = new JPanel();

	 

	 
	 JLabel anioL = new JLabel("año");
	 JTextField anioT = new JTextField(20); //////////////
	 
	 JLabel asientosL = new JLabel("asientos");
	 JTextField asientosT = new JTextField(20);////////////7
	 
	 JLabel marcaL = new JLabel("marca");
	 JTextField marcaT = new JTextField(20);/////////////7
	 
	 JLabel placaL = new JLabel("placa");
	 JTextField placaT = new JTextField(20);/////////////////7

	 JLabel idL = new JLabel("id");
	 JTextField idT = new JTextField(20);/////////////////7 
	 
		 
	 JButton GUARDAR = new JButton("agregar");
	 JButton BORRAR = new JButton("borrar");
	 JButton ACTUALIZAR = new JButton("actualiar");
	 
	public Ventana(String dibujo ,int x, int y, int ancho, int alto) {
		 super(dibujo);
		    this.setBounds(x,y,ancho, alto);
			this.setLayout(new BorderLayout());
			
			panelWest.add(anioL);
			panelWest.add(anioT);
			panelWest.add(asientosL);
			panelWest.add(asientosT);
			panelWest.add(marcaL);
			panelWest.add(marcaT);
			panelWest.add(placaL);
			panelWest.add(placaT);
			panelWest.add(GUARDAR);
			
			panelEast.add(idL);
			panelEast.add(idT);
			panelEast.add(BORRAR);
			
			panelEast.add(ACTUALIZAR);
	
			
			GestionBoton gb = new GestionBoton(this);
			
			 GUARDAR.addActionListener(gb);
			 BORRAR.addActionListener(gb);
			 ACTUALIZAR.addActionListener(gb);
			
			this.add(panelWest, BorderLayout.NORTH);
			this.add(panelEast, BorderLayout.CENTER);	
		
		    this.setVisible(true);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}