
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Atleta;
import refactorCode.FinallyException;

public class SportivoDao {
    
    public void registraSportivo(Atleta atleta) throws ExceptionDao {
        String sql= "INSERT INTO atleta(nome, cognome, sesso, nazionalità, indirizzo, datanascita, telefono, codfiscale, ruolo_atleta, peso, codprocuratore, iban_atleta) VALUES(?, ?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?)";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
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
            throw new ExceptionDao("ERRORE REGISTRAZIONE PROCURATORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
}
