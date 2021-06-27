
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Admin;
import refactorCode.FinallyException;


public class AdminDao {

    /*INFORMAZIONI IMPORTANTI*/
    private String nomeUtente;
    
    /*METODI*/
    public String prendiNomeUtente(Admin admin) throws ExceptionDao {
        String sql= "SELECT * FROM login WHERE opzuser LIKE ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, admin.getopzAdmin()+"%");
            rs = pStmt.executeQuery();
            
            while(rs.next()) {   
                this.setNomeUtente(rs.getString("username"));
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA NOME UTENTE ADMIN FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return this.getNomeUtente();
    }
    
    /*GET AND SET*/
    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }
    
    
}
