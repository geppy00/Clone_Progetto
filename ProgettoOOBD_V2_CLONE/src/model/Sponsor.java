
package model;

import java.util.ArrayList;

public class Sponsor {
    
    private int idSponsor;
    private String nome;
    private String indirizzo; 
    private String telefono;

    public Sponsor(String nome, String indirizzo, String telefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }
    
    public Sponsor() {
        
    }
    
    /*RELAZIONI*/
    private ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
    
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
}
