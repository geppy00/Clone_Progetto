
package view.modificaDati;

import controller.ControllerSportivo;
import convalidazione.ControlloConvalidazione;
import convalidazione.MessageError;
import convalidazione.PermessoPerNonScrivere;
import convalidazione.PermessoPerScrivere;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Atleta;
import view.SezioneAtletaView;

public class ModificaSportivo extends javax.swing.JFrame {
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private static final String FORMAT = "yyyy/MM/dd";
    private MessageError messageError = new MessageError();
    
    /*DATI DEL ATLETA*/
    private ArrayList<Atleta> datiAtleta =  new ArrayList<Atleta>();
    
    public ModificaSportivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jPMessage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogoutJB1 = new javax.swing.JButton();
        inputCodiceFiscaleJTF = new javax.swing.JTextField();
        inputSessoJTF = new javax.swing.JTextField();
        inputCognomeJTF = new javax.swing.JTextField();
        inputCodiceFiscaleModificatoJTF = new javax.swing.JTextField();
        inputNazioneJTF = new javax.swing.JTextField();
        inputRuoloJTF = new javax.swing.JTextField();
        inputPesoJTF = new javax.swing.JTextField();
        inputIndirizzoJTF = new javax.swing.JTextField();
        inputIbanJTF = new javax.swing.JTextField();
        inputDataNascitaJDC = new com.toedter.calendar.JDateChooser();
        inputTelefonoJTF = new javax.swing.JTextField();
        inputProcuratoreAssociatoJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        inputNomeJTF = new javax.swing.JTextField();
        btnAggiornaJB = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        inputIdClubJTF1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 5, 40, 40));

        inputCodiceFiscaleJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputCodiceFiscaleJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputCodiceFiscaleJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputCodiceFiscaleJTF.setText("Codice Fiscale");
        inputCodiceFiscaleJTF.setBorder(null);
        inputCodiceFiscaleJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCodiceFiscaleJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCodiceFiscaleJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputCodiceFiscaleJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 530, 30));

        inputSessoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputSessoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputSessoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputSessoJTF.setBorder(null);
        jPanel1.add(inputSessoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 310, 30));

        inputCognomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputCognomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputCognomeJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputCognomeJTF.setBorder(null);
        jPanel1.add(inputCognomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 310, 30));

        inputCodiceFiscaleModificatoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputCodiceFiscaleModificatoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputCodiceFiscaleModificatoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputCodiceFiscaleModificatoJTF.setBorder(null);
        jPanel1.add(inputCodiceFiscaleModificatoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 310, 30));

        inputNazioneJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNazioneJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNazioneJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputNazioneJTF.setBorder(null);
        jPanel1.add(inputNazioneJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 310, 30));

        inputRuoloJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputRuoloJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputRuoloJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputRuoloJTF.setBorder(null);
        jPanel1.add(inputRuoloJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 310, 30));

        inputPesoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputPesoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputPesoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputPesoJTF.setBorder(null);
        jPanel1.add(inputPesoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 310, 30));

        inputIndirizzoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIndirizzoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIndirizzoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIndirizzoJTF.setBorder(null);
        jPanel1.add(inputIndirizzoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 310, 30));

        inputIbanJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIbanJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIbanJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIbanJTF.setBorder(null);
        jPanel1.add(inputIbanJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 310, 30));
        jPanel1.add(inputDataNascitaJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 310, 30));

        inputTelefonoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputTelefonoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputTelefonoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputTelefonoJTF.setBorder(null);
        inputTelefonoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTelefonoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTelefonoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputTelefonoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 630, 30));

        inputProcuratoreAssociatoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputProcuratoreAssociatoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputProcuratoreAssociatoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputProcuratoreAssociatoJTF.setBorder(null);
        jPanel1.add(inputProcuratoreAssociatoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 310, 30));

        btnCercaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaJB.setText("Cerca");
        btnCercaJB.setBorder(null);
        btnCercaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaJB.setFocusPainted(false);
        btnCercaJB.setFocusable(false);
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCercaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 100, 30));

        btnAnnullaJB.setBackground(new java.awt.Color(231, 76, 60));
        btnAnnullaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAnnullaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnullaJB.setText("Anulla");
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.setFocusPainted(false);
        btnAnnullaJB.setFocusable(false);
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 110, 30));

        inputNomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputNomeJTF.setBorder(null);
        jPanel1.add(inputNomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 310, 30));

        btnAggiornaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnAggiornaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAggiornaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAggiornaJB.setText("Modifica");
        btnAggiornaJB.setBorder(null);
        btnAggiornaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggiornaJB.setFocusPainted(false);
        btnAggiornaJB.setFocusable(false);
        btnAggiornaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAggiornaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 109, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cognome");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 70, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Indirizzo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 70, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nome");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 70, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sesso");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 40, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Codice Fiscale");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 110, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ruolo Atleta");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 110, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nazione");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 70, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("IBAN");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 170, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Peso");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 40, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Telefono");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 110, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ID Procuratore Associato");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 170, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Data di Nascita");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 110, 30));

        jPMessage.setBackground(new java.awt.Color(46, 204, 113));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_26px.png"))); // NOI18N

        errorMessage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 255, 255));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("Evento Creato Con Successo");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 630, 40));

        inputIdClubJTF1.setBackground(new java.awt.Color(9, 46, 119));
        inputIdClubJTF1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdClubJTF1.setForeground(new java.awt.Color(231, 231, 231));
        inputIdClubJTF1.setBorder(null);
        inputIdClubJTF1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIdClubJTF1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIdClubJTF1FocusLost(evt);
            }
        });
        jPanel1.add(inputIdClubJTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 310, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ID Club");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void inputCodiceFiscaleJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodiceFiscaleJTFFocusGained
        if(inputCodiceFiscaleJTF.getText().equals("Codice Fiscale")){
            inputCodiceFiscaleJTF.setText("");
            inputCodiceFiscaleJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputCodiceFiscaleJTFFocusGained

    private void inputCodiceFiscaleJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodiceFiscaleJTFFocusLost
        if(inputCodiceFiscaleJTF.getText().equals("")){
            inputCodiceFiscaleJTF.setText("Nome");
            inputCodiceFiscaleJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputCodiceFiscaleJTFFocusLost

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        String CodiceFiscalePreso = inputCodiceFiscaleJTF.getText();
        
        if(controlloConvalidazione.controlloCercaAtleta(CodiceFiscalePreso) == true) {
            try {
                datiAtleta = controllerSportivo.cercaSportivo(CodiceFiscalePreso);
                if(datiAtleta.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    //JOptionPane.showMessageDialog(this, "ATLETA "+CodiceFiscalePreso+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    messageError.showMessage(false, true, "warning", "Atleta Con Codice Fiscale "+CodiceFiscalePreso+" Non Trovato", errorMessage, jPMessage, btnCloseMessage);
                }
                else {
                    //JOptionPane.showMessageDialog(this, "✓ ATLETA "+CodiceFiscalePreso+" TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    messageError.showMessage(false, true, "success", "Atleta Con Codice Fiscale "+CodiceFiscalePreso+" Trovato Con Successo", errorMessage, jPMessage, btnCloseMessage);
                    datiAtleta.forEach((Atleta atleta)->{
                        inputCodiceFiscaleModificatoJTF.setText(atleta.getCodiceFiscale());
                        inputCognomeJTF.setText(atleta.getCognmome());
                        inputDataNascitaJDC.setDate(atleta.getDataNascita());
                        inputIbanJTF.setText(atleta.getIban());
                        inputIndirizzoJTF.setText(atleta.getIndirizzo());
                        inputNazioneJTF.setText(atleta.getNazione());
                        inputNomeJTF.setText(atleta.getNome());
                        String pesoSTR = Float.toString(atleta.getPeso());
                        inputPesoJTF.setText(pesoSTR);
                        inputProcuratoreAssociatoJTF.setText(atleta.getIdProcuratore());
                        inputRuoloJTF.setText(atleta.getRuolo());
                        inputSessoJTF.setText(atleta.getSesso());
                        inputTelefonoJTF.setText(atleta.getTelefono());
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(ModificaSportivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CODICE FISCALE DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Scrivere Nel Campo Il Codice Fiscale Da Cercare", errorMessage, jPMessage, btnCloseMessage);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       SezioneAtletaView sezioneAtletaView = new SezioneAtletaView();
       sezioneAtletaView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnAggiornaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaJBActionPerformed
       ControllerSportivo controllerSportivo = new ControllerSportivo();
        String codiceFiscalePreso = inputCodiceFiscaleJTF.getText();
        java.sql.Date dataNascitaSql = null;
        if(controlloConvalidazione.controlloCercaAtleta(codiceFiscalePreso) == true) {
            if(datiAtleta.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                //JOptionPane.showMessageDialog(this, "ATLETA "+codiceFiscalePreso+" NON ESISTE\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                messageError.showMessage(false, true, "warning", "Atleta Con Codice Fiscale "+codiceFiscalePreso+" Non Esiste Non Possibile Modificarlo", errorMessage, jPMessage, btnCloseMessage);
            }
            else {
                String nome = inputNomeJTF.getText();
                String cognome = inputCognomeJTF.getText();
                String sesso = inputSessoJTF.getText();
                String nazionalita = inputNazioneJTF.getText();
                String indirizzo = inputIndirizzoJTF.getText();
                
                try {
                    dataNascitaSql = new java.sql.Date(inputDataNascitaJDC.getDate().getTime());
                } catch(NullPointerException nex) {
                    Toolkit.getDefaultToolkit().beep();
                    //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERISCI UNA DATA VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    messageError.showMessage(false, true, "warning", "Inserisci Una Data Valida", errorMessage, jPMessage, btnCloseMessage);
                }
                
                String telefono = inputTelefonoJTF.getText();
                String codiceFiscale = inputCodiceFiscaleModificatoJTF.getText();
                String ruolo = inputRuoloJTF.getText();
                String pesoStr = inputPesoJTF.getText();
                float peso = Float.parseFloat(pesoStr);
                String idProcuratore = inputProcuratoreAssociatoJTF.getText();
                String iban = inputIbanJTF.getText();
                
                int idClub;
                if(inputIdClubJTF1.getText().equals(""))
                    idClub = 0;
                else
                    idClub = Integer.parseInt(inputIdClubJTF1.getText());

                if(controlloConvalidazione.controlloModificaAtleta(nome, cognome, nazionalita, indirizzo, dataNascitaSql, codiceFiscale, sesso, telefono, ruolo, pesoStr, idProcuratore, iban) == true) {
                    try {
                        controllerSportivo.aggiornaSportivo(codiceFiscalePreso, nome, cognome, sesso, nazionalita, indirizzo, dataNascitaSql, telefono, codiceFiscale, ruolo, peso, idProcuratore, iban, idClub);
                        //JOptionPane.showMessageDialog(this, "✓ MODIFICA DELL'ATLETA "+codiceFiscalePreso+" EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                        messageError.showMessage(false, true, "success", "Modifica Dell'Atleta Con Codice Fiscale "+codiceFiscalePreso+" Effettuata Con Successo", errorMessage, jPMessage, btnCloseMessage);
                    } catch (ExceptionDao ex) {
                        //Logger.getLogger(ModificaSportivo.class.getName()).log(Level.SEVERE, null, ex);
                        messageError.showMessage(false, true, "warning", "Club Con ID "+inputIdClubJTF1.getText()+" Non Presente Nel Sistema", errorMessage, jPMessage, btnCloseMessage);
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
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE IL CODICE FISCALE PER TROVARE IL PROCURATORE DA MODIFICARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Inserire Il Codice Fiscale Per Trovare L'Atleta Da Modificare", errorMessage, jPMessage, btnCloseMessage);
        }
    }//GEN-LAST:event_btnAggiornaJBActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void inputIdClubJTF1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdClubJTF1FocusGained
        inputIdClubJTF1.setDocument(new PermessoPerScrivere());
    }//GEN-LAST:event_inputIdClubJTF1FocusGained

    private void inputIdClubJTF1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdClubJTF1FocusLost
        inputIdClubJTF1.setDocument(new PermessoPerNonScrivere());
    }//GEN-LAST:event_inputIdClubJTF1FocusLost

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
                new ModificaSportivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaJB;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputCodiceFiscaleJTF;
    private javax.swing.JTextField inputCodiceFiscaleModificatoJTF;
    private javax.swing.JTextField inputCognomeJTF;
    private com.toedter.calendar.JDateChooser inputDataNascitaJDC;
    private javax.swing.JTextField inputIbanJTF;
    private javax.swing.JTextField inputIdClubJTF1;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNazioneJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JTextField inputPesoJTF;
    private javax.swing.JTextField inputProcuratoreAssociatoJTF;
    private javax.swing.JTextField inputRuoloJTF;
    private javax.swing.JTextField inputSessoJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
