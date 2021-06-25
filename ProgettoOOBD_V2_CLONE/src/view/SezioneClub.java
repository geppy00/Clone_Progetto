
package view;

import view.elimina.EliminaClub;
import view.modificaDati.ModificaDatiClub;
import view.registrare.RegistraClub;

public class SezioneClub extends javax.swing.JFrame {

   
    
    public SezioneClub() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sezioneClubJL = new javax.swing.JLabel();
        btnRegistraClubJB = new javax.swing.JButton();
        btnEliminaClubJB = new javax.swing.JButton();
        btnAggiornaClubJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sezioneClubJL.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        sezioneClubJL.setText("SEZIONE CLUB");

        btnRegistraClubJB.setText("REGISTRA CLUB");
        btnRegistraClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraClubJBActionPerformed(evt);
            }
        });

        btnEliminaClubJB.setText("ELIMINA CLUB");
        btnEliminaClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaClubJBActionPerformed(evt);
            }
        });

        btnAggiornaClubJB.setText("AGGIORNA CLUB");
        btnAggiornaClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaClubJBActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistraClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sezioneClubJL)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnEliminaClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(btnAggiornaClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(sezioneClubJL)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistraClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminaClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAggiornaClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnTornaIndietroJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
       AdminView adminView = new AdminView();
       adminView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnRegistraClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraClubJBActionPerformed
        RegistraClub registraClub = new RegistraClub();
        registraClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistraClubJBActionPerformed

    private void btnEliminaClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaClubJBActionPerformed
        EliminaClub eliminaClub = new EliminaClub();
        eliminaClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminaClubJBActionPerformed

    private void btnAggiornaClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaClubJBActionPerformed
        ModificaDatiClub modificaDatiClub = new ModificaDatiClub();
        modificaDatiClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggiornaClubJBActionPerformed

     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaClubJB;
    private javax.swing.JButton btnEliminaClubJB;
    private javax.swing.JButton btnRegistraClubJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel sezioneClubJL;
    // End of variables declaration//GEN-END:variables
}
