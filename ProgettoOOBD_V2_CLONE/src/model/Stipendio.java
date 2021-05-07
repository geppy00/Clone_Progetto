
package model;


public class Stipendio {
    
    private int idStipendio;
    private double valoreStipendio;
    private int statusPagamento;
    private String idAtleta;
    private int idClub;
    private java.sql.Date dataPagamento;
    
    /*RELAZIONI*/
    private Atleta atleta;
    private Club club;
    
    /*COSTRUTTORI*/
    public Stipendio(double valoreStipendio, String idAtleta, int idClub, java.sql.Date dataPagamento) {
        this.valoreStipendio = valoreStipendio;
        this.idAtleta = idAtleta;
        this.idClub = idClub;
        this.dataPagamento = dataPagamento;  
    }
    
    public Stipendio() {
        
    }
    
    public Stipendio(int idClub) {
        this.idClub = idClub;
    }
    
    public Stipendio(String idAtleta, int idClub) {
        this.idAtleta = idAtleta;
        this.idClub = idClub;
    }
    
    public Stipendio(java.sql.Date dataPagamento, int idClub) {
        this.dataPagamento = dataPagamento;
        this.idClub = idClub;
    }
    
    public Stipendio(java.sql.Date dataPagamento, int idClub, String idAtleta) {
        this.dataPagamento = dataPagamento;
        this.idClub = idClub;
        this.idAtleta = idAtleta;
    }
    
    
    /*GET AND SET*/
    public int getIdStipendio() {
        return idStipendio;
    }

    public void setIdStipendio(int idStipendio) {
        this.idStipendio = idStipendio;
    }

    public double getValoreStipendio() {
        return valoreStipendio;
    }

    public void setValoreStipendio(double valoreStipendio) {
        this.valoreStipendio = valoreStipendio;
    }

    public int getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(int statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }
    
    public java.sql.Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(java.sql.Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
  
}
