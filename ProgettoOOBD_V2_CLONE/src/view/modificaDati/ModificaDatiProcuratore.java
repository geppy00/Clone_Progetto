
package view.modificaDati;

import controller.ControllerProcuratore;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Admin;
import model.Procuratore;
import view.AdminView;


public class ModificaDatiProcuratore extends javax.swing.JFrame {
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private static final String FORMAT = "yyyy/MM/dd";
    
    /*DATI DEL PROCURATORE*/
    private ArrayList<Procuratore> datiProcuratore =  new ArrayList<Procuratore>();
    
    public ModificaDatiProcuratore() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPMessage.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnLogoutJB1 = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        inputMatricolaDaCercareJTF = new javax.swing.JTextField();
        inputSessoJTF = new javax.swing.JTextField();
        inputNomeJTF = new javax.swing.JTextField();
        inputIbanJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCercaJTF = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        btnModificaJB = new javax.swing.JButton();
        inputMatricolaJTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputCognomeJTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inputNazioneJTF = new javax.swing.JTextField();
        cambiaDataNascitaJDC = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        inputIndirizzoJTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        inputTelefonoJTF = new javax.swing.JTextField();
        inputCodiceFiscaleJTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 40));

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
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 510, 40));

        inputMatricolaDaCercareJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputMatricolaDaCercareJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputMatricolaDaCercareJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputMatricolaDaCercareJTF.setText("Matricola ");
        inputMatricolaDaCercareJTF.setBorder(null);
        inputMatricolaDaCercareJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputMatricolaDaCercareJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputMatricolaDaCercareJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputMatricolaDaCercareJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 420, 30));

        inputSessoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputSessoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputSessoJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputSessoJTF.setBorder(null);
        jPanel1.add(inputSessoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 250, 30));

        inputNomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputNomeJTF.setBorder(null);
        jPanel1.add(inputNomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 250, 30));

        inputIbanJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIbanJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIbanJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputIbanJTF.setBorder(null);
        jPanel1.add(inputIbanJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("sesso");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 40, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 70, 30));

        btnCercaJTF.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaJTF.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaJTF.setText("Cercare");
        btnCercaJTF.setActionCommand("Stabilisca");
        btnCercaJTF.setBorder(null);
        btnCercaJTF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaJTF.setFocusPainted(false);
        btnCercaJTF.setFocusable(false);
        btnCercaJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJTFActionPerformed(evt);
            }
        });
        jPanel1.add(btnCercaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 90, 30));

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
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 80, 30));

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
        jPanel1.add(btnModificaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 90, 30));

        inputMatricolaJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputMatricolaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputMatricolaJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputMatricolaJTF.setBorder(null);
        jPanel1.add(inputMatricolaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 250, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Matricola");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 70, 30));

        inputCognomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputCognomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputCognomeJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputCognomeJTF.setBorder(null);
        jPanel1.add(inputCognomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 250, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cognome");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 70, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("IBAN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 40, 30));

        inputNazioneJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNazioneJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNazioneJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputNazioneJTF.setBorder(null);
        jPanel1.add(inputNazioneJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 250, 30));
        jPanel1.add(cambiaDataNascitaJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 250, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nazione");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 70, 30));

        inputIndirizzoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIndirizzoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIndirizzoJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputIndirizzoJTF.setBorder(null);
        jPanel1.add(inputIndirizzoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 250, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Indirizzo");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 70, 30));

        inputTelefonoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputTelefonoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputTelefonoJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputTelefonoJTF.setBorder(null);
        jPanel1.add(inputTelefonoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 250, 30));

        inputCodiceFiscaleJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputCodiceFiscaleJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputCodiceFiscaleJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputCodiceFiscaleJTF.setBorder(null);
        jPanel1.add(inputCodiceFiscaleJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 250, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Data di Nascita");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 100, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Codice Fiscale");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
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

    private void inputMatricolaDaCercareJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMatricolaDaCercareJTFFocusGained
        if(inputMatricolaDaCercareJTF.getText().equals("Matricola")){
            inputMatricolaDaCercareJTF.setText("");
            inputMatricolaDaCercareJTF.setBackground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputMatricolaDaCercareJTFFocusGained

    private void inputMatricolaDaCercareJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMatricolaDaCercareJTFFocusLost
        if(inputMatricolaDaCercareJTF.getText().equals("")){
            inputMatricolaDaCercareJTF.setText("Matricola");
            inputMatricolaDaCercareJTF.setBackground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputMatricolaDaCercareJTFFocusLost

    private void btnCercaJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJTFActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String matricolaCopiata = inputMatricolaDaCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaProcuratore(matricolaCopiata) == true) {
            try {
                datiProcuratore = controllerProcuratore.cercaProcuratore(matricolaCopiata);
                if(datiProcuratore.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "PROCURATORE "+matricolaCopiata+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, "✓ PROCURATORE "+matricolaCopiata+" TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    datiProcuratore.forEach((Procuratore procuratore)->{
                        inputMatricolaJTF.setText(procuratore.getCode_procuratore());
                        inputNomeJTF.setText(procuratore.getNome());
                        inputCognomeJTF.setText(procuratore.getCognome());
                        inputSessoJTF.setText(procuratore.getSesso());
                        inputNazioneJTF.setText(procuratore.getNazione());
                        inputIndirizzoJTF.setText(procuratore.getIndirizzo());
                        inputTelefonoJTF.setText(procuratore.getTelefono());
                        inputCodiceFiscaleJTF.setText(procuratore.getCodFiscale());
                        inputIbanJTF.setText(procuratore.getIban());
                        cambiaDataNascitaJDC.setDate(procuratore.getDataNascita());
                    });
                }
            } catch (ExceptionDao ex) {
                    Logger.getLogger(ModificaDatiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LA MATRICOLA DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCercaJTFActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       AdminView adminPage = new AdminView();
       adminPage.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnModificaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        java.sql.Date dataNascitaPresoSql = null;
        String matricolaDaModificare = inputMatricolaDaCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaProcuratore(matricolaDaModificare) == true) {
            if(datiProcuratore.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "PROCURATORE "+matricolaDaModificare+" NON ESISTE\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            else {
                String matricolaNuova = inputMatricolaJTF.getText();
                String nomeNuovo = inputNomeJTF.getText();
                String cognomeNuovo = inputCognomeJTF.getText();
                String sessoNuovo = inputSessoJTF.getText();
                String nazioneNuova = inputNazioneJTF.getText();
                String indirizzoNuovo = inputIndirizzoJTF.getText();
                String telefonoNuovo = inputTelefonoJTF.getText();
                String codiceFiscaleNuovo = inputCodiceFiscaleJTF.getText();
                String ibanNuovo = inputIbanJTF.getText();

                try {
                    dataNascitaPresoSql = new java.sql.Date(cambiaDataNascitaJDC.getDate().getTime());
                } catch(NullPointerException nex) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERISCI UNA DATA VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }

                if(controlloConvalidazione.controlloModificaProcuratore(matricolaNuova, nomeNuovo, cognomeNuovo, sessoNuovo, nazioneNuova, indirizzoNuovo, telefonoNuovo, codiceFiscaleNuovo, ibanNuovo, String.valueOf(dataNascitaPresoSql)) == true) {
                    try {
                        controllerProcuratore.aggiornaProcuratore(matricolaNuova, nomeNuovo, cognomeNuovo, sessoNuovo, nazioneNuova, indirizzoNuovo, (java.sql.Date) dataNascitaPresoSql, telefonoNuovo, codiceFiscaleNuovo, ibanNuovo, matricolaDaModificare);
                        JOptionPane.showMessageDialog(this, "✓ MODIFICA DEL PROCURATORE "+matricolaDaModificare+" EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                    } catch (ExceptionDao ex) {
                        Logger.getLogger(ModificaDatiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE LA MATRICOLA PER TROVARE IL PROCURATORE DA MODIFICARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificaJBActionPerformed

    public String convertiDate(java.util.Date dataDiNascita){
        DateFormat df = new SimpleDateFormat(FORMAT);
        String strDate = df.format(dataDiNascita);
        return strDate;
    }
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaDatiProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJTF;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnModificaJB;
    private com.toedter.calendar.JDateChooser cambiaDataNascitaJDC;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputCodiceFiscaleJTF;
    private javax.swing.JTextField inputCognomeJTF;
    private javax.swing.JTextField inputIbanJTF;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputMatricolaDaCercareJTF;
    private javax.swing.JTextField inputMatricolaJTF;
    private javax.swing.JTextField inputNazioneJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JTextField inputSessoJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
