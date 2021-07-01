
package view.elimina;

import controller.ControllerProcuratore;
import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.SezioneEliminaContrattoProcuratore;

public class EliminaContrattoProcuratore extends javax.swing.JFrame {

    private String idProcuratore;
    private int numeroContratto;
    private String idAtleta;
    
    /*COSTRUTTORI*/
    public EliminaContrattoProcuratore(String idProcuratore, int numeroContratto, String idAtleta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        this.numeroContratto = numeroContratto;
        this.idAtleta = idAtleta;
        
        adviceJL.setText("SEI SICURO DI VOLER ELIMINARE IL CONTRATTO NUMERO "+this.getNumeroContratto()+" ?");
    }
    
    public EliminaContrattoProcuratore() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adviceJL = new javax.swing.JLabel();
        btnYesJB = new javax.swing.JButton();
        btnNoJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnYesJB.setText("SI");
        btnYesJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesJBActionPerformed(evt);
            }
        });

        btnNoJB.setText("NO");
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
                .addGap(161, 161, 161)
                .addComponent(adviceJL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnYesJB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnNoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adviceJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYesJB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnYesJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        try {
            controllerProcuratore.eliminaContratto(this.getNumeroContratto(), this.getIdAtleta());
            SezioneEliminaContrattoProcuratore sezioneEliminaContrattoProcuratore = new SezioneEliminaContrattoProcuratore(this.getIdProcuratore());
            sezioneEliminaContrattoProcuratore.setVisible(true);
            this.setVisible(false);
        } catch (ExceptionDao ex) {
            Logger.getLogger(EliminaContrattoProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnYesJBActionPerformed

    private void btnNoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoJBActionPerformed
        SezioneEliminaContrattoProcuratore sezioneEliminaContrattoProcuratore = new SezioneEliminaContrattoProcuratore(this.getIdProcuratore());
        sezioneEliminaContrattoProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNoJBActionPerformed

      /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }
    
    public int getNumeroContratto() {
        return numeroContratto;
    }

    public void setNumeroContratto(int numeroContratto) {
        this.numeroContratto = numeroContratto;
    }
    
    public String getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaContrattoProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adviceJL;
    private javax.swing.JButton btnNoJB;
    private javax.swing.JButton btnYesJB;
    // End of variables declaration//GEN-END:variables
}
