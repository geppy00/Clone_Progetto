
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
    
    public boolean controlloRegistraAtleta(String nome, String cognome, String nazione, String indirizzo, String dataNascita, String codiceFiscale) {
        if(nome != null && !(nome.equals("")) && cognome != null && !(cognome.equals("")) && nazione != null && !(nazione.equals("")) && indirizzo != null && !(indirizzo.equals("")) && dataNascita != null && !(dataNascita.equals("")) && codiceFiscale != null && !(codiceFiscale.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaAtleta(String codiceFiscale) {
        if(codiceFiscale != null && !(codiceFiscale.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloModificaAtleta(String nome, String cognome, String nazione, String indirizzo, String dataNascita, String codiceFiscale, String sesso, String telefono, String ruolo,String pesoStr, String idProcuratore, String iban) {
        if(nome != null && !(nome.equals("")) && cognome != null && !(cognome.equals("")) && nazione != null && !(nazione.equals("")) && indirizzo != null && !(indirizzo.equals("")) && dataNascita != null && !(dataNascita.equals("")) && codiceFiscale != null && !(codiceFiscale.equals("")) && sesso != null && !(sesso.equals("")) && telefono != null && !(telefono.equals("")) && ruolo != null && !(ruolo.equals("")) && pesoStr != null && !(pesoStr.equals("")) && idProcuratore != null && !(idProcuratore.equals("")) && iban != null && !(iban.equals("")))
            return true;
        else
            return false;
    }
    
    //CLUB
    public boolean controlloRegistraPagamento(String importo, String idDestinatario) {
        if(importo != null && !(importo.equals("")) && Integer.parseInt(importo) > 0 && idDestinatario != null && !(idDestinatario.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloVisuallizzaPagamentiAtleta(String idAtleta) {
        if(idAtleta != null && !(idAtleta.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloVisuallizzaPagamentiData(String dataRicerca) {
        if(dataRicerca != null && !(dataRicerca.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaPagamento(String dataPagamento, String idDestinatario) {
        if(dataPagamento != null && !(dataPagamento.equals("")) && idDestinatario != null && !(idDestinatario.equals("")))
            return true;
        else
            return false;
    }
    
    //SPONSOR
    public boolean controlloRegistraEvento(String inizioEvento, String fineEvento, String louogo, String titolo, String gettone){
        if(inizioEvento != null && !(inizioEvento.equals("")) && fineEvento != null && !(fineEvento.equals("")) && louogo != null && !(louogo.equals("")) && titolo != null && !(titolo.equals("")) && gettone != null && !(gettone.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloDescrizioneEvento(String descrizione){  
        if(descrizione.length() > 280)
            return false;
        else
            return true;
    }
    
    public boolean controlloIdEvento(String idEvento) {
        if(idEvento != null && !(idEvento.equals("")) && Integer.parseInt(idEvento) > 0)
            return true;
        else
            return false;
    }
    
    public boolean controlloModificaEvento(String DatainizioEvento, String DatafineEvento, String louogo, String titolo, String gettone, String oraInizio, String oraFine) {
        if(DatainizioEvento != null && !(DatainizioEvento.equals("")) && DatafineEvento != null && !(DatafineEvento.equals("")) && louogo != null && !(louogo.equals("")) && titolo != null && !(titolo.equals("")) && gettone != null && !(gettone.equals("")) && oraInizio != null && !(oraInizio.equals("")) && oraFine != null && !(oraFine.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloEliminaEventoNome(String nomeEvento) {
        if(nomeEvento != null && !(nomeEvento.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloEliminaEventoData(String dataEvento) {
        if(dataEvento != null && !(dataEvento.equals("")))
            return true;
        else
            return false;
    }
    
    //PROCURATORE
    public boolean controlloAtleta(String datoAtleta) {
        if(datoAtleta != null && !(datoAtleta.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controllaId(String id) {
        if(id != null && !(id.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controllaNome(String nome) {
        if(nome != null && !(nome.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controllaStipulaContratto(String idAtleta, String id, String dataInizio, String dataFine, String valore) {
        if(idAtleta != null && !(idAtleta.equals("")) && id != null && !(id.equals("")) && dataInizio != null && !(dataInizio.equals("")) && dataFine != null && !(dataFine.equals("")) && valore != null && !(valore.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controllaModificaContratto(String idClub, String idSponsor, String dataInizio, String dataFine, String valore){
        if(idClub != null && !(idClub.equals("")) && idSponsor != null && !(idSponsor.equals("")) && dataInizio != null && !(dataInizio.equals("")) && dataFine != null && !(dataFine.equals("")) && valore != null && !(valore.equals("")))
            return true;
        else
            return false;
    }
}
