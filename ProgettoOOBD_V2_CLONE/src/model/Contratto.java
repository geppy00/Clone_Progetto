
package model;

import java.util.Date;


public class Contratto {

    private int numeroContratto;
    private String idAtleta;
    private int idSponsor; 
    private int idClub; 
    private java.sql.Date  dataStart; 
    private java.sql.Date  dataEnd;
    private float valoreContratto;
    
    /*COSTRUTTORI*/
    public Contratto(int numeroContratto) {
        this.numeroContratto = numeroContratto;
    }
    
    public Contratto(String idAtleta, int idClub, java.sql.Date dataInizio, java.sql.Date dataFine, float valContratto) {
        this.idAtleta = idAtleta;
        this.valoreContratto = valContratto;
        this.idClub = idClub;
        this.dataStart = dataInizio;
        this.dataEnd = dataFine;
    }
    
    public Contratto(String idAtleta, int idSponsor, int idClub, java.sql.Date dataInizio, java.sql.Date dataFine, float valContratto) {
        this.idAtleta = idAtleta;
        this.valoreContratto = valContratto;
        this.idClub = idClub;
        this.dataStart = dataInizio;
        this.dataEnd = dataFine;
        this.idSponsor = idSponsor;
    }
    
    public Contratto(int numeroContratto, String idAtleta, int idSponsor, int idClub, java.sql.Date dataInizio, java.sql.Date dataFine, float valContratto) {
        this.numeroContratto = numeroContratto;
        this.idAtleta = idAtleta;
        this.valoreContratto = valContratto;
        this.idClub = idClub;
        this.dataStart = dataInizio;
        this.dataEnd = dataFine;
        this.idSponsor = idSponsor;
    }
    
    public Contratto(String idAtleta, int numeroContratto) {
        this.idAtleta = idAtleta;
        this.numeroContratto = numeroContratto;
    }
    
    public Contratto(String idAtleta) {
        this.idAtleta = idAtleta;
    }
    
    public Contratto() {
        
    }

    /*GET AND SET*/
    public String getIdAtleta() {
        return idAtleta;
    }

    /**
     * @param idAtleta the idAtleta to set
     */
    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }

    /**
     * @return the idSponsor
     */
    public int getIdSponsor() {
        return idSponsor;
    }

    /**
     * @param idSponsor the idSponsor to set
     */
    public void setIdSponsor(int idSponsor) {
        this.idSponsor = idSponsor;
    }

    /**
     * @return the idClub
     */
    public int getIdClub() {
        return idClub;
    }

    /**
     * @param idClub the idClub to set
     */
    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public java.sql.Date getDataStart() {
        return dataStart;
    }

    public void setDataStart(java.sql.Date dataStart) {
        this.dataStart = dataStart;
    }

    public java.sql.Date getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(java.sql.Date dataEnd) {
        this.dataEnd = dataEnd;
    }
    
    public float getValoreContratto() {
        return valoreContratto;
    }

    public void setValoreContratto(float valoreContratto) {
        this.valoreContratto = valoreContratto;
    }
    
    public int getNumeroContratto() {
        return numeroContratto;
    }

    public void setNumeroContratto(int numeroContratto) {
        this.numeroContratto = numeroContratto;
    }


}
