
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public class DataAccessObject {
    
    public DataAccessObject(){
        
    }
    
    public Connection connectionToDatabase() {
        Connection connection = null;

	try {
            Class.forName("org.postgresql.Driver");
            
        }catch(ClassNotFoundException e) {
            e.printStackTrace();    //errore sul caricamento del driver postgresql
        }
        
        try{
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Progetto_OO_BD", "postgres", "BOMBOEBELLO12");
        }catch(SQLException e) {
            e.printStackTrace();    //errore derivato dalla connessione
        }
        
        return connection;
    }
}
