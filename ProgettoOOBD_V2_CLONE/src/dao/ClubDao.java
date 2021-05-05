
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Club;
import refactorCode.FinallyException;



public class ClubDao {
     
    public void registraClub(Club club) throws ExceptionDao {
        String sql= "INSERT INTO club(nomeclub, indirizzo, telefono) VALUES(?, ?, ?)";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, club.getNomeClub());
            pStmt.setString(2, club.getIndirizzo());
            pStmt.setString(3, club.getTelefono());
            pStmt.execute();
            pStmt.close();
            connection.close();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE REGISTRAZIONE CLUB FALLITA "+e);
        }
       
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public ArrayList<Club> cercaClub(Club club) throws ExceptionDao {
        ArrayList<Club> datiClub = new ArrayList<Club>();
        String sql= "SELECT * FROM club WHERE nomeclub LIKE ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, club.getNomeClub()+"%");
            rs = pStmt.executeQuery();
            
            if(rs == null)
                return null;
            else {
                while(rs.next()) {
                    club.setIdClub(rs.getInt("idclub"));
                    club.setNomeClub(rs.getString("nomeclub"));
                    club.setIndirizzo(rs.getString("indirizzo"));
                    club.setTelefono(rs.getString("telefono"));
                    datiClub.add(club);
                }
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA CLUB FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiClub;
    }
    
    public void eliminaClub(Club club) throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        String sql= "DELETE FROM club WHERE nomeclub = ?;";
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, club.getNomeClub());
            pStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "CLUB eliminato con successo");
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE ELIMINAZIONE CLUB FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public void aggiornaClub(Club club, String nomeClub) throws ExceptionDao {
        String sql = "UPDATE club set nomeclub='"+club.getNomeClub()+"', indirizzo='"+club.getIndirizzo()+"', telefono='"+club.getTelefono()+"' WHERE nomeclub='"+nomeClub+"';";
        Statement stmt = null;
        Connection connection = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
            JOptionPane.showMessageDialog(null, "CLUB aggirnato con successo");
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE AGGIORNAMENTO CLUB FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
     }
    
}
