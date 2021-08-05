package com.espiritu.juego.clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionMenu implements ActionListener  {
    Ventana ventana;

    public GestionMenu (Ventana ventana){
        this.ventana= ventana;
    }

    
    public void actionPerformed (ActionEvent e){

        String accion = e.getActionCommand();

        if(accion.equals("load")) {
			System.out.println("*beep boop* you loaded a file");
		}
        if(accion.equals("exit")) {
			System.exit(0);
		}


    
    }


}
    
