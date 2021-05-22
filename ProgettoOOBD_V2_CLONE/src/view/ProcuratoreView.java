
package view;

public class ProcuratoreView extends javax.swing.JFrame {

    private String idProcuratore;
     
    /*COSTRUTTORE*/
    public ProcuratoreView(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
    }

    public ProcuratoreView() {
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        benvenutoJL = new javax.swing.JLabel();
        btnGestireContrattiJB = new javax.swing.JButton();
        btnDenaroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        benvenutoJL.setText("BENVENUTO PROCURATORE");

        btnGestireContrattiJB.setText("GESTIRE CONTRATTI");
        btnGestireContrattiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestireContrattiJBActionPerformed(evt);
            }
        });

        btnDenaroJB.setText("GESTIONE DENARO");
        btnDenaroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenaroJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnGestireContrattiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btnDenaroJB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(benvenutoJL)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(benvenutoJL)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestireContrattiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDenaroJB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestireContrattiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestireContrattiJBActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());  
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGestireContrattiJBActionPerformed

    private void btnDenaroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenaroJBActionPerformed
        PercentualiGuadagnoProcuratoreView percentualiGuadagnoProcuratoreView = new PercentualiGuadagnoProcuratoreView(this.getIdProcuratore());
        percentualiGuadagnoProcuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDenaroJBActionPerformed

    
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
                new ProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel benvenutoJL;
    private javax.swing.JButton btnDenaroJB;
    private javax.swing.JButton btnGestireContrattiJB;
    // End of variables declaration//GEN-END:variables
}
