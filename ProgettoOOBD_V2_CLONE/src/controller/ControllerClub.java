
package controller;

import dao.ExceptionDao;
import java.util.ArrayList;
import model.Admin;
import model.Club;


public class ControllerClub {
    
    public boolean registraClub(String nome, String indirizzo, String telefono, String username, String password) throws ExceptionDao {
        if(nome != null && nome.length() > 0 && indirizzo != null && indirizzo.length() > 0 && username != null && username.length() > 0 && password != null && password.length() > 0) {
            Club club = new Club(nome, indirizzo, telefono, username, password);
            Admin admin = new Admin();
            admin.registraClub(club);
        }
        
        return false;
    }
    
    public ArrayList<Club> cercaClub(String nomeClub) throws ExceptionDao {
        if(nomeClub != null && nomeClub.length() > 0) {
            Club club = new Club(nomeClub);
            Admin admin = new Admin();
            return admin.cercaClub(club);
        }
        return null;
    }
    
    public void eliminaClub(String nomeClub) throws ExceptionDao {
        if(nomeClub != null && nomeClub.length() > 0) {
            Club club = new Club(nomeClub);
            Admin admin = new Admin();
            admin.eliminaClub(club);
        }
    }
    
    public void aggiornaClub(String nomeClubCercare, String nome, String indirizzo, String telefono, String username, String password) throws ExceptionDao {
        if(nome != null && nome.length() > 0 && indirizzo != null && indirizzo.length() > 0 && nomeClubCercare != null && nomeClubCercare.length() > 0) {
            Club club = new Club(nome, indirizzo, telefono, username, password);
            Admin admin = new Admin();
            admin.aggiornaClub(club, nomeClubCercare);
        }
    }
}
