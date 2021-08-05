package com.espiritu.juego.clases;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.RenderingHints;


public class Panel extends JPanel { 
  
	Raqueta raqueta1;
	Pelota pelota; 
	Raqueta raqueta2;

    public Panel(){

        raqueta1 = new Raqueta(this);
        pelota = new Pelota(this);
    }

    public void moverTodo (){

      pelota.moverPelota();
      raqueta1.moverRaqueta1();
      
    }

    public void paintComponent(Graphics g){
      super.paintComponent(g);
      setBackground(Color.gray); 
      
      
      Graphics2D g2 = (Graphics2D)g;
      g2.setColor(Color.BLACK); 
      

      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      
      raqueta1.pintarRaqueta(g2);
      pelota.pintarPelota(g2);
      
     
     
    }



}














