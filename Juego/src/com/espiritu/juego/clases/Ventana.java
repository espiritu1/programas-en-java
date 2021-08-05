package com.espiritu.juego.clases;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Ventana extends JFrame {
	
 	Panel panel;
	
		
	public Ventana ( String pong, int x,  int y,  int ancho,  int alto){
		super(pong);
		panel = new Panel();
	

		this.setBounds(x,y,ancho, alto);

	    this.setLayout(new BorderLayout());

		

			
	
	    this.add(panel,BorderLayout.CENTER);
		

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    this.setVisible(true);
	    
	    while (true){
		
	    	panel.moverTodo();
	    	panel.repaint();
		    
	      try{
	      Thread.sleep(3);
	      } catch (final InterruptedException e){
	      System.out.println(e);
	      }
	    }
	  }
}

