
package model;

import java.util.ArrayList;

public class Sponsor {
    
    private int idSponsor;
    private String nome;
    private String indirizzo; 
    private String telefono;

    /*COSTRUTTO*/
    public Sponsor(String nome, String indirizzo, String telefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }
    
    public Sponsor() {
        
    }
    
    public Sponsor(int idSponsor) {
        this.idSponsor = idSponsor;
    }
    
    public Sponsor(String nome) {
        this.nome = nome;
    }
    
    /*RELAZIONI*/
    private ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
    
    public int getIdSponsor() {
        return idSponsor;
    }
    
    public void setIdSponsor(int idSponsor) {
        this.idSponsor = idSponsor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
    
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
