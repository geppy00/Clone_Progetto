
package controller;

import dao.ExceptionDao;
import model.Admin;
import model.Sponsor;


public class ControllerSponsor {
    public boolean registraSponsor(String nome, String indirizzo, String telefono) throws ExceptionDao {
        
        if(nome != null && nome.length() > 0 && indirizzo != null && indirizzo.length() > 0 && telefono != null && telefono.length() > 0) {
            Sponsor sponsor = new Sponsor(nome, indirizzo, telefono);
            Admin admin = new Admin();
            admin.registraSponsor(sponsor);
        }
        return false;
    }
}
