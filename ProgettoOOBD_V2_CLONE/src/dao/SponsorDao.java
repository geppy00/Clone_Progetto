
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Sponsor;
import refactorCode.FinallyException;


public class SponsorDao {
    
    public void registraSponsor(Sponsor sponsor) throws ExceptionDao {
        String sql= "INSERT INTO sponsor(nome, indirizzo, telefono) VALUES(?, ?, ?)";
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
        String sql= "SELECT * FROM sponsor WHERE nome LIKE ?;";
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
                    sponsor.setNome(rs.getString("nome"));
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
    
    public void eliminaSponsor(Sponsor sponsor) throws ExceptionDao {
        String sql= "DELETE FROM sponsor WHERE nome = ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, sponsor.getNome());
            pStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sponsor eliminato con successo");
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE ELIMINAZIONE SPONSOR FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public void aggiornaSponsor(Sponsor sponsor, String nomeSponsor) throws ExceptionDao {
        String sql = "UPDATE sponsor set nome='"+sponsor.getNome()+"', indirizzo='"+sponsor.getIndirizzo()+"', telefono='"+sponsor.getTelefono()+"' WHERE nome='"+nomeSponsor+"';";
        Statement stmt = null;
        Connection connection = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Sponsor aggirnato con successo");
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE AGGIORNAMENTO SPONSOR FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
}