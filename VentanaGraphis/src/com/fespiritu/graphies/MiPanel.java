package com.fespiritu.graphies;
import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.Color;

public class MiPanel extends JPanel {

    int a= -1;
    int b=-90;

    public void paintComponent(Graphics g){
      super.paintComponent(g);
      //dibujo cabeza
      g.setColor(Color.YELLOW);
      g.fillOval(100,100,250,250);

      //ojos
      g.setColor(Color.BLACK);
      g.fillOval(160,180,50,50);
      g.fillOval(260,180,50,50);

      g.setColor(Color.RED);
      g.drawArc(150,220,150,80,a,b);    
    }
}
