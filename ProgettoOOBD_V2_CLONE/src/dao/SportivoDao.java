
package dao;

import convalidazione.MessageError;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Atleta;
import model.Club;
import model.Invitati;
import model.Procuratore;
import refactorCode.FinallyException;

public class SportivoDao {
    
   
    
    public void registraSportivo(Atleta atleta) throws ExceptionDao {
        String sql;
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        if(atleta.getIdClub() > 0) {
            sql = "INSERT INTO atleta(nome, cognome, sexo, nazione, indirizzo, datanascita, telefono, codfiscale, ruolo_atleta, peso, codprocuratore, iban_atleta, codclub) VALUES(?, ?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?)";
            try{
                connection = new DataAccessObject().connectionToDatabase();
                pStmt = connection.prepareStatement(sql);
                pStmt.setString(1, atleta.getNome());
                pStmt.setString(2, atleta.getCognmome());
                pStmt.setString(3, atleta.getSesso());
                pStmt.setString(4, atleta.getNazione());
                pStmt.setString(5, atleta.getIndirizzo());
                pStmt.setDate(6, atleta.getDataNascita());
                pStmt.setString(7, atleta.getTelefono());
                pStmt.setString(8, atleta.getCodiceFiscale());
                pStmt.setString(9, atleta.getRuolo());
                pStmt.setDouble(10, atleta.getPeso());
                pStmt.setString(11, atleta.getIdProcuratore());
                pStmt.setString(12, atleta.getIban());
                pStmt.setInt(13, atleta.getIdClub());
                pStmt.execute();
            }catch(SQLException e) {
                throw new ExceptionDao("ERRORE ATLETA PROCURATORE FALLITA "+e);
            }
            finally {
                FinallyException finallyException = new FinallyException();
                finallyException.finallyException();
            }
        }
        else {
            sql = "INSERT INTO atleta(nome, cognome, sexo, nazione, indirizzo, datanascita, telefono, codfiscale, ruolo_atleta, peso, codprocuratore, iban_atleta) VALUES(?, ?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?)";
            try{
                connection = new DataAccessObject().connectionToDatabase();
                pStmt = connection.prepareStatement(sql);
                pStmt.setString(1, atleta.getNome());
                pStmt.setString(2, atleta.getCognmome());
                pStmt.setString(3, atleta.getSesso());
                pStmt.setString(4, atleta.getNazione());
                pStmt.setString(5, atleta.getIndirizzo());
                pStmt.setDate(6, atleta.getDataNascita());
                pStmt.setString(7, atleta.getTelefono());
                pStmt.setString(8, atleta.getCodiceFiscale());
                pStmt.setString(9, atleta.getRuolo());
                pStmt.setDouble(10, atleta.getPeso());
                pStmt.setString(11, atleta.getIdProcuratore());
                pStmt.setString(12, atleta.getIban());
                pStmt.execute();
            }catch(SQLException e) {
                throw new ExceptionDao("ERRORE REGISTRAZIONE ATLETA FALLITA "+e);
            }
            finally {
                FinallyException finallyException = new FinallyException();
                finallyException.finallyException();
            }
        }
            
        
    }
    
    public ArrayList<Club> verificaCercaClub(Club club) throws ExceptionDao {
        String sql= "SELECT * FROM club WHERE idclub="+club.getIdClub()+";";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<Club> datiClub = new ArrayList<>();
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            if(rs == null)
                return null;
            else {
                while(rs.next()) {
                    club.setIdClub(rs.getInt("idclub"));
                    club.setNomeClub(rs.getString("nomeclub"));
                    club.setIndirizzo("indirizzo");
                    club.setTelefono("telefono");
                    
                    datiClub.add(club);
                }
            }
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA Club FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiClub;
    }
    
    public ArrayList<Atleta> cercaSportivo(Atleta atleta) throws ExceptionDao {
        String sql= "SELECT * FROM atleta WHERE codfiscale LIKE ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<Atleta> datiAtleta = new ArrayList<Atleta>();
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, atleta.getCodiceFiscale()+"%");
            rs = pStmt.executeQuery();
            if(rs == null)
                return null;
            else {
                while(rs.next()) {
                    atleta.setNome(rs.getString("nome"));
                    atleta.setCognmome(rs.getString("cognome"));
                    atleta.setSesso(rs.getString("sexo"));
                    atleta.setNazione(rs.getString("nazione"));
                    atleta.setIndirizzo(rs.getString("indirizzo"));
                    atleta.setDataNascita(rs.getDate("datanascita"));
                    atleta.setTelefono(rs.getString("telefono"));
                    atleta.setCodiceFiscale(rs.getString("codfiscale"));
                    atleta.setRuolo(rs.getString("ruolo_atleta"));
                    atleta.setPeso(rs.getFloat("peso"));
                    atleta.setIdProcuratore(rs.getString("codprocuratore"));
                    atleta.setIban(rs.getString("iban_atleta"));
                    
                    datiAtleta.add(atleta);
                }
            }
        }catch(SQLException e){
            throw new ExceptionDao("ERRORE RICERCA ATLETA FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiAtleta;
    }
    
    public void eliminaAtletaLogin(Atleta atleta) throws ExceptionDao {
        String sql= "DELETE FROM login WHERE opzuser = 'Atleta' AND codatleta = '"+atleta.getCodiceFiscale()+"' AND codclub IS NULL AND codprocuratore IS NULL AND codsponsor IS NULL";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.executeUpdate();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE ELIMINAZIONE LOGIN ATLETA FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public void eliminaSportivo(Atleta atleta) throws ExceptionDao {
        String sql= "DELETE FROM atleta WHERE codfiscale = ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        this.eliminaAtletaLogin(atleta);
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, atleta.getCodiceFiscale());
            pStmt.executeUpdate();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE ELIMINAZIONE ATLETA FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public void aggiornaSportivo(Atleta atleta, String codiceFiscaleDaModificare) throws ExceptionDao {
        String sql;
        Statement stmt = null;
        Connection connection = null;
        
        if(atleta.getIdClub() > 0)
            sql = "UPDATE atleta set nome='"+atleta.getNome()+"', cognome='"+atleta.getCognmome()+"', sexo='"+atleta.getSesso()+
                         "', nazione='"+atleta.getNazione()+"', indirizzo='"+atleta.getIndirizzo()+"', datanascita='"+atleta.getDataNascita()+"', telefono='"+atleta.getTelefono()+
                         "', codfiscale='"+atleta.getCodiceFiscale()+"', ruolo_atleta='"+atleta.getRuolo()+"', peso='"+atleta.getPeso()+"', codprocuratore='"+atleta.getIdProcuratore()+"', iban_atleta='"+atleta.getIban()+"', codclub="+atleta.getIdClub()+" WHERE codfiscale='"+codiceFiscaleDaModificare+"';";
        else
            sql = "UPDATE atleta set nome='"+atleta.getNome()+"', cognome='"+atleta.getCognmome()+"', sexo='"+atleta.getSesso()+
                         "', nazione='"+atleta.getNazione()+"', indirizzo='"+atleta.getIndirizzo()+"', datanascita='"+atleta.getDataNascita()+"', telefono='"+atleta.getTelefono()+
                         "', codfiscale='"+atleta.getCodiceFiscale()+"', ruolo_atleta='"+atleta.getRuolo()+"', peso='"+atleta.getPeso()+"', codprocuratore='"+atleta.getIdProcuratore()+"', iban_atleta='"+atleta.getIban()+"' WHERE codfiscale='"+codiceFiscaleDaModificare+"';";
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
        }catch(SQLException e){
            throw new ExceptionDao("ERRORE AGGIORNAMENTO ATLETA FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public boolean controllaInvitato(Invitati invitati) throws ExceptionDao {
        String sql= "SELECT * FROM invitatti WHERE idatleta='"+invitati.getIdAtleta()+"' AND idevento="+invitati.getIdEvento()+";";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String idAtletaInvitato;
        int idEventoInvitato;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                idAtletaInvitato = rs.getString("idatleta");
                idEventoInvitato = rs.getInt("idevento");
                
                System.out.println("idAtletaInvitato="+idAtletaInvitato+" idEventoInvitato="+idEventoInvitato);
                
                if(invitati.getIdAtleta().equals(idAtletaInvitato) && invitati.getIdEvento() == idEventoInvitato)
                    return false;
            }
            
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE CONTROLLO INVITATTI"+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return true;
    }
    
    public boolean registraInvitato(Invitati invitati) throws ExceptionDao {
        String sql= "INSERT INTO invitatti(idatleta, idevento, status_presenza) VALUES(?, ?, ?)";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        if(this.controllaInvitato(invitati)) {
            try {
                connection = new DataAccessObject().connectionToDatabase();
                pStmt = connection.prepareStatement(sql);
                pStmt.setString(1, invitati.getIdAtleta());
                pStmt.setInt(2, invitati.getIdEvento());
                pStmt.setInt(3, invitati.getStatusPresenza());
                pStmt.execute();
            } catch(SQLException e) {
                throw new ExceptionDao("ERRORE REGISTRAZIONE INVITATI FALLITA "+e);
            } 
            finally {
                FinallyException finallyException = new FinallyException();
                finallyException.finallyException();
            }
            
            return true;
        }
        else 
            return false;
    }
    
}
