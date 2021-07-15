
package view;

import java.awt.Color;
import view.registrare.RegistraContrattoClub;


public class SezioneGestioneContrattiView extends javax.swing.JFrame {

    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public SezioneGestioneContrattiView(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
    }

    public SezioneGestioneContrattiView() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStipulaContrattoJB = new javax.swing.JButton();
        btnVisualizzaContrttiJB = new javax.swing.JButton();
        btnEliminaContrattoJB = new javax.swing.JButton();
        btnModificaContrattoJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();
        jLCurrentAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStipulaContrattoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnStipulaContrattoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnStipulaContrattoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnStipulaContrattoJB.setText("Stabilire Contratto");
        btnStipulaContrattoJB.setActionCommand("Procutore");
        btnStipulaContrattoJB.setBorder(null);
        btnStipulaContrattoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStipulaContrattoJB.setFocusPainted(false);
        btnStipulaContrattoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStipulaContrattoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStipulaContrattoJBMouseExited(evt);
            }
        });
        btnStipulaContrattoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStipulaContrattoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnStipulaContrattoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, 80));

        btnVisualizzaContrttiJB.setBackground(new java.awt.Color(1, 180, 245));
        btnVisualizzaContrttiJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVisualizzaContrttiJB.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizzaContrttiJB.setText("Visualizza Contratto");
        btnVisualizzaContrttiJB.setBorder(null);
        btnVisualizzaContrttiJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizzaContrttiJB.setFocusable(false);
        btnVisualizzaContrttiJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizzaContrttiJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisualizzaContrttiJBMouseExited(evt);
            }
        });
        btnVisualizzaContrttiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizzaContrttiJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnVisualizzaContrttiJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 250, 80));

        btnEliminaContrattoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnEliminaContrattoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminaContrattoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminaContrattoJB.setText("Anulla Contratto");
        btnEliminaContrattoJB.setBorder(null);
        btnEliminaContrattoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminaContrattoJB.setFocusable(false);
        btnEliminaContrattoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminaContrattoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminaContrattoJBMouseExited(evt);
            }
        });
        btnEliminaContrattoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaContrattoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminaContrattoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 250, 80));

        btnModificaContrattoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnModificaContrattoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificaContrattoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnModificaContrattoJB.setText("Update Contratto");
        btnModificaContrattoJB.setBorder(null);
        btnModificaContrattoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificaContrattoJB.setFocusable(false);
        btnModificaContrattoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificaContrattoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificaContrattoJBMouseExited(evt);
            }
        });
        btnModificaContrattoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaContrattoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificaContrattoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 250, 80));

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, 40));

        btnTornaIndietroJB.setBackground(new java.awt.Color(11, 58, 151));
        btnTornaIndietroJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnTornaIndietroJB.setBorder(null);
        btnTornaIndietroJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTornaIndietroJB.setFocusPainted(false);
        btnTornaIndietroJB.setFocusable(false);
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 40));

        jLCurrentAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCurrentAccount.setForeground(new java.awt.Color(255, 255, 255));
        jLCurrentAccount.setText("Current Account:");
        jPanel1.add(jLCurrentAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 160, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sportivo System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStipulaContrattoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStipulaContrattoJBMouseEntered
        btnStipulaContrattoJB.setBackground(new Color(34,87,191));
        btnStipulaContrattoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnStipulaContrattoJBMouseEntered

    private void btnStipulaContrattoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStipulaContrattoJBMouseExited
        btnStipulaContrattoJB.setBackground(new Color(1,180,245));
        btnStipulaContrattoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnStipulaContrattoJBMouseExited

    private void btnStipulaContrattoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStipulaContrattoJBActionPerformed
        ScegliContrattoView scegliContrattoView = new ScegliContrattoView(this.getIdProcuratore());
        scegliContrattoView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnStipulaContrattoJBActionPerformed

    private void btnVisualizzaContrttiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizzaContrttiJBMouseEntered
        btnVisualizzaContrttiJB.setBackground(new Color(34,87,191));
        btnVisualizzaContrttiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnVisualizzaContrttiJBMouseEntered

    private void btnVisualizzaContrttiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizzaContrttiJBMouseExited
        btnVisualizzaContrttiJB.setBackground(new Color(1,180,245));
        btnVisualizzaContrttiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnVisualizzaContrttiJBMouseExited

    private void btnVisualizzaContrttiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizzaContrttiJBActionPerformed
       VisualizzaTuttiContrattiProcuratore modificaContrattiProcuratore = new VisualizzaTuttiContrattiProcuratore(this.getIdProcuratore());
        modificaContrattiProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVisualizzaContrttiJBActionPerformed

    private void btnEliminaContrattoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaContrattoJBMouseEntered
        btnEliminaContrattoJB.setBackground(new Color(34,87,191));
        btnEliminaContrattoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnEliminaContrattoJBMouseEntered

    private void btnEliminaContrattoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaContrattoJBMouseExited
        btnEliminaContrattoJB.setBackground(new Color(1,180,245));
        btnEliminaContrattoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEliminaContrattoJBMouseExited

    private void btnEliminaContrattoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaContrattoJBActionPerformed
        SezioneEliminaContrattoProcuratore sezioneEliminaContrattoProcuratore = new SezioneEliminaContrattoProcuratore(this.getIdProcuratore());
        sezioneEliminaContrattoProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminaContrattoJBActionPerformed

    private void btnModificaContrattoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaContrattoJBMouseEntered
        btnModificaContrattoJB.setBackground(new Color(34,87,191));
        btnModificaContrattoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnModificaContrattoJBMouseEntered

    private void btnModificaContrattoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaContrattoJBMouseExited
        btnModificaContrattoJB.setBackground(new Color(1,180,245));
        btnModificaContrattoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnModificaContrattoJBMouseExited

    private void btnModificaContrattoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaContrattoJBActionPerformed
        ScegliModificaContratto scegliModificaContratto = new ScegliModificaContratto(this.getIdProcuratore());
        scegliModificaContratto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificaContrattoJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        ProcuratoreView procuratoreView = new ProcuratoreView(this.getIdProcuratore());
        procuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

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
                new SezioneGestioneContrattiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEliminaContrattoJB;
    private javax.swing.JButton btnModificaContrattoJB;
    private javax.swing.JButton btnStipulaContrattoJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JButton btnVisualizzaContrttiJB;
    private javax.swing.JLabel jLCurrentAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
