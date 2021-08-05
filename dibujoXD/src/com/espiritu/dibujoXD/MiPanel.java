package com.espiritu.dibujoXD;
import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.Color;


public class MiPanel extends JPanel  {
	
			
	
	 public void paintComponent(Graphics g){
	      super.paintComponent(g);
	      
	      //g.fillOval(100,100,160,200);
	      int xv [] = {100, 160, 20, 100};
	      int yv [] = {50, 80, 200, 60}; 
	      g.fillPolygon (xv, yv, 3); 
	      	
	      
	      int xv2 [] = {160, 200, 350, 100};
	      int yv2 [] = {70,170, 200, 100}; 
	      g.fillPolygon (xv2, yv2, 3); 
	  
	  		      
	      

	       
	     // Draws the outline of a circular or elliptical arc covering the specified rectangle.
	      
	 
	 
	 
	 }
}
