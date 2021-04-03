
package model;

import java.util.Date;


public class Contratto {

    
    private String idAtleta;
    private int idSponsor; 
    private int idClub; 
    private Date dataStart; 
    private Date dataEnd;
    
    /**
     * @return the idAtleta
     */
    public String getIdAtleta() {
        return idAtleta;
    }

    /**
     * @param idAtleta the idAtleta to set
     */
    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
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
     * @return the dataStart
     */
    public Date getDataStart() {
        return dataStart;
    }

    /**
     * @param dataStart the dataStart to set
     */
    public void setDataStart(Date dataStart) {
        this.dataStart = dataStart;
    }

    /**
     * @return the dataEnd
     */
    public Date getDataEnd() {
        return dataEnd;
    }

    /**
     * @param dataEnd the dataEnd to set
     */
    public void setDataEnd(Date dataEnd) {
        this.dataEnd = dataEnd;
    }
}
