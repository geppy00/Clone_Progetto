
package view;


public class SezioneIntroitiAtleta extends javax.swing.JFrame {

    private String idAtleta;
    
    /*COSTRUTTORI*/
    public SezioneIntroitiAtleta(String idAtleta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAtleta = idAtleta;
    }
    
    public SezioneIntroitiAtleta() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPagamentiClubJB = new javax.swing.JButton();
        btnContrattiStipulatiJB = new javax.swing.JButton();
        btnGettoniEventoJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPagamentiClubJB.setText("PAGAMENTI DEL CLUB");
        btnPagamentiClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentiClubJBActionPerformed(evt);
            }
        });

        btnContrattiStipulatiJB.setText("CONTRATTI STIPULATI");
        btnContrattiStipulatiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContrattiStipulatiJBActionPerformed(evt);
            }
        });

        btnGettoniEventoJB.setText("GETTONI EVENTO");
        btnGettoniEventoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGettoniEventoJBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("Torna Indietro");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPagamentiClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(btnGettoniEventoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnContrattiStipulatiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTornaIndietroJB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContrattiStipulatiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGettoniEventoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagamentiClubJB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnTornaIndietroJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnPagamentiClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentiClubJBActionPerformed
        SezionePagamentiClubAtleta sezionePagamentiClubAtleta = new SezionePagamentiClubAtleta(this.getIdAtleta());
        sezionePagamentiClubAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPagamentiClubJBActionPerformed

    private void btnGettoniEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGettoniEventoJBActionPerformed
        SezioneGettoniEventoAtleta sezioneGettoniEventoAtleta = new SezioneGettoniEventoAtleta(this.getIdAtleta());
        sezioneGettoniEventoAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGettoniEventoJBActionPerformed

    private void btnContrattiStipulatiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContrattiStipulatiJBActionPerformed
        ScegliContrattiAtleta scegliContrattiAtleta = new ScegliContrattiAtleta(this.getIdAtleta());
        scegliContrattiAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContrattiStipulatiJBActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        AtletaView atletaView = new AtletaView(this.getIdAtleta());
        atletaView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    /*GET AND SET*/
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
                new SezioneIntroitiAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContrattiStipulatiJB;
    private javax.swing.JButton btnGettoniEventoJB;
    private javax.swing.JButton btnPagamentiClubJB;
    private javax.swing.JButton btnTornaIndietroJB;
    // End of variables declaration//GEN-END:variables
}
