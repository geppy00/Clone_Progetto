
package view;

import java.awt.Color;
import java.awt.Frame;


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

        jPanel1 = new javax.swing.JPanel();
        btnPagamentiClubJB = new javax.swing.JButton();
        btnContrattiStipulatiJB = new javax.swing.JButton();
        btnGettoniEventoJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();
        jLCurrentAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagamentiClubJB.setBackground(new java.awt.Color(1, 180, 245));
        btnPagamentiClubJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPagamentiClubJB.setForeground(new java.awt.Color(255, 255, 255));
        btnPagamentiClubJB.setText("Pagamento del Club");
        btnPagamentiClubJB.setActionCommand("Procutore");
        btnPagamentiClubJB.setBorder(null);
        btnPagamentiClubJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagamentiClubJB.setFocusPainted(false);
        btnPagamentiClubJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPagamentiClubJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPagamentiClubJBMouseExited(evt);
            }
        });
        btnPagamentiClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentiClubJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagamentiClubJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 410, 80));

        btnContrattiStipulatiJB.setBackground(new java.awt.Color(1, 180, 245));
        btnContrattiStipulatiJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnContrattiStipulatiJB.setForeground(new java.awt.Color(255, 255, 255));
        btnContrattiStipulatiJB.setText("Contratto Stipulato");
        btnContrattiStipulatiJB.setToolTipText("");
        btnContrattiStipulatiJB.setBorder(null);
        btnContrattiStipulatiJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContrattiStipulatiJB.setFocusable(false);
        btnContrattiStipulatiJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContrattiStipulatiJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContrattiStipulatiJBMouseExited(evt);
            }
        });
        btnContrattiStipulatiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContrattiStipulatiJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnContrattiStipulatiJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 410, 80));

        btnGettoniEventoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnGettoniEventoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGettoniEventoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnGettoniEventoJB.setText("Gettone Evento");
        btnGettoniEventoJB.setBorder(null);
        btnGettoniEventoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGettoniEventoJB.setFocusable(false);
        btnGettoniEventoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGettoniEventoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGettoniEventoJBMouseExited(evt);
            }
        });
        btnGettoniEventoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGettoniEventoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnGettoniEventoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 410, 80));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 15, -1, -1));

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

    private void btnPagamentiClubJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagamentiClubJBMouseEntered
        btnPagamentiClubJB.setBackground(new Color(34,87,191));
        btnPagamentiClubJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnPagamentiClubJBMouseEntered

    private void btnPagamentiClubJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagamentiClubJBMouseExited
        btnPagamentiClubJB.setBackground(new Color(1,180,245));
        btnPagamentiClubJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnPagamentiClubJBMouseExited

    private void btnPagamentiClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentiClubJBActionPerformed
        SezionePagamentiClubAtleta sezionePagamentiClubAtleta = new SezionePagamentiClubAtleta(this.getIdAtleta());
        sezionePagamentiClubAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPagamentiClubJBActionPerformed

    private void btnContrattiStipulatiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContrattiStipulatiJBMouseEntered
        btnContrattiStipulatiJB.setBackground(new Color(34,87,191));
        btnContrattiStipulatiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnContrattiStipulatiJBMouseEntered

    private void btnContrattiStipulatiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContrattiStipulatiJBMouseExited
        btnContrattiStipulatiJB.setBackground(new Color(1,180,245));
        btnContrattiStipulatiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnContrattiStipulatiJBMouseExited

    private void btnContrattiStipulatiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContrattiStipulatiJBActionPerformed
        ScegliContrattiAtleta scegliContrattiAtleta = new ScegliContrattiAtleta(this.getIdAtleta());
        scegliContrattiAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContrattiStipulatiJBActionPerformed

    private void btnGettoniEventoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGettoniEventoJBMouseEntered
        btnGettoniEventoJB.setBackground(new Color(34,87,191));
        btnGettoniEventoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnGettoniEventoJBMouseEntered

    private void btnGettoniEventoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGettoniEventoJBMouseExited
        btnGettoniEventoJB.setBackground(new Color(1,180,245));
        btnGettoniEventoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnGettoniEventoJBMouseExited

    private void btnGettoniEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGettoniEventoJBActionPerformed

        SezioneGettoniEventoAtleta sezioneGettoniEventoAtleta = new SezioneGettoniEventoAtleta(this.getIdAtleta());
        sezioneGettoniEventoAtleta.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnGettoniEventoJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        AtletaView atletaView = new AtletaView(this.getIdAtleta());
        atletaView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

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
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnContrattiStipulatiJB;
    private javax.swing.JButton btnGettoniEventoJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnPagamentiClubJB;
    private javax.swing.JLabel jLCurrentAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
