
package view.modificaDati;

import controller.ControllerProcuratore;
import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConfermaModificaContrattiProcuratore extends javax.swing.JFrame {

   

    private String idAtleta; 
    private int idSponsor; 
    private int idClub; 
    private java.sql.Date dataInizio;  
    private java.sql.Date dataFine; 
    private float valContratto;
    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public ConfermaModificaContrattiProcuratore(String idProcuratore, String idAtleta, int idSponsor, int idClub, java.sql.Date dataInizio,  java.sql.Date dataFine, float valContratto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        this.idAtleta = idAtleta;
        this.idSponsor = idSponsor;
        this.idClub = idClub;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.valContratto = valContratto;
    }

    public ConfermaModificaContrattiProcuratore() {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSiJB1 = new javax.swing.JButton();
        btnNoJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSiJB1.setText("SI");
        btnSiJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiJB1ActionPerformed(evt);
            }
        });

        btnNoJB.setText("NO");
        btnNoJB.setToolTipText("");
        btnNoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnSiJB1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiJB1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnSiJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiJB1ActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        try {
            controllerProcuratore.modificaContratto(this.getIdAtleta(), this.getIdSponsor(), this.getIdClub(), this.getDataInizio(), this.getDataFine(), this.getValContratto());
        } catch (ExceptionDao ex) {
            Logger.getLogger(ConfermaModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiJB1ActionPerformed

    private void btnNoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoJBActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnNoJBActionPerformed

   
    /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }
    
    
     public String getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }

    public int getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(int idSponsor) {
        this.idSponsor = idSponsor;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public java.sql.Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(java.sql.Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public java.sql.Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(java.sql.Date dataFine) {
        this.dataFine = dataFine;
    }

    public float getValContratto() {
        return valContratto;
    }

    public void setValContratto(float valContratto) {
        this.valContratto = valContratto;
    }
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfermaModificaContrattiProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNoJB;
    private javax.swing.JButton btnSiJB1;
    // End of variables declaration//GEN-END:variables
}
