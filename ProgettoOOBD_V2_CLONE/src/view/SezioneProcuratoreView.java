
package view;
import java.awt.Color;
import view.elimina.EliminaProcuratore;
import view.modificaDati.ModificaDatiProcuratore;
import view.registrare.RegistraProcuratore;

public class SezioneProcuratoreView extends javax.swing.JFrame {


    
    public SezioneProcuratoreView() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegistraProcuratore = new javax.swing.JButton();
        btnEliminaProcuratoreJB = new javax.swing.JButton();
        btnModificaDatiProcuratoreJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();
        jLCurrentAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistraProcuratore.setBackground(new java.awt.Color(1, 180, 245));
        RegistraProcuratore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RegistraProcuratore.setForeground(new java.awt.Color(255, 255, 255));
        RegistraProcuratore.setText("Add Procuratore");
        RegistraProcuratore.setActionCommand("Procutore");
        RegistraProcuratore.setBorder(null);
        RegistraProcuratore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistraProcuratore.setFocusPainted(false);
        RegistraProcuratore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistraProcuratoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistraProcuratoreMouseExited(evt);
            }
        });
        RegistraProcuratore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistraProcuratoreActionPerformed(evt);
            }
        });
        jPanel1.add(RegistraProcuratore, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 410, 80));

        btnEliminaProcuratoreJB.setBackground(new java.awt.Color(1, 180, 245));
        btnEliminaProcuratoreJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminaProcuratoreJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminaProcuratoreJB.setText("Delete Procuratore");
        btnEliminaProcuratoreJB.setToolTipText("");
        btnEliminaProcuratoreJB.setBorder(null);
        btnEliminaProcuratoreJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminaProcuratoreJB.setFocusable(false);
        btnEliminaProcuratoreJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminaProcuratoreJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminaProcuratoreJBMouseExited(evt);
            }
        });
        btnEliminaProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaProcuratoreJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminaProcuratoreJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 410, 80));

        btnModificaDatiProcuratoreJB.setBackground(new java.awt.Color(1, 180, 245));
        btnModificaDatiProcuratoreJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificaDatiProcuratoreJB.setForeground(new java.awt.Color(255, 255, 255));
        btnModificaDatiProcuratoreJB.setText("Update Procuratore");
        btnModificaDatiProcuratoreJB.setBorder(null);
        btnModificaDatiProcuratoreJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificaDatiProcuratoreJB.setFocusable(false);
        btnModificaDatiProcuratoreJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificaDatiProcuratoreJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificaDatiProcuratoreJBMouseExited(evt);
            }
        });
        btnModificaDatiProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaDatiProcuratoreJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificaDatiProcuratoreJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 410, 80));

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 40));

        btnLogoutJB.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnLogoutJB.setBorder(null);
        btnLogoutJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB.setFocusPainted(false);
        btnLogoutJB.setFocusable(false);
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 40));

        jLCurrentAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCurrentAccount.setForeground(new java.awt.Color(255, 255, 255));
        jLCurrentAccount.setText("Current Account:");
        jPanel1.add(jLCurrentAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 160, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sportivo System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGap(0, 713, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistraProcuratoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistraProcuratoreMouseEntered
        RegistraProcuratore.setBackground(new Color(34,87,191));
        RegistraProcuratore.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_RegistraProcuratoreMouseEntered

    private void RegistraProcuratoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistraProcuratoreMouseExited
        RegistraProcuratore.setBackground(new Color(1,180,245));
        RegistraProcuratore.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_RegistraProcuratoreMouseExited

    private void RegistraProcuratoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistraProcuratoreActionPerformed
        RegistraProcuratore registraProcuratore = new RegistraProcuratore();
        registraProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistraProcuratoreActionPerformed

    private void btnEliminaProcuratoreJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaProcuratoreJBMouseEntered
        btnEliminaProcuratoreJB.setBackground(new Color(34,87,191));
        btnEliminaProcuratoreJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnEliminaProcuratoreJBMouseEntered

    private void btnEliminaProcuratoreJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaProcuratoreJBMouseExited
        btnEliminaProcuratoreJB.setBackground(new Color(1,180,245));
        btnEliminaProcuratoreJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEliminaProcuratoreJBMouseExited

    private void btnEliminaProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaProcuratoreJBActionPerformed
        EliminaProcuratore eliminaProcuratore = new EliminaProcuratore();
       eliminaProcuratore.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnEliminaProcuratoreJBActionPerformed

    private void btnModificaDatiProcuratoreJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaDatiProcuratoreJBMouseEntered
        btnModificaDatiProcuratoreJB.setBackground(new Color(34,87,191));
        btnModificaDatiProcuratoreJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnModificaDatiProcuratoreJBMouseEntered

    private void btnModificaDatiProcuratoreJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaDatiProcuratoreJBMouseExited
        btnModificaDatiProcuratoreJB.setBackground(new Color(1,180,245));
        btnModificaDatiProcuratoreJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnModificaDatiProcuratoreJBMouseExited

    private void btnModificaDatiProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaDatiProcuratoreJBActionPerformed
        
        ModificaDatiProcuratore modificaDatiProcuratore = new ModificaDatiProcuratore();
        modificaDatiProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificaDatiProcuratoreJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
       AdminView adminPage = new AdminView();
       adminPage.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegistraProcuratore;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEliminaProcuratoreJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnModificaDatiProcuratoreJB;
    private javax.swing.JLabel jLCurrentAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
