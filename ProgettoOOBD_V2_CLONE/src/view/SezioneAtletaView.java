
package view;

import view.elimina.EliminaAtleta;
import view.modificaDati.ModificaSportivo;
import view.registrare.RegistrareSportivo;


public class SezioneAtletaView extends javax.swing.JFrame {

    public SezioneAtletaView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sezSportivoJL = new javax.swing.JLabel();
        btnAggiungiSportivoJB = new javax.swing.JButton();
        btnEliminaSportivoJB = new javax.swing.JButton();
        btnAggiornaSportivoJB = new javax.swing.JButton();
        btnIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sezSportivoJL.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        sezSportivoJL.setText("SEZIONE SPORTIVO");

        btnAggiungiSportivoJB.setText("AGGIUNGI SPORTIVO");
        btnAggiungiSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiungiSportivoJBActionPerformed(evt);
            }
        });

        btnEliminaSportivoJB.setText("ELIMINA SPORTIVO");
        btnEliminaSportivoJB.setToolTipText("");
        btnEliminaSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaSportivoJBActionPerformed(evt);
            }
        });

        btnAggiornaSportivoJB.setText("AGGIORNA SPORTIVO");
        btnAggiornaSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaSportivoJBActionPerformed(evt);
            }
        });

        btnIndietroJB.setText("TORNA INDIETRO");
        btnIndietroJB.setToolTipText("");
        btnIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndietroJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(sezSportivoJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIndietroJB)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAggiungiSportivoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(btnEliminaSportivoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btnAggiornaSportivoJB)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIndietroJB)
                    .addComponent(sezSportivoJL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAggiungiSportivoJB, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnAggiornaSportivoJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminaSportivoJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAggiungiSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiungiSportivoJBActionPerformed
        RegistrareSportivo registraSportivo = new RegistrareSportivo();
        registraSportivo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggiungiSportivoJBActionPerformed

    private void btnIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndietroJBActionPerformed
        AdminView adminView = new AdminView();
        adminView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIndietroJBActionPerformed

    private void btnEliminaSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaSportivoJBActionPerformed
        EliminaAtleta eliminaAtleta = new EliminaAtleta();
        eliminaAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminaSportivoJBActionPerformed

    private void btnAggiornaSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaSportivoJBActionPerformed
        ModificaSportivo modificaSportivo = new ModificaSportivo();
        modificaSportivo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggiornaSportivoJBActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneAtletaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaSportivoJB;
    private javax.swing.JButton btnAggiungiSportivoJB;
    private javax.swing.JButton btnEliminaSportivoJB;
    private javax.swing.JButton btnIndietroJB;
    private javax.swing.JLabel sezSportivoJL;
    // End of variables declaration//GEN-END:variables
}
