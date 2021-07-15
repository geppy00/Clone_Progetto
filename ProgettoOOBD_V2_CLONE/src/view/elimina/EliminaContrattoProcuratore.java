
package view.elimina;

import controller.ControllerProcuratore;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.SezioneEliminaContrattoProcuratore;
import view.SezioneGestioneContrattiView;

public class EliminaContrattoProcuratore extends javax.swing.JFrame {

    /*DATI IMPORTANTI*/
    private String idProcuratore;
    private int numeroContratto;
    private String idAtleta;
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*COSTRUTTORI*/
    public EliminaContrattoProcuratore(String idProcuratore, int numeroContratto, String idAtleta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        this.numeroContratto = numeroContratto;
        this.idAtleta = idAtleta;
        jMessagge.setVisible(false);
        adviceJL.setText("SEI SICURO DI VOLER ELIMINARE IL CONTRATTO NUMERO "+this.getNumeroContratto()+" ?");
    }
    
    public EliminaContrattoProcuratore() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adviceJL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNoJB = new javax.swing.JButton();
        btnYesJB = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();
        jMessagge = new javax.swing.JPanel();
        jLMessaggio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCloseMessagio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNoJB.setBackground(new java.awt.Color(231, 76, 60));
        btnNoJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnNoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnNoJB.setText("NO");
        btnNoJB.setBorder(null);
        btnNoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNoJB.setFocusPainted(false);
        btnNoJB.setFocusable(false);
        btnNoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnNoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 113, 50));

        btnYesJB.setBackground(new java.awt.Color(46, 204, 113));
        btnYesJB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnYesJB.setForeground(new java.awt.Color(255, 255, 255));
        btnYesJB.setText("SI");
        btnYesJB.setBorder(null);
        btnYesJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYesJB.setFocusPainted(false);
        btnYesJB.setFocusable(false);
        btnYesJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnYesJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 112, 48));

        btnLogoutJB1.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnLogoutJB1.setBorder(null);
        btnLogoutJB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB1.setFocusPainted(false);
        btnLogoutJB1.setFocusable(false);
        btnLogoutJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 40));

        jMessagge.setBackground(new java.awt.Color(231, 76, 60));

        jLMessaggio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLMessaggio.setForeground(new java.awt.Color(255, 255, 255));
        jLMessaggio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMessaggio.setText("Credenziale Sbagliate");

        jLabel3.setBackground(new java.awt.Color(231, 76, 60));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_20px.png"))); // NOI18N
        jLabel3.setFocusable(false);

        btnCloseMessagio.setBackground(new java.awt.Color(231, 76, 60));
        btnCloseMessagio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_delete_20px.png"))); // NOI18N
        btnCloseMessagio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMessagio.setFocusable(false);
        btnCloseMessagio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMessagioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jMessaggeLayout = new javax.swing.GroupLayout(jMessagge);
        jMessagge.setLayout(jMessaggeLayout);
        jMessaggeLayout.setHorizontalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMessaggeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jMessaggeLayout.setVerticalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jMessagge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 360, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(adviceJL)
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adviceJL)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoJBActionPerformed
        
        SezioneEliminaContrattoProcuratore sezioneEliminaContrattoProcuratore = new SezioneEliminaContrattoProcuratore(this.getIdProcuratore());
        sezioneEliminaContrattoProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNoJBActionPerformed

    private void btnYesJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        if(controlloConvalidazione.controllaId(String.valueOf(this.getNumeroContratto())) == true && controlloConvalidazione.controllaId(this.getIdAtleta()) == true) {
            try {
                controllerProcuratore.eliminaContratto(this.getNumeroContratto(), this.getIdAtleta());
                JOptionPane.showMessageDialog(this, "✓ ELIMINAZIONE DEL CONTRATTO NUMERO "+this.getNumeroContratto()+" EFFETTUATA CON SUCCESSO", "ELIMINAZIONE", JOptionPane.INFORMATION_MESSAGE);
                SezioneEliminaContrattoProcuratore sezioneEliminaContrattoProcuratore = new SezioneEliminaContrattoProcuratore(this.getIdProcuratore());
                sezioneEliminaContrattoProcuratore.setVisible(true);
                this.setVisible(false);
            } catch (ExceptionDao ex) {
                Logger.getLogger(EliminaContrattoProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nERRORE FATALE NON E' STATO POSSIBILE RICAVARE I DATI RIPROVARE", "ERRORE FATALE", JOptionPane.ERROR_MESSAGE);
            SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
            sezioneGestioneContrattiView.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnYesJBActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnCloseMessagioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMessagioMouseClicked
        jMessagge.setVisible(false);
    }//GEN-LAST:event_btnCloseMessagioMouseClicked

      /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }
    
    public int getNumeroContratto() {
        return numeroContratto;
    }

    public void setNumeroContratto(int numeroContratto) {
        this.numeroContratto = numeroContratto;
    }
    
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
                new EliminaContrattoProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adviceJL;
    private javax.swing.JLabel btnCloseMessagio;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnNoJB;
    private javax.swing.JButton btnYesJB;
    private javax.swing.JLabel jLMessaggio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jMessagge;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
