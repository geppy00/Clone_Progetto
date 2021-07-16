
package view;

import java.awt.Color;
import java.awt.Frame;
import view.elimina.EliminaAtleta;
import view.modificaDati.ModificaSportivo;
import view.registrare.RegistrareSportivo;


public class SezioneAtletaView extends javax.swing.JFrame {
    
    public SezioneAtletaView() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAggiungiSportivoJB = new javax.swing.JButton();
        btnEliminaSportivoJB = new javax.swing.JButton();
        btnAggiornaSportivoJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAggiungiSportivoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnAggiungiSportivoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAggiungiSportivoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAggiungiSportivoJB.setText("Add Sportivo");
        btnAggiungiSportivoJB.setActionCommand("Procutore");
        btnAggiungiSportivoJB.setBorder(null);
        btnAggiungiSportivoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggiungiSportivoJB.setFocusPainted(false);
        btnAggiungiSportivoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAggiungiSportivoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAggiungiSportivoJBMouseExited(evt);
            }
        });
        btnAggiungiSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiungiSportivoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAggiungiSportivoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 410, 80));

        btnEliminaSportivoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnEliminaSportivoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminaSportivoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminaSportivoJB.setText("Delete Sportivo");
        btnEliminaSportivoJB.setToolTipText("");
        btnEliminaSportivoJB.setBorder(null);
        btnEliminaSportivoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminaSportivoJB.setFocusable(false);
        btnEliminaSportivoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminaSportivoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminaSportivoJBMouseExited(evt);
            }
        });
        btnEliminaSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaSportivoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminaSportivoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 410, 80));

        btnAggiornaSportivoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnAggiornaSportivoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAggiornaSportivoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAggiornaSportivoJB.setText("Update Sportivo");
        btnAggiornaSportivoJB.setBorder(null);
        btnAggiornaSportivoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggiornaSportivoJB.setFocusable(false);
        btnAggiornaSportivoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAggiornaSportivoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAggiornaSportivoJBMouseExited(evt);
            }
        });
        btnAggiornaSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaSportivoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAggiornaSportivoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 410, 80));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 15, -1, -1));

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

    private void btnAggiungiSportivoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggiungiSportivoJBMouseEntered
        btnAggiungiSportivoJB.setBackground(new Color(34,87,191));
        btnAggiungiSportivoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnAggiungiSportivoJBMouseEntered

    private void btnAggiungiSportivoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggiungiSportivoJBMouseExited
        btnAggiungiSportivoJB.setBackground(new Color(1,180,245));
        btnAggiungiSportivoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnAggiungiSportivoJBMouseExited

    private void btnAggiungiSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiungiSportivoJBActionPerformed
        RegistrareSportivo registraSportivo = new RegistrareSportivo();
        registraSportivo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggiungiSportivoJBActionPerformed

    private void btnEliminaSportivoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaSportivoJBMouseEntered
        btnEliminaSportivoJB.setBackground(new Color(34,87,191));
        btnEliminaSportivoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnEliminaSportivoJBMouseEntered

    private void btnEliminaSportivoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaSportivoJBMouseExited
        btnEliminaSportivoJB.setBackground(new Color(1,180,245));
        btnEliminaSportivoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEliminaSportivoJBMouseExited

    private void btnEliminaSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaSportivoJBActionPerformed
       EliminaAtleta eliminaAtleta = new EliminaAtleta();
        eliminaAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminaSportivoJBActionPerformed

    private void btnAggiornaSportivoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggiornaSportivoJBMouseEntered
        btnAggiornaSportivoJB.setBackground(new Color(34,87,191));
        btnAggiornaSportivoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnAggiornaSportivoJBMouseEntered

    private void btnAggiornaSportivoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggiornaSportivoJBMouseExited
        btnAggiornaSportivoJB.setBackground(new Color(1,180,245));
        btnAggiornaSportivoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnAggiornaSportivoJBMouseExited

    private void btnAggiornaSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaSportivoJBActionPerformed
        ModificaSportivo modificaSportivo = new ModificaSportivo();
        modificaSportivo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggiornaSportivoJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        AdminView adminView = new AdminView();
        adminView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

     
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneAtletaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaSportivoJB;
    private javax.swing.JButton btnAggiungiSportivoJB;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEliminaSportivoJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
