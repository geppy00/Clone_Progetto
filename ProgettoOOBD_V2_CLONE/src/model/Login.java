
package model;

import dao.ExceptionDao;
import dao.LoginDao;


public class Login {

    private int codeLogin;
    private String username; 
    private String password;
    private String opzioneLogin;
   

    public Login(String username, String password, String scelta) {
        this.username = username;
        this.password = password;
        this.opzioneLogin = scelta;
    }
    
    public Login() {
        
    }
    
    /*public Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
   
    public int getCodeLogin() {
        return codeLogin;
    }

   
    public void setCodeLogin(int codeLogin) {
        this.codeLogin = codeLogin;
    }

    
    public String getUsername() {
        return username;
    }

   
    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

   
    public void setPassword(String password) {
        this.password = password;
    }
    
   public String getOpzioneLogin() {
        return opzioneLogin;
    }

   
    public void setOpzioneLogin(String opzioneLogin) {
        this.opzioneLogin = opzioneLogin;
    }
    
    public String verificaLogin(Login login) throws ExceptionDao {
       return new LoginDao().verificaLogin(username, password, opzioneLogin);
      
    }
}
