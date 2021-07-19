
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.Stipendio;
import refactorCode.FinallyException;


public class StipendioDao {
    
    
    /*METODI DAO*/
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
    
    
    /*public ArrayList<Stipendio> cercaTuttiPagamenti(Stipendio stipendio) throws ExceptionDao {
        ArrayList<Stipendio> datiStipendio = new ArrayList<Stipendio>();
        String sql= "SELECT * FROM stipendio WHERE idclub="+stipendio.getIdClub()+";";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            if(rs == null)
                return null;
            else {
                while(rs.next()) {
                    stipendio.setIdStipendio(rs.getInt("idstipendio"));
                    stipendio.setValoreStipendio(rs.getDouble("val_stipendio"));
                    stipendio.setStatusPagamento(rs.getInt("status_pagamento"));
                    stipendio.setDataPagamento(rs.getDate("data_pagamento"));
                    stipendio.setIdAtleta(rs.getString("idatleta"));
                    stipendio.setIdClub(rs.getInt("idclub"));
                    datiStipendio.add(stipendio);
                }
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA PAGAMENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiStipendio;
    }*/
    
    
    
    public ArrayList<Stipendio> cercaPagamentiAtleta(Stipendio stipendio) throws ExceptionDao {
        ArrayList<Stipendio> datiStipendio = new ArrayList<Stipendio>();
        String sql= "SELECT * FROM stipendio WHERE idatleta='"+stipendio.getIdAtleta()+"' AND idclub="+stipendio.getIdClub()+";";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            if(rs == null)
                return null;
            else {
                while(rs.next()) {
                    stipendio.setIdStipendio(rs.getInt("idstipendio"));
                    stipendio.setValoreStipendio(rs.getDouble("val_stipendio"));
                    stipendio.setStatusPagamento(rs.getInt("status_pagamento"));
                    stipendio.setDataPagamento(rs.getDate("data_pagamento"));
                    stipendio.setIdAtleta(rs.getString("idatleta"));
                    stipendio.setIdClub(rs.getInt("idclub"));
                    datiStipendio.add(stipendio);
                }
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA PAGAMENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiStipendio;
    }
    
    
    public ArrayList<Stipendio> cercaPagamentiDataPagamento(Stipendio stipendio) throws ExceptionDao {
        ArrayList<Stipendio> datiStipendio = new ArrayList<Stipendio>();
        String sql= "SELECT * FROM stipendio where data_pagamento='"+stipendio.getDataPagamento()+"' AND idclub="+stipendio.getIdClub()+";";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            if(rs == null)
                return null;
            else {
                while(rs.next()) {
                    stipendio.setIdStipendio(rs.getInt("idstipendio"));
                    stipendio.setValoreStipendio(rs.getDouble("val_stipendio"));
                    stipendio.setStatusPagamento(rs.getInt("status_pagamento"));
                    stipendio.setDataPagamento(rs.getDate("data_pagamento"));
                    stipendio.setIdAtleta(rs.getString("idatleta"));
                    stipendio.setIdClub(rs.getInt("idclub"));
                    datiStipendio.add(stipendio);
                }
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA PAGAMENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return datiStipendio;
    }
    
    
    public double cercaPagamento(Stipendio stipendio) throws ExceptionDao {
        String sql = "SELECT * FROM stipendio WHERE idclub="+stipendio.getIdClub()+" AND idatleta='"+stipendio.getIdAtleta()+"' AND data_pagamento='"+stipendio.getDataPagamento()+"';";
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            if(rs == null)
                return -1;
            else {
                while(rs.next()) {
                    double importo = rs.getDouble("val_stipendio");
                    return importo;
                }
            }
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA PAGAMENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return -1;
    }
    
    
    public void modificaPagamento(Stipendio stipendio) throws ExceptionDao {
        String sql = "UPDATE stipendio SET val_stipendio="+stipendio.getValoreStipendio()+" WHERE idclub="+stipendio.getIdClub()+" AND idatleta='"+stipendio.getIdAtleta()+"';";
        Statement stmt = null;
        Connection connection = null;
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE AGGIORNAMENTO CLUB FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
 
    
    public void eliminaPagamento (Stipendio stipendio) throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        String sql= "DELETE FROM stipendio WHERE val_stipendio="+stipendio.getValoreStipendio()+" AND idclub="+stipendio.getIdClub()+" AND idatleta='"+stipendio.getIdAtleta()+"' AND data_pagamento='"+stipendio.getDataPagamento()+"';";
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.executeUpdate();
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE ELIMINAZIONE CLUB FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
}
