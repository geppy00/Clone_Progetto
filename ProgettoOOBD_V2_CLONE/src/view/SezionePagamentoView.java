
package view;

import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.registrare.RegistraPagamento;


public class SezionePagamentoView extends javax.swing.JFrame {
    
    private String idClub;
    
    /*COSTRUTTORI*/
    public SezionePagamentoView(String idClub) {
        initComponents();
        this.idClub = idClub;
        this.setLocationRelativeTo(null);
    }
    
    public SezionePagamentoView() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEffettuaPagamentoJB = new javax.swing.JButton();
        btnVisualizzaPagamentiJB = new javax.swing.JButton();
        btnModificaPagamentiJB = new javax.swing.JButton();
        btnEliminaPagamentoJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEffettuaPagamentoJB.setText("EFFETTUA PAGAMENTO");
        btnEffettuaPagamentoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffettuaPagamentoJBActionPerformed(evt);
            }
        });

        btnVisualizzaPagamentiJB.setText("VISUALIZZA PAGAMENTI");
        btnVisualizzaPagamentiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizzaPagamentiJBActionPerformed(evt);
            }
        });

        btnModificaPagamentiJB.setText("MODIFICA PAGAMENTI");

        btnEliminaPagamentoJB.setText("ANNULLA PAGAMENTO");

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
                .addGap(32, 32, 32)
                .addComponent(btnEffettuaPagamentoJB)
                .addGap(18, 18, 18)
                .addComponent(btnVisualizzaPagamentiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificaPagamentiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminaPagamentoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTornaIndietroJB)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEffettuaPagamentoJB, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnVisualizzaPagamentiJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificaPagamentiJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminaPagamentoJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(btnTornaIndietroJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        ClubView clubView = new ClubView(this.getIdClub());
        clubView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnEffettuaPagamentoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffettuaPagamentoJBActionPerformed
        RegistraPagamento registraPagamento = new RegistraPagamento(this.getIdClub());
        registraPagamento.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEffettuaPagamentoJBActionPerformed

    private void btnVisualizzaPagamentiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizzaPagamentiJBActionPerformed
        SezioneVisualizzaPagamenti sezioneVisualizzaPagamenti = null;
        try {
            sezioneVisualizzaPagamenti = new SezioneVisualizzaPagamenti(this.getIdClub());
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezionePagamentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        sezioneVisualizzaPagamenti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVisualizzaPagamentiJBActionPerformed

    /*GET AND SET*/
    public String getIdClub() {
        return idClub;
    }

    public void setIdClub(String idClub) {
        this.idClub = idClub;
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezionePagamentoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEffettuaPagamentoJB;
    private javax.swing.JButton btnEliminaPagamentoJB;
    private javax.swing.JButton btnModificaPagamentiJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JButton btnVisualizzaPagamentiJB;
    // End of variables declaration//GEN-END:variables
}
