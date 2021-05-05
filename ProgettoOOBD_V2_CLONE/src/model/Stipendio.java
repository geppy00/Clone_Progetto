
package model;


public class Stipendio {
    
    private int idstipendio;
    private double val_stipendio;
    private int status_pagamento;
    private String idatleta;
    private int idclub;
    private java.sql.Date dataPagamento;
    
    
    public int getIdstipendio() {
        return idstipendio;
    }

    public void setIdstipendio(int idstipendio) {
        this.idstipendio = idstipendio;
    }

    public double getVal_stipendio() {
        return val_stipendio;
    }

    public void setVal_stipendio(double val_stipendio) {
        this.val_stipendio = val_stipendio;
    }

    public int getStatus_pagamento() {
        return status_pagamento;
    }

    public void setStatus_pagamento(int status_pagamento) {
        this.status_pagamento = status_pagamento;
    }

    public String getIdatleta() {
        return idatleta;
    }

    public void setIdatleta(String idatleta) {
        this.idatleta = idatleta;
    }

    public int getIdclub() {
        return idclub;
    }

    public void setIdclub(int idclub) {
        this.idclub = idclub;
    }
    
    public java.sql.Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(java.sql.Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
