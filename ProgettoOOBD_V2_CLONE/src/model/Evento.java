
package model;

import java.util.ArrayList;
import java.util.Date;


public class Evento {
    
    private int idEvento;
    private Date dataEvento;
    private String luogoEvento;
    private Date oraEvento;
    private int idSponsor;
    private ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
     
    /**
     * @return the idEvento
     */
    public int getIdEvento() {
        return idEvento;
    }

    /**
     * @param idEvento the idEvento to set
     */
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * @return the dataEvento
     */
    public Date getDataEvento() {
        return dataEvento;
    }

    /**
     * @param dataEvento the dataEvento to set
     */
    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    /**
     * @return the luogoEvento
     */
    public String getLuogoEvento() {
        return luogoEvento;
    }

    /**
     * @param luogoEvento the luogoEvento to set
     */
    public void setLuogoEvento(String luogoEvento) {
        this.luogoEvento = luogoEvento;
    }

    /**
     * @return the oraEvento
     */
    public Date getOraEvento() {
        return oraEvento;
    }

    /**
     * @param oraEvento the oraEvento to set
     */
    public void setOraEvento(Date oraEvento) {
        this.oraEvento = oraEvento;
    }

    /**
     * @return the idSponsor
     */
    public int getIdSponsor() {
        return idSponsor;
    }

    /**
     * @param idSponsor the idSponsor to set
     */
    public void setIdSponsor(int idSponsor) {
        this.idSponsor = idSponsor;
    }
}
