
package view;

import controller.ControllerSportivo;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Frame;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AtletaView extends javax.swing.JFrame {

    /*INFORMAZIONI IMPORTANTI*/
    private String idAtleta;
    
    /*CONTROLLER PER SPORTIVO*/
    ControllerSportivo controllerSportivo = new ControllerSportivo();
    
    /*COSTRUTTORI*/
    public AtletaView(String idAtleta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAtleta = idAtleta;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        try {
            jLCurrentAccount.setText("Current Account: "+controllerSportivo.prendiNomeUtente(this.getIdAtleta()));
        } catch (ExceptionDao ex) {
            Logger.getLogger(AtletaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public AtletaView() {
         
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEntroitiJB = new javax.swing.JButton();
        btnGestioneEventiJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLDataAttuale = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogoutJB = new javax.swing.JButton();
        jLCurrentAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(11, 58, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntroitiJB.setBackground(new java.awt.Color(1, 180, 245));
        btnEntroitiJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEntroitiJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEntroitiJB.setText("Introito");
        btnEntroitiJB.setActionCommand("Procutore");
        btnEntroitiJB.setBorder(null);
        btnEntroitiJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntroitiJB.setFocusPainted(false);
        btnEntroitiJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntroitiJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntroitiJBMouseExited(evt);
            }
        });
        btnEntroitiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntroitiJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntroitiJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 250, 100));

        btnGestioneEventiJB.setBackground(new java.awt.Color(1, 180, 245));
        btnGestioneEventiJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGestioneEventiJB.setForeground(new java.awt.Color(255, 255, 255));
        btnGestioneEventiJB.setText("Gestione Evento");
        btnGestioneEventiJB.setBorder(null);
        btnGestioneEventiJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestioneEventiJB.setFocusable(false);
        btnGestioneEventiJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestioneEventiJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestioneEventiJBMouseExited(evt);
            }
        });
        btnGestioneEventiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioneEventiJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestioneEventiJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 250, 100));

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
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 40));

        jPanel3.setBackground(new java.awt.Color(246, 0, 107));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setFocusable(false);

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Portale Atleta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLDataAttuale, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataAttuale)
                    .addComponent(jLabel2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 510, 60));

        btnLogoutJB.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_shutdown_32px_1.png"))); // NOI18N
        btnLogoutJB.setBorder(null);
        btnLogoutJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB.setFocusPainted(false);
        btnLogoutJB.setFocusable(false);
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, 40));

        jLCurrentAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCurrentAccount.setForeground(new java.awt.Color(255, 255, 255));
        jLCurrentAccount.setText("Current Account:");
        jPanel2.add(jLCurrentAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 160, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atleta System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 15, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnGestioneEventiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioneEventiJBActionPerformed
        GestioneEventiAtleta gestioneEventiAtleta = new GestioneEventiAtleta(this.getIdAtleta());
        gestioneEventiAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGestioneEventiJBActionPerformed

    private void btnGestioneEventiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestioneEventiJBMouseExited
        btnGestioneEventiJB.setBackground(new Color(1,180,245));
        btnGestioneEventiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnGestioneEventiJBMouseExited

    private void btnGestioneEventiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestioneEventiJBMouseEntered
        btnGestioneEventiJB.setBackground(new Color(34,87,191));
        btnGestioneEventiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnGestioneEventiJBMouseEntered

    private void btnEntroitiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntroitiJBActionPerformed
        SezioneIntroitiAtleta sezioneIntroitiAtleta = new SezioneIntroitiAtleta(this.getIdAtleta());
        sezioneIntroitiAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEntroitiJBActionPerformed

    private void btnEntroitiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntroitiJBMouseExited
        btnEntroitiJB.setBackground(new Color(1,180,245));
        btnEntroitiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEntroitiJBMouseExited

    private void btnEntroitiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntroitiJBMouseEntered
        btnEntroitiJB.setBackground(new Color(34,87,191));
        btnEntroitiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnEntroitiJBMouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    
    /*GET AND SET*/
    public String getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtletaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEntroitiJB;
    private javax.swing.JButton btnGestioneEventiJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JLabel jLCurrentAccount;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
