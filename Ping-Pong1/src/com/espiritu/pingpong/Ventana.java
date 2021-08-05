package com.espiritu.pingpong;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana  extends JFrame{ 
	
    public JPanel barraN = new JPanel();
    public JPanel areaJuegoC = new JPanel();

    public JButton boton0 = new JButton("barra de menu ");
	public JButton boton1 = new JButton("area de juego");
	
	public Ventana(String pong, int x, int y, int ancho, int alto){
		super(pong);
		this.setBounds(x,y,ancho, alto);
		this.setLayout(new BorderLayout());
		

		areaJuegoC.setLayout(new BorderLayout());
		barraN.setLayout(new BorderLayout());
		
		
		areaJuegoC.add(boton1);
		barraN.add(boton0);
		
		
		
		this.add(barraN,BorderLayout.NORTH);
		this.add(areaJuegoC,BorderLayout.CENTER);
		
		this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	

}
