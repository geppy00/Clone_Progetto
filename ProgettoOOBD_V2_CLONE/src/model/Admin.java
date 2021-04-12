
package model;

import dao.AdminDao;
import dao.ExceptionDao;
import java.util.ArrayList;
import java.util.Date;

public class Admin extends Login {


    private String usernameAdmin;
    private String passwordAdmin;
    private String opzAdmin;
    private String codiceProcuratore;
    private String nomeProcuratore;
    private String cognmomeProcuratore;
    private String sessoProcuratore;
    private String nazioneProcuratore;
    private String indirizzoProcuratore;
    private java.sql.Date dataNascitaProcuratore;
    private String telefonoProcuratore;
    private String codiceFiscaleProcuratore;
    private String ibanProcuratore;
    
    public Admin(String codiceProcuratore, String nome, String cognmome, String sesso, String nazione, String indirizzo, java.sql.Date dataNascita, String telefono, String codiceFiscale, String iban) {
        this.codiceFiscaleProcuratore = codiceFiscale;
        this.codiceProcuratore = codiceProcuratore;
        this.cognmomeProcuratore = cognmome;
        this.dataNascitaProcuratore = dataNascita;
        this.ibanProcuratore = iban;
        this.indirizzoProcuratore = indirizzo;
        this.nazioneProcuratore = nazione;
        this.nomeProcuratore = nome;
        this.sessoProcuratore = sesso;
        this.telefonoProcuratore = telefono;
    }
    
    public Admin() {
        
    }
    
    public Admin(String codiceProcuratore) {
        this.codiceProcuratore = codiceProcuratore;
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
    
    
    /**
     * @return the codiceProcuratore
     */
    public String getCodiceProcuratore() {
        return codiceProcuratore;
    }

    /**
     * @param codiceProcuratore the codiceProcuratore to set
     */
    public void setCodiceProcuratore(String codiceProcuratore) {
        this.codiceProcuratore = codiceProcuratore;
    }

    /**
     * @return the nomeProcuratore
     */
    public String getNomeProcuratore() {
        return nomeProcuratore;
    }

    /**
     * @param nomeProcuratore the nomeProcuratore to set
     */
    public void setNomeProcuratore(String nomeProcuratore) {
        this.nomeProcuratore = nomeProcuratore;
    }

    /**
     * @return the cognmomeProcuratore
     */
    public String getCognmomeProcuratore() {
        return cognmomeProcuratore;
    }

    /**
     * @param cognmomeProcuratore the cognmomeProcuratore to set
     */
    public void setCognmomeProcuratore(String cognmomeProcuratore) {
        this.cognmomeProcuratore = cognmomeProcuratore;
    }

    /**
     * @return the sessoProcuratore
     */
    public String getSessoProcuratore() {
        return sessoProcuratore;
    }

    /**
     * @param sessoProcuratore the sessoProcuratore to set
     */
    public void setSessoProcuratore(String sessoProcuratore) {
        this.sessoProcuratore = sessoProcuratore;
    }

    /**
     * @return the nazioneProcuratore
     */
    public String getNazioneProcuratore() {
        return nazioneProcuratore;
    }

    /**
     * @param nazioneProcuratore the nazioneProcuratore to set
     */
    public void setNazioneProcuratore(String nazioneProcuratore) {
        this.nazioneProcuratore = nazioneProcuratore;
    }

    /**
     * @return the indirizzoProcuratore
     */
    public String getIndirizzoProcuratore() {
        return indirizzoProcuratore;
    }

    /**
     * @param indirizzoProcuratore the indirizzoProcuratore to set
     */
    public void setIndirizzoProcuratore(String indirizzoProcuratore) {
        this.indirizzoProcuratore = indirizzoProcuratore;
    }

    /**
     * @return the dataNascitaProcuratore
     */
    public java.sql.Date getDataNascitaProcuratore() {
        return dataNascitaProcuratore;
    }

    /**
     * @param dataNascitaProcuratore the dataNascitaProcuratore to set
     */
    public void setDataNascitaProcuratore(java.sql.Date dataNascitaProcuratore) {
        this.dataNascitaProcuratore = dataNascitaProcuratore;
    }

    /**
     * @return the telefonoProcuratore
     */
    public String getTelefonoProcuratore() {
        return telefonoProcuratore;
    }

    /**
     * @param telefonoProcuratore the telefonoProcuratore to set
     */
    public void setTelefonoProcuratore(String telefonoProcuratore) {
        this.telefonoProcuratore = telefonoProcuratore;
    }

    /**
     * @return the codiceFiscaleProcuratore
     */
    public String getCodiceFiscaleProcuratore() {
        return codiceFiscaleProcuratore;
    }

    /**
     * @param codiceFiscaleProcuratore the codiceFiscaleProcuratore to set
     */
    public void setCodiceFiscaleProcuratore(String codiceFiscaleProcuratore) {
        this.codiceFiscaleProcuratore = codiceFiscaleProcuratore;
    }

    /**
     * @return the ibanProcuratore
     */
    public String getIbanProcuratore() {
        return ibanProcuratore;
    }

    /**
     * @param ibanProcuratore the ibanProcuratore to set
     */
    public void setIbanProcuratore(String ibanProcuratore) {
        this.ibanProcuratore = ibanProcuratore;
    }
    
    public void registraProcuratore(Admin admin) throws ExceptionDao {
        new AdminDao().registraProcuratore(admin);
    }
    
    public ArrayList<Admin> cercaProcuratore(Admin admin) throws ExceptionDao {
        return new AdminDao().cercaProcuratore(admin);
    }
    
    public void eliminaProcuratore(Admin admin) throws ExceptionDao {
        new AdminDao().eliminaProcuratore(admin);
    }
}
