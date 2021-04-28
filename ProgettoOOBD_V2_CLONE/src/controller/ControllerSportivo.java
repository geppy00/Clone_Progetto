
package controller;

import dao.ExceptionDao;
import java.util.ArrayList;
import model.Admin;
import model.Atleta;


public class ControllerSportivo {
    
    public boolean registraSportivo(String nome, String cognmome, String sesso, String nazione, String indirizzo, java.sql.Date dataNascita, String telefono, String codiceFiscale, String ruolo, float peso, String idProcuratore, String iban, int idClub) throws ExceptionDao {
        if(nome != null && nome.length() > 0 && cognmome != null && cognmome.length() > 0 && nazione != null && indirizzo != null && indirizzo.length() > 0 && dataNascita != null && codiceFiscale != null && codiceFiscale.length() > 0){
            Atleta atleta = new Atleta(nome, cognmome, sesso, nazione, indirizzo, dataNascita, telefono, codiceFiscale, ruolo, peso, idProcuratore, iban, idClub);
            Admin admin = new Admin();
            admin.registraSportivo(atleta);
        }
        
        return false;
    }
    
    public ArrayList<Atleta> cercaSportivo(String codiceFiscaleAtleta) throws ExceptionDao {
        if(codiceFiscaleAtleta != null && codiceFiscaleAtleta.length() > 0){
            Atleta atleta = new Atleta(codiceFiscaleAtleta);
            Admin admin = new Admin();
            return admin.cercaSportivo(atleta);
        }
        
        return null;
    }
    
    public boolean eliminaSportivo(String codiceFiscaleAtletaEliminare) throws ExceptionDao {
        if(codiceFiscaleAtletaEliminare != null && codiceFiscaleAtletaEliminare.length() > 0){
            Atleta atleta = new Atleta(codiceFiscaleAtletaEliminare);
            Admin admin = new Admin();
            admin.eliminaSportivo(atleta);
            return true;
        }
        
        return false;
    }
    
    public boolean aggiornaSportivo(String codiceFiscalePreso, String nome, String cognome, String sesso, String nazionalita, String indirizzo, java.sql.Date dataNascitaSql, String telefono, String codiceFiscale, String ruolo, float peso, String idProcuratore, String iban, int idClub) throws ExceptionDao {
        if(codiceFiscalePreso!=null && codiceFiscalePreso.length() > 0 && nome!=null && nome.length() > 0 && cognome!=null && cognome.length()>0 && nazionalita!=null && nazionalita.length()>0 && indirizzo!=null && indirizzo.length()>0 && dataNascitaSql!=null && codiceFiscale!=null && codiceFiscale.length()>0) {
            Atleta atleta = new Atleta(nome, cognome, sesso, nazionalita, indirizzo, dataNascitaSql, telefono, codiceFiscale, ruolo, peso, idProcuratore, iban, idClub);
            Admin admin = new Admin();
            admin.aggiornaSportivo(atleta, codiceFiscalePreso);
            return true;
        }
        return false;
    }
}
