
package model;

import dao.ExceptionDao;
import dao.ProcuratoreDao;
import dao.SponsorDao;
import dao.SportivoDao;
import java.util.ArrayList;

public class Admin extends Login {


    private String usernameAdmin;
    private String passwordAdmin;
    private String opzAdmin;
    
    
    public Admin() {
        
    }
    
    public String getUsernameAdmin() {
        return usernameAdmin;
    }
    
    public void setUsernameAdmin(String usernameAdmin) {
        this.usernameAdmin = usernameAdmin;
    }
    
    public String getopzAdmin() {
        return opzAdmin;
    }
    
    public void setopzAdmin(String opzAdmin) {
        this.opzAdmin = opzAdmin;
    }

     public String getPasswordAdmin() {
        return passwordAdmin;
    }
   
    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }
/*METODI PER ADMIN*/
    public void registraProcuratore(Procuratore procuratore) throws ExceptionDao {
        new ProcuratoreDao().registraProcuratore(procuratore);
    }
    
    public ArrayList<Procuratore> cercaProcuratore(Procuratore procuratore) throws ExceptionDao {
        return new ProcuratoreDao().cercaProcuratore(procuratore);
    }
    
    public void eliminaProcuratore(Procuratore procuratore) throws ExceptionDao {
        new ProcuratoreDao().eliminaProcuratore(procuratore);
    }
    
    public void aggiornaProcuratore(Procuratore procuratore, String matricolaDaModificare) throws ExceptionDao {
        new ProcuratoreDao().aggiornaProcuratore(procuratore, matricolaDaModificare);
    }
    
    public void registraSponsor(Sponsor sponsor) throws ExceptionDao {
        new SponsorDao().registraSponsor(sponsor);
    }
    
    public ArrayList<Sponsor> cercaSponsor(Sponsor sponsor) throws ExceptionDao {
        return new SponsorDao().cercaSponsor(sponsor);
    }
    
    public void eliminaSponsor(Sponsor sponsor) throws ExceptionDao {
        new SponsorDao().eliminaSponsor(sponsor);
    }
    
    public void aggiornaSponsor(Sponsor sponsor, String nomeSponsor) throws ExceptionDao {
        new SponsorDao().aggiornaSponsor(sponsor, nomeSponsor);
    }
    
    public void registraSportivo(Atleta atleta) throws ExceptionDao {
        new SportivoDao().registraSportivo(atleta);
    }
}
