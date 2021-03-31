
package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class DataAccessObject {
    
    public DataAccessObject(){
        
    }
    
    public Connection connectionToDatabase() {
        Connection connection = null;

	try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OO_BD_V2", "postgres", "SNOWEBELLO12");
            if(connection != null) {
                System.out.println("Connessione al database effettuata con successo ");
            }
        }catch(Exception e) {
            System.out.println(e);
            System.out.println("Connection FAILED ");
            System.err.println(e.getClass().getName()+": "+e.getMessage()); 
            System.exit(0);
        }
        
        return connection;
    }
}
