
package view;

import controller.ControllerAdmin;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Frame;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import view.registrare.RegistraNuovoProfilo;

public class AdminView extends javax.swing.JFrame {

    ImageIcon icon;
    
    /*CONTROLLER PER ADMIN*/
    ControllerAdmin controllerAdmin = new ControllerAdmin();
    
    /*INFORMAZIONI IMPORTANTI*/
    private String opzUser = "Admin";
    
    /*COSTRUTTORI*/
    public AdminView() {
        initComponents();
        this.setLocationRelativeTo(null);
        // data attuale
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        
        try {
            jLCurrentAccount.setText("Current Account: "+controllerAdmin.prendiNomeUtente(this.getOpzUser()));
        } catch (ExceptionDao ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnProcuratoreJB = new javax.swing.JButton();
        btnAtleta = new javax.swing.JButton();
        btnSponsor = new javax.swing.JButton();
        btnClubJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnNuovoProfiloJB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLDataAttuale = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLNewAccount = new javax.swing.JLabel();
        btnLogoutJB = new javax.swing.JButton();
        jLCurrentAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProcuratoreJB.setBackground(new java.awt.Color(1, 180, 245));
        btnProcuratoreJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnProcuratoreJB.setForeground(new java.awt.Color(255, 255, 255));
        btnProcuratoreJB.setText("Procuratore");
        btnProcuratoreJB.setActionCommand("Procutore");
        btnProcuratoreJB.setBorder(null);
        btnProcuratoreJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcuratoreJB.setFocusPainted(false);
        btnProcuratoreJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProcuratoreJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProcuratoreJBMouseExited(evt);
            }
        });
        btnProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcuratoreJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcuratoreJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, 80));

        btnAtleta.setBackground(new java.awt.Color(1, 180, 245));
        btnAtleta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtleta.setForeground(new java.awt.Color(255, 255, 255));
        btnAtleta.setText("Atleta");
        btnAtleta.setBorder(null);
        btnAtleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtleta.setFocusable(false);
        btnAtleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtletaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtletaMouseExited(evt);
            }
        });
        btnAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtletaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 250, 80));

        btnSponsor.setBackground(new java.awt.Color(1, 180, 245));
        btnSponsor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSponsor.setForeground(new java.awt.Color(255, 255, 255));
        btnSponsor.setText("Sponsor");
        btnSponsor.setBorder(null);
        btnSponsor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSponsor.setFocusable(false);
        btnSponsor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSponsorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSponsorMouseExited(evt);
            }
        });
        btnSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSponsorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 250, 80));

        btnClubJB.setBackground(new java.awt.Color(1, 180, 245));
        btnClubJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClubJB.setForeground(new java.awt.Color(255, 255, 255));
        btnClubJB.setText("Club");
        btnClubJB.setBorder(null);
        btnClubJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClubJB.setFocusable(false);
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
        jPanel1.add(btnClubJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 250, 80));

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 40));

        btnNuovoProfiloJB.setBackground(new java.awt.Color(11, 58, 151));
        btnNuovoProfiloJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_male_user_32px_3.png"))); // NOI18N
        btnNuovoProfiloJB.setBorder(null);
        btnNuovoProfiloJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuovoProfiloJB.setFocusPainted(false);
        btnNuovoProfiloJB.setFocusable(false);
        btnNuovoProfiloJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuovoProfiloJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuovoProfiloJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 40, 50));

        jPanel2.setBackground(new java.awt.Color(246, 0, 107));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setFocusable(false);

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Portale Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLDataAttuale, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataAttuale)
                    .addComponent(jLabel2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 510, 60));

        jLNewAccount.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLNewAccount.setForeground(new java.awt.Color(231, 231, 231));
        jLNewAccount.setText("Create Account");
        jLNewAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLNewAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLNewAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLNewAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLNewAccountMouseExited(evt);
            }
        });
        jPanel1.add(jLNewAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 448, 130, -1));

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
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, 40));

        jLCurrentAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCurrentAccount.setForeground(new java.awt.Color(255, 255, 255));
        jLCurrentAccount.setText("Current Account:");
        jPanel1.add(jLCurrentAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 160, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sportivo System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setFocusable(false);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 15, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcuratoreJBActionPerformed
        SezioneProcuratoreView procuratoreView = new SezioneProcuratoreView();
        procuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProcuratoreJBActionPerformed

    private void btnSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSponsorActionPerformed
        SezioneSponsorView sezioneSponsorView = new SezioneSponsorView();
        sezioneSponsorView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSponsorActionPerformed

    private void btnAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtletaActionPerformed
        SezioneAtletaView sezioneAtletaView = new SezioneAtletaView();
        sezioneAtletaView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtletaActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnClubJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClubJBActionPerformed
        SezioneClub sezioneClub = new SezioneClub();
        sezioneClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnClubJBActionPerformed

    private void btnNuovoProfiloJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuovoProfiloJBActionPerformed
        RegistraNuovoProfilo registraNuovoProfilo = new RegistraNuovoProfilo();
        registraNuovoProfilo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuovoProfiloJBActionPerformed

    private void btnProcuratoreJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcuratoreJBMouseEntered
       btnProcuratoreJB.setBackground(new Color(34,87,191));
       btnProcuratoreJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnProcuratoreJBMouseEntered

    private void btnProcuratoreJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcuratoreJBMouseExited
        btnProcuratoreJB.setBackground(new Color(1,180,245));
        btnProcuratoreJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnProcuratoreJBMouseExited

    private void jLNewAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNewAccountMouseEntered
       jLNewAccount.setText("<html><u>Create Account</u></html>");
    }//GEN-LAST:event_jLNewAccountMouseEntered

    private void jLNewAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNewAccountMouseExited
        jLNewAccount.setText("<html><p>Create Account</p></html>");
    }//GEN-LAST:event_jLNewAccountMouseExited

    private void jLNewAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNewAccountMouseClicked
         RegistraNuovoProfilo registraNuovoProfilo = new RegistraNuovoProfilo();
        registraNuovoProfilo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLNewAccountMouseClicked

    private void btnAtletaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtletaMouseEntered
       btnAtleta.setBackground(new Color(34,87,191));
       btnAtleta.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnAtletaMouseEntered

    private void btnAtletaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtletaMouseExited
        btnAtleta.setBackground(new Color(1,180,245));
        btnAtleta.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnAtletaMouseExited

    private void btnClubJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClubJBMouseEntered
       btnClubJB.setBackground(new Color(34,87,191));
       btnClubJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnClubJBMouseEntered

    private void btnClubJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClubJBMouseExited
        btnClubJB.setBackground(new Color(1,180,245));
        btnClubJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnClubJBMouseExited

    private void btnSponsorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSponsorMouseEntered
       btnSponsor.setBackground(new Color(34,87,191));
       btnSponsor.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnSponsorMouseEntered

    private void btnSponsorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSponsorMouseExited
       btnSponsor.setBackground(new Color(1,180,245));
       btnSponsor.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSponsorMouseExited

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    /*GET AND SET*/
    public String getOpzUser() {
        return opzUser;
    }

    public void setOpzUser(String opzUser) {
        this.opzUser = opzUser;
    }
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtleta;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnClubJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnNuovoProfiloJB;
    private javax.swing.JButton btnProcuratoreJB;
    private javax.swing.JButton btnSponsor;
    private javax.swing.JLabel jLCurrentAccount;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLNewAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
