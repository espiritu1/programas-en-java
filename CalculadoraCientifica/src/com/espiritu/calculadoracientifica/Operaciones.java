package com.espiritu.calculadoracientifica;

public class Operaciones {
	private String cadenaOperacion;

	public Operaciones(String cadenaOp){
		this.cadenaOperacion = cadenaOp;
	}

	public String getResultado(){
   		int tamanio = cadenaOperacion.length();
   		for(int i=0;i<tamanio;i++){
   			char caracter = cadenaOperacion.charAt(i);
   			if(caracter == '+'){
   				String numero1 = cadenaOperacion.substring(0,i);
   				String numero2 = cadenaOperacion.substring(i+1,cadenaOperacion.length());
   				double resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
   				return Double.toString(resultado);
   			}
   			if(caracter == '-'){
   				String numero1 = cadenaOperacion.substring(0,i);
   				String numero2 = cadenaOperacion.substring(i+1,cadenaOperacion.length());
   				double resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
   				return Double.toString(resultado);
   			}
   			if(caracter == 'x'){
   				String numero1 = cadenaOperacion.substring(0,i);
   				String numero2 = cadenaOperacion.substring(i+1,cadenaOperacion.length());
   				double resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
   				return Double.toString(resultado);
   			}
   			if(caracter == '/'){
   				String numero1 = cadenaOperacion.substring(0,i);
   				String numero2 = cadenaOperacion.substring(i+1,cadenaOperacion.length());
   				double resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
   				return Double.toString(resultado);
   			}
   		}
		return "error";
	}


}
