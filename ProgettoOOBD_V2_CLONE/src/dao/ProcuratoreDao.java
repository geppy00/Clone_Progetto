
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Atleta;
import model.Club;
import model.Contratto;
import model.Procuratore;
import model.Sponsor;
import model.Stipendio;
import refactorCode.FinallyException;


public class ProcuratoreDao {
    
    private String nomeClub;

    public ProcuratoreDao() {
        
    }
    
    public void registraProcuratore(Procuratore procuratore) throws ExceptionDao {
        String sql= "INSERT INTO procuratore(code_procuratore, nome, cognome, sexo, nazione, indirizzo, datanascita, telefono, codfiscale, iban_procuratore) VALUES(?, ?, ?, ?, ?, ?, ?, ? ,?, ?)";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try{
          connection = new DataAccessObject().connectionToDatabase();
          pStmt = connection.prepareStatement(sql);
          pStmt.setString(1, procuratore.getCode_procuratore());
          pStmt.setString(2, procuratore.getNome());
          pStmt.setString(3, procuratore.getCognome());
          pStmt.setString(4, procuratore.getSesso());
          pStmt.setString(5, procuratore.getNazione());
          pStmt.setString(6, procuratore.getIndirizzo());
          pStmt.setDate(7, procuratore.getDataNascita());
          pStmt.setString(8, procuratore.getTelefono());
          pStmt.setString(9, procuratore.getCodFiscale());
          pStmt.setString(10, procuratore.getIban());
          pStmt.execute();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE REGISTRAZIONE PROCURATORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public ArrayList<Procuratore> cercaProcuratore(Procuratore procuratore) throws ExceptionDao {
        String sql= "SELECT * FROM procuratore WHERE code_procuratore LIKE ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<Procuratore> datiProcuratore = new ArrayList<Procuratore>();
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, procuratore.getCode_procuratore()+"%");
            rs = pStmt.executeQuery();
            if(rs==null){return null;}
            //QUESTO CONTROLLO NON FUNZIONA BISOGNA AGGIUSTARE CIOE' SE ESISTE LA MATRICOLA CERCATA ESSO STAMPA A SCHERMO LA JDIALOG PERO' SE NON ESISTE ALLORA NON STAMPA QUESTA JDIALOG SOTTO
            if(rs != null) {
                while(rs.next()) {
                    procuratore.setNome(rs.getString("nome"));
                    procuratore.setCode_procuratore(rs.getString("code_procuratore"));
                    procuratore.setCognome(rs.getString("cognome"));
                    procuratore.setSesso(rs.getString("sexo"));
                    procuratore.setNazione(rs.getString("nazione"));
                    procuratore.setIndirizzo(rs.getString("indirizzo"));
                    procuratore.setDataNascita(rs.getDate("datanascita"));
                    procuratore.setTelefono(rs.getString("telefono"));
                    procuratore.setCodFiscale(rs.getString("codfiscale"));
                    procuratore.setIban(rs.getString("iban_procuratore"));
                
                    datiProcuratore.add(procuratore);
                }
            }       
        }catch(SQLException e){
            throw new ExceptionDao("ERRORE RICERCA PROCURATORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiProcuratore;
    }
    
    public void eliminaProcuratore(Procuratore procuratore) throws ExceptionDao {
        String sql= "DELETE FROM procuratore WHERE code_procuratore = ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, procuratore.getCode_procuratore());
            pStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Procuratore eliminato con successo");
        }catch(SQLException e){
            throw new ExceptionDao("ERRORE ELIMINAZIONE PROCURATORE FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public void aggiornaProcuratore(Procuratore procuratore, String matricolaDaModificare) throws ExceptionDao {
        String sql = "UPDATE procuratore set code_procuratore='"+procuratore.getCode_procuratore()+"', nome='"+procuratore.getNome()+"', cognome='"+procuratore.getCognome()+
                     "', sexo='"+procuratore.getSesso()+"', nazione='"+procuratore.getNazione()+"', indirizzo='"+procuratore.getIndirizzo()+"', datanascita='"+procuratore.getDataNascita()+
                     "', telefono='"+procuratore.getTelefono()+"', codfiscale='"+procuratore.getCodFiscale()+"', iban_procuratore='"+procuratore.getIban()+"' WHERE codfiscale='"+matricolaDaModificare+"';";
        Statement stmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Procuratore aggirnato con successo");
        }catch(SQLException e){
            throw new ExceptionDao("ERRORE AGGIORNAMENTO PROCURATORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public ArrayList<Atleta> cercaSportivo(Atleta atleta) throws ExceptionDao {
        String sql= "SELECT * FROM atleta WHERE codfiscale='"+atleta.getCodiceFiscale()+"';";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<Atleta> datiAtleta = new ArrayList<Atleta>();
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            //pStmt.setString(1, atleta.getCodiceFiscale()+"%");
            rs = pStmt.executeQuery();
            if(rs == null)
                return null;
            else {
                while(rs.next()) {
                    atleta.setNome(rs.getString("nome"));
                    atleta.setCognmome(rs.getString("cognome"));
                    atleta.setDataNascita(rs.getDate("datanascita"));
                    atleta.setCodiceFiscale(rs.getString("codfiscale")); //in piu ma ci puo servire
                    atleta.setRuolo(rs.getString("ruolo_atleta"));
                    
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
    
    public String cercaClub(Club club) throws ExceptionDao {
        String sql= "SELECT * FROM club WHERE idclub="+club.getIdClub()+";";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            //pStmt.setInt(1, club.getIdClub());
            rs = pStmt.executeQuery();
            
            if(rs == null)
                return null;
            else 
                while(rs.next()){
                    setNomeClub(rs.getString("nomeclub"));
                    return getNomeClub();
                } 
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA CLUB FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return null;
    }
    
    
    public String cercaSponsor(Sponsor sponsor) throws ExceptionDao {
        String sql= "SELECT * FROM sponsor WHERE idsponsor="+sponsor.getIdSponsor()+";";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            
            if(rs == null)
                return null;
            else 
                while(rs.next()){
                    return rs.getString("nome");
                } 
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA SPONSOR FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return null;
    }
    
    
    public void registraContratto(Contratto contratto, String conChi) throws ExceptionDao {
        String sql = null;
        if(conChi.equals("CLUB"))
            sql = "INSERT INTO contratto(idatleta, idclub, datastart, dataend, valore_contrattuale) VALUES(?, ?, ?, ?, ?);";
        else if(conChi.equals("SPONSOR"))
            sql = "INSERT INTO contratto(idatleta, idsponsor, datastart, dataend, valore_contrattuale) VALUES(?, ?, ?, ?, ?);";
        else
            sql = null;
        
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try{
          connection = new DataAccessObject().connectionToDatabase();
          pStmt = connection.prepareStatement(sql);
          pStmt.setString(1, contratto.getIdAtleta());
          pStmt.setInt(2, contratto.getIdClub());
          pStmt.setDate(3, contratto.getDataStart());
          pStmt.setDate(4, contratto.getDataEnd());
          pStmt.setDouble(5, contratto.getValoreContratto());
          pStmt.execute();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE REGISTRAZIONE CONTRATTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    
    public double prendiValoreContrattuale(Contratto contratto) throws ExceptionDao {
        String sql= "SELECT valore_contrattuale FROM contratto WHERE idatleta='"+contratto.getIdAtleta()+"';";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            
            if(rs == null)
                return -1;
            else 
                while(rs.next()){
                    System.out.println("rs="+rs.getDouble("valore_contrattuale"));
                    return rs.getDouble("valore_contrattuale");
                } 
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA CLUB FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return -1;
    }
    
    /*public double prendiValoreContrattualeSponsor(Contratto contratto) throws ExceptionDao {
        String sql= "select contratto.valore_contrattuale from sponsor JOIN contratto ON sponsor.idsponsor="+contratto.getIdSponsor()+";";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            
            if(rs == null)
                return -1;
            else 
                while(rs.next()){
                    System.out.println("rs="+rs.getDouble("valore_contrattuale"));
                    return rs.getDouble("valore_contrattuale");
                } 
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA CLUB FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return -1;
    }*/
    
    
    public String[] prendiGuadagnoPiuAlto(Contratto contratto, String idProcuratore) throws ExceptionDao {
        String sql= "select atleta.codfiscale, atleta.nome, atleta.cognome, MAX(valore_contrattuale) FROM contratto join atleta on contratto.idatleta=atleta.codfiscale WHERE atleta.codprocuratore= '"+idProcuratore+"' GROUP BY atleta.codfiscale, atleta.nome, atleta.cognome;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            
            if(rs == null)
                return null;
            else 
                while(rs.next()){
                    String valConstrattuale = String.valueOf(rs.getDouble("max"));
                    String idAtleta = rs.getString("codfiscale");
                    String nomeAtleta = rs.getString("nome");
                    String cognomeAtleta = rs.getString("cognome");
                    
                    String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta, valConstrattuale};
                    
                    return tbDataAtleta;
                } 
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA MASSIMO VALORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        
        return null;
    }
    
    
    public String prendiNomeSponsorPerContratti() throws ExceptionDao {
        String sql = "select sponsor.nome from sponsor JOIN contratto ON sponsor.idsponsor=contratto.idsponsor";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
               return rs.getString("nome");
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA ATLETA FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return null;
    }
    
    public void modificaContratto(Contratto contratto, String idAtletaDaModificare, java.sql.Date dataBegin, java.sql.Date dataEnd) throws ExceptionDao {
        String sql = "UPDATE contratto set idatleta='"+contratto.getIdAtleta()+"', idsponsor="+contratto.getIdSponsor()+", idclub="+contratto.getIdClub()+"  datastart='"+contratto.getDataStart()+"', dataend='"+contratto.getDataEnd()+"', valore_contrattuale="+contratto.getValoreContratto()+" WHERE idatleta='"+idAtletaDaModificare+"' AND datastart='"+dataBegin+"' AND dataend='"+dataEnd+";";
        System.out.println("COMANDO SQL="+sql);
        Statement stmt = null;
        Connection connection = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Contratto aggirnato con successo");
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE AGGIORNAMENTO CLUB FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    /*GET AND SET*/
    public String getNomeClub() {
        return nomeClub;
    }

    public void setNomeClub(String nomeClub) {
        this.nomeClub = nomeClub;
    }
}
