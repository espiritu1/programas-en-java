package com.espiritu.calculadoracientifica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IUOperaciones {
	
	private String resultado;
	private String operacion;

	public IUOperaciones(String operacion){
		
		this.operacion = operacion; 
	}

	public void setResultado(String resultado){
		this.resultado = resultado;
	}

	public void guardar(){
		try{
			FileWriter fw = new FileWriter(".\\HolaMundo.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);	
			bw.write("\n"+operacion+"="+resultado);
			bw.close();
		}catch(IOException e){
			System.out.println("Error"+ e);
		}
	}

}
