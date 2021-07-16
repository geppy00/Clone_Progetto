
package view.registrare;

import controller.ControllerClub;
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
import view.SezioneClub;


public class RegistraClub extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();
    
    public RegistraClub() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.jPanel2.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputTelefonoJTF = new javax.swing.JTextField();
        btnRegistraJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        inputNomeJTF = new javax.swing.JTextField();
        inputIndirizzoJTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLogoutJB1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputTelefonoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputTelefonoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        inputTelefonoJTF.setForeground(new java.awt.Color(231, 231, 231));
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
        jPanel1.add(inputTelefonoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 350, 30));

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
        jPanel1.add(btnRegistraJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 80, 30));

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
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 80, 30));

        inputNomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        inputNomeJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputNomeJTF.setText("Nome Club");
        inputNomeJTF.setBorder(null);
        inputNomeJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNomeJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNomeJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputNomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 350, 30));

        inputIndirizzoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIndirizzoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        inputIndirizzoJTF.setForeground(new java.awt.Color(231, 231, 231));
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
        jPanel1.add(inputIndirizzoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 350, 30));

        jPanel2.setBackground(new java.awt.Color(46, 204, 113));

        jLabel1.setBackground(new java.awt.Color(46, 204, 113));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_26px.png"))); // NOI18N

        btnCloseMessage.setBackground(new java.awt.Color(46, 204, 113));
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

        jLabel2.setBackground(new java.awt.Color(46, 204, 113));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCloseMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 350, 30));

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
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
            inputTelefonoJTF.setForeground(new Color(231,231,231));

        }
    }//GEN-LAST:event_inputTelefonoJTFFocusLost

    private void btnRegistraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraJBActionPerformed
       ControllerClub controllerClub = new ControllerClub();
        String nome = inputNomeJTF.getText();
        String indirizzo = inputIndirizzoJTF.getText();
        String telefono = inputTelefonoJTF.getText();
        
        
        if(controlloConvalidazione.controlloRegistraClub(nome, indirizzo, telefono) == true) {
            try {
                controllerClub.registraClub(nome, indirizzo, telefono);
                //JOptionPane.showMessageDialog(this, "✓ REGISTRAZIONE EFFETTUATA CON SUCCESSO", "REGISTRAZIONE", JOptionPane.INFORMATION_MESSAGE);
                messageError.showMessage(false, true, "success", "Registrazione Effettuata Con Successo", jLabel2, jPanel2, btnCloseMessage);
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraClub.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Uno O Piu' Campi Mancanti", jLabel2, jPanel2, btnCloseMessage);
        }

    }//GEN-LAST:event_btnRegistraJBActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneClub sezioneClub = new SezioneClub();
        sezioneClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        this.jPanel2.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void inputNomeJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeJTFFocusGained
      if(inputNomeJTF.getText().equals("Nome Club")){
            inputNomeJTF.setText("");
            inputNomeJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputNomeJTFFocusGained

    private void inputNomeJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeJTFFocusLost
        if(inputNomeJTF.getText().equals("")){
            inputNomeJTF.setText("Nome Club");
            inputNomeJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputNomeJTFFocusLost

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

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnRegistraJB;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
