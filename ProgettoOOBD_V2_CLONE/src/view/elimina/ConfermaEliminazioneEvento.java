
package view.elimina;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import convalidazione.MessageError;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConfermaEliminazioneEvento extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private String idSponsor;
    private int idEvento;
    
    /*COSTRUTTORI*/
    public ConfermaEliminazioneEvento(String idSponsor, int idEvento) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        this.idEvento = idEvento;
        
        jMessagge.setVisible(false);
    }
    
    public ConfermaEliminazioneEvento() {
        
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
        btnCloseMessagio = new javax.swing.JButton();
        btnLogoutJB2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adviceJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        adviceJL.setForeground(new java.awt.Color(255, 255, 255));
        adviceJL.setText("Sei Sicuro di Voler Eliminare Questo Evento?");
        jPanel1.add(adviceJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 330, -1));

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
        jPanel1.add(btnNoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 113, 50));

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
        jPanel1.add(btnYesJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 112, 48));

        jMessagge.setBackground(new java.awt.Color(231, 76, 60));

        jLMessaggio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLMessaggio.setForeground(new java.awt.Color(255, 255, 255));
        jLMessaggio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMessaggio.setText("Credenziale Sbagliate");

        jLabel3.setBackground(new java.awt.Color(231, 76, 60));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_20px.png"))); // NOI18N
        jLabel3.setFocusable(false);

        btnCloseMessagio.setBackground(new java.awt.Color(231, 76, 60));
        btnCloseMessagio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnCloseMessagio.setBorder(null);
        btnCloseMessagio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMessagio.setFocusPainted(false);
        btnCloseMessagio.setFocusable(false);
        btnCloseMessagio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseMessagioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMessaggeLayout = new javax.swing.GroupLayout(jMessagge);
        jMessagge.setLayout(jMessaggeLayout);
        jMessaggeLayout.setHorizontalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMessaggeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jMessaggeLayout.setVerticalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jMessaggeLayout.createSequentialGroup()
                .addGroup(jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jMessagge, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 320, 30));

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 5, -1, -1));

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

    private void btnNoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoJBActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnNoJBActionPerformed

    private void btnYesJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesJBActionPerformed
       ControllerSponsor controllerSponsor = new ControllerSponsor();
       MessageError messageError = new MessageError();
        
        if(controlloConvalidazione.controlloIdEvento(String.valueOf(this.getIdEvento())) == true) {
            try {
                controllerSponsor.eliminaEvento(this.getIdEvento(), Integer.parseInt(this.getIdSponsor()));
                //JOptionPane.showMessageDialog(this, "✓ ELIMINAZIONE EFFETTUATA CON SUCCESSO", "ELIMINAZIONE", JOptionPane.INFORMATION_MESSAGE);
                messageError.showMessage(false, true, "success", "Eliminazione Effettuata Con Successo", jLMessaggio, jMessagge, btnCloseMessagio);
                btnYesJB.setEnabled(false);
                btnNoJB.setEnabled(false);
                btnYesJB.setForeground(new Color(255, 255, 255));
                btnNoJB.setForeground(new Color(255, 255, 255));
            } catch (ExceptionDao ex) {
                Logger.getLogger(ConfermaEliminazioneEvento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "CI E' STATO UN PROBLEMA NEL RICAVARE I DATI\nRIPROVA A SELEZIONE QUESTO EVENTO", "WARNING", JOptionPane.WARNING_MESSAGE);
            messageError.showMessage(false, true, "warning", "Errore Nell'Eliminazione", jLMessaggio, jMessagge, btnCloseMessagio);
        }
    }//GEN-LAST:event_btnYesJBActionPerformed

    private void btnCloseMessagioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessagioActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseMessagioActionPerformed

    private void btnLogoutJB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJB2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked


    /*GET AND SET*/
    public String getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(String idSponsor) {
        this.idSponsor = idSponsor;
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
                new ConfermaEliminazioneEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adviceJL;
    private javax.swing.JButton btnCloseMessagio;
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
