
package controller;

import dao.ExceptionDao;
import java.util.ArrayList;
import model.Admin;
import model.Club;
import model.Stipendio;


public class ControllerClub {
    
    public boolean registraClub(String nome, String indirizzo, String telefono) throws ExceptionDao {
        if(nome != null && nome.length() > 0 && indirizzo != null && indirizzo.length() > 0) {
            Club club = new Club(nome, indirizzo, telefono);
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
    
    public void aggiornaClub(String nomeClubCercare, String nome, String indirizzo, String telefono) throws ExceptionDao {
        if(nome != null && nome.length() > 0 && indirizzo != null && indirizzo.length() > 0 && nomeClubCercare != null && nomeClubCercare.length() > 0) {
            Club club = new Club(nome, indirizzo, telefono);
            Admin admin = new Admin();
            admin.aggiornaClub(club, nomeClubCercare);
        }
    }
    
    public boolean effettuaPagamento(double valoreStipendio, String idAtleta, int idClub, java.sql.Date dataPagamento) throws ExceptionDao {
        if(valoreStipendio > 0 && idAtleta != null && idAtleta.length() > 0 && idClub > 0 && dataPagamento !=null) {
            Stipendio stipendio = new Stipendio(valoreStipendio, idAtleta, idClub, dataPagamento);
            Club club = new Club();
            club.effettuaPagamento(stipendio);
            return true;
        }
        return false;
    }
    
    /*public ArrayList<Stipendio> cercaTuttiPagamenti(int idClub) throws ExceptionDao {
        if(idClub > 0) {
            Stipendio stipendio = new Stipendio(idClub);
            Club club = new Club();
            return club.cercaTuttiPagamenti(stipendio);
        }
        
        return null;
    }*/
    
    
    public ArrayList<Stipendio> cercaPagamentiAtleta(String idAtleta, int idClub) throws ExceptionDao {
        if(idAtleta != null && idAtleta.length() > 0) {
            Stipendio stipendio = new Stipendio(idAtleta, idClub);
            Club club = new Club();
            return club.cercaPagamentiAtleta(stipendio);
        }
        
        return null;
    }
    
    public ArrayList<Stipendio> cercaPagamentiDataPagamento(java.sql.Date dataPagamento, int idClub) throws ExceptionDao {
        if(dataPagamento != null) {
            Stipendio stipendio = new Stipendio(dataPagamento, idClub);
            Club club = new Club();
            return club.cercaPagamentiDataPagamento(stipendio);
        }
        
        return null;
    }
    
    public double cercaPagamento(java.sql.Date dataPagamento, int idClub, String idAtleta) throws ExceptionDao {
        if(dataPagamento != null && idClub > 0 && idAtleta != null && idAtleta.length() > 0) {
            Stipendio stipendio = new Stipendio(dataPagamento, idClub, idAtleta);
            Club club = new Club();
            return club.cercaPagamento(stipendio);
        }
        
        return -1;
    }
    
    public boolean modificaPagamento(java.sql.Date dataPagamento, int idClub, String idAtleta, double importo) throws ExceptionDao {
        if(dataPagamento != null && idClub > 0 && idAtleta != null && idAtleta.length() > 0 && importo > 0) {
            Stipendio stipendio = new Stipendio(importo, idAtleta, idClub, dataPagamento);
            Club club = new Club();
            club.modificaPagamento(stipendio);
            return true;
        }
        
        return false;
    }
    
    public void eliminaPagamento(java.sql.Date dataPagamento, int idClub, String idAtleta, double importo) throws ExceptionDao {
        if(dataPagamento != null && idClub > 0 && idAtleta != null && idAtleta.length() > 0 && importo > 0) {
            Stipendio stipendio = new Stipendio(importo, idAtleta, idClub, dataPagamento);
            Club club = new Club();
            club.eliminaPagamento(stipendio);
        }
    }
}
