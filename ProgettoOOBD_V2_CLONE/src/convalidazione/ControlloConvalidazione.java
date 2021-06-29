
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
    
    
}
