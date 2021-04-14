
package model;

import dao.ExceptionDao;
import dao.ProcuratoreDao;
import java.util.ArrayList;
import java.util.Date;

public class Admin extends Login {


    private String usernameAdmin;
    private String passwordAdmin;
    private String opzAdmin;
    
    
    public Admin() {
        
    }
    
    
    /**
     * @return the usernameAdmin
     */
    public String getUsernameAdmin() {
        return usernameAdmin;
    }

    /**
     * @param usernameAdmin the usernameAdmin to set
     */
    public void setUsernameAdmin(String usernameAdmin) {
        this.usernameAdmin = usernameAdmin;
    }
    public String getopzAdmin() {
        return opzAdmin;
    }
    public void setopzAdmin(String opzAdmin) {
        this.opzAdmin = opzAdmin;
    }

     public String getPasswordAdmin() {
        return passwordAdmin;
    }
    /**
     * @param passwordAdmin the passwordAdmin to set
     */
    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }
    
    public void visualizaDatti(Admin admin) throws ExceptionDao{
       
    }

    public void registraProcuratore(Procuratore procuratore) throws ExceptionDao {
        new ProcuratoreDao().registraProcuratore(procuratore);
    }
    
    public ArrayList<Procuratore> cercaProcuratore(Procuratore procuratore) throws ExceptionDao {
        return new ProcuratoreDao().cercaProcuratore(procuratore);
    }
    
    public void eliminaProcuratore(Procuratore procuratore) throws ExceptionDao {
        new ProcuratoreDao().eliminaProcuratore(procuratore);
    }
    
    public void aggiornaProcuratore(Procuratore procuratore, String matricolaDaModificare) throws ExceptionDao {
        new ProcuratoreDao().aggiornaProcuratore(procuratore, matricolaDaModificare);
    }
}
