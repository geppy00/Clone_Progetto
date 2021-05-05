
package model;

import dao.ExceptionDao;
import dao.LoginDao;


public class Login {

    private int codeLogin;
    private String username; 
    private String password;
    private String opzioneLogin;
    private String codprocuratore; 
    private int codclub;
    private int codsponsor;
    private String codatleta; 
   

    public Login(String username, String password, String scelta, String idAtleta, String idProcuratore, int idClub, int idSponsor, int idLogin) {
        this.username = username;
        this.password = password;
        this.opzioneLogin = scelta;
        this.codatleta = idAtleta;
        this.codclub = idClub;
        this.codprocuratore = idProcuratore;
        this.codsponsor = idSponsor;
        this.codeLogin = idLogin;
    }
    
    public Login() {
        
    }
    
    /*public Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public Login(String username, String password, String scelta) {
        this.username = username;
        this.password = password;
        this.opzioneLogin = scelta;
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
    
   public String getOpzioneLogin() {
        return opzioneLogin;
    }

   
    public void setOpzioneLogin(String opzioneLogin) {
        this.opzioneLogin = opzioneLogin;
    }
    
    public String verificaLogin(Login login) throws ExceptionDao {
       return new LoginDao().verificaLogin(username, password, opzioneLogin);
      
    }
    
       public String getCodprocuratore() {
        return codprocuratore;
    }

    public void setCodprocuratore(String codprocuratore) {
        this.codprocuratore = codprocuratore;
    }

    public int getCodclub() {
        return codclub;
    }

    public void setCodclub(int codclub) {
        this.codclub = codclub;
    }

    public int getCodsponsor() {
        return codsponsor;
    }

    public void setCodsponsor(int codsponsor) {
        this.codsponsor = codsponsor;
    }

    public String getCodatleta() {
        return codatleta;
    }

    public void setCodatleta(String codatleta) {
        this.codatleta = codatleta;
    }
}
