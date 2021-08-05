package com.espiritu.algo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

public class GestionBoton implements ActionListener {
	Ventana ventana;
	
	public GestionBoton(Ventana ventana){
		this.ventana = ventana;
	}
	
	Carro carro = new Carro();	
	String nada ="";
	
	public void actionPerformed (ActionEvent e){
		
		if (e.getSource()==ventana.GUARDAR) {
			/////////////////////////////////////////////////////////////////CREATE
			
			//pasa los datos de los los JTtextfiel a la clase Carro carro
			String anio=ventana.anioT.getText();
			carro.setAnio(Integer.parseInt(anio));				
			//asientos
			String asientos = ventana.asientosT.getText();
			carro.setAsientos(Integer.parseInt(asientos));;
			//marcar
			String marca = ventana.marcaT.getText();
			carro.setMarca(marca);
			//placa 
			String placa=ventana.placaT.getText();
			carro.setPlaca(placa);
			
			//limpia los textfiel 
			ventana.anioT.setText(nada);
			ventana.asientosT.setText(nada);
			ventana.marcaT.setText(nada);
			ventana.placaT.setText(nada);
			ventana.idT.setText(nada);
			
			//imprime en consola los datos del carro que se le pasaron a la clase Carro por el toString
			//el id no cuenta
			System.out.println(carro);
			
			try {	
				Connection con = SingleConection.getInstance();
				PreparedStatement ps = null;
				String query ="INSERT INTO transportes (anio, asientos, marca, placa) VALUES (?,?,?,?)";
				ps=con.prepareStatement(query);
				ps.setInt(1, carro.getAnio());
				ps.setInt(2, carro.getAsientos());
				ps.setString(3, carro.getMarca());
				ps.setString(4, carro.getPlaca());
				ps.executeUpdate();
				try {
				} catch (Exception ex) {
					System.out.println(ex);
					System.out.println("faltas algo 1");
				}
			} catch (SQLException ed) {
				System.out.println(ed);
				System.out.println("faltas algo 2");
			}
			
		}
			//////////////////////////////////////////////////////////////////     DELETE	
		if(e.getSource()==ventana.BORRAR) {
			
			//se  pasa el idea a la clase carro 
			String id = ventana.idT.getText();
			carro.setId(Integer.parseInt(id));	
			
			// se borra por el id los demas valores no cuentan
			System.out.println(carro);
			
			//limpia los textfiel  despues de borrar
			ventana.anioT.setText(nada);
			ventana.asientosT.setText(nada);
			ventana.marcaT.setText(nada);
			ventana.placaT.setText(nada);
			ventana.idT.setText(nada);
			
			try {
				Connection con = SingleConection.getInstance();
				PreparedStatement ps=null;
	
				String query= "DELETE FROM transportes WHERE id = ?";
				ps=con.prepareStatement(query);
				 ps.setInt(1,carro.getId());
				 ps.executeUpdate();	
					
			} catch (SQLException ed) {
				System.out.println(ed);
				
			}
			
		}
		
		//////////////////////////////////////////////                          UPDATE
		if(e.getSource()==ventana.ACTUALIZAR) {
			
			String id = ventana.idT.getText();
			carro.setId(Integer.parseInt(id));	
			
			String anio=ventana.anioT.getText();
			carro.setAnio(Integer.parseInt(anio));				
			//asientos
			String asientos = ventana.asientosT.getText();
			carro.setAsientos(Integer.parseInt(asientos));;
			//marcar
			String marca = ventana.marcaT.getText();
			carro.setMarca(marca);
			//placa x
			String placa=ventana.placaT.getText();
			carro.setPlaca(placa);
			
			ventana.anioT.setText(nada);
			ventana.asientosT.setText(nada);
			ventana.marcaT.setText(nada);
			ventana.placaT.setText(nada);
			ventana.idT.setText(nada);
			
			//imprime en consola los datos que se actulizaron
			System.out.println(carro);
			
			try {
				Connection con = SingleConection.getInstance();
				PreparedStatement ps=null;
				String query = "UPDATE transportes SET anio = ?, asientos= ?, marca= ?,placa= ? WHERE id = ? ";
				ps=con.prepareStatement(query);
				ps.setInt(1,carro.getAnio());
				ps.setInt(2, carro.getAsientos());
				ps.setString(3, carro.getMarca());
				ps.setString(4, carro.getPlaca());
				ps.setInt(5,carro.getId());
				ps.executeUpdate();
				 	
			} catch (Exception e2) {
				System.out.println("el mensaje se ha actualizado correctamente"); 
				// TODO: handle exception
			}
			
			
			
			
			
		}
	}
}
	

