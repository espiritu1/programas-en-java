package xpong;

import java.awt.BorderLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JFrame;

public class GuardarUser extends JFrame {
	
	
	
	JPanel pan = new JPanel(); 
	
	JLabel nickL = new JLabel("Nickmane");
	JTextField nickT= new JTextField (20);
	
	JLabel fraseL = new JLabel("Frase");
	JTextField fraseT= new JTextField (20);
	
	JButton Guardar = new JButton("Guardar Usuario");
	
	public GuardarUser () {
		
		
		GestionBotones gb = new GestionBotones(this);
		 Guardar.addActionListener(gb);
				
		pan.add(nickL);
		pan.add(nickT);
		
		pan.add(fraseL);
		pan.add(fraseT);
		
		pan.add(Guardar);
		
		this.setBounds(200,200,325,200);
		this.setLayout(new BorderLayout());
		
		this.add(pan,BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	 
	

}
