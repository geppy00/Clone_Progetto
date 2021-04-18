
package controller;

import dao.ExceptionDao;
import model.Admin;
import model.Atleta;


public class ControllerSportivo {
    public boolean registraSportivo(String nome, String cognmome, String sesso, String nazione, String indirizzo, java.sql.Date dataNascita, String telefono, String codiceFiscale, String ruolo, float peso, String idProcuratore, String iban) throws ExceptionDao {
        if(nome != null && nome.length() > 0 && cognmome != null && cognmome.length() > 0 && nazione != null && indirizzo != null && indirizzo.length() > 0 && dataNascita != null && codiceFiscale != null && codiceFiscale.length() > 0){
            Atleta atleta = new Atleta(nome, cognmome, sesso, nazione, indirizzo, dataNascita, telefono, codiceFiscale, ruolo, peso, idProcuratore, iban);
            Admin admin = new Admin();
            admin.registraSportivo(atleta);
        }
        return false;
    }
}
