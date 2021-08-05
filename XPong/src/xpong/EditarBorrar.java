package xpong;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class EditarBorrar extends JFrame {

	
	JPanel panchito = new JPanel();
		
		
	JLabel idL = new JLabel("ID");
	JTextField idT= new JTextField (20);
	
	JLabel nameL = new JLabel("Nickmane");
	JTextField nameT= new JTextField (20);
		
	JLabel puntosL = new JLabel("puntos");
	JTextField puntosT= new JTextField (20);

	JLabel fraseL = new JLabel("Frase");
	JTextField fraseT= new JTextField (20);
	

			JButton borrar = new JButton("Borrar");
			JButton editar= new JButton("Editar");
			
			
			
	
	public EditarBorrar(){
		
		 GestionBotones gb = new GestionBotones(this);
		 borrar.addActionListener(gb);
		 editar.addActionListener(gb);
		
		panchito.add(idL);
		panchito.add(idT);
		
		panchito.add(nameL);
		panchito.add(nameT);
		
		panchito.add(puntosL);
		panchito.add(puntosT);
		
		panchito.add(fraseL);
		panchito.add(fraseT);
		panchito.add(borrar);
		panchito.add(editar);
		
		this.setBounds(400,5,320, 600);
		this.setLayout(new BorderLayout());
		
		this.add(panchito,BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
