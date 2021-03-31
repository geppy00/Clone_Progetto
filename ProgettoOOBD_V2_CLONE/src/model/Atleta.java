
package model;


public class Atleta extends Persona {
    
    private float peso;
    private float altezza;
    private String club;
    private int idAtleta; 
    
    
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

   
    public String getClub() {
        return club;
    }

    
    public void setClub(String club) {
        this.club = club;
    }
    
    public int getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(int idAtleta) {
        this.idAtleta = idAtleta;
    }
}
