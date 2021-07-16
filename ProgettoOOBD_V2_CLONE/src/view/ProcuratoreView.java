
package view;

import controller.ControllerProcuratore;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Frame;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcuratoreView extends javax.swing.JFrame {

    /*INFORMAZIONI IMPORTANTI*/
    private String idProcuratore;
    
    /*CONTROLLER PER PROCURATORE*/
    ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
    
    /*COSTRUTTORE*/
    public ProcuratoreView(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        
        try {
            jLCurrentAccount.setText("Current Account: "+controllerProcuratore.prendiNomeUtente(this.getIdProcuratore()));
        } catch (ExceptionDao ex) {
            Logger.getLogger(ProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ProcuratoreView() {
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnGestireContrattiJB = new javax.swing.JButton();
        btnDenaroJB = new javax.swing.JButton();
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

        jPanel2.setBackground(new java.awt.Color(11, 58, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGestireContrattiJB.setBackground(new java.awt.Color(1, 180, 245));
        btnGestireContrattiJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGestireContrattiJB.setForeground(new java.awt.Color(255, 255, 255));
        btnGestireContrattiJB.setText("Gestione Contratti");
        btnGestireContrattiJB.setActionCommand("Procutore");
        btnGestireContrattiJB.setBorder(null);
        btnGestireContrattiJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestireContrattiJB.setFocusPainted(false);
        btnGestireContrattiJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestireContrattiJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestireContrattiJBMouseExited(evt);
            }
        });
        btnGestireContrattiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestireContrattiJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestireContrattiJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 250, 100));

        btnDenaroJB.setBackground(new java.awt.Color(1, 180, 245));
        btnDenaroJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDenaroJB.setForeground(new java.awt.Color(255, 255, 255));
        btnDenaroJB.setText("Gestione Guardagni");
        btnDenaroJB.setBorder(null);
        btnDenaroJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDenaroJB.setFocusable(false);
        btnDenaroJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDenaroJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDenaroJBMouseExited(evt);
            }
        });
        btnDenaroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenaroJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnDenaroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 250, 100));

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
        jLabel2.setText("Portale Procuratore");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLDataAttuale, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
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
        jLabel1.setText("Procuratore System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestireContrattiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestireContrattiJBMouseEntered
        btnGestireContrattiJB.setBackground(new Color(34,87,191));
        btnGestireContrattiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnGestireContrattiJBMouseEntered

    private void btnGestireContrattiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestireContrattiJBMouseExited
        btnGestireContrattiJB.setBackground(new Color(1,180,245));
        btnGestireContrattiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnGestireContrattiJBMouseExited

    private void btnGestireContrattiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestireContrattiJBActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());  
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGestireContrattiJBActionPerformed

    private void btnDenaroJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDenaroJBMouseEntered
        btnDenaroJB.setBackground(new Color(34,87,191));
        btnDenaroJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnDenaroJBMouseEntered

    private void btnDenaroJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDenaroJBMouseExited
        btnDenaroJB.setBackground(new Color(1,180,245));
        btnDenaroJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnDenaroJBMouseExited

    private void btnDenaroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenaroJBActionPerformed
        PercentualiGuadagnoProcuratoreView percentualiGuadagnoProcuratoreView = new PercentualiGuadagnoProcuratoreView(this.getIdProcuratore());
        percentualiGuadagnoProcuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDenaroJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    
    /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }

    /*MAIN*/
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDenaroJB;
    private javax.swing.JButton btnGestireContrattiJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JLabel jLCurrentAccount;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
