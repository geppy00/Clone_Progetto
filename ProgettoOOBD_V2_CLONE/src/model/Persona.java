
package model;

import java.util.Date;


public class Persona {

    
    private String nome;
    private String cognome;
    private Date dataNascita;
    private char sesso;
    private String codiceFiscale;
    private String luogoNascita;
    private String citta;
    private String via;
    private int cap;
    private String iban;
    
    public Persona() {
        
    }
    
    
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCognome() {
        return cognome;
    }

    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

   
    public Date getDataNascita() {
        return dataNascita;
    }

    
    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public char getSesso() {
        return sesso;
    }

   
    public void setSesso(char sesso) {
        this.sesso = sesso;
    }

    
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

   
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    
    public String getLuogoNascita() {
        return luogoNascita;
    }

        public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    
    public String getCitta() {
        return citta;
    }

    
    public void setCitta(String citta) {
        this.citta = citta;
    }

  
    public String getVia() {
        return via;
    }

    
    public void setVia(String via) {
        this.via = via;
    }

    
    public int getCap() {
        return cap;
    }

  
    public void setCap(int cap) {
        this.cap = cap;
    }

    
    public String getIban() {
        return iban;
    }

    
    public void setIban(String iban) {
        this.iban = iban;
    }
}
