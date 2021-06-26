
package convalidazione;

public class ControlloConvalidazione {
    
    /*COSTRUTTORE*/
    public ControlloConvalidazione() {
        
    }
    
    /*METODI*/
    public boolean controlloRegistraProcuratore(String matricolaPresa, String nomePreso, String cognomePreso, String nazionePresa, String indirizzoPreso, String dataNascitaPresoSql, String codiceFiscalePreso) {
        if(matricolaPresa != null && !(matricolaPresa.equals("")) && nomePreso != null && !(nomePreso.equals("")) && cognomePreso != null && !(cognomePreso.equals("")) && nazionePresa != null && !(nazionePresa.equals("")) &&  indirizzoPreso != null && !(indirizzoPreso.equals("")) && dataNascitaPresoSql != null && !(dataNascitaPresoSql.equals("")) && codiceFiscalePreso != null && !(codiceFiscalePreso.equals(""))) 
            return true;
        else
            return false;
    }
}
