
package model;

import dao.ExceptionDao;
import dao.StipendioDao;
import java.util.ArrayList;


public class Club {

   private int idClub; 
   private String nomeClub; 
   private String indirizzo; 
   private String telefono;
   private String username;
   private String password;
   
   
   /*RELAZIONI*/
   private ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
   private ArrayList<Stipendio> listaStipendi = new ArrayList<Stipendio>(); 
   
   /*COSTRUTTORI*/
   public Club(String nome, String indirizzo, String telefono) {
       this.indirizzo = indirizzo;
       this.nomeClub = nome;
       this.telefono = telefono;
   }
   
   public Club() {
       
   }
   
   /*GET AND SET*/
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
    
     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /*METODI RELATIVI PER IL CLUB*/
    public void effettuaPagamento(Stipendio stipendio) throws ExceptionDao {
        new StipendioDao().registraPagamento(stipendio);
    }
}
