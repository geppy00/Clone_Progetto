
package view;

import java.awt.Color;
import view.elimina.EliminaSponsor;
import view.modificaDati.ModificaSponsor;
import view.registrare.RegistraSponsor;

public class SezioneSponsorView extends javax.swing.JFrame {
    
    public SezioneSponsorView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btsRegistraSponsorJB = new javax.swing.JButton();
        btnEliminaSponsorJB = new javax.swing.JButton();
        btnAggiornaSponsorJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();
        jLCurrentAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btsRegistraSponsorJB.setBackground(new java.awt.Color(1, 180, 245));
        btsRegistraSponsorJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btsRegistraSponsorJB.setForeground(new java.awt.Color(255, 255, 255));
        btsRegistraSponsorJB.setText("Add Sponsor");
        btsRegistraSponsorJB.setActionCommand("Procutore");
        btsRegistraSponsorJB.setBorder(null);
        btsRegistraSponsorJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsRegistraSponsorJB.setFocusPainted(false);
        btsRegistraSponsorJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btsRegistraSponsorJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btsRegistraSponsorJBMouseExited(evt);
            }
        });
        btsRegistraSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsRegistraSponsorJBActionPerformed(evt);
            }
        });
        jPanel1.add(btsRegistraSponsorJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 410, 80));

        btnEliminaSponsorJB.setBackground(new java.awt.Color(1, 180, 245));
        btnEliminaSponsorJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminaSponsorJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminaSponsorJB.setText("Delete Sponsor");
        btnEliminaSponsorJB.setToolTipText("");
        btnEliminaSponsorJB.setBorder(null);
        btnEliminaSponsorJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminaSponsorJB.setFocusable(false);
        btnEliminaSponsorJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminaSponsorJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminaSponsorJBMouseExited(evt);
            }
        });
        btnEliminaSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaSponsorJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminaSponsorJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 410, 80));

        btnAggiornaSponsorJB.setBackground(new java.awt.Color(1, 180, 245));
        btnAggiornaSponsorJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAggiornaSponsorJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAggiornaSponsorJB.setText("Update Sponsor");
        btnAggiornaSponsorJB.setBorder(null);
        btnAggiornaSponsorJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggiornaSponsorJB.setFocusable(false);
        btnAggiornaSponsorJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAggiornaSponsorJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAggiornaSponsorJBMouseExited(evt);
            }
        });
        btnAggiornaSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaSponsorJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAggiornaSponsorJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 410, 80));

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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void btsRegistraSponsorJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsRegistraSponsorJBMouseEntered
        btsRegistraSponsorJB.setBackground(new Color(34,87,191));
        btsRegistraSponsorJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btsRegistraSponsorJBMouseEntered

    private void btsRegistraSponsorJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsRegistraSponsorJBMouseExited
        btsRegistraSponsorJB.setBackground(new Color(1,180,245));
        btsRegistraSponsorJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btsRegistraSponsorJBMouseExited

    private void btsRegistraSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsRegistraSponsorJBActionPerformed
       RegistraSponsor registraSponsor = new RegistraSponsor();
        registraSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btsRegistraSponsorJBActionPerformed

    private void btnEliminaSponsorJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaSponsorJBMouseEntered
        btnEliminaSponsorJB.setBackground(new Color(34,87,191));
        btnEliminaSponsorJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnEliminaSponsorJBMouseEntered

    private void btnEliminaSponsorJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaSponsorJBMouseExited
        btnEliminaSponsorJB.setBackground(new Color(1,180,245));
        btnEliminaSponsorJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEliminaSponsorJBMouseExited

    private void btnEliminaSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaSponsorJBActionPerformed
        EliminaSponsor eliminaSponsor = new EliminaSponsor();
        eliminaSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminaSponsorJBActionPerformed

    private void btnAggiornaSponsorJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggiornaSponsorJBMouseEntered
        btnAggiornaSponsorJB.setBackground(new Color(34,87,191));
        btnAggiornaSponsorJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnAggiornaSponsorJBMouseEntered

    private void btnAggiornaSponsorJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggiornaSponsorJBMouseExited
        btnAggiornaSponsorJB.setBackground(new Color(1,180,245));
        btnAggiornaSponsorJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnAggiornaSponsorJBMouseExited

    private void btnAggiornaSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaSponsorJBActionPerformed

        ModificaSponsor modificaSponsor = new ModificaSponsor();
        modificaSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggiornaSponsorJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        AdminView adminView = new AdminView();
        adminView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneSponsorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaSponsorJB;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEliminaSponsorJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btsRegistraSponsorJB;
    private javax.swing.JLabel jLCurrentAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
