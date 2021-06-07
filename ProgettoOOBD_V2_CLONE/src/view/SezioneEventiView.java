
package view;

import view.elimina.EliminaEvento;
import view.registrare.RegistraEventoSponsor;

public class SezioneEventiView extends javax.swing.JFrame {

    private String idSponsor;
    
    /*COSTRUTTORI*/
    public SezioneEventiView(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
    }

    public SezioneEventiView() {
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreaEventoJB = new javax.swing.JButton();
        btnElencoEventiJB = new javax.swing.JButton();
        btnCancellaEventoJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnPartecipantiJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreaEventoJB.setText("CREA EVENTO");
        btnCreaEventoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaEventoJBActionPerformed(evt);
            }
        });

        btnElencoEventiJB.setText("ELENCO/MODIFICA EVENTI");
        btnElencoEventiJB.setToolTipText("");
        btnElencoEventiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElencoEventiJBActionPerformed(evt);
            }
        });

        btnCancellaEventoJB.setText("CANCELLA EVENTO");
        btnCancellaEventoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancellaEventoJBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        btnPartecipantiJB.setText("ELENCO PARTECIPANTI");
        btnPartecipantiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartecipantiJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnCreaEventoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(265, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnElencoEventiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnPartecipantiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancellaEventoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreaEventoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnElencoEventiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancellaEventoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPartecipantiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(btnTornaIndietroJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnCreaEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaEventoJBActionPerformed
        RegistraEventoSponsor registraEventoSponsor = new RegistraEventoSponsor(this.getIdSponsor());
        registraEventoSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCreaEventoJBActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SponsorView sponsorView = new SponsorView(this.getIdSponsor());
        sponsorView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnElencoEventiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElencoEventiJBActionPerformed
        ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
        elencoEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnElencoEventiJBActionPerformed

    private void btnCancellaEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellaEventoJBActionPerformed
        EliminaEvento eliminaEvento = new EliminaEvento(this.getIdSponsor());
        eliminaEvento.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancellaEventoJBActionPerformed

    private void btnPartecipantiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartecipantiJBActionPerformed
        ElencoPartecipantiSponsor elencoPartecipantiSponsor = new ElencoPartecipantiSponsor(this.getIdSponsor());
        elencoPartecipantiSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPartecipantiJBActionPerformed

    
    /*GET AND SET*/
    public String getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(String idSponsor) {
        this.idSponsor = idSponsor;
    }
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneEventiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancellaEventoJB;
    private javax.swing.JButton btnCreaEventoJB;
    private javax.swing.JButton btnElencoEventiJB;
    private javax.swing.JButton btnPartecipantiJB;
    private javax.swing.JButton btnTornaIndietroJB;
    // End of variables declaration//GEN-END:variables
}
