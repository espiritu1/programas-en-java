package com.espiritu.dibujoXD;


import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiVentana extends JFrame {
	
	public JButton b1 = new JButton("feliz");
	public JButton b2 = new JButton("Triste");
	public JPanel  panelBotones = new JPanel();
	public MiPanel  panelDibujo = new MiPanel();
	
	public MiVentana(String dibujo ,int x, int y, int ancho, int alto) {
		
		super(dibujo);
	    this.setBounds(x,y,ancho, alto);
		this.setLayout(new BorderLayout());
		
		panelDibujo.setBackground(Color.WHITE);
		GestionBotones gb = new GestionBotones(this);
		
		
		this.add(panelBotones, BorderLayout.NORTH);
	    this.add(panelDibujo, BorderLayout.CENTER);

	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
	}
}
