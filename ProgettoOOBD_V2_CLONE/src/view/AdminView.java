
package view;

import controller.ControllerAdmin;
import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.registrare.RegistraNuovoProfilo;

public class AdminView extends javax.swing.JFrame {

    /*CONTROLLER PER ADMIN*/
    ControllerAdmin controllerAdmin = new ControllerAdmin();
    
    /*INFORMAZIONI IMPORTANTI*/
    private String opzUser = "Admin";
    
    /*COSTRUTTORI*/
    public AdminView() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            jLabel4.setText(controllerAdmin.prendiNomeUtente(this.getOpzUser()));
        } catch (ExceptionDao ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnProcuratoreJB = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnClubJB = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();
        btnNuovoProfiloJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 117, 233));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN PORTALE");

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USER:");

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProcuratoreJB.setBackground(new java.awt.Color(243, 243, 243));
        btnProcuratoreJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_insurance_agent_64px.png"))); // NOI18N
        btnProcuratoreJB.setActionCommand("Procutore");
        btnProcuratoreJB.setBorder(null);
        btnProcuratoreJB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProcuratoreJB.setFocusPainted(false);
        btnProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcuratoreJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcuratoreJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 140, 120));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_soccer_64px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 140, 120));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_crowdfunding_64px.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 140, 120));

        btnClubJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_stadium_64px.png"))); // NOI18N
        btnClubJB.setBorder(null);
        btnClubJB.setFocusable(false);
        btnClubJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClubJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnClubJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 140, 120));

        btnLogoutJB.setBackground(new java.awt.Color(255, 255, 255));
        btnLogoutJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_logout_rounded_left_32px_2.png"))); // NOI18N
        btnLogoutJB.setBorder(null);
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, -1, 59));

        btnNuovoProfiloJB.setBackground(new java.awt.Color(255, 255, 255));
        btnNuovoProfiloJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_writer_male_32px.png"))); // NOI18N
        btnNuovoProfiloJB.setBorder(null);
        btnNuovoProfiloJB.setFocusPainted(false);
        btnNuovoProfiloJB.setFocusable(false);
        btnNuovoProfiloJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuovoProfiloJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuovoProfiloJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 760, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcuratoreJBActionPerformed
        SezioneProcuratoreView procuratoreView = new SezioneProcuratoreView();
        procuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProcuratoreJBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SezioneSponsorView sezioneSponsorView = new SezioneSponsorView();
        sezioneSponsorView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SezioneAtletaView sezioneAtletaView = new SezioneAtletaView();
        sezioneAtletaView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

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
    private javax.swing.JButton btnClubJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnNuovoProfiloJB;
    private javax.swing.JButton btnProcuratoreJB;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
