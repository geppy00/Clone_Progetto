
package view;
import view.elimina.EliminaProcuratore;
import view.modificaDati.ModificaDatiProcuratore;
import view.registrare.RegistraProcuratore;

public class SezioneProcuratoreView extends javax.swing.JFrame {

    
    public SezioneProcuratoreView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistraProcuratoreJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnEliminaProcuratoreJB = new javax.swing.JButton();
        btnModificaDatiProcuratoreJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistraProcuratoreJB.setText("REGISTRA  UTENTE");
        btnRegistraProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraProcuratoreJBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        btnEliminaProcuratoreJB.setText("ELIMINA UTENTE");
        btnEliminaProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaProcuratoreJBActionPerformed(evt);
            }
        });

        btnModificaDatiProcuratoreJB.setText("MODIFICA DATI PERSONALI");
        btnModificaDatiProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaDatiProcuratoreJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnRegistraProcuratoreJB, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(btnEliminaProcuratoreJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(btnModificaDatiProcuratoreJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTornaIndietroJB)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistraProcuratoreJB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminaProcuratoreJB, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificaDatiProcuratoreJB, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnTornaIndietroJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistraProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraProcuratoreJBActionPerformed
        RegistraProcuratore registraProcuratore = new RegistraProcuratore();
        registraProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistraProcuratoreJBActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
       AdminView adminPage = new AdminView();
       adminPage.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnEliminaProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaProcuratoreJBActionPerformed
       EliminaProcuratore eliminaProcuratore = new EliminaProcuratore();
       eliminaProcuratore.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnEliminaProcuratoreJBActionPerformed

    private void btnModificaDatiProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaDatiProcuratoreJBActionPerformed
        ModificaDatiProcuratore modificaDatiProcuratore = new ModificaDatiProcuratore();
        modificaDatiProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificaDatiProcuratoreJBActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SezioneProcuratoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SezioneProcuratoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SezioneProcuratoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SezioneProcuratoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminaProcuratoreJB;
    private javax.swing.JButton btnModificaDatiProcuratoreJB;
    private javax.swing.JButton btnRegistraProcuratoreJB;
    private javax.swing.JButton btnTornaIndietroJB;
    // End of variables declaration//GEN-END:variables
}
