
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
