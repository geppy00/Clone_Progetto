
package view.registrare;

import controller.ControllerSportivo;
import convalidazione.ControlloConvalidazione;
import convalidazione.MessageError;
import dao.ExceptionDao;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistraInvitato extends javax.swing.JFrame {

    /*DATI IMPORTANTI*/
    private String idAtleta;
    private int idEvento;
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();
    
    /*COSTRUTTORI*/
    public RegistraInvitato(String idAtleta, int idEvento) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAtleta = idAtleta;
        this.idEvento = idEvento;
        
        this.jMessagge.setVisible(false);
    }

    public RegistraInvitato() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adviceJL = new javax.swing.JLabel();
        btnNoJB = new javax.swing.JButton();
        btnYesJB = new javax.swing.JButton();
        jMessagge = new javax.swing.JPanel();
        jLMessaggio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adviceJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        adviceJL.setForeground(new java.awt.Color(255, 255, 255));
        adviceJL.setText("Sei Sicuro di Voler Partecipare In Questo Evento?");
        jPanel1.add(adviceJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

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

        jMessagge.setBackground(new java.awt.Color(231, 76, 60));

        jLMessaggio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLMessaggio.setForeground(new java.awt.Color(255, 255, 255));
        jLMessaggio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMessaggio.setText("Credenziale Sbagliate");

        jLabel3.setBackground(new java.awt.Color(231, 76, 60));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_20px.png"))); // NOI18N
        jLabel3.setFocusable(false);

        btnCloseMessage.setBackground(new java.awt.Color(231, 76, 60));
        btnCloseMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnCloseMessage.setBorder(null);
        btnCloseMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMessage.setFocusPainted(false);
        btnCloseMessage.setFocusable(false);
        btnCloseMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseMessageActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnCloseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jMessaggeLayout.setVerticalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMessaggeLayout.createSequentialGroup()
                .addGroup(jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCloseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLMessaggio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanel1.add(jMessagge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 360, 30));

        btnLogoutJB2.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnLogoutJB2.setBorder(null);
        btnLogoutJB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB2.setFocusPainted(false);
        btnLogoutJB2.setFocusable(false);
        btnLogoutJB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJB2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnYesJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        try {
            if(controlloConvalidazione.controllaInvitatti(this.getIdAtleta(), String.valueOf(this.getIdEvento())) == true) {
                if(controllerSportivo.registraInvitato(this.getIdAtleta(), this.getIdEvento(), 1)) {
                    messageError.showMessage(false, true, "success", "L'Atleta "+this.getIdAtleta()+" E' Invitato Per L'Evento Numero "+this.getIdEvento() ,jLMessaggio , jMessagge, btnCloseMessage);
                    this.btnYesJB.setEnabled(false);
                    this.btnNoJB.setEnabled(false);
                }
                else {
                    messageError.showMessage(false, true, "warning", "Già Hai Scelto Per Questo Evento",jLMessaggio , jMessagge, btnCloseMessage);
                    this.btnYesJB.setEnabled(false);
                    this.btnNoJB.setEnabled(false);
                }
                /*try {
                    java.util.concurrent.TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RegistraInvitato.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);*/
            }
            else {
                messageError.showMessage(false, true, "warning","Errore Anamolo Non E' Stato Possibile Registrare L'invitato Riprovare" , jLMessaggio, jMessagge, btnCloseMessage);
                /*try {
                    java.util.concurrent.TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RegistraInvitato.class.getName()).log(Level.SEVERE, null, ex);
                    this.setVisible(false);
                }*/
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraInvitato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnYesJBActionPerformed

    private void btnNoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        
        try {
            if(controlloConvalidazione.controllaInvitatti(this.getIdAtleta(), String.valueOf(this.getIdEvento())) == true) {
                if(controllerSportivo.registraInvitato(this.getIdAtleta(), this.getIdEvento(), 0)) {
                    messageError.showMessage(false, true, "success", "L'Atleta "+this.getIdAtleta()+" Non E' Invitato Per L'Evento Numero "+this.getIdEvento() ,jLMessaggio , jMessagge, btnCloseMessage);
                    this.btnYesJB.setEnabled(false);
                    this.btnNoJB.setEnabled(false);
                }
                else {
                    messageError.showMessage(false, true, "warning", "Già Hai Scelto Per Questo Evento",jLMessaggio , jMessagge, btnCloseMessage);
                    this.btnYesJB.setEnabled(false);
                    this.btnNoJB.setEnabled(false);
                }
                /*try {
                    java.util.concurrent.TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RegistraInvitato.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);*/
            }
            else{
                messageError.showMessage(false, true, "warning","Errore Anamolo Non E' Stato Possibile Registrare L'invitato Riprovare" , jLMessaggio, jMessagge, btnCloseMessage);
                /*try {
                    java.util.concurrent.TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RegistraInvitato.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);*/
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraInvitato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNoJBActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        this.jMessagge.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnLogoutJB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJB2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    /*GET AND SET*/
    public String getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }
    
     public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
    
   /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraInvitato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adviceJL;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB2;
    private javax.swing.JButton btnNoJB;
    private javax.swing.JButton btnYesJB;
    private javax.swing.JLabel jLMessaggio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jMessagge;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
