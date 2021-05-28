
package model;

import java.util.ArrayList;
import java.util.Date;


public class Evento {
    
    private int idEvento;
    private String titolo;
    private String luogoEvento;
    private java.sql.Date dataInizio;
    private  java.sql.Time oraInizio;
    private java.sql.Date dataFine;
    private  java.sql.Time oraFine;
    private int idSponsor;
    private String descrizione;
    
    private ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>(); //associazione
    
    /*COSTRUTTORI*/
    public Evento() {
        
    }
    
    public Evento(String titolo, String luogo, java.sql.Date dataInizio,  java.sql.Time oraInizio, java.sql.Date dataFine,  java.sql.Time oraFine, int idSponsor, String descrizione) {
        this.dataFine = dataFine;
        this.dataInizio = dataInizio;
        this.descrizione = descrizione;
        this.idSponsor = idSponsor;
        this.luogoEvento = luogo;
        this.oraFine = oraFine;
        this.oraInizio = oraInizio;
        this.titolo = titolo;
    }
    
    /*GET AND SET*/
    public java.sql.Time getOraInizio() {
        return oraInizio;
    }

    public void setOraInizio(java.sql.Time oraInizio) {
        this.oraInizio = oraInizio;
    }

    public java.sql.Time getOraFine() {
        return oraFine;
    }

    public void setOraFine(java.sql.Time oraFine) {
        this.oraFine = oraFine;
    }
    
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getLuogoEvento() {
        return luogoEvento;
    }

    public void setLuogoEvento(String luogoEvento) {
        this.luogoEvento = luogoEvento;
    }

    public java.sql.Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(java.sql.Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public java.sql.Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(java.sql.Date dataFine) {
        this.dataFine = dataFine;
    }

    public int getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(int idSponsor) {
        this.idSponsor = idSponsor;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
}
