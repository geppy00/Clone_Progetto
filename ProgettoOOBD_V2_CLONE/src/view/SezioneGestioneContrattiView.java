
package view;

import view.registrare.RegistraContrattoClub;


public class SezioneGestioneContrattiView extends javax.swing.JFrame {

    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public SezioneGestioneContrattiView(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
    }

    public SezioneGestioneContrattiView() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titoloJL = new javax.swing.JLabel();
        btnStipulaContrattoJB = new javax.swing.JButton();
        btnModificaContrattoJB = new javax.swing.JButton();
        btnVisualizzaContrttiJB = new javax.swing.JButton();
        btnEliminaContrattoJB = new javax.swing.JButton();
        btnTornaIndietriJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titoloJL.setText("GESTIONE CONTRATTI");

        btnStipulaContrattoJB.setText("STABILIRE CONTRATTO");
        btnStipulaContrattoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStipulaContrattoJBActionPerformed(evt);
            }
        });

        btnModificaContrattoJB.setText("MODIFICA CONTRATTO");

        btnVisualizzaContrttiJB.setText("VISUALIZZA CONTRATTI");

        btnEliminaContrattoJB.setText("ELIMINA CONTRATTO");

        btnTornaIndietriJB.setText("TORNA INDIETRO");
        btnTornaIndietriJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietriJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addComponent(titoloJL))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnStipulaContrattoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(btnModificaContrattoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(btnVisualizzaContrttiJB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(btnEliminaContrattoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTornaIndietriJB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloJL)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVisualizzaContrttiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminaContrattoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnStipulaContrattoJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificaContrattoJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnTornaIndietriJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnTornaIndietriJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietriJBActionPerformed
        ProcuratoreView procuratoreView = new ProcuratoreView(this.getIdProcuratore());
        procuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietriJBActionPerformed

    private void btnStipulaContrattoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStipulaContrattoJBActionPerformed
        ScegliContrattoView scegliContrattoView = new ScegliContrattoView(this.getIdProcuratore());
        scegliContrattoView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnStipulaContrattoJBActionPerformed

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
                new SezioneGestioneContrattiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminaContrattoJB;
    private javax.swing.JButton btnModificaContrattoJB;
    private javax.swing.JButton btnStipulaContrattoJB;
    private javax.swing.JButton btnTornaIndietriJB;
    private javax.swing.JButton btnVisualizzaContrttiJB;
    private javax.swing.JLabel titoloJL;
    // End of variables declaration//GEN-END:variables
}
