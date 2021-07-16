
package view;

import dao.ExceptionDao;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.elimina.EliminaPagamento;
import view.modificaDati.ModificaPagamento;
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

        jPanel1 = new javax.swing.JPanel();
        btnEffettuaPagamentoJB = new javax.swing.JButton();
        btnVisualizzaPagamentiJB = new javax.swing.JButton();
        btnEliminaPagamentoJB = new javax.swing.JButton();
        btnModificaPagamentiJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEffettuaPagamentoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnEffettuaPagamentoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEffettuaPagamentoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEffettuaPagamentoJB.setText("Effetua Pagamento");
        btnEffettuaPagamentoJB.setActionCommand("Procutore");
        btnEffettuaPagamentoJB.setBorder(null);
        btnEffettuaPagamentoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEffettuaPagamentoJB.setFocusPainted(false);
        btnEffettuaPagamentoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEffettuaPagamentoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEffettuaPagamentoJBMouseExited(evt);
            }
        });
        btnEffettuaPagamentoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffettuaPagamentoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEffettuaPagamentoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, 80));

        btnVisualizzaPagamentiJB.setBackground(new java.awt.Color(1, 180, 245));
        btnVisualizzaPagamentiJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVisualizzaPagamentiJB.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizzaPagamentiJB.setText("Visualizza Pagamento");
        btnVisualizzaPagamentiJB.setBorder(null);
        btnVisualizzaPagamentiJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizzaPagamentiJB.setFocusable(false);
        btnVisualizzaPagamentiJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizzaPagamentiJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisualizzaPagamentiJBMouseExited(evt);
            }
        });
        btnVisualizzaPagamentiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizzaPagamentiJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnVisualizzaPagamentiJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 250, 80));

        btnEliminaPagamentoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnEliminaPagamentoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminaPagamentoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminaPagamentoJB.setText("Delete Pagemento");
        btnEliminaPagamentoJB.setBorder(null);
        btnEliminaPagamentoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminaPagamentoJB.setFocusable(false);
        btnEliminaPagamentoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminaPagamentoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminaPagamentoJBMouseExited(evt);
            }
        });
        btnEliminaPagamentoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaPagamentoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminaPagamentoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 250, 80));

        btnModificaPagamentiJB.setBackground(new java.awt.Color(1, 180, 245));
        btnModificaPagamentiJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificaPagamentiJB.setForeground(new java.awt.Color(255, 255, 255));
        btnModificaPagamentiJB.setText("Update Pagamento");
        btnModificaPagamentiJB.setBorder(null);
        btnModificaPagamentiJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificaPagamentiJB.setFocusable(false);
        btnModificaPagamentiJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificaPagamentiJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificaPagamentiJBMouseExited(evt);
            }
        });
        btnModificaPagamentiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaPagamentiJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificaPagamentiJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 250, 80));

        btnClose.setBackground(new java.awt.Color(11, 58, 151));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setFocusPainted(false);
        btnClose.setFocusable(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, 40));

        btnTornaIndietroJB.setBackground(new java.awt.Color(11, 58, 151));
        btnTornaIndietroJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnTornaIndietroJB.setBorder(null);
        btnTornaIndietroJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTornaIndietroJB.setFocusPainted(false);
        btnTornaIndietroJB.setFocusable(false);
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Club System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEffettuaPagamentoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEffettuaPagamentoJBMouseEntered
        btnEffettuaPagamentoJB.setBackground(new Color(34,87,191));
        btnEffettuaPagamentoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnEffettuaPagamentoJBMouseEntered

    private void btnEffettuaPagamentoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEffettuaPagamentoJBMouseExited
        btnEffettuaPagamentoJB.setBackground(new Color(1,180,245));
        btnEffettuaPagamentoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEffettuaPagamentoJBMouseExited

    private void btnEffettuaPagamentoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffettuaPagamentoJBActionPerformed
       RegistraPagamento registraPagamento = new RegistraPagamento(this.getIdClub());
        registraPagamento.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEffettuaPagamentoJBActionPerformed

    private void btnVisualizzaPagamentiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizzaPagamentiJBMouseEntered
        btnVisualizzaPagamentiJB.setBackground(new Color(34,87,191));
        btnVisualizzaPagamentiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnVisualizzaPagamentiJBMouseEntered

    private void btnVisualizzaPagamentiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizzaPagamentiJBMouseExited
        btnVisualizzaPagamentiJB.setBackground(new Color(1,180,245));
        btnVisualizzaPagamentiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnVisualizzaPagamentiJBMouseExited

    private void btnVisualizzaPagamentiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizzaPagamentiJBActionPerformed
        SezioneVisualizzaPagamenti sezioneVisualizzaPagamenti = null;
        sezioneVisualizzaPagamenti = new SezioneVisualizzaPagamenti(this.getIdClub());
        sezioneVisualizzaPagamenti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVisualizzaPagamentiJBActionPerformed

    private void btnEliminaPagamentoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaPagamentoJBMouseEntered
        btnEliminaPagamentoJB.setBackground(new Color(34,87,191));
        btnEliminaPagamentoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnEliminaPagamentoJBMouseEntered

    private void btnEliminaPagamentoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaPagamentoJBMouseExited
        btnEliminaPagamentoJB.setBackground(new Color(1,180,245));
        btnEliminaPagamentoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEliminaPagamentoJBMouseExited

    private void btnEliminaPagamentoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaPagamentoJBActionPerformed
        EliminaPagamento eliminaPagamento = new EliminaPagamento(this.getIdClub());
        eliminaPagamento.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminaPagamentoJBActionPerformed

    private void btnModificaPagamentiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaPagamentiJBMouseEntered
        btnModificaPagamentiJB.setBackground(new Color(34,87,191));
        btnModificaPagamentiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnModificaPagamentiJBMouseEntered

    private void btnModificaPagamentiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaPagamentiJBMouseExited
        btnModificaPagamentiJB.setBackground(new Color(1,180,245));
        btnModificaPagamentiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnModificaPagamentiJBMouseExited

    private void btnModificaPagamentiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaPagamentiJBActionPerformed
        ModificaPagamento modificaPagamento = new ModificaPagamento(this.getIdClub());
        modificaPagamento.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificaPagamentiJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        ClubView clubView = new ClubView(this.getIdClub());
        clubView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

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
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEffettuaPagamentoJB;
    private javax.swing.JButton btnEliminaPagamentoJB;
    private javax.swing.JButton btnModificaPagamentiJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JButton btnVisualizzaPagamentiJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
