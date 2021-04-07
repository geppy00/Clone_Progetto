
package controller;
import dao.ExceptionDao;
import java.util.Date;
import model.Admin;

public class ControllerAdmin {
    
    public ControllerAdmin(){
        
    }
    
    public boolean registraProcuratore(String codiceProcuratore, String nome, String cognmome, String sesso, String nazione, String indirizzo, Date dataNascita, String telefono, String codiceFiscale, String iban) throws ExceptionDao {
        
        if(codiceProcuratore != null && codiceProcuratore.length() > 0 && nome != null && nome.length() > 0 && cognmome != null && cognmome.length() > 0 && nazione != null && nazione.length() > 0 && indirizzo != null && indirizzo.length() > 0 && nazione.length() > 0 && dataNascita != null && codiceFiscale != null && codiceFiscale.length() > 0 ){
            Admin admin = new Admin(codiceProcuratore, nome, cognmome, sesso, nazione, indirizzo, dataNascita, telefono, codiceFiscale, iban);
            admin.registraProcuratore(admin);
            return true;
        }
        
        return false;
    }
}