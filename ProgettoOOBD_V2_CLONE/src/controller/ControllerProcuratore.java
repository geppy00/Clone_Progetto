
package controller;

import dao.ExceptionDao;
import java.util.ArrayList;
import model.Admin;
import model.Procuratore;


public class ControllerProcuratore {
    
     public boolean registraProcuratore(String codiceProcuratore, String nome, String cognmome, String sesso, String nazione, String indirizzo, java.sql.Date dataNascita, String telefono, String codiceFiscale, String iban) throws ExceptionDao {
        
        if(codiceProcuratore != null && codiceProcuratore.length() > 0 && nome != null && nome.length() > 0 && cognmome != null && cognmome.length() > 0 && nazione != null && nazione.length() > 0 && indirizzo != null && indirizzo.length() > 0 && nazione.length() > 0 && dataNascita != null && codiceFiscale != null && codiceFiscale.length() > 0 ){
            Procuratore procuratore = new Procuratore(codiceProcuratore, nome, cognmome, sesso, nazione, indirizzo, dataNascita, telefono, codiceFiscale, iban);
            Admin admin = new Admin();
            admin.registraProcuratore(procuratore);
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Procuratore> cercaProcuratore(String codiceProcuratore) throws ExceptionDao {
        
        if(codiceProcuratore != null && codiceProcuratore.length() > 0){
            Procuratore procuratore = new Procuratore(codiceProcuratore);
            Admin admin = new Admin();
            return admin.cercaProcuratore(procuratore);
        }
        
        return null;
    }
    
    public boolean eliminaProcuratore(String codiceProcuratore) throws ExceptionDao {
        
        if(codiceProcuratore != null && codiceProcuratore.length() > 0){
            Procuratore procuratore = new Procuratore(codiceProcuratore);
            Admin admin = new Admin();
            admin.eliminaProcuratore(procuratore);
            return true;
        }
        
        return false;
    }
    
    public boolean aggiornaProcuratore(String codiceProcuratoreAgiornato, String nomeAgiornato, String cognmomeAgiornato, String sessoAgiornato, String nazioneAgiornato, String indirizzoAgiornato, java.sql.Date dataNascitaAgiornato, String telefonoAgiornato, String codiceFiscaleAgiornato, String ibanAgiornato, String matricolaDaModificare) throws ExceptionDao {
        
        if(codiceProcuratoreAgiornato != null && codiceProcuratoreAgiornato.length() > 0 && nomeAgiornato != null && nomeAgiornato.length() > 0 && cognmomeAgiornato != null && cognmomeAgiornato.length() > 0 && nazioneAgiornato != null && nazioneAgiornato.length() > 0 && indirizzoAgiornato != null && indirizzoAgiornato.length() > 0 && nazioneAgiornato.length() > 0 && dataNascitaAgiornato != null && codiceFiscaleAgiornato != null && codiceFiscaleAgiornato.length() > 0 && matricolaDaModificare != null && matricolaDaModificare.length() > 0) {
            Procuratore procuratore = new Procuratore(codiceProcuratoreAgiornato, nomeAgiornato, cognmomeAgiornato, sessoAgiornato, nazioneAgiornato, indirizzoAgiornato, (java.sql.Date) dataNascitaAgiornato, telefonoAgiornato, codiceFiscaleAgiornato, ibanAgiornato);
            Admin admin = new Admin();
            admin.aggiornaProcuratore(procuratore, matricolaDaModificare);
            return true;
        }
        
        return false;
    }
}
