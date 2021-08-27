
package model;
import dao.ExceptionDao;
import dao.SportivoDao;
import java.util.ArrayList;

public class Atleta extends Login {

    private String username;
    private String nome;
    private String cognmome;
    private String sesso;
    private String nazione;
    private String indirizzo;
    private java.sql.Date dataNascita;
    private String telefono;
    private String codiceFiscale;
    private String ruolo;
    private float peso;
    private String idProcuratore;
    private String iban;
    private int idClub;
    
    /*RELAZIONI*/
    private ArrayList<Evento> listaEvento = new ArrayList<Evento>();
    private ArrayList<Sponsor> listaSponsor = new ArrayList<Sponsor>();
    private ArrayList<Stipendio> listaStipendi = new ArrayList<Stipendio>(); 
    private Procuratore procuratore;
    private Club club;
    
    /*COSTRUTTORE*/
    public Atleta(String nome, String cognmome, String sesso, String nazione, String indirizzo, java.sql.Date dataNascita, String telefono, String codiceFiscale, String ruolo, float peso, String idProcuratore, String iban, int idClub){
        this.nome = nome;
        this.cognmome = cognmome;
        this.sesso = sesso;
        this.nazione = nazione;
        this.indirizzo = indirizzo;
        this.dataNascita = dataNascita;
        this.telefono = telefono;
        this.codiceFiscale = codiceFiscale;
        this.ruolo = ruolo;
        this.peso = peso;
        this.idProcuratore = idProcuratore;
        this.iban = iban;
        this.idClub = idClub;
    }
    
    public Atleta(String codiceFiscaleAtleta) {
        this.codiceFiscale = codiceFiscaleAtleta;
    }
    
    public Atleta() {
        
    }
    
/*SETTER AND GETTER*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognmome() {
        return cognmome;
    }

    public void setCognmome(String cognmome) {
        this.cognmome = cognmome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public java.sql.Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(java.sql.Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    public void setProcuratore(Procuratore procuratore) {
        this.procuratore = procuratore;
    }

  
    public Club getClub() {
        return club;
    }

    
    public void setClub(Club club) {
        this.club = club;
    }
    
    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    /*METODO*/
    public boolean registraInvitato(Invitati invitati) throws ExceptionDao {
        return new SportivoDao().registraInvitato(invitati);
    }
   
}
