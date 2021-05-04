
package controller;
import dao.ExceptionDao;
import model.Login;

public class ControllerLogin {
    public String verificaLogin(String username, String password, String scelta) throws ExceptionDao{
        
        if(username.length() > 0 && username != null && password.length() > 0 && password != null && scelta.length() > 0 && scelta != null) {
            Login login = new Login(username, password, scelta);
            String value  =  login.verificaLogin(login);
            if(value != null)
                return value;
        }
        
        return null;
    }
}
