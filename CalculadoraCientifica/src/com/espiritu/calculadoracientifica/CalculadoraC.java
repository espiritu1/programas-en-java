package com.espiritu.calculadoracientifica;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraC extends JFrame {
	
	public JTextField text = 			new JTextField();

	public JButton boton0 = 			new JButton("0");
	public JButton boton1 = 			new JButton("1");
    public JButton boton2 = 			new JButton("2");
   	public JButton boton3 = 			new JButton("3");
   	public JButton boton4 = 			new JButton("4");
    public JButton boton5 = 			new JButton("5");
   	public JButton boton6 = 			new JButton("6");
    public JButton boton7 = 			new JButton("7");
    public JButton boton8 = 			new JButton("8");
    public JButton boton9 = 			new JButton("9");
    public JButton botonPunto = 		new JButton(".");
    public JButton botonEXP = 			new JButton("EXP");
    
    public JButton botonBorrar = 		new JButton("DEL");
    public JButton botonAC = 			new JButton("AC");
    public JButton botonX = 			new JButton("X");
    public JButton botonDiv = 			new JButton("/");
    public JButton botonSuma =			new JButton("+");
    public JButton botonMenos = 		new JButton("-");
    public JButton botonANS = 			new JButton("Ans");    
  	public JButton botonIgual = 		new JButton("=");
  	
    
    public JButton botonAB7C =			new JButton("ab/c");
    public JButton botonRaiz = 			new JButton("√");
    public JButton botonExCuadrado = 	new JButton("X2");
    public JButton botonExponenete = 	new JButton("^");
    public JButton botonLog = 			new JButton("log");
    public JButton botonIn = 			new JButton("in");
    public JButton boton = 				new JButton("(-)");
    public JButton botonSignos = 		new JButton("°:;");
    public JButton botonhyp = 			new JButton("hyp");
    public JButton botonSin = 			new JButton("sin");
    public JButton botonCon = 			new JButton("cos");
    public JButton botonTan= 			new JButton("tan");
    public JButton botonRCL =			new JButton("RCL");
    public JButton botonEnd = 			new JButton("end");
    public JButton botonAParentesis = 	new JButton("(");
    public JButton botonCParentesis = 	new JButton(")");
    public JButton botonComa = 			new JButton(",");
    public JButton botonMPlus = 		new JButton("m+");
    
    public JPanel digital = new JPanel();
    public JPanel botones = new JPanel();
    public JPanel operaciones2 = new JPanel();
    public JPanel algo = new JPanel();
    
    
	
	public CalculadoraC (String name, int x, int y, int ancho, int alto) {
		super(name);
		this.setBounds(x,y,ancho, alto);
		this.setLayout(new BorderLayout());
        

        digital.setLayout(new BorderLayout());
        botones.setLayout(new GridLayout(4,5));
        
        operaciones2.setLayout(new GridLayout(3,6));
        algo.setLayout(new BoxLayout(algo,BoxLayout.Y_AXIS));
       


        botones.add(boton7);
        botones.add(boton8);
        botones.add(boton9);
        botones.add(botonBorrar);
        botones.add(botonAC);
        
        botones.add(boton4);
        botones.add(boton5);
        botones.add(boton6);
        botones.add(botonX);
        botones.add(botonDiv);
        
        
        
        botones.add(boton1);
        botones.add(boton2);
        botones.add(boton3);
        botones.add(botonSuma);
        botones.add(botonMenos);
                
        botones.add(boton0);
        botones.add(botonPunto);
        botones.add(botonEXP);
        botones.add(botonANS);
        botones.add(botonIgual);
        

        operaciones2.add(botonAB7C);
        operaciones2.add(botonRaiz);
        operaciones2.add(botonExCuadrado);
        operaciones2.add(botonExponenete);
        operaciones2.add(botonLog);
        operaciones2.add(botonIn);
        operaciones2.add(boton);
        operaciones2.add(botonSignos);
        operaciones2.add(botonhyp );
        operaciones2.add(botonSin);
        operaciones2.add(botonCon);
        operaciones2.add(botonTan);
        operaciones2.add(botonRCL);
        operaciones2.add(botonEnd);
        operaciones2.add(botonAParentesis);
        operaciones2.add(botonCParentesis);
        operaciones2.add(botonComa);
        operaciones2.add(botonMPlus);



        digital.add(text,BorderLayout.NORTH);
        digital.add(operaciones2, BorderLayout.CENTER);
        digital.add(botones, BorderLayout.EAST);        
        
        
        
    	GestionBotones gb = new GestionBotones(this);
    	
    	boton1.addActionListener(gb);
		boton2.addActionListener(gb);
		boton3.addActionListener(gb);
		boton4.addActionListener(gb);
		boton5.addActionListener(gb);
		boton6.addActionListener(gb);
		boton7.addActionListener(gb);
		boton8.addActionListener(gb);
		boton9.addActionListener(gb);
		boton0.addActionListener(gb);

		botonSuma.addActionListener(gb);
		botonMenos.addActionListener(gb);
		botonX.addActionListener(gb);
		botonDiv.addActionListener(gb);

		botonIgual.addActionListener(gb);
		botonPunto.addActionListener(gb);
		botonBorrar.addActionListener(gb);
		text.addActionListener(gb);
        

       
        this.add(digital, BorderLayout.CENTER);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}

}
