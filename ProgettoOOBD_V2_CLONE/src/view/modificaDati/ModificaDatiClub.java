
package view.modificaDati;

import controller.ControllerClub;
import convalidazione.ControlloConvalidazione;
import convalidazione.MessageError;
import convalidazione.PermessoPerNonScrivere;
import convalidazione.PermessoPerScrivere;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Club;
import view.SezioneClub;


public class ModificaDatiClub extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();  
    
    /*DATI DEL PROCURATORE*/
    private ArrayList<Club> datiClub = new ArrayList<Club>();
    
    public ModificaDatiClub() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jPMessage.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogoutJB1 = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        inputTelefonoJTF = new javax.swing.JTextField();
        inputNomeCercareJTF = new javax.swing.JTextField();
        inputIndirizzoJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCercaJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnModificaJB = new javax.swing.JButton();
        inputNomeJTF1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, 40));

        jPMessage.setBackground(new java.awt.Color(46, 204, 113));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_26px.png"))); // NOI18N

        errorMessage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 255, 255));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("Contratto stabilitto con sucesso ");

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

        javax.swing.GroupLayout jPMessageLayout = new javax.swing.GroupLayout(jPMessage);
        jPMessage.setLayout(jPMessageLayout);
        jPMessageLayout.setHorizontalGroup(
            jPMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMessageLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCloseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMessageLayout.setVerticalGroup(
            jPMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCloseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 520, 40));

        inputTelefonoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputTelefonoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputTelefonoJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputTelefonoJTF.setBorder(null);
        inputTelefonoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTelefonoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTelefonoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputTelefonoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 250, 30));

        inputNomeCercareJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeCercareJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeCercareJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputNomeCercareJTF.setText("Nome Club");
        inputNomeCercareJTF.setBorder(null);
        inputNomeCercareJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNomeCercareJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNomeCercareJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputNomeCercareJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 430, 30));

        inputIndirizzoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIndirizzoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIndirizzoJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputIndirizzoJTF.setBorder(null);
        jPanel1.add(inputIndirizzoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Indirizzo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 60, 30));

        btnCercaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaJB.setText("Cercare");
        btnCercaJB.setActionCommand("Stabilisca");
        btnCercaJB.setBorder(null);
        btnCercaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaJB.setFocusPainted(false);
        btnCercaJB.setFocusable(false);
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCercaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 90, 30));

        btnTornaIndietroJB.setBackground(new java.awt.Color(231, 76, 60));
        btnTornaIndietroJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnTornaIndietroJB.setForeground(new java.awt.Color(255, 255, 255));
        btnTornaIndietroJB.setText("Annulla");
        btnTornaIndietroJB.setBorder(null);
        btnTornaIndietroJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTornaIndietroJB.setFocusPainted(false);
        btnTornaIndietroJB.setFocusable(false);
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 80, 30));

        btnModificaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnModificaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnModificaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnModificaJB.setText("Modifica");
        btnModificaJB.setActionCommand("Stabilisca");
        btnModificaJB.setBorder(null);
        btnModificaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificaJB.setFocusPainted(false);
        btnModificaJB.setFocusable(false);
        btnModificaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 90, 30));

        inputNomeJTF1.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeJTF1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeJTF1.setForeground(new java.awt.Color(221, 231, 231));
        inputNomeJTF1.setBorder(null);
        jPanel1.add(inputNomeJTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 510, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        String nomeClubCercare = inputNomeCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaClub(nomeClubCercare) == true) {
            try {
                datiClub = controllerClub.cercaClub(nomeClubCercare);
                if(datiClub.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    //JOptionPane.showMessageDialog(this, "CLUB "+nomeClubCercare+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    messageError.showMessage(false, true, "warning", "Club "+nomeClubCercare+" Non Trovato", errorMessage, jPMessage, btnCloseMessage);
                }
                else {
                    //JOptionPane.showMessageDialog(this, "✓ CLUB "+nomeClubCercare+" TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    messageError.showMessage(false, true, "success", "Club "+nomeClubCercare+" Trovato Con Successo", errorMessage, jPMessage, btnCloseMessage);
                    datiClub.forEach((Club club) -> {
                        inputNomeJTF1.setText(club.getNomeClub());
                        inputIndirizzoJTF.setText(club.getIndirizzo());
                        inputTelefonoJTF.setText(club.getTelefono());
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(ModificaDatiClub.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CLUB DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Scrivere Nel Campo Il Club Da Cercare", errorMessage, jPMessage, btnCloseMessage);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
       SezioneClub sezioneClub = new SezioneClub();
        sezioneClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnModificaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaJBActionPerformed
       ControllerClub controllerClub = new ControllerClub();
        String nomeClubCercare = inputNomeCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaClub(nomeClubCercare) == true) {
            if(datiClub.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                //JOptionPane.showMessageDialog(this, "CLUB "+nomeClubCercare+" NON ESISTE\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                messageError.showMessage(false, true, "warning", "Club "+nomeClubCercare+" Non Esiste Non Possibile Modificarlo", errorMessage, jPMessage, btnCloseMessage);
            }
            else {
                String nome = inputNomeCercareJTF.getText();
                String indirizzo = inputIndirizzoJTF.getText();
                String telefono = inputTelefonoJTF.getText();
                if(controlloConvalidazione.controlloModificaClub(nome, indirizzo, telefono) == true) {
                    try {
                        controllerClub.aggiornaClub(nomeClubCercare, nome, indirizzo, telefono);
                        //JOptionPane.showMessageDialog(this, "✓ MODIFICA DEL CLUB "+nomeClubCercare+" EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                        messageError.showMessage(false, true, "success", "Modifica Del Club "+nomeClubCercare+" Effettuata Con Successo", errorMessage, jPMessage, btnCloseMessage);
                    } catch (ExceptionDao ex) {
                        Logger.getLogger(ModificaDatiClub.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else {
                    Toolkit.getDefaultToolkit().beep();
                    //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    messageError.showMessage(false, true, "warning", "Uno O Piu' Campi Mancanti", errorMessage, jPMessage, btnCloseMessage);
                }
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE IL NOME PER TROVARE IL CLUB DA MODIFICARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Inserire Il Nome Per Trovare Il Club Da Modificare", errorMessage, jPMessage, btnCloseMessage);
        }
    }//GEN-LAST:event_btnModificaJBActionPerformed

    private void inputNomeCercareJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeCercareJTFFocusGained
       if(inputNomeCercareJTF.getText().equals("Nome Club")){
            inputNomeCercareJTF.setText("");
            inputNomeCercareJTF.setForeground(new Color(255,255,255));
       }
    }//GEN-LAST:event_inputNomeCercareJTFFocusGained

    private void inputNomeCercareJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeCercareJTFFocusLost
       if(inputNomeCercareJTF.getText().equals("")){
            inputNomeCercareJTF.setText("Nome Club");
            inputNomeCercareJTF.setForeground(new Color(231,231,231));
       }
    }//GEN-LAST:event_inputNomeCercareJTFFocusLost

    private void inputTelefonoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTelefonoJTFFocusGained
        inputTelefonoJTF.setDocument(new PermessoPerScrivere());
    }//GEN-LAST:event_inputTelefonoJTFFocusGained

    private void inputTelefonoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTelefonoJTFFocusLost
        inputTelefonoJTF.setDocument(new PermessoPerNonScrivere());
    }//GEN-LAST:event_inputTelefonoJTFFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaDatiClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnModificaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNomeCercareJTF;
    private javax.swing.JTextField inputNomeJTF1;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
