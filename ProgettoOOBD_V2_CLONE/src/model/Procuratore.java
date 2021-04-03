
package model;

import java.util.ArrayList;
import java.util.Date;


public class Procuratore {

    private String code_procuratore;
    private String nome;
    private String cognome;
    private String sesso;
    private String nazione; 
    private String indirizzo;
    private Date dataNascita;
    private String telefono;
    private String codFiscale;
    
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
    public Date getDataNascita() {
        return dataNascita;
    }

    /**
     * @param dataNascita the dataNascita to set
     */
    public void setDataNascita(Date dataNascita) {
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
}
