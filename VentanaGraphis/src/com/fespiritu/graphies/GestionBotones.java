package com.fespiritu.graphies;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionBotones implements ActionListener {
	MiVentana ventana;

	public GestionBotones (MiVentana ventana){
		this.ventana= ventana;
	}

	public void actionPerformed (ActionEvent e){
		String accion = e.getActionCommand();

		if (accion.equals("feliz")){
			ventana.panelDibujo.a = -1;
            ventana.panelDibujo.b = -90;
            ventana.panelDibujo.repaint();
		
		} else if (accion.equals("Triste")){
			ventana.panelDibujo.a = 1;
            ventana.panelDibujo.b = 90;
            ventana.panelDibujo.repaint();
            }  

	}
}
