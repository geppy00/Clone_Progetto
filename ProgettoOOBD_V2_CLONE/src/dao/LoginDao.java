
package dao;
import refactorCode.FinallyException;
import java.sql.*;
import model.Login;


public class LoginDao {
    
    /*INFORMAZIONI IMPORTANTI*/
    private String nomeUtente;
    
    /*COSTRUTTORE*/
    public LoginDao(){
       
    }
    
    public String verificaLogin(String userName, String password, String scelta) throws ExceptionDao {
            PreparedStatement pStmt = null;
            ResultSet  rs = null;
            Connection connection = null;
            String id = null;
            
        try{
            connection = new DataAccessObject().connectionToDatabase();
            String sql = "SELECT * FROM login WHERE username =? and passuser=? and opzuser=?";
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1,userName);
            pStmt.setString(2,password);
            pStmt.setString(3,scelta);
            rs = pStmt.executeQuery();
            if(rs.next()) {
                if(scelta.equals("Admin")) {
                    return "admin";
                }
                else if(scelta.equals("Procuratore")) {
                    //sql = "SELECT * from procuratore inner join login on procuratore.code_procuratore = login.codprocuratore;";
                    sql = "SELECT Login.codprocuratore from login where username='"+userName+"' AND passuser='"+password+"';";
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        id = rs.getString("codprocuratore");
                        return id;
                    }
                }
                else if(scelta.equals("Club")) {
                    sql = "SELECT idclub from club inner join login on club.idclub = login.codclub WHERE login.username='"+userName+"' AND login.passuser='"+password+"';";
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        int idInt = rs.getInt("idclub");
                        id = Integer.toString(idInt);
                        return id;
                    }
                }
                else if(scelta.equals("Sponsor")) {
                    sql = "SELECT idsponsor from sponsor inner join login on sponsor.idsponsor = login.codsponsor WHERE login.username='"+userName+"' AND login.passuser='"+password+"';";
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        int idInt = rs.getInt("idsponsor");
                        id = Integer.toString(idInt);
                        return id;
                    }
                }
                else if(scelta.equals("Atleta")) {
                    sql = "SELECT codfiscale from atleta inner join login on atleta.codfiscale = login.codatleta WHERE login.username='"+userName+"' AND login.passuser='"+password+"';";
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        id = rs.getString("codfiscale");
                        return id;
                    }
                }
            }

        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE NELLA CONSULTA DEI DATI"+e);
        }
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
        return null;
    }
    
    public void registraUtente(Login login) throws ExceptionDao {
        String sql = null;
        PreparedStatement pStmt = null;
        Connection connection = null;
        
        switch(login.getOpzioneLogin()) {
            case "Procuratore":
                sql = "INSERT INTO login(username, passuser, opzuser, codprocuratore) VALUES(?, ?, ?, ?)";
                //login.setCodprocuratore(login.getIdGenerico());
                break;
                
            case "Atleta":
                sql = "INSERT INTO login(username, passuser, opzuser, codatleta) VALUES(?, ?, ?, ?)";
                //login.setCodatleta(login.getIdGenerico());
                break;
                
            case "Sponsor":
                sql = "INSERT INTO login(username, passuser, opzuser, codsponsor) VALUES(?, ?, ?, ?)";
                //login.setCodsponsor(Integer.parseInt(login.getIdGenerico()));
                break;
                
            case "Club":
                sql = "INSERT INTO login(username, passuser, opzuser, codclub) VALUES(?, ?, ?, ?)";
                //login.setC(Integer.parseInt(login.getIdGenerico()));
                break;
        }
        
        
        try{
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, login.getUsername());
            pStmt.setString(2, login.getPassword());
            pStmt.setString(3, login.getOpzioneLogin());

            if(login.getOpzioneLogin().equals("Procuratore") || login.getOpzioneLogin().equals("Atleta"))
                pStmt.setString(4, login.getIdGenerico());
            else
                pStmt.setInt(4, Integer.parseInt(login.getIdGenerico()));

            pStmt.execute();
            pStmt.close();
            connection.close();
       }catch(SQLException e) {
           throw new ExceptionDao("ERRORE REGISTRAZIONE CLUB FALLITA "+e);
       }
       
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    public String prendiNomeUtente(String id, String opzUser) throws ExceptionDao {
        String sql = null;
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        
        switch(opzUser) {
            case "Atleta":
                sql= "SELECT username FROM login WHERE codatleta='"+id+"' AND codprocuratore IS NULL AND codclub IS NULL AND codsponsor IS NULL;";
            break;
            
            case "Procuratore":
                sql= "SELECT username FROM login WHERE codprocuratore='"+id+"' AND codclub IS NULL AND codatleta IS NULL AND codsponsor IS NULL;";
            break;
            
            case "Club":
                sql= "SELECT username FROM login WHERE codclub = "+id+" AND codprocuratore IS NULL AND codatleta IS NULL AND codsponsor IS NULL;";
            break;
            
            case "Sponsor":
                sql= "SELECT username FROM login WHERE codsponsor = "+id+"AND codclub IS NULL AND codatleta IS NULL AND codprocuratore IS NULL;";
            break;
            
            case "Admin":
                sql= "SELECT username FROM login WHERE opzuser = 'Admin'";
            break;
        }
        
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            
            while(rs.next()) {   
                this.setNomeUtente(rs.getString("username"));
            }
        }catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA NOME UTENTE SPORTIVO FALLITA "+e);
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