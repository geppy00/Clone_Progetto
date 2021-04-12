
package dao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Admin;
import refactorCode.FinallyException;
import view.registrare.RegistraProcuratore;

public class AdminDao {
    
    public void registraProcuratore(Admin admin) throws ExceptionDao {
        String sql= "INSERT INTO procuratore(code_procuratore, nome, cognome, sesso, nazione, indirizzo, datanascita, telefono, codfiscale, iban_procuratore) VALUES(?, ?, ?, ?, ?, ?, ?, ? ,?, ?)";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try{
          connection = new DataAccessObject().connectionToDatabase();
          pStmt = connection.prepareStatement(sql);
          pStmt.setString(1, admin.getCodiceProcuratore());
          pStmt.setString(2, admin.getNomeProcuratore());
          pStmt.setString(3, admin.getCognmomeProcuratore());
          pStmt.setString(4, admin.getSessoProcuratore());
          pStmt.setString(5, admin.getNazioneProcuratore());
          pStmt.setString(6, admin.getIndirizzoProcuratore());
          pStmt.setDate(7, admin.getDataNascitaProcuratore());
          pStmt.setString(8, admin.getTelefonoProcuratore());
          pStmt.setString(9, admin.getCodiceFiscaleProcuratore());
          pStmt.setString(10, admin.getIbanProcuratore());
          pStmt.execute();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE REGISTRAZIONE PROCURATORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public ArrayList<Admin> cercaProcuratore(Admin admin) throws ExceptionDao {
        String sql= "SELECT * FROM procuratore WHERE code_procuratore LIKE ?;";
        PreparedStatement pStmt = null;

        Connection connection = null;
        ResultSet rs = null;
        ArrayList<Admin> datiProcuratore = new ArrayList<Admin>();
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, admin.getCodiceProcuratore()+"%");
            rs = pStmt.executeQuery();
            if(rs==null){return null;}
            //QUESTO CONTROLLO NON FUNZIONA BISOGNA AGGIUSTARE CIOE' SE ESISTE LA MATRICOLA CERCATA ESSO STAMPA A SCHERMO LA JDIALOG PERO' SE NON ESISTE ALLORA NON STAMPA QUESTA JDIALOG SOTTO
            if(rs != null) {
                while(rs.next()) {
                    admin.setNomeProcuratore(rs.getString("nome"));
                    admin.setCodiceProcuratore(rs.getString("code_procuratore"));
                    admin.setCognmomeProcuratore(rs.getString("cognome"));
                    admin.setSessoProcuratore(rs.getString("sesso"));
                    admin.setNazioneProcuratore(rs.getString("nazione"));
                    admin.setIndirizzoProcuratore(rs.getString("indirizzo"));
                    admin.setDataNascitaProcuratore(rs.getDate("datanascita"));
                    admin.setTelefonoProcuratore(rs.getString("telefono"));
                    admin.setCodiceFiscaleProcuratore(rs.getString("codfiscale"));
                    admin.setIbanProcuratore(rs.getString("iban_procuratore"));
                
                    datiProcuratore.add(admin);
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
    
    public void eliminaProcuratore(Admin admin) throws ExceptionDao {
        String sql= "DELETE FROM procuratore WHERE code_procuratore = ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, admin.getCodiceProcuratore());
            pStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Procuratore eliminato con successo");
        }catch(SQLException e){
            throw new ExceptionDao("ERRORE ELIMINAZIONE PROCURATORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
}
