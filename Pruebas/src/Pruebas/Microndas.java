package Pruebas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Microndas extends JFrame {

	
	public Microndas (String Xname, int x, int y, int ancho, int alto) {
		super("xname");
		this.setBounds(x,y,ancho,alto);
		this.setLayout(new BorderLayout());
		
		JPanel digital = new JPanel();
		digital.setLayout (new BorderLayout());
		JTextField digitos = new JTextField("****");
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,3));
		
		for (int i=1; i<=9; i++) {
			botones.add(new JButton(""+i));
		}
		
		botones.add(new JButton("INICIAR"));
		botones.add(new JButton("0"));
		botones.add(new JButton("parrar"));
		
		digital.add(digitos, BorderLayout.NORTH);
		digital.add(botones, BorderLayout.CENTER);
		
	
		
		JButton b1 =new JButton("comida");
		ImageIcon pollo = new ImageIcon("pollo.jpg");
		b1.set
		
		this.add(b1,BorderLayout.CENTER);
		this.add(digital,BorderLayout.EAST);
		
		
		
		this.setVisible(true);
	}
}
