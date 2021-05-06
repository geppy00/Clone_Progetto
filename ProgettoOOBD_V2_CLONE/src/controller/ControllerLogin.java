
package controller;
import dao.ExceptionDao;
import model.Admin;
import model.Login;

public class ControllerLogin {
    
    public String verificaLogin(String username, String password, String scelta) throws ExceptionDao {
        
        if(username.length() > 0 && username != null && password.length() > 0 && password != null && scelta.length() > 0 && scelta != null) {
            Login login = new Login(username, password, scelta);
            String value  =  login.verificaLogin(login);
            if(value != null)
                return value;
        }
        
        return null;
    }
    
    public boolean registraUtenteLogin(String opzUser, String username, String password, String idCorrispodente) throws ExceptionDao {
        if(opzUser != null && opzUser.length() > 0 && username != null && username.length() > 0 && password != null && password.length() > 0 && idCorrispodente != null && idCorrispodente.length() > 0) {
            Login login = new Login(opzUser, username, password, idCorrispodente);
            Admin admin = new Admin();
            admin.registraUtenteLogin(login);
            return true;
        }
        return false;
    }
}
