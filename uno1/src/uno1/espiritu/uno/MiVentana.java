package uno1.espiritu.uno;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class MiVentana extends JFrame{
    JFrame
    
    public MiVentana (String dibujo, int x , int y , int ancho, int alto){
        super(dibujo);
	    this.setBounds(x,y,ancho, alto);
		this.setLayout(new BorderLayout());

        GestionBotones gb = new GestionBotones(this);
	    

    }

}