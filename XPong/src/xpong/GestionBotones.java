package xpong;
import xpong.SingleConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;






public class GestionBotones implements ActionListener  {
	EditarBorrar ventana;
	GuardarUser ventana2;
	Seleccion ventana3;

	
	public GestionBotones (EditarBorrar ventana){
	    this.ventana= ventana;
	
	  }
	
	
	public GestionBotones (GuardarUser ventana2){
	    this.ventana2= ventana2;
	
	  }
	
	public GestionBotones (Seleccion ventana3){
	    this.ventana3= ventana3;
	
	  }
	
	
	
	public void actionPerformed (ActionEvent e){
		
		String accion = e.getActionCommand();
		 if (accion.equals("Borrar")){
			 System.out.println("aqui se borran los datos de usuario en la  bd");
			 String id = ventana.idT.getText();
			 int	intid=(Integer.parseInt(id));
			 
			 
			 try {
					Connection con = SingleConnection.getInstance();
					PreparedStatement ps=null;
		
					String query= "DELETE FROM datos WHERE id = ?";
					ps=con.prepareStatement(query);
					 ps.setInt(1,intid);
					 ps.executeUpdate();	
						
				} catch (SQLException ed) {
					System.out.println(ed);	
				}	 
           }
		 if (accion.equals("Editar")){
			 System.out.println("equi se edita los datos de usuarip en la bd");
			 String id = ventana.idT.getText();
			 int	intid=(Integer.parseInt(id));
			 String puntos = ventana.puntosT.getText();
			 int	intpuntos=(Integer.parseInt(puntos));
			 String nickname = ventana.nameT.getText();			 
			 String frase = ventana.fraseT.getText();
			 try {
				 Connection con = SingleConnection.getInstance();
					PreparedStatement ps=null;
					String query = "UPDATE datos SET nickname =?, frase=? WHERE id=?";  //puntos = ?
 					ps=con.prepareStatement(query);
					ps.setString(1,nickname);
					ps.setInt(2,intpuntos);
					ps.setString(3,frase);
					ps.setInt(4,intid);
					
					ps.executeUpdate();
				
			} catch (Exception e2) {
				System.out.println("dos datos se actualizaron correctamente"); 
			}
			 
           }
		 if (accion.equals("Guardar Usuario")){
			 System.out.println("aqui se guarda el usuario en la bd");
			 			 
			 String nickname = ventana2.nickT.getText();
			 String frase = ventana2.fraseT.getText();
			 
			
			try {
				Connection con = SingleConnection.getInstance();
				PreparedStatement ps = null;
				String query="INSERT INTO datos (nickname,frase) VALUES (?,?)";
				ps=con.prepareStatement(query);
				ps.setString(1, nickname);
				ps.setString(2, frase);
				ps.executeUpdate();
				
				
			}catch(SQLException ed){
				System.out.println(ed);
				
			}

			 
			 
       
           }
		 
		 if (accion.equals("generar reporte")){
			 System.out.println("reporte PDF");
             

           }
		
		
		
	}
	
}
