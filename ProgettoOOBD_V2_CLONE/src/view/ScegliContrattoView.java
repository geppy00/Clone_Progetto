
package view;

import view.registrare.RegistraContrattoClub;
import view.registrare.RegistrareContrattoSponsor;


public class ScegliContrattoView extends javax.swing.JFrame {

    
    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public ScegliContrattoView(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
    }
    
    public ScegliContrattoView() {
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClubJB = new javax.swing.JButton();
        btnSponsorJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClubJB.setText("CLUB");
        btnClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClubJBActionPerformed(evt);
            }
        });

        btnSponsorJB.setText("SPONSOR");
        btnSponsorJB.setToolTipText("");
        btnSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSponsorJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*ACTION PERFOMED*/
    private void btnClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClubJBActionPerformed
       RegistraContrattoClub registraContrattoClub = new RegistraContrattoClub(this.getIdProcuratore());
       registraContrattoClub.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnClubJBActionPerformed

    private void btnSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSponsorJBActionPerformed
        RegistrareContrattoSponsor registrareContrattoSponsor = new RegistrareContrattoSponsor(this.getIdProcuratore());
        registrareContrattoSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSponsorJBActionPerformed


    /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }
    
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScegliContrattoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClubJB;
    private javax.swing.JButton btnSponsorJB;
    // End of variables declaration//GEN-END:variables
}
