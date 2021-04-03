
package model;

import java.util.ArrayList;


public class Club {

   private int idClub; 
   private String nomeClub; 
   private String indirizzo; 
   private String telefono;
   
   /*RELAZIONI*/
   private ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
   
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

    /**
     * @return the nomeClub
     */
    public String getNomeClub() {
        return nomeClub;
    }

    /**
     * @param nomeClub the nomeClub to set
     */
    public void setNomeClub(String nomeClub) {
        this.nomeClub = nomeClub;
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
