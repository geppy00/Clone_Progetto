
package view;

import java.awt.Color;
import view.elimina.EliminaClub;
import view.modificaDati.ModificaDatiClub;
import view.registrare.RegistraClub;

public class SezioneClub extends javax.swing.JFrame {

   
    
    public SezioneClub() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistraClubJB = new javax.swing.JButton();
        btnEliminaClubJB = new javax.swing.JButton();
        btnAggiornaClubJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();
        jLCurrentAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistraClubJB.setBackground(new java.awt.Color(1, 180, 245));
        btnRegistraClubJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistraClubJB.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistraClubJB.setText("Add Club");
        btnRegistraClubJB.setActionCommand("Procutore");
        btnRegistraClubJB.setBorder(null);
        btnRegistraClubJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistraClubJB.setFocusPainted(false);
        btnRegistraClubJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistraClubJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistraClubJBMouseExited(evt);
            }
        });
        btnRegistraClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraClubJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistraClubJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 410, 80));

        btnEliminaClubJB.setBackground(new java.awt.Color(1, 180, 245));
        btnEliminaClubJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminaClubJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminaClubJB.setText("Delete Club");
        btnEliminaClubJB.setToolTipText("");
        btnEliminaClubJB.setBorder(null);
        btnEliminaClubJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminaClubJB.setFocusable(false);
        btnEliminaClubJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminaClubJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminaClubJBMouseExited(evt);
            }
        });
        btnEliminaClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaClubJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminaClubJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 410, 80));

        btnAggiornaClubJB.setBackground(new java.awt.Color(1, 180, 245));
        btnAggiornaClubJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAggiornaClubJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAggiornaClubJB.setText("Update Club");
        btnAggiornaClubJB.setBorder(null);
        btnAggiornaClubJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggiornaClubJB.setFocusable(false);
        btnAggiornaClubJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAggiornaClubJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAggiornaClubJBMouseExited(evt);
            }
        });
        btnAggiornaClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaClubJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAggiornaClubJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 410, 80));

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

    private void btnRegistraClubJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistraClubJBMouseEntered
        btnRegistraClubJB.setBackground(new Color(34,87,191));
        btnRegistraClubJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnRegistraClubJBMouseEntered

    private void btnRegistraClubJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistraClubJBMouseExited
        btnRegistraClubJB.setBackground(new Color(1,180,245));
        btnRegistraClubJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnRegistraClubJBMouseExited

    private void btnRegistraClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraClubJBActionPerformed
        RegistraClub registraClub = new RegistraClub();
        registraClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistraClubJBActionPerformed

    private void btnEliminaClubJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaClubJBMouseEntered
        btnEliminaClubJB.setBackground(new Color(34,87,191));
        btnEliminaClubJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnEliminaClubJBMouseEntered

    private void btnEliminaClubJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaClubJBMouseExited
        btnEliminaClubJB.setBackground(new Color(1,180,245));
        btnEliminaClubJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEliminaClubJBMouseExited

    private void btnEliminaClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaClubJBActionPerformed
        EliminaClub eliminaClub = new EliminaClub();
        eliminaClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminaClubJBActionPerformed

    private void btnAggiornaClubJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggiornaClubJBMouseEntered
        btnAggiornaClubJB.setBackground(new Color(34,87,191));
        btnAggiornaClubJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnAggiornaClubJBMouseEntered

    private void btnAggiornaClubJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggiornaClubJBMouseExited
        btnAggiornaClubJB.setBackground(new Color(1,180,245));
        btnAggiornaClubJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnAggiornaClubJBMouseExited

    private void btnAggiornaClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaClubJBActionPerformed
        ModificaDatiClub modificaDatiClub = new ModificaDatiClub();
        modificaDatiClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggiornaClubJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        AdminView adminView = new AdminView();
       adminView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaClubJB;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEliminaClubJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnRegistraClubJB;
    private javax.swing.JLabel jLCurrentAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
