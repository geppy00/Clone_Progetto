
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Evento;
import model.Sponsor;
import refactorCode.FinallyException;


public class SponsorDao {
    
    /*INFORMAZIONI IMPORTANTI*/
    private String nomeUtente;
    
    /*METODI*/
    public void registraSponsor(Sponsor sponsor) throws ExceptionDao {
        String sql= "INSERT INTO sponsor(nomesponsor, indirizzo, telefono) VALUES(?, ?, ?)";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, sponsor.getNome());
            pStmt.setString(2, sponsor.getIndirizzo());
            pStmt.setString(3, sponsor.getTelefono());
            pStmt.execute();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE REGISTRAZIONE SPONSOR FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public ArrayList<Sponsor> cercaSponsor(Sponsor sponsor) throws ExceptionDao {
        ArrayList<Sponsor> datiSponsor = new ArrayList<Sponsor>();
        String sql= "SELECT * FROM sponsor WHERE nomesponsor LIKE ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, sponsor.getNome()+"%");
            rs = pStmt.executeQuery();
            if(rs==null) 
                return null;
            else {
                while(rs.next()) {
                    sponsor.setIdSponsor(rs.getInt("idsponsor"));
                    sponsor.setNome(rs.getString("nomesponsor"));
                    sponsor.setIndirizzo(rs.getString("indirizzo"));
                    sponsor.setTelefono(rs.getString("telefono"));
                    datiSponsor.add(sponsor);
                }
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA SPONSOR FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiSponsor;
    }
    
    public void eliminaSponsorLogin(Sponsor sponsor) throws ExceptionDao {
        String sql= "DELETE FROM login WHERE opzuser = 'Sponsor' AND codsponsor = "+sponsor.getIdSponsor()+" AND codclub IS NULL AND codatleta IS NULL AND codprocuratore IS NULL;";
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
    
    public void eliminaSponsor(Sponsor sponsor) throws ExceptionDao {
        String sql= "DELETE FROM sponsor WHERE nomesponsor = ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        this.eliminaSponsorLogin(sponsor);
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, sponsor.getNome());
            pStmt.executeUpdate();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE ELIMINAZIONE SPONSOR FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public void aggiornaSponsor(Sponsor sponsor, String nomeSponsor) throws ExceptionDao {
        String sql = "UPDATE sponsor set nomesponsor='"+sponsor.getNome()+"', indirizzo='"+sponsor.getIndirizzo()+"', telefono='"+sponsor.getTelefono()+"' WHERE nomesponsor='"+nomeSponsor+"';";
        Statement stmt = null;
        Connection connection = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE AGGIORNAMENTO SPONSOR FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    
    public void registraEvento(Evento evento) throws ExceptionDao {
        String sql= "INSERT INTO evento(titolo, luogoevento, data_inizioevento, ora_inizio_evento, data_fineevento, ora_fine_evento, gettonevalue, idsponsor, descrizione) VALUES(?, ?, ?, ?,  ?, ?, ?, ?, ?)";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, evento.getTitolo());
            pStmt.setString(2, evento.getLuogoEvento());
            pStmt.setDate(3, evento.getDataInizio());
            pStmt.setTime(4, evento.getOraInizio());
            pStmt.setDate(5, evento.getDataFine());
            pStmt.setTime(6, evento.getOraFine());
            pStmt.setDouble(7, evento.getGettoneValue());
            pStmt.setInt(8, evento.getIdSponsor());
            pStmt.setString(9, evento.getDescrizione());
            pStmt.execute();
            JOptionPane.showMessageDialog(null, "REGISTRAZIONE EVENTO EFFETTUATA CON SUCCESSO");
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE REGISTRAZIONE EVENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public ArrayList<Evento> prendiDatiEvento(Evento evento) throws ExceptionDao {
        ArrayList<Evento> datiEvento = new ArrayList<Evento>();
        String sql= "SELECT * FROM evento WHERE idevento = ?";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setInt(1, evento.getIdEvento());
            rs = pStmt.executeQuery();
            if(rs==null) 
                return null;
            else {
                while(rs.next()) {
                   evento.setTitolo(rs.getString("titolo"));
                   evento.setLuogoEvento(rs.getString("luogoevento"));
                   evento.setDataInizio(rs.getDate("data_inizioevento"));
                   evento.setOraInizio(rs.getTime("ora_inizio_evento"));
                   evento.setDataFine(rs.getDate("data_fineevento"));
                   evento.setOraFine(rs.getTime("ora_fine_evento"));
                   evento.setGettoneValue(rs.getDouble("gettonevalue"));
                   evento.setDescrizione(rs.getString("descrizione"));
                   
                   datiEvento.add(evento);
                }
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA EVENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiEvento;
    }
    
    public void aggiornaEvento(Evento evento) throws ExceptionDao {
        String sql = "UPDATE evento set titolo='"+evento.getTitolo()+"', luogoevento='"+evento.getLuogoEvento()+"', data_inizioevento='"+evento.getDataInizio()+"', ora_inizio_evento='"+evento.getOraInizio()+"', data_fineevento='"+evento.getDataFine()+"', ora_fine_evento='"+evento.getOraFine()+"', gettonevalue='"+evento.getGettoneValue()+"', descrizione='"+evento.getDescrizione()+"' WHERE idevento="+evento.getIdEvento()+" AND idsponsor="+evento.getIdSponsor()+";";
        Statement stmt = null;
        Connection connection = null;
        
        System.out.println(sql);
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Evento aggirnato con successo");
        }catch(SQLException e) {
            throw new ExceptionDao("Evento AGGIORNAMENTO SPONSOR FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public ArrayList<Evento> cercaNomeEvento(Evento evento) throws ExceptionDao {
        ArrayList<Evento> datiEvento = new ArrayList<Evento>();
        String sql= "SELECT * FROM evento WHERE idsponsor ="+evento.getIdSponsor()+" AND titolo ='"+evento.getTitolo()+"';";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            if(rs==null) 
                return null;
            else {
                while(rs.next()) {
                   evento.setIdEvento(rs.getInt("idevento"));
                   evento.setTitolo(rs.getString("titolo"));
                   evento.setLuogoEvento(rs.getString("luogoevento"));
                   evento.setDataInizio(rs.getDate("data_inizioevento"));
                   evento.setOraInizio(rs.getTime("ora_inizio_evento"));
                   evento.setDataFine(rs.getDate("data_fineevento"));
                   evento.setOraFine(rs.getTime("ora_fine_evento"));
                   evento.setGettoneValue(rs.getDouble("gettonevalue"));
               
                   datiEvento.add(evento);
                }
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA EVENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiEvento;
    }
    
    public ArrayList<Evento> cercaDataEvento(Evento evento) throws ExceptionDao {
        ArrayList<Evento> datiEvento = new ArrayList<Evento>();
        String sql= "SELECT * FROM evento WHERE idsponsor ="+evento.getIdSponsor()+" AND data_inizioevento ='"+evento.getDataInizio()+"';";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            if(rs==null) 
                return null;
            else {
                while(rs.next()) {
                   evento.setIdEvento(rs.getInt("idevento"));
                   evento.setTitolo(rs.getString("titolo"));
                   evento.setLuogoEvento(rs.getString("luogoevento"));
                   evento.setDataInizio(rs.getDate("data_inizioevento"));
                   evento.setOraInizio(rs.getTime("ora_inizio_evento"));
                   evento.setDataFine(rs.getDate("data_fineevento"));
                   evento.setOraFine(rs.getTime("ora_fine_evento"));
                   evento.setGettoneValue(rs.getDouble("gettonevalue"));
               
                   datiEvento.add(evento);
                }
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA EVENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiEvento;
    }
    
    private void eliminaInvitati(Evento evento) throws ExceptionDao {
        String sql= "DELETE FROM invitatti WHERE idevento = ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setInt(1, evento.getIdEvento());
            pStmt.executeUpdate();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE INVITATTI SPONSOR FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public void eliminaEvento(Evento evento) throws ExceptionDao {
        this.eliminaInvitati(evento);
        
        String sql= "DELETE FROM evento WHERE idevento = ? AND idsponsor = ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setInt(1, evento.getIdEvento());
            pStmt.setInt(2, evento.getIdSponsor());
            pStmt.executeUpdate();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE ELIMINAZIONE EVENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public String prendiNomeUtente(Sponsor sponsor) throws ExceptionDao {
        String sql= "SELECT username FROM login WHERE codsponsor = "+sponsor.getIdSponsor()+"AND codclub IS NULL AND codatleta IS NULL AND codprocuratore IS NULL;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            
            while(rs.next()) {   
                this.setNomeUtente(rs.getString("username"));
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA NOME UTENTE SPORTIVO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return this.getNomeUtente();
    }

    
    /*GET AND SET*/
    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }
}
