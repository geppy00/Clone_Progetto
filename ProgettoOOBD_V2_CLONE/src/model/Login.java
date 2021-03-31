
package model;


public class Login {

   
   
    private int codeLogin;
    private String username; 
    private String password;
    private int opzioneLogin;
    
    public Login() {
        
    }
    
   
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

    
    public int getOpzioneLogin() {
        return opzioneLogin;
    }

   
    public void setOpzioneLogin(int opzioneLogin) {
        this.opzioneLogin = opzioneLogin;
    }
}
