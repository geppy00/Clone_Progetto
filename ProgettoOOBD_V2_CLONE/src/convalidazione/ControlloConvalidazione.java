
package convalidazione;

public class ControlloConvalidazione {
    
    /*COSTRUTTORE*/
    public ControlloConvalidazione() {
        
    }
    
    /*METODI*/
    
    //ADMIN
    public boolean controlloRegistraProcuratore(String matricolaPresa, String nomePreso, String cognomePreso, String nazionePresa, String indirizzoPreso, String dataNascitaPresoSql, String codiceFiscalePreso) {
        if(matricolaPresa != null && !(matricolaPresa.equals("")) && nomePreso != null && !(nomePreso.equals("")) && cognomePreso != null && !(cognomePreso.equals("")) && nazionePresa != null && !(nazionePresa.equals("")) &&  indirizzoPreso != null && !(indirizzoPreso.equals("")) && dataNascitaPresoSql != null && !(dataNascitaPresoSql.equals("")) && codiceFiscalePreso != null && !(codiceFiscalePreso.equals(""))) 
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaProcuratore(String matricolaProcuratore) {
        if(matricolaProcuratore != null && !(matricolaProcuratore.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloModificaProcuratore(String matricolaNuova, String nomeNuovo, String cognomeNuovo, String sessoNuovo, String nazioneNuova, String indirizzoNuovo, String telefonoNuovo, String codiceFiscaleNuovo, String ibanNuovo, String dataNascitaSql) {
        if(matricolaNuova != null && !(matricolaNuova.equals("")) && nomeNuovo != null && !(nomeNuovo.equals("")) && cognomeNuovo != null && !(cognomeNuovo.equals("")) && sessoNuovo != null && !(sessoNuovo.equals("")) &&  nazioneNuova != null && !(nazioneNuova.equals("")) && indirizzoNuovo != null && !(indirizzoNuovo.equals("")) && telefonoNuovo != null && !(telefonoNuovo.equals("")) && codiceFiscaleNuovo != null && !(codiceFiscaleNuovo.equals("")) && ibanNuovo != null && !(ibanNuovo.equals("")) && dataNascitaSql != null && !(dataNascitaSql.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloRegistraNuovoProfilo(String username, String password, String confermaPassword, String id) {
        if(username != null && !(username.equals("")) && password != null && !(password.equals("")) && confermaPassword != null && !(confermaPassword.equals("")) && id != null && !(id.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloRegistraSponsor(String nome, String indirizzo, String telefono) {
        if(nome != null && !(nome.equals("")) && indirizzo != null && !(indirizzo.equals("")) && telefono != null && !(telefono.equals("")) && telefono.length() <= 15)
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaSponsor(String idSponsor) {
        if(idSponsor != null && !(idSponsor.equals("")) && idSponsor.length() > 0)
            return true;
        else
            return false;
    }
    
    public boolean controlloModificaSponsor(String nomeNuovo, String indirizzoNuovo, String telefonoNuovo) {
        if(nomeNuovo != null && !(nomeNuovo.equals("")) && indirizzoNuovo != null && !(indirizzoNuovo.equals("")) && telefonoNuovo != null && !(telefonoNuovo.equals("")) && telefonoNuovo.length() <= 15)
            return true;
        else
            return false;
    }
    
    public boolean controlloRegistraClub(String nome, String indirizzo, String telefono) {
        if(nome != null && !(nome.equals("")) && indirizzo != null && !(indirizzo.equals("")) && telefono != null && !(telefono.equals("")) && telefono.length() <= 15)
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaClub(String idClub) {
        if(idClub != null && !(idClub.equals("")) && idClub.length() > 0)
            return true;
        else
            return false;
    }
    
    public boolean controlloModificaClub(String nomeNuovo, String indirizzoNuovo, String telefonoNuovo) {
        if(nomeNuovo != null && !(nomeNuovo.equals("")) && indirizzoNuovo != null && !(indirizzoNuovo.equals("")) && telefonoNuovo != null && !(telefonoNuovo.equals("")) && telefonoNuovo.length() <= 15)
            return true;
        else
            return false;
    }
    
}
