
package view;

import controller.ControllerSponsor;
import dao.ExceptionDao;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SponsorView extends javax.swing.JFrame {

    /*INFORMAZIONI IMPORTANTI*/
    private String idSponsor;
    
    /*CONTROLLER PER SPONSOR*/
    ControllerSponsor ControllerSponsor = new ControllerSponsor();
    
    /*COSTRUTTORI*/
    public SponsorView(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        try {
              jLCurrentAccount.setText("Current Account: "+ControllerSponsor.prendiNomeUtente(Integer.parseInt(this.getIdSponsor())));
        } catch (ExceptionDao ex) {
            Logger.getLogger(SponsorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SponsorView() {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeUtenteJL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVisualizzaSportiviJB = new javax.swing.JButton();
        btnGestioneEventiJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLDataAttuale = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogoutJB = new javax.swing.JButton();
        jLCurrentAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(11, 58, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVisualizzaSportiviJB.setBackground(new java.awt.Color(1, 180, 245));
        btnVisualizzaSportiviJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVisualizzaSportiviJB.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizzaSportiviJB.setText("Visualizza Sportivo");
        btnVisualizzaSportiviJB.setActionCommand("Procutore");
        btnVisualizzaSportiviJB.setBorder(null);
        btnVisualizzaSportiviJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizzaSportiviJB.setFocusPainted(false);
        btnVisualizzaSportiviJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizzaSportiviJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisualizzaSportiviJBMouseExited(evt);
            }
        });
        btnVisualizzaSportiviJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizzaSportiviJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnVisualizzaSportiviJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 250, 100));

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
        jLabel2.setText("Portale Sponsor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLDataAttuale, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
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
        jLabel1.setText("Sportivo System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(nomeUtenteJL)
                .addContainerGap(468, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeUtenteJL)
                .addContainerGap(499, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizzaSportiviJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizzaSportiviJBMouseEntered
        btnVisualizzaSportiviJB.setBackground(new Color(34,87,191));
        btnVisualizzaSportiviJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnVisualizzaSportiviJBMouseEntered

    private void btnVisualizzaSportiviJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizzaSportiviJBMouseExited
        btnVisualizzaSportiviJB.setBackground(new Color(1,180,245));
        btnVisualizzaSportiviJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnVisualizzaSportiviJBMouseExited

    private void btnVisualizzaSportiviJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizzaSportiviJBActionPerformed
        
        ElencoSportiviSponsor elencoSportiviSponsor = new ElencoSportiviSponsor(this.getIdSponsor());
        elencoSportiviSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVisualizzaSportiviJBActionPerformed

    private void btnGestioneEventiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestioneEventiJBMouseEntered
        btnGestioneEventiJB.setBackground(new Color(34,87,191));
        btnGestioneEventiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnGestioneEventiJBMouseEntered

    private void btnGestioneEventiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestioneEventiJBMouseExited
        btnGestioneEventiJB.setBackground(new Color(1,180,245));
        btnGestioneEventiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnGestioneEventiJBMouseExited

    private void btnGestioneEventiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioneEventiJBActionPerformed
        SezioneEventiView sezioneEventiView = new SezioneEventiView(this.getIdSponsor());
        sezioneEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGestioneEventiJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    
    /*GET AND SET*/
    public String getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(String idSponsor) {
        this.idSponsor = idSponsor;
    }

    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SponsorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGestioneEventiJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnVisualizzaSportiviJB;
    private javax.swing.JLabel jLCurrentAccount;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomeUtenteJL;
    // End of variables declaration//GEN-END:variables
}
