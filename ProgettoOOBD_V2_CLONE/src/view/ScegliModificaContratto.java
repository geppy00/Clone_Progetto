
package view;

public class ScegliModificaContratto extends javax.swing.JFrame {

    private String idProcuratore;
 
    /*COSTRUTORI*/
    public ScegliModificaContratto(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
    }
    
    public ScegliModificaContratto() {
        
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
                .addContainerGap()
                .addComponent(btnClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSponsorJB, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(btnClubJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClubJBActionPerformed
        ContrattiClubProcuratoreView contrattiClubProcuratoreView = new ContrattiClubProcuratoreView(this.getIdProcuratore());
        contrattiClubProcuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnClubJBActionPerformed

    private void btnSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSponsorJBActionPerformed
        ContrattiSponsorProcuratoreView contrattiSponsorProcuratoreView = new ContrattiSponsorProcuratoreView(this.getIdProcuratore());
        contrattiSponsorProcuratoreView.setVisible(true);
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
                new ScegliModificaContratto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClubJB;
    private javax.swing.JButton btnSponsorJB;
    // End of variables declaration//GEN-END:variables
}
