
package refactorCode;

import dao.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FinallyException {
    public FinallyException(){}
    PreparedStatement pStmt = null;
    ResultSet  rs = null;
    Connection connection = null;
    public void finallyException() throws ExceptionDao{
      
        try{
                if(pStmt != null)
                    pStmt.close();
            }catch(SQLException e) {
                throw new ExceptionDao("ERRORE NELLA CHIUSURA DELLO STATEMENT"+e);
            }
            
            try{
                if(connection != null)
                    connection.close();
            }catch(SQLException e) {
                throw new ExceptionDao("ERRORE NELLA CHIUSURA DELLA CONNESSIONE"+e);
            }
    }
    
}
