
package controller;

import dao.ExceptionDao;
import java.util.ArrayList;
import model.Admin;
import model.Sponsor;


public class ControllerSponsor {
    public boolean registraSponsor(String nome, String indirizzo, String telefono) throws ExceptionDao {
        
        if(nome != null && nome.length() > 0 && indirizzo != null && indirizzo.length() > 0) {
            Sponsor sponsor = new Sponsor(nome, indirizzo, telefono);
            Admin admin = new Admin();
            admin.registraSponsor(sponsor);
        }
        return false;
    }
    
    public ArrayList<Sponsor> cercaSponsor(String nomeSponsor) throws ExceptionDao {
        if(nomeSponsor != null && nomeSponsor.length() > 0) {
            Sponsor sponsor = new Sponsor(nomeSponsor);
            Admin admin = new Admin();
            return admin.cercaSponsor(sponsor);
        }
        
        return null;
    }
    
    public boolean eliminaSponsor(String nomeSponsor) throws ExceptionDao {
        if(nomeSponsor != null && nomeSponsor.length() > 0) {
            Sponsor sponsor = new Sponsor(nomeSponsor);
            Admin admin = new Admin();
            admin.eliminaSponsor(sponsor);
            return true;
        }
        return false;
    }
    
    public boolean aggiornaSponsor(String nome, String indirizzo, String telefono, String nomeDaAggiornare) throws ExceptionDao {
        if(nome != null && nome.length() > 0 && indirizzo != null && indirizzo.length() > 0 && nomeDaAggiornare != null && nomeDaAggiornare.length() > 0) {
            Sponsor sponsor = new Sponsor(nome, indirizzo, telefono);
            Admin admin = new Admin();
            admin.aggiornaSponsor(sponsor, nomeDaAggiornare);
            return true;
        }
        return false;
    }
}
