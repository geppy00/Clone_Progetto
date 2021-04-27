
package model;

import java.util.ArrayList;


public class Club {

   private int idClub; 
   private String nomeClub; 
   private String indirizzo; 
   private String telefono;
   
   /*RELAZIONI*/
   private ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
   
   
   /*COSTRUTTORE*/
   public Club(String nome, String indirizzo, String telefono) {
       this.indirizzo = indirizzo;
       this.nomeClub = nome;
       this.telefono = telefono;
   }
   
   public Club() {
       
   }
   
   public Club(String nomeClub) {
    this.nomeClub = nomeClub;
   }
   

    public int getIdClub() {
        return idClub;
    }

   
    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

   
    public String getNomeClub() {
        return nomeClub;
    }

   
    public void setNomeClub(String nomeClub) {
        this.nomeClub = nomeClub;
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
