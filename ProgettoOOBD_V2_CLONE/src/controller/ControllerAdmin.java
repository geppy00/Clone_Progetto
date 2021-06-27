
package controller;

import dao.ExceptionDao;
import model.Admin;


public class ControllerAdmin {
    
    /*COSTRUTTORE*/
    public ControllerAdmin() {
        
    }
    
    /*METODI*/
    public String prendiNomeUtente(String opzUser) throws ExceptionDao {
        if(opzUser != null && opzUser.length() > 0 && opzUser.equals("Admin")) {
            Admin admin = new Admin(opzUser);
            return admin.prendiNomeUtente(admin);
        }
        else
            return null;
    }
}
