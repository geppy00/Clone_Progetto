
package model;
import java.util.ArrayList;

public class Atleta {
    
    private float peso;
    private float altezza;
    private int idAtleta; 
    
    /*RELAZIONI*/
    private ArrayList<Evento> listaEvento = new ArrayList<Evento>();
    private ArrayList<Sponsor> listaSponsor = new ArrayList<Sponsor>();
    private Procuratore procuratore;
    private Club club;
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltezza() {
        return altezza;
    }

    
    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }
    
    public int getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(int idAtleta) {
        this.idAtleta = idAtleta;
    }
    
    /**
     * @return the procuratore
     */
    public Procuratore getProcuratore() {
        return procuratore;
    }

    /**
     * @param procuratore the procuratore to set
     */
    public void setProcuratore(Procuratore procuratore) {
        this.procuratore = procuratore;
    }

    /**
     * @return the club
     */
    public Club getClub() {
        return club;
    }

    /**
     * @param club the club to set
     */
    public void setClub(Club club) {
        this.club = club;
    }
}
