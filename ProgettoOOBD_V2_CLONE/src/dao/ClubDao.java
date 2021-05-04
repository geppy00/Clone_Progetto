
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
    
    public int cercaIdClub(Club club) throws ExceptionDao {
        String sql="SELECT * FROM club WHERE nomeclub='"+club.getNomeClub()+"' AND indirizzo='"+club.getIndirizzo()+"' AND telefono='"+club.getTelefono()+"';";
        Statement stmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                int idClubPreso = rs.getInt("idclub");
                return idClubPreso;
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE ID CLUB NON TROVATO "+e);
        }
        
        return -1;
    }
    
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
        
        
        int idClub = cercaIdClub(club);
        if(idClub == -1) {
            JOptionPane.showMessageDialog(null, "!!ERRORE NON E' STATO POSSIBILE REGISTRARE IL CLUB!!");
            System.exit(0);
        }
        sql = "INSERT INTO login(username, passuser, opzuser, codclub) VALUES(?, ?, ?, ?)";
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, club.getUsername());
            pStmt.setString(2, club.getPassword());
            pStmt.setString(3, "Club");
            pStmt.setInt(4, idClub);
            pStmt.execute();
            JOptionPane.showMessageDialog(null, "CLUB REGISTRATO CON SUCCESSO");
            pStmt.close();
            connection.close();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE REGISTRAZIONE LOGIN CLUB FALLITA "+e);
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
        String sql= "DELETE FROM club WHERE nomeclub = ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
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
