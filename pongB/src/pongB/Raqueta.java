package pongB;
import java.awt.*;
import java.awt.event.*;
public class Raqueta extends Rectangle {
	
	int id;
	int yVelocidad;
	int velocidad = 10;
	
	public Raqueta(int x, int y, int raquetaAncho, int raquetaAlto, int id) {
		super(x,y,raquetaAncho, raquetaAlto);
		this.id = id;
	}
	
	public void keyPressed(KeyEvent e) {
		switch(id){
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W) {
				setYDirection(-velocidad);
			}
			if(e.getKeyCode()==KeyEvent.VK_S) {
				setYDirection(velocidad);
			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				setYDirection(-velocidad);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				setYDirection(velocidad);
			}
			break;
		}		
	}
	public void keyReleased(KeyEvent e) {
		switch(id){
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W) {
				setYDirection(0);
			}
			if(e.getKeyCode()==KeyEvent.VK_S) {
				setYDirection(0);
			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				setYDirection(0);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				setYDirection(0);
			}
			break;
		}
	}
	public void setYDirection(int yDireccion){
		yVelocidad =yDireccion;
	}
	public void mover(){
		y= y+yVelocidad;
	}
	public void draw(Graphics g){
		if (id==1)
			g.setColor(Color.blue);
		else
			g.setColor(Color.red);
		g.fillRect(x,y,width,height);
	}
	
	

}
