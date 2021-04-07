
package dao;
import refactorCode.FinallyException;
import java.sql.*;
import model.Login;


public class LoginDao {
    
    public LoginDao(){
       
    }
    
    public boolean verificaLogin(String userName, String password, String scelta) throws ExceptionDao {
            PreparedStatement pStmt = null;
            ResultSet  rs = null;
            Connection connection = null;
        try{
            String sql = "SELECT * FROM login WHERE username =? and passuser=? and opzuser=?";
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1,userName);
            pStmt.setString(2,password);
            pStmt.setString(3,scelta);
            rs = pStmt.executeQuery();
            if(rs.next()){
               return true;
            }
            
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE NELLA CONSULTA DEI DATI"+e);
        }
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
            
        
        return false;
    }
}