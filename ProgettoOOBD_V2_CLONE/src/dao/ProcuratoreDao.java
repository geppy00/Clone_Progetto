
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Procuratore;
import refactorCode.FinallyException;


public class ProcuratoreDao {
    public void registraProcuratore(Procuratore procuratore) throws ExceptionDao {
        String sql= "INSERT INTO procuratore(code_procuratore, nome, cognome, sexo, nazione, indirizzo, datanascita, telefono, codfiscale, iban_procuratore) VALUES(?, ?, ?, ?, ?, ?, ?, ? ,?, ?)";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try{
          connection = new DataAccessObject().connectionToDatabase();
          pStmt = connection.prepareStatement(sql);
          pStmt.setString(1, procuratore.getCode_procuratore());
          pStmt.setString(2, procuratore.getNome());
          pStmt.setString(3, procuratore.getCognome());
          pStmt.setString(4, procuratore.getSesso());
          pStmt.setString(5, procuratore.getNazione());
          pStmt.setString(6, procuratore.getIndirizzo());
          pStmt.setDate(7, procuratore.getDataNascita());
          pStmt.setString(8, procuratore.getTelefono());
          pStmt.setString(9, procuratore.getCodFiscale());
          pStmt.setString(10, procuratore.getIban());
          pStmt.execute();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE REGISTRAZIONE PROCURATORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public ArrayList<Procuratore> cercaProcuratore(Procuratore procuratore) throws ExceptionDao {
        String sql= "SELECT * FROM procuratore WHERE code_procuratore LIKE ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<Procuratore> datiProcuratore = new ArrayList<Procuratore>();
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, procuratore.getCode_procuratore()+"%");
            rs = pStmt.executeQuery();
            if(rs==null){return null;}
            //QUESTO CONTROLLO NON FUNZIONA BISOGNA AGGIUSTARE CIOE' SE ESISTE LA MATRICOLA CERCATA ESSO STAMPA A SCHERMO LA JDIALOG PERO' SE NON ESISTE ALLORA NON STAMPA QUESTA JDIALOG SOTTO
            if(rs != null) {
                while(rs.next()) {
                    procuratore.setNome(rs.getString("nome"));
                    procuratore.setCode_procuratore(rs.getString("code_procuratore"));
                    procuratore.setCognome(rs.getString("cognome"));
                    procuratore.setSesso(rs.getString("sexo"));
                    procuratore.setNazione(rs.getString("nazione"));
                    procuratore.setIndirizzo(rs.getString("indirizzo"));
                    procuratore.setDataNascita(rs.getDate("datanascita"));
                    procuratore.setTelefono(rs.getString("telefono"));
                    procuratore.setCodFiscale(rs.getString("codfiscale"));
                    procuratore.setIban(rs.getString("iban_procuratore"));
                
                    datiProcuratore.add(procuratore);
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
    
    public void eliminaProcuratore(Procuratore procuratore) throws ExceptionDao {
        String sql= "DELETE FROM procuratore WHERE code_procuratore = ?;";
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, procuratore.getCode_procuratore());
            pStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Procuratore eliminato con successo");
        }catch(SQLException e){
            throw new ExceptionDao("ERRORE ELIMINAZIONE PROCURATORE FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public void aggiornaProcuratore(Procuratore procuratore, String matricolaDaModificare) throws ExceptionDao {
        String sql = "UPDATE procuratore set code_procuratore='"+procuratore.getCode_procuratore()+"', nome='"+procuratore.getNome()+"', cognome='"+procuratore.getCognome()+
                     "', sexo='"+procuratore.getSesso()+"', nazione='"+procuratore.getNazione()+"', indirizzo='"+procuratore.getIndirizzo()+"', datanascita='"+procuratore.getDataNascita()+
                     "', telefono='"+procuratore.getTelefono()+"', codfiscale='"+procuratore.getCodFiscale()+"', iban_procuratore='"+procuratore.getIban()+"' WHERE codfiscale='"+matricolaDaModificare+"';";
        Statement stmt = null;
        Connection connection = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Procuratore aggirnato con successo");
        }catch(SQLException e){
            throw new ExceptionDao("ERRORE AGGIORNAMENTO PROCURATORE FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
}
