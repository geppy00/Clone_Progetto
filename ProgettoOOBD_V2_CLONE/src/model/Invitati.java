
package model;

public class Invitati {

    private String idAtleta; 
    private int idEvento;
    private int statusPresenza;
    
    /*COSTRUTTORE*/
    public Invitati() {
        
    }
    
    public Invitati(String idAtleta, int idEvento, int statusPresenza) {
        this.idAtleta = idAtleta;
        this.idEvento = idEvento;
        this.statusPresenza = statusPresenza;
    }
    
    /*GET AND SET*/
    public String getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
    
     public int getStatusPresenza() {
        return statusPresenza;
    }

    public void setStatusPresenza(int statusPresenza) {
        this.statusPresenza = statusPresenza;
    }
    
}
