
package controller;
import dao.ExceptionDao;
import model.Login;

public class ControllerLogin {
    public boolean verificaLogin(String username, String password, String scelta) throws ExceptionDao{
        
        if(username.length() > 0 && username != null && password.length() > 0 && password != null && scelta.length() > 0 && scelta != null) {
            Login login = new Login(username, password, scelta);
            boolean value  =  login.verificaLogin(login);
            if(value == true)
                return true;
        }
        
        return false;
    }
}
