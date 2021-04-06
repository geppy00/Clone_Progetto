
package dao;
import java.sql.*;
import model.Login;


public class LoginDao {
    
    public LoginDao(){
       
    }
    
    public boolean verificaLogin(String userName, String password, String scelta) throws ExceptionDao {
        String sql = "SELSCT * FROM login";
        PreparedStatement pStmt = null;
        ResultSet  rs = null;
        Connection connection = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Login login = new Login();
                    login.setUsername(rs.getString("username"));
                    login.setPassword(rs.getString("passuser"));
                    login.setOpzioneLogin(rs.getString("opzuser"));
                    //String usernameDb = rs.getString("username");
                    //String passwordDb = rs.getString("passuser");
                    //String sceltaDb = rs.getString("opzuser");
                    if(login.getUsername().equals(userName) && login.getPassword().equals(password) && login.getOpzioneLogin().equals(scelta)) {
                        return true;
                    }
                }
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE NELLA CONSULTA DEI DATI"+e);
        }
        
        finally {
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
        
        return false;
    }
}