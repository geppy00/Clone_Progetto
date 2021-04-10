
package dao;

import java.sql.*;
import java.sql.PreparedStatement;
import model.Admin;
import refactorCode.FinallyException;
import view.registrare.RegistraProcuratore;

public class AdminDao {
    private static final String FORMAT = "yyyy/MM/dd";
    
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
}
