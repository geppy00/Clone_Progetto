
package dao;

import java.sql.*;
import java.sql.PreparedStatement;
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
    
    public void cercaProcuratore(Admin admin) throws ExceptionDao {
        String sql= "SELECT * FROM procuratore WHERE code_procuratore LIKE ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, admin.getCodiceProcuratore()+"%");
            rs = pStmt.executeQuery();
            
            //QUESTO CONTROLLO NON FUNZIONA BISOGNA AGGIUSTARE CIOE' SE ESISTE LA MATRICOLA CERCATA ESSO STAMPA A SCHERMO LA JDIALOG PERO' SE NON ESISTE ALLORA NON STAMPA QUESTA JDIALOG SOTTO
            if(pStmt == null)
                JOptionPane.showMessageDialog(null, "Procuratore non trovato");
            
            while(rs.next()){
                String codeProcuratoreSQL = rs.getString("code_procuratore");
                System.out.println(codeProcuratoreSQL);
                
                String nomeProcuratoreSQL = rs.getString("nome");
                String cognmomeProcuratoreSQL = rs.getString("cognome");
                String sessoProcuratoreSQL = rs.getString("sesso");
                String nazioneProcuratoreSQL = rs.getString("nazione"); 
                String indirizzoProcuratoreSQL = rs.getString("indirizzo"); 
                java.sql.Date dataNascitaProcuratoreSQL = rs.getDate("datanascita"); 
                String telefonoProcuratoreSQL = rs.getString("telefono"); 
                String codiceFiscaleProcuratoreSQL = rs.getString("codfiscale"); 
                String ibanProcuratoreSQL = rs.getString("iban_procuratore");
                
                if(codeProcuratoreSQL.equals(admin.getCodiceProcuratore()))
                    JOptionPane.showMessageDialog(null, "Procuratore trovato");
            }
            
        }catch(SQLException e){
            throw new ExceptionDao("ERRORE RICERCA PROCURATORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
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
