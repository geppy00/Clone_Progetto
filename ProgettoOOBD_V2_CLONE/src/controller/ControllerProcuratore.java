
package controller;

import dao.ExceptionDao;
import dao.ProcuratoreDao;
import java.util.ArrayList;
import model.Admin;
import model.Atleta;
import model.Club;
import model.Contratto;
import model.Procuratore;
import model.Sponsor;


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
    
    public ArrayList<Atleta> cercaSportivo(String idAtleta) throws ExceptionDao {
        if(idAtleta != null && idAtleta.length() > 0) {
            Atleta atleta = new Atleta(idAtleta);
            Procuratore procuratore = new Procuratore();
            return procuratore.cercaSportivo(atleta);
        }
        
        return null;
    }
    
    public String cercaClub(int idClub) throws ExceptionDao {
        if(idClub > 0) {
            Club club = new Club(idClub);
            Procuratore procuratore = new Procuratore();
            return procuratore.cercaClub(club);
        }
        return null;
    }
    
    public boolean registraContratto(String idAtleta, int idClub, java.sql.Date dataInizio, java.sql.Date dataFine, float valContratto, String conChi) throws ExceptionDao {
        if(idAtleta != null && idAtleta.length() > 0 && idClub > 0 && dataInizio != null && dataFine != null && valContratto > 0 && conChi != null && conChi.length() > 0) {
            Contratto contratto = new Contratto(idAtleta, idClub, dataInizio, dataFine, valContratto);
            Procuratore procuratore = new Procuratore();
            procuratore.registraContratto(contratto, conChi);
            return true;
        }
        
        return false;
    }
    
    public double prendiValoreContrattuale(String idAtleta) throws ExceptionDao {
        if(idAtleta != null && idAtleta.length() > 0 ) {
            Contratto contratto = new Contratto(idAtleta);
            Procuratore procuratore = new Procuratore();
            return procuratore.prendiValoreContrattuale(contratto);
        }
        
        return -1;
    }
    
    public String[] prendiGuadagnoPiuAlto(String idProcuratore) throws ExceptionDao {
        if(idProcuratore != null && idProcuratore.length() > 0) {
            Contratto contratto = new Contratto();
            Procuratore procuratore = new Procuratore();
            return procuratore.prendiGuadagnoPiuAlto(contratto, idProcuratore);
        }
        
        return null;
    }
    
    
    public String cercaSponsor(int idSponsor) throws ExceptionDao {
        if(idSponsor > 0) {
            Sponsor sponsor = new Sponsor(idSponsor);
            Procuratore procuratore = new Procuratore();
            return procuratore.cercaSponsor(sponsor);
        }
        return null;
    }
    
    
    public String prendiNomeSponsorPerContratti() throws ExceptionDao {
        Procuratore procuratore = new Procuratore();
        return procuratore.prendiNomeSponsorPerContratti();
    }
    
    
    public void modificaContratto(String idAtleta, int idSponsor, int idClub, java.sql.Date dataInizio,  java.sql.Date dataFine, float valContratto) throws ExceptionDao {
        if(idAtleta != null && idAtleta.length() > 0 && idSponsor > 0 && idClub > 0 && dataInizio != null && dataFine != null && valContratto > 0) {
            Contratto contratto = new Contratto(idAtleta, idSponsor, idClub, dataInizio, dataFine, valContratto);
            Procuratore procuratore = new Procuratore();
            procuratore.modificaContratto(contratto, idAtleta, dataInizio, dataFine);
        }
    }
    
    /*public double prendiValoreContrattualeSponsor() throws ExceptionDao {
        
    }*/
}
