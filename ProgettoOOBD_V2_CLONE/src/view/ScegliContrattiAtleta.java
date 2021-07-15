
package view;

import java.awt.Color;

public class ScegliContrattiAtleta extends javax.swing.JFrame {

    private String idAtleta;
    
    /*COSTRUTTORE*/
    public ScegliContrattiAtleta(String idAtleta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAtleta = idAtleta;
    }
    
    public ScegliContrattiAtleta() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogoutJB = new javax.swing.JButton();
        btnClubJB = new javax.swing.JButton();
        btnSponsorJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutJB.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnLogoutJB.setBorder(null);
        btnLogoutJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB.setFocusPainted(false);
        btnLogoutJB.setFocusable(false);
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 40));

        btnClubJB.setBackground(new java.awt.Color(1, 180, 245));
        btnClubJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClubJB.setForeground(new java.awt.Color(255, 255, 255));
        btnClubJB.setText("Club");
        btnClubJB.setActionCommand("Procutore");
        btnClubJB.setBorder(null);
        btnClubJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClubJB.setFocusPainted(false);
        btnClubJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClubJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClubJBMouseExited(evt);
            }
        });
        btnClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClubJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnClubJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 340, 100));

        btnSponsorJB.setBackground(new java.awt.Color(1, 180, 245));
        btnSponsorJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSponsorJB.setForeground(new java.awt.Color(255, 255, 255));
        btnSponsorJB.setText("Sponsor");
        btnSponsorJB.setActionCommand("Procutore");
        btnSponsorJB.setBorder(null);
        btnSponsorJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSponsorJB.setFocusPainted(false);
        btnSponsorJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSponsorJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSponsorJBMouseExited(evt);
            }
        });
        btnSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSponsorJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnSponsorJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 340, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void btnClubJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClubJBMouseEntered
        btnClubJB.setBackground(new Color(34,87,191));
        btnClubJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnClubJBMouseEntered

    private void btnClubJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClubJBMouseExited
        btnClubJB.setBackground(new Color(1,180,245));
        btnClubJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnClubJBMouseExited

    private void btnClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClubJBActionPerformed
        SezioneContrattiClubStipulatiAtleta sezioneContrattiClubStipulatiAtleta = new SezioneContrattiClubStipulatiAtleta(this.getIdAtleta());
        sezioneContrattiClubStipulatiAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnClubJBActionPerformed

    private void btnSponsorJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSponsorJBMouseEntered
        btnSponsorJB.setBackground(new Color(34,87,191));
        btnSponsorJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnSponsorJBMouseEntered

    private void btnSponsorJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSponsorJBMouseExited
        btnSponsorJB.setBackground(new Color(1,180,245));
        btnSponsorJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSponsorJBMouseExited

    private void btnSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSponsorJBActionPerformed
       SezioniContrattiSponsorStipulatiAtleta sezioniContrattiSponsorStipulatiAtleta = new SezioniContrattiSponsorStipulatiAtleta(this.getIdAtleta());
        sezioniContrattiSponsorStipulatiAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSponsorJBActionPerformed

    
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
                new ScegliContrattiAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClubJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnSponsorJB;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
