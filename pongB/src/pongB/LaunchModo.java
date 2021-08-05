package pongB;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.BorderLayout;

public class LaunchModo extends JFrame implements ActionListener   {
	
	
	JPanel panel1 = new JPanel();
	JButton  j1 = new JButton("1 jugador");
	
	JButton  j2 = new JButton("2 jugadores");
	
	 public LaunchModo(String pong,int x, int y, int ancho, int alto){
		 super(pong);
		 
		 j1.setFocusable(false);
		 j1.addActionListener(this);
		 j1.setFont(new Font(null, Font.PLAIN,25)); //necesito otra vercio nde java
		 
		 
		 j2.setFocusable(false);
		 j2.addActionListener(this);
		 j2.setFont(new Font(null, Font.PLAIN,25));
		
		 
		
		 panel1.add(j1);
		 panel1.add(j2);
		
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setBounds(x,y,ancho, alto);
		 this.setLayout(new BorderLayout());
		 this.setVisible(true);
		
	    this.add(panel1,BorderLayout.CENTER);
	   
	}
	
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==j1) {
			 this.dispose();
			 UnoVsPc  unovspc = new UnoVsPc();
			 
		 }
		 if(e.getSource()==j2) {
			 this.dispose();
			 UnoVsUno  unovsuno = new UnoVsUno();
		 }
		 
	 }
	
	 

}
