package com.espiritu.calculadoracientifica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionBotones implements ActionListener {
	CalculadoraC ventana;

	 public GestionBotones(CalculadoraC vi){
       this.ventana=vi;
	 }
	 
	 public void actionPerformed(ActionEvent e ){
			
			if (e.getSource() == this.ventana.boton1)
				this.ventana.text.setText(this.ventana.text.getText() + "1");
			if (e.getSource() == this.ventana.boton2)
				this.ventana.text.setText(this.ventana.text.getText() + "2");
			if (e.getSource() == this.ventana.boton3)
				this.ventana.text.setText(this.ventana.text.getText() + "3");
			if (e.getSource() == this.ventana.boton4)
				this.ventana.text.setText(this.ventana.text.getText() + "4");
			if (e.getSource() == this.ventana.boton5)
				this.ventana.text.setText(this.ventana.text.getText() + "5");
			if (e.getSource() == this.ventana.boton6)
				this.ventana.text.setText(this.ventana.text.getText() + "6");
			if (e.getSource() == this.ventana.boton7)
				this.ventana.text.setText(this.ventana.text.getText() + "7");
			if (e.getSource() == this.ventana.boton8)
				this.ventana.text.setText(this.ventana.text.getText() + "8");
			if (e.getSource() == this.ventana.boton9)
				this.ventana.text.setText(this.ventana.text.getText() + "9");
			if (e.getSource() == this.ventana.boton0)
				this.ventana.text.setText(this.ventana.text.getText() + "0");

			if (e.getSource() == this.ventana.botonSuma)
				this.ventana.text.setText(this.ventana.text.getText() + "+");
			if (e.getSource() == this.ventana.botonMenos)
				this.ventana.text.setText(this.ventana.text.getText() + "-");

			if (e.getSource() == this.ventana.botonX)
				this.ventana.text.setText(this.ventana.text.getText() + "x");
			

			if (e.getSource() == this.ventana.botonPunto)
				this.ventana.text.setText(this.ventana.text.getText() + ".");
			if (e.getSource() == this.ventana.botonDiv)
				this.ventana.text.setText(this.ventana.text.getText() + "/");

			if (e.getSource() == this.ventana.botonBorrar)
				this.ventana.text.setText("");
			if (e.getSource() == this.ventana.botonIgual){
				IUOperaciones ioperacion = new IUOperaciones(this.ventana.text.getText());
				Operaciones operacion = new Operaciones(this.ventana.text.getText());
				ioperacion.setResultado(operacion.getResultado());
				this.ventana.text.setText(operacion.getResultado());
				ioperacion.guardar();
			}
	 
	 }
}
