
package model;

import dao.ExceptionDao;
import dao.ProcuratoreDao;
import java.util.ArrayList;
import java.util.Date;


public class Procuratore {

    


    private String code_procuratore;
    private String nome;
    private String cognome;
    private String sesso;
    private String nazione; 
    private String indirizzo;
    private java.sql.Date dataNascita;
    private String telefono;
    private String codFiscale;
    private String iban;
    

    public Procuratore(String code_procuratore, String nome, String cognome, String sesso, String nazione, String indirizzo, java.sql.Date dataNascita, String telefono, String codFiscale, String iban) {
        this.code_procuratore = code_procuratore;
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.nazione = nazione;
        this.indirizzo = indirizzo;
        this.dataNascita = dataNascita;
        this.telefono = telefono;
        this.codFiscale = codFiscale;
        this.iban = iban;
    }
    
    public Procuratore(String codiceProcuratore){
        this.code_procuratore = codiceProcuratore;
    }
    
    public Procuratore() {
        
    }
    
    /*RELAZIONI*/
    private ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
    
    /**
     * @return the code_procuratore
     */
    public String getCode_procuratore() {
        return code_procuratore;
    }

    /**
     * @param code_procuratore the code_procuratore to set
     */
    public void setCode_procuratore(String code_procuratore) {
        this.code_procuratore = code_procuratore;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the sesso
     */
    public String getSesso() {
        return sesso;
    }

    /**
     * @param sesso the sesso to set
     */
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    /**
     * @return the nazione
     */
    public String getNazione() {
        return nazione;
    }

    /**
     * @param nazione the nazione to set
     */
    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    /**
     * @return the indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * @param indirizzo the indirizzo to set
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * @return the dataNascita
     */
    public java.sql.Date getDataNascita() {
        return dataNascita;
    }

    /**
     * @param dataNascita the dataNascita to set
     */
    public void setDataNascita(java.sql.Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the codFiscale
     */
    public String getCodFiscale() {
        return codFiscale;
    }

    /**
     * @param codFiscale the codFiscale to set
     */
    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
    }
    
    
    public String getIban() {
        return iban;
    }

   
    public void setIban(String iban) {
        this.iban = iban;
    }
    
    /*METODI*/
    public ArrayList<Atleta> cercaSportivo(Atleta atleta) throws ExceptionDao {
        return new ProcuratoreDao().cercaSportivo(atleta);
    }
    
    public String cercaClub(Club club) throws ExceptionDao {
        return new ProcuratoreDao().cercaClub(club);
    }
    
    public void registraContratto(Contratto contratto) throws ExceptionDao {
        new ProcuratoreDao().registraContratto(contratto);
    }
    
    public double prendiValoreContrattuale(Contratto contratto) throws ExceptionDao {
        return new ProcuratoreDao().prendiValoreContrattuale(contratto);
    }
}
