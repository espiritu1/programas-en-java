package pongB;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
public class UnoVsUno  extends JFrame {
	
	
	//Panel panelOpciones;
	Panel panel ;
	
	public UnoVsUno(){

		panel = new Panel();
		this.add(panel);
		this.setTitle("juego de pong 1 v 1");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}







