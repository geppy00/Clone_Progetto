//dataNascitaPresoSql != null && !(dataNascitaPresoSql.equals("")) && matricolaPresa != null && !(matricolaPresa.equals("") && (matricolaPresa.equals("Matricola"))) && nomePreso != null && !((nomePreso.equals("")) && (nomePreso.equals("Nome"))) && cognomePreso != null && !((cognomePreso.equals("")) && (cognomePreso.equals("Cognome"))) && nazionePresa != null && !((nazionePresa.equals("")) && (nazionePresa.equals("Nazione"))) && indirizzoPreso != null && !((indirizzoPreso.equals("")) && (indirizzoPreso.equals("Indirizzo"))) && codiceFiscalePreso != null && !((codiceFiscalePreso.equals("")) && (codiceFiscalePreso.equals("Codice Fiscale")))
package convalidazione;

public class ControlloConvalidazione {
    
    /*COSTRUTTORE*/
    public ControlloConvalidazione() {
        
    }
    
    /*METODI*/
    
    //ADMIN
    public boolean controlloRegistraProcuratore(String matricolaPresa, String nomePreso, String cognomePreso, String nazionePresa, String indirizzoPreso, java.sql.Date dataNascitaPresoSql, String codiceFiscalePreso) {
        System.out.println("DATA CONVALIDAZIONE="+dataNascitaPresoSql);
        if(matricolaPresa != null && !(matricolaPresa.equals("")) && !(matricolaPresa.equals("Matricola")) && nomePreso != null && !(nomePreso.equals("")) && !(nomePreso.equals("Nome")) && cognomePreso != null && !(cognomePreso.equals("")) && !(cognomePreso.equals("Cognome")) && nazionePresa != null && !(nazionePresa.equals("")) && !(nazionePresa.equals("")) && indirizzoPreso != null && !(indirizzoPreso.equals("")) && !(indirizzoPreso.equals("")) && dataNascitaPresoSql != null && !(dataNascitaPresoSql.equals("")) && codiceFiscalePreso != null && !(codiceFiscalePreso.equals("")) && !(codiceFiscalePreso.equals("Codice Fiscale"))) 
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaProcuratore(String matricolaProcuratore) {
        if(matricolaProcuratore != null && !(matricolaProcuratore.equals("")) && !(matricolaProcuratore.equals("Matricola da Eliminare")) && !(matricolaProcuratore.equals("Matricola ")))
            return true;
        else
            return false;
    }
    
    public boolean controlloModificaProcuratore(String matricolaNuova, String nomeNuovo, String cognomeNuovo, String sessoNuovo, String nazioneNuova, String indirizzoNuovo, String telefonoNuovo, String codiceFiscaleNuovo, String ibanNuovo, java.sql.Date dataNascitaSql) {
        if(matricolaNuova != null && !(matricolaNuova.equals("")) && nomeNuovo != null && !(nomeNuovo.equals("")) && cognomeNuovo != null && !(cognomeNuovo.equals("")) && sessoNuovo != null && !(sessoNuovo.equals("")) &&  nazioneNuova != null && !(nazioneNuova.equals("")) && indirizzoNuovo != null && !(indirizzoNuovo.equals("")) && telefonoNuovo != null && !(telefonoNuovo.equals("")) && codiceFiscaleNuovo != null && !(codiceFiscaleNuovo.equals("")) && ibanNuovo != null && !(ibanNuovo.equals("")) && dataNascitaSql != null && !(dataNascitaSql.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloRegistraNuovoProfilo(String username, String password, String confermaPassword, String id) {
        if(username != null && (!(username.equals("")) && !(username.equals("User Name"))) && password != null && (!(password.equals("")) && !(password.equals("Password"))) && confermaPassword != null && (!(confermaPassword.equals("")) && !(confermaPassword.equals("Conferma Password"))) && id != null && (!(id.equals("")) && !(id.equals("ID Corrispondente"))))
            return true;
        else
            return false;
    }
    
    public boolean controlloRegistraSponsor(String nome, String indirizzo, String telefono) {
        if(nome != null && (!(nome.equals("")) && !(nome.equals("Nome"))) && indirizzo != null && (!(indirizzo.equals("")) && !(indirizzo.equals("Indirizzo"))) && telefono != null && (!(telefono.equals("")) && !(telefono.equals("Telefono"))) && telefono.length() <= 15)
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaSponsor(String idSponsor) {
        if(idSponsor != null && (!(idSponsor.equals("")) && !(idSponsor.equals("Nome Sponsor"))) && idSponsor.length() > 0)
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
        if(nome != null && (!(nome.equals("")) && !(nome.equals("Nome Club"))) && indirizzo != null && (!(indirizzo.equals("")) && !(indirizzo.equals("Indirizzo"))) && telefono != null && (!(telefono.equals("")) && !(telefono.equals("Telefono"))) && telefono.length() <= 15)
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaClub(String idClub) {
        if(idClub != null && (!(idClub.equals("")) && !(idClub.equals("Nome Club"))) && idClub.length() > 0)
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
    
    public boolean controlloRegistraAtleta(String nome, String cognome, String nazione, String indirizzo, java.sql.Date dataNascita, String codiceFiscale) {
        if(nome != null && (!(nome.equals("")) && !(nome.equals("Nome"))) && cognome != null && (!(cognome.equals("")) && !(cognome.equals("Cognome"))) && nazione != null && (!(nazione.equals("")) && !(nazione.equals("Nazione"))) && indirizzo != null && (!(indirizzo.equals("")) && !(indirizzo.equals("Indirizzo"))) && dataNascita != null && !(dataNascita.equals("")) && codiceFiscale != null && (!(codiceFiscale.equals("")) && !(codiceFiscale.equals("Codice Fiscale"))))
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaAtleta(String codiceFiscale) {
        if(codiceFiscale != null && (!(codiceFiscale.equals("")) && !(codiceFiscale.equals("Codice Fiscale"))))
            return true;
        else
            return false;
    }
    
    public boolean controlloModificaAtleta(String nome, String cognome, String nazione, String indirizzo, java.sql.Date dataNascita, String codiceFiscale, String sesso, String telefono, String ruolo,String pesoStr, String idProcuratore, String iban) {
        if(nome != null && !(nome.equals("")) && cognome != null && !(cognome.equals("")) && nazione != null && !(nazione.equals("")) && indirizzo != null && !(indirizzo.equals("")) && dataNascita != null && !(dataNascita.equals("")) && codiceFiscale != null && !(codiceFiscale.equals("")) && sesso != null && !(sesso.equals("")) && telefono != null && !(telefono.equals("")) && ruolo != null && !(ruolo.equals("")) && pesoStr != null && !(pesoStr.equals("")) && idProcuratore != null && !(idProcuratore.equals("")) && iban != null && !(iban.equals("")))
            return true;
        else
            return false;
    }
    
    //CLUB
    public boolean controlloRegistraPagamento(String importo, String idDestinatario) {
        if(importo != null && (!(importo.equals("")) && !(importo.equals("L'Importo"))) && Integer.parseInt(importo) > 0 && idDestinatario != null && (!(idDestinatario.equals("")) && !(idDestinatario.equals("ID Destinatario"))))
            return true;
        else
            return false;
    }
    
    public boolean controlloVisuallizzaPagamentiAtleta(String idAtleta) {
        if(idAtleta != null && (!(idAtleta.equals("")) && !(idAtleta.equals("ID Atleta"))))
            return true;
        else
            return false;
    }
    
    public boolean controlloVisuallizzaPagamentiData(java.sql.Date dataRicerca) {
        if(dataRicerca != null && !(dataRicerca.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controlloCercaPagamento(java.sql.Date dataPagamento, String idDestinatario) {
        if(dataPagamento != null && !(dataPagamento.equals("")) && idDestinatario != null && (!(idDestinatario.equals("")) && !(idDestinatario.equals("ID Destinatario"))))
            return true;
        else
            return false;
    }
    
    //SPONSOR
    public boolean controlloRegistraEvento(java.sql.Date inizioEvento, java.sql.Date fineEvento, String louogo, String titolo, String gettone){
        if(inizioEvento != null && !(inizioEvento.equals("")) && fineEvento != null && !(fineEvento.equals("")) && louogo != null && (!(louogo.equals("")) && !(louogo.equals("Luogo Evento"))) && titolo != null && (!(titolo.equals("")) && !(titolo.equals("Titolo Dell'Evento"))) && gettone != null && (!(gettone.equals("")) && !(gettone.equals("Gettone"))))
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
    
    public boolean controlloModificaEvento(java.sql.Date DatainizioEvento, java.sql.Date DatafineEvento, String louogo, String titolo, String gettone, String oraInizio, String oraFine) {
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
    
    public boolean controlloEliminaEventoData(java.sql.Date dataEvento) {
        if(dataEvento != null && !(dataEvento.equals("")))
            return true;
        else
            return false;
    }
    
    public boolean controllaInvitatti(String idAtleta, String idEvento) {
        if(idAtleta != null && !(idAtleta.equals("")) && idEvento != null && !(idEvento.equals("")))
            return true;
        else
            return false;
    }
    
    //PROCURATORE
    public boolean controlloAtleta(String datoAtleta) {
        if(datoAtleta != null && (!(datoAtleta.equals("")) && !(datoAtleta.equals("Codice Fiscale Dell'Atleta"))))
            return true;
        else
            return false;
    }
    
    public boolean controllaId(String id) {
        if(id != null && (!(id.equals("")) && !(id.equals("ID Club")) && !(id.equals("ID Sponsor"))))
            return true;
        else
            return false;
    }
    
    public boolean controllaNome(String nome) {
        if(nome != null && (!(nome.equals("")) && !(nome.equals("Nome Club")) && !(nome.equals("Nome Sponsor"))))
            return true;
        else
            return false;
    }
    
    public boolean controllaStipulaContratto(String idAtleta, String id, java.sql.Date dataInizio, java.sql.Date dataFine, String valore) {
        if(idAtleta != null && (!(idAtleta.equals("")) && !(idAtleta.equals("Codice Fiscale Dell'Atleta"))) && id != null && (!(id.equals("")) && !(id.equals("ID Club")) && !(id.equals("ID Sponsor"))) && dataInizio != null && !(dataInizio.equals("")) && dataFine != null && !(dataFine.equals("")) && valore != null && (!(valore.equals("")) && !(valore.equals("Valore Contrattuale"))))
            return true;
        else
            return false;
    }
    
    public boolean controllaModificaContratto(String idClub, String idSponsor, java.sql.Date dataInizio, java.sql.Date dataFine, String valore){
        if(idClub != null && !(idClub.equals("")) && idSponsor != null && !(idSponsor.equals("")) && dataInizio != null && !(dataInizio.equals("")) && dataFine != null && !(dataFine.equals("")) && valore != null && !(valore.equals("")))
            return true;
        else
            return false;
    }
}
