package com.espiritu.ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GestionBoton implements ActionListener{
	
	Ventana ventana;
	
	
	public GestionBoton(Ventana ventana) {
		this.ventana=ventana;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		String s = ventana.textf.getText();
		ventana.label.setText(s);
	}
	
}
