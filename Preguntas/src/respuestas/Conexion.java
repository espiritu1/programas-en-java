package respuestas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	    
	    public Connection get_connecion(){
	        Connection conection = null;
	        try{
	            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/preguntas","root","");
	            
	        }catch (SQLException e){
	            System.out.println(e);
	        }
	        return conection;
	    }
	    
	}
	
