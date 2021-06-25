
package view;

import view.elimina.EliminaSponsor;
import view.modificaDati.ModificaSponsor;
import view.registrare.RegistraSponsor;

public class SezioneSponsorView extends javax.swing.JFrame {
    
    public SezioneSponsorView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titoloJL = new javax.swing.JLabel();
        btsRegistraSponsorJB = new javax.swing.JButton();
        btnEliminaSponsorJB = new javax.swing.JButton();
        btnAggiornaSponsorJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titoloJL.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        titoloJL.setText("SEZIONE SPONSOR");

        btsRegistraSponsorJB.setText("REGISTRA SPONSOR");
        btsRegistraSponsorJB.setToolTipText("");
        btsRegistraSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsRegistraSponsorJBActionPerformed(evt);
            }
        });

        btnEliminaSponsorJB.setText("ELIMINA SPONSOR");
        btnEliminaSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaSponsorJBActionPerformed(evt);
            }
        });

        btnAggiornaSponsorJB.setText("AGGIORNA SPONSOR");
        btnAggiornaSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaSponsorJBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btsRegistraSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(btnEliminaSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnAggiornaSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(titoloJL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTornaIndietroJB)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsRegistraSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminaSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAggiornaSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnTornaIndietroJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsRegistraSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsRegistraSponsorJBActionPerformed
        RegistraSponsor registraSponsor = new RegistraSponsor();
        registraSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btsRegistraSponsorJBActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        AdminView adminView = new AdminView();
        adminView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnEliminaSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaSponsorJBActionPerformed
        EliminaSponsor eliminaSponsor = new EliminaSponsor();
        eliminaSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminaSponsorJBActionPerformed

    private void btnAggiornaSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaSponsorJBActionPerformed
        ModificaSponsor modificaSponsor = new ModificaSponsor();
        modificaSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggiornaSponsorJBActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneSponsorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaSponsorJB;
    private javax.swing.JButton btnEliminaSponsorJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JButton btsRegistraSponsorJB;
    private javax.swing.JLabel titoloJL;
    // End of variables declaration//GEN-END:variables
}
