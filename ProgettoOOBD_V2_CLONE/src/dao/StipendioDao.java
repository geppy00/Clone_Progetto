
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Stipendio;
import refactorCode.FinallyException;


public class StipendioDao {
    
    public void registraPagamento(Stipendio stipendio) throws ExceptionDao {
        String sql = "INSERT INTO stipendio(val_stipendio, status_pagamento, data_pagamento, idatleta, idclub) VALUES(?, ?, ?, ?, ?)";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setDouble(1, stipendio.getValoreStipendio());
            pStmt.setInt(2, 1);
            pStmt.setDate(3, stipendio.getDataPagamento());
            pStmt.setString(4, stipendio.getIdAtleta());
            pStmt.setInt(5, stipendio.getIdClub());
            pStmt.execute();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE REGISTRAZIONE PAGAMENTO FALLITA "+e);
        }
       
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
 
}
