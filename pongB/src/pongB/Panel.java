package pongB;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Panel extends JPanel implements Runnable {
	public static final int juegoAncho = 1300;
	public static final int juegoAlto = (int)(juegoAncho*(0.5555));
	public static final Dimension tamanio = new Dimension(juegoAncho,juegoAlto); 
	public static final int pelota = 20;
	public static final int raquetaAncho = 30;
	public static final int raquetaAlto = 100;
	Thread hiloJuego;
	Image imagen;
	Graphics graphics;
	Random random;
	Raqueta raqueta1;
	Raqueta raqueta2;
	Pelota  ball;
	Puntos puntos; 
	
	public Panel(){	
		
		newRaquetas();
		newPelota();
		puntos = new Puntos(juegoAncho, juegoAlto);
		this.setFocusable(true);
		this.addKeyListener( new AL());
		this.setPreferredSize(tamanio);
		
		hiloJuego = new Thread(this);
		hiloJuego.start();	
	}
	public void newPelota(){
	}

												
	public void newRaquetas(){
		raqueta1 = new Raqueta(0,(juegoAlto/2)-(raquetaAlto/2),raquetaAncho,raquetaAlto,1);
		raqueta2 = new Raqueta(juegoAncho-raquetaAncho,(juegoAlto/2)-(raquetaAlto/2),raquetaAncho,raquetaAlto,2);
	}
	public void  pintar(Graphics g) {
		imagen = createImage(getWidth(),getHeight());
		graphics = imagen.getGraphics();
		draw(graphics);
		g.drawImage(imagen,0,0,this);		
	}
	public void draw(Graphics g){
		raqueta1.draw(g);
		raqueta2.draw(g);	
	}
	public void mover() {
		raqueta1.mover();
		raqueta2.mover();
	}
	public void colicion() {	
		if(raqueta1.y<= 0)
			raqueta1.y= 0;
		if(raqueta1.y >= (juegoAlto-raquetaAlto))
			raqueta1.y =juegoAlto-raquetaAlto;
		
		if(raqueta2.y<= 0)
			raqueta2.y= 0;
		if(raqueta2.y >= (juegoAlto-raquetaAlto))
			raqueta2.y =juegoAlto-raquetaAlto;
		
		
	}
	
	public void run() {
		
		long lastTime=System.nanoTime();
		double amountofTicks =60.0;
		double ns = 1000000000/ amountofTicks;
		double delta = 0;
		while(true){
			long now = System.nanoTime();
			delta += (now - lastTime)/ns;
			lastTime = now;
			if (delta >=1) {
				mover();
				colicion();
				repaint();
				delta--;
				
			}
		}
	}
	
	public class AL extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			raqueta1.keyPressed(e);
			raqueta2.keyPressed(e);
			
		}
		public void keyReleased(KeyEvent e) {
			raqueta1.keyReleased(e);
			raqueta2.keyReleased(e);
			
		}
	}
	

}
