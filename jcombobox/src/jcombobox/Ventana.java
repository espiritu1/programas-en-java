package jcombobox;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import javax.swing.JFrame;


public class Ventana  extends JFrame implements ItemListener {
	public JComboBox<String> combo1;
	public JPanel panel= new JPanel();
	
	public Ventana(String dibujo ,int x, int y, int ancho, int alto) {
		super(dibujo);
	    this.setBounds(x,y,ancho, alto);
	    this.setLayout(new BorderLayout());
	    combo1 = new JComboBox<String>();
	    combo1.addItem("rojo");
	    combo1.addItem("verde");
	    combo1.addItem("azul");
	    combo1.addItem("amarillo");
	    combo1.addItem("negro");
	    combo1.addItemListener(this);
	    
	    panel.add(combo1);
	    
	    
	    
	    this.add(panel, BorderLayout.CENTER);   
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource ()== combo1) {
			String texto=combo1.getSelectedItem().toString();
			setTitle(texto);
		}
		
	}
	

}
