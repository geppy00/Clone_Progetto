
package view.registrare;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import convalidazione.MessageError;
import convalidazione.PermessoPerNonScrivere;
import convalidazione.PermessoPerScrivere;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.SezioneSponsorView;

public class RegistraSponsor extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();
    
    /*COSTRUTTORE*/
    public RegistraSponsor() {
        initComponents();
        this.setLocationRelativeTo(null);
        jMessagge.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputNomeSponsorJTF = new javax.swing.JTextField();
        inputTelefonoJTF = new javax.swing.JTextField();
        inputIndirizzoJTF = new javax.swing.JTextField();
        btnRegistraJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
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

        inputNomeSponsorJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeSponsorJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeSponsorJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputNomeSponsorJTF.setText("Nome ");
        inputNomeSponsorJTF.setBorder(null);
        inputNomeSponsorJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNomeSponsorJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNomeSponsorJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputNomeSponsorJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 340, 30));

        inputTelefonoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputTelefonoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputTelefonoJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputTelefonoJTF.setText("Telefono");
        inputTelefonoJTF.setBorder(null);
        inputTelefonoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTelefonoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTelefonoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputTelefonoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 340, 30));

        inputIndirizzoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIndirizzoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIndirizzoJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputIndirizzoJTF.setText("Indirizzo");
        inputIndirizzoJTF.setBorder(null);
        inputIndirizzoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIndirizzoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIndirizzoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputIndirizzoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 340, 30));

        btnRegistraJB.setBackground(new java.awt.Color(46, 204, 113));
        btnRegistraJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRegistraJB.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistraJB.setText("Registra");
        btnRegistraJB.setBorder(null);
        btnRegistraJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistraJB.setFocusPainted(false);
        btnRegistraJB.setFocusable(false);
        btnRegistraJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistraJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, 30));

        btnAnnullaJB.setBackground(new java.awt.Color(231, 76, 60));
        btnAnnullaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAnnullaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnullaJB.setText("Annulla");
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.setFocusPainted(false);
        btnAnnullaJB.setFocusable(false);
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 80, 30));

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
                .addGap(36, 36, 36)
                .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
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

        jPanel1.add(jMessagge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 340, 30));

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
        jPanel1.add(btnLogoutJB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTelefonoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTelefonoJTFFocusGained
        if(inputTelefonoJTF.getText().equals("Telefono")){
            inputTelefonoJTF.setText("");
            inputTelefonoJTF.setForeground(new Color(255,255,255));
            inputTelefonoJTF.setDocument(new PermessoPerScrivere());
        }
    }//GEN-LAST:event_inputTelefonoJTFFocusGained

    private void inputTelefonoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTelefonoJTFFocusLost
        if(inputTelefonoJTF.getText().equals("")){
            inputTelefonoJTF.setDocument(new PermessoPerNonScrivere());
            inputTelefonoJTF.setText("Telefono");
            inputTelefonoJTF.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_inputTelefonoJTFFocusLost

    private void inputIndirizzoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIndirizzoJTFFocusGained
        if(inputIndirizzoJTF.getText().equals("Indirizzo")){
            inputIndirizzoJTF.setText("");
            inputIndirizzoJTF.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_inputIndirizzoJTFFocusGained

    private void inputIndirizzoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIndirizzoJTFFocusLost
        if(inputIndirizzoJTF.getText().equals("")){
            inputIndirizzoJTF.setText("Indirizzo");
            inputIndirizzoJTF.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_inputIndirizzoJTFFocusLost

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        this.jMessagge.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnRegistraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        
        String nomeSponsor = inputNomeSponsorJTF.getText();
        String indirizzoSponsor = inputIndirizzoJTF.getText();
        String telefonoSponsor = inputTelefonoJTF.getText();
        
        if(controlloConvalidazione.controlloRegistraSponsor(nomeSponsor, indirizzoSponsor, telefonoSponsor) == true) {
            try {
                controllerSponsor.registraSponsor(nomeSponsor, indirizzoSponsor, telefonoSponsor);
                //JOptionPane.showMessageDialog(this, "✓ REGISTRAZIONE EFFETTUATA CON SUCCESSO", "REGISTRAZIONE", JOptionPane.INFORMATION_MESSAGE);
                messageError.showMessage(false, true, "success", "Registrazione Effettuata Con Successo", jLMessaggio , jMessagge, btnCloseMessage);
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraSponsor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Uno O Piu' Campi Mancanti" , jLMessaggio, jMessagge, btnCloseMessage);
        }
    }//GEN-LAST:event_btnRegistraJBActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneSponsorView sezioneSponsorView = new SezioneSponsorView();
        sezioneSponsorView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void inputNomeSponsorJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeSponsorJTFFocusGained
        if(inputNomeSponsorJTF.getText().equals("Nome ")){
            inputNomeSponsorJTF.setText("");
            inputNomeSponsorJTF.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_inputNomeSponsorJTFFocusGained

    private void inputNomeSponsorJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeSponsorJTFFocusLost
       if(inputNomeSponsorJTF.getText().equals("")){
            inputNomeSponsorJTF.setText("Nome ");
            inputNomeSponsorJTF.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_inputNomeSponsorJTFFocusLost

    private void btnLogoutJB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB2ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraSponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB2;
    private javax.swing.JButton btnRegistraJB;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNomeSponsorJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel jLMessaggio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jMessagge;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
