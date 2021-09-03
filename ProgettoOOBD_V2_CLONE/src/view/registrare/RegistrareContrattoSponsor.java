
package view.registrare;

import controller.ControllerProcuratore;
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
import view.SezioneGestioneContrattiView;


public class RegistrareContrattoSponsor extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();
    
    /*DATI IMPORTANTI*/
    private String idProcuratore;
    private ArrayList<Atleta> datiAtleta = new ArrayList<Atleta>();
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
    
    /*COSTRUTTORE*/
    public RegistrareContrattoSponsor(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        jPMessage.setVisible(false);
        
        this.setVisible(true);
    }
    
    public RegistrareContrattoSponsor() {
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        inputIdSponsorJTF = new javax.swing.JTextField();
        nomeSponsorJTF = new javax.swing.JTextField();
        inputDataFineJDC = new com.toedter.calendar.JDateChooser();
        inputDataInizioJDC = new com.toedter.calendar.JDateChooser();
        inputValoreContrttoJTF = new javax.swing.JTextField();
        ruoloJTF = new javax.swing.JTextField();
        cognomeJTF = new javax.swing.JTextField();
        inputCfAtletaJTF = new javax.swing.JTextField();
        nomeJTF = new javax.swing.JTextField();
        dataNascitaJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputIdSponsorJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdSponsorJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdSponsorJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIdSponsorJTF.setText("ID Sponsor");
        inputIdSponsorJTF.setBorder(null);
        inputIdSponsorJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIdSponsorJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIdSponsorJTFFocusLost(evt);
            }
        });
        inputIdSponsorJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdSponsorJTFActionPerformed(evt);
            }
        });
        jPanel1.add(inputIdSponsorJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 250, 30));

        nomeSponsorJTF.setEditable(false);
        nomeSponsorJTF.setBackground(new java.awt.Color(9, 46, 119));
        nomeSponsorJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nomeSponsorJTF.setForeground(new java.awt.Color(231, 231, 231));
        nomeSponsorJTF.setText("Nome Sponsor");
        nomeSponsorJTF.setToolTipText("");
        nomeSponsorJTF.setBorder(null);
        nomeSponsorJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeSponsorJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeSponsorJTFFocusLost(evt);
            }
        });
        jPanel1.add(nomeSponsorJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 230, 30));
        jPanel1.add(inputDataFineJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 230, 30));
        jPanel1.add(inputDataInizioJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 250, 30));

        inputValoreContrttoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputValoreContrttoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputValoreContrttoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputValoreContrttoJTF.setText("Valore Contrattuale");
        inputValoreContrttoJTF.setBorder(null);
        inputValoreContrttoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputValoreContrttoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputValoreContrttoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputValoreContrttoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 490, 30));

        ruoloJTF.setEditable(false);
        ruoloJTF.setBackground(new java.awt.Color(9, 46, 119));
        ruoloJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ruoloJTF.setForeground(new java.awt.Color(231, 231, 231));
        ruoloJTF.setText("Ruolo");
        ruoloJTF.setBorder(null);
        jPanel1.add(ruoloJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 230, 30));

        cognomeJTF.setEditable(false);
        cognomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        cognomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cognomeJTF.setForeground(new java.awt.Color(231, 231, 231));
        cognomeJTF.setText("Cognome");
        cognomeJTF.setBorder(null);
        jPanel1.add(cognomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 230, 30));

        inputCfAtletaJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputCfAtletaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputCfAtletaJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputCfAtletaJTF.setText("Codice Fiscale Dell'Atleta");
        inputCfAtletaJTF.setBorder(null);
        inputCfAtletaJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCfAtletaJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCfAtletaJTFFocusLost(evt);
            }
        });
        inputCfAtletaJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCfAtletaJTFActionPerformed(evt);
            }
        });
        jPanel1.add(inputCfAtletaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 410, 30));

        nomeJTF.setEditable(false);
        nomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        nomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nomeJTF.setForeground(new java.awt.Color(231, 231, 231));
        nomeJTF.setText("Nome");
        nomeJTF.setToolTipText("");
        nomeJTF.setBorder(null);
        jPanel1.add(nomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 30));

        dataNascitaJTF.setEditable(false);
        dataNascitaJTF.setBackground(new java.awt.Color(9, 46, 119));
        dataNascitaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dataNascitaJTF.setForeground(new java.awt.Color(231, 231, 231));
        dataNascitaJTF.setText("Data Nascita");
        dataNascitaJTF.setBorder(null);
        jPanel1.add(dataNascitaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, 30));

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
        jPanel1.add(btnCercaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 80, 30));

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
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 80, 30));

        jButton1.setBackground(new java.awt.Color(46, 204, 113));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registra");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 80, 30));

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
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 490, 40));

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
       sezioneGestioneContrattiView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String idAtleta = inputCfAtletaJTF.getText();
        
        if(controlloConvalidazione.controlloAtleta(idAtleta) == true) {
            try {
                datiAtleta = controllerProcuratore.cercaSportivo(idAtleta);
                if(datiAtleta.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    //JOptionPane.showMessageDialog(this, "ATLETA "+idAtleta+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    messageError.showMessage(false, true, "warning","Atleta "+idAtleta+" Non Trovato" , errorMessage, jPMessage, btnCloseMessage);
                }
                else {
                    //JOptionPane.showMessageDialog(this, "✓ ATLETA "+idAtleta+" TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    messageError.showMessage(false, true, "success", "Atleta "+idAtleta+" Trovato", errorMessage , jPMessage, btnCloseMessage);
                    datiAtleta.forEach((Atleta atleta) -> {
                        nomeJTF.setText(atleta.getNome());
                        cognomeJTF.setText(atleta.getCognmome());
                        dataNascitaJTF.setText(dateFormat.format(atleta.getDataNascita()));
                        ruoloJTF.setText(atleta.getRuolo());
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraContrattoClub.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CODICE FISCALE DELL'ATLETA DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Scrivere Nel Campo Il Codice Fiscale Da Cercare" , errorMessage, jPMessage, btnCloseMessage);
        }
        
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void inputIdSponsorJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdSponsorJTFActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        int idSponsor = Integer.parseInt(inputIdSponsorJTF.getText());
        
        if(controlloConvalidazione.controllaId(String.valueOf(idSponsor)) == true) {
            try {
                messageError.closeFiestraMessage(jPMessage);
                String nomeSponsor = controllerProcuratore.cercaSponsor(idSponsor);
                if(controlloConvalidazione.controllaNome(nomeSponsor) == true)
                    nomeSponsorJTF.setText(nomeSponsor);
                else {
                    Toolkit.getDefaultToolkit().beep();
                    nomeSponsorJTF.setText(" ");
                    //JOptionPane.showMessageDialog(this, "SPONSOR CON ID "+idSponsor+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    messageError.showMessage(false, true, "warning","Sponsor Con Id "+idSponsor+" Non Trovato" , errorMessage, jPMessage, btnCloseMessage);
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistrareContrattoSponsor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE L'ID DELLO SPONSOR DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Scrivere L'Id Dello Sponsor Da Cercare" , errorMessage, jPMessage, btnCloseMessage);
        }
    }//GEN-LAST:event_inputIdSponsorJTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String idAtleta = inputCfAtletaJTF.getText();
        int idSponsor = 0;
        java.sql.Date dataInizio = null;
        java.sql.Date dataFine = null;
        float valContratto = 0;        
        
        try {
            dataInizio = new java.sql.Date(inputDataInizioJDC.getDate().getTime());
            dataFine = new java.sql.Date(inputDataFineJDC.getDate().getTime());
            idSponsor = Integer.parseInt(inputIdSponsorJTF.getText());
            valContratto = Float.parseFloat(inputValoreContrttoJTF.getText());
        }catch(NullPointerException npe) {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "INSERIRE UNA DATA VALIDA", "WARNING", JOptionPane.WARNING_MESSAGE);
            messageError.showMessage(false, true, "warning","Inserisci Una Data Valida" , errorMessage, jPMessage, btnCloseMessage);
        }catch(NumberFormatException nfe) {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "INSERIRE UN NUMERO VALIDO", "WARNING", JOptionPane.WARNING_MESSAGE);
            messageError.showMessage(false, true, "warning","Inserire Un Numero Valido" , errorMessage, jPMessage, btnCloseMessage);
        }
        
        if(controlloConvalidazione.controllaStipulaContratto(idAtleta, String.valueOf(idSponsor), dataInizio, dataFine, String.valueOf(valContratto)) == true) {
            if(datiAtleta.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                //JOptionPane.showMessageDialog(this, "ATLETA CON CODICE FISCALE "+idAtleta+" NON ESISTE\n\t\tNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                messageError.showMessage(false, true, "warning","Atleta Con Codice Fiscale "+idAtleta+" Non Esiste Non Possibile Modificarlo" , errorMessage, jPMessage, btnCloseMessage);
            }
            else {
                try {
                    //JOptionPane.showMessageDialog(this, "✓ REGISTRAZIONE DEL CONTRATTO EFFETTUATA CON SUCCESSO", "REGISTRAZIONE", JOptionPane.INFORMATION_MESSAGE);
                    messageError.showMessage(false, true, "success", "Registrazione Effettuta Con Successo", errorMessage , jPMessage, btnCloseMessage);
                    controllerProcuratore.registraContratto(idAtleta, idSponsor, dataInizio, dataFine, valContratto, "SPONSOR");
                } catch (ExceptionDao ex) {
                    Logger.getLogger(RegistraContrattoClub.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Uno O Piu' Campi Mancanti" , errorMessage, jPMessage, btnCloseMessage);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void inputCfAtletaJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCfAtletaJTFFocusGained
       if(inputCfAtletaJTF.getText().equals("Codice Fiscale Dell'Atleta")){
            inputCfAtletaJTF.setText("");
            inputCfAtletaJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputCfAtletaJTFFocusGained

    private void inputCfAtletaJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCfAtletaJTFFocusLost
        if(inputCfAtletaJTF.getText().equals("")){
            inputCfAtletaJTF.setText("Codice Fiscale Dell'Atleta");
            inputCfAtletaJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputCfAtletaJTFFocusLost

    private void inputIdSponsorJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdSponsorJTFFocusGained
        if(inputIdSponsorJTF.getText().equals("ID Sponsor")){
            inputIdSponsorJTF.setText("");
            inputIdSponsorJTF.setForeground(new Color(255,255,255));
            inputIdSponsorJTF.setDocument(new PermessoPerScrivere());
        }
    }//GEN-LAST:event_inputIdSponsorJTFFocusGained

    private void inputIdSponsorJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdSponsorJTFFocusLost
        if(inputIdSponsorJTF.getText().equals("")){
            inputIdSponsorJTF.setDocument(new PermessoPerNonScrivere());
            inputIdSponsorJTF.setText("ID Sponsor");
            inputIdSponsorJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputIdSponsorJTFFocusLost

    private void nomeSponsorJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeSponsorJTFFocusGained
       if(nomeSponsorJTF.getText().equals("Nome Sponsor")){
            nomeSponsorJTF.setText("");
            nomeSponsorJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_nomeSponsorJTFFocusGained

    private void nomeSponsorJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeSponsorJTFFocusLost
       if(nomeSponsorJTF.getText().equals("")){
            nomeSponsorJTF.setText("Nome Sponsor");
            nomeSponsorJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_nomeSponsorJTFFocusLost

    private void inputValoreContrttoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputValoreContrttoJTFFocusGained
         if(inputValoreContrttoJTF.getText().equals("Valore Contrattuale")) {
            inputValoreContrttoJTF.setText("");
            inputValoreContrttoJTF.setForeground(new Color(255,255,255));
            inputValoreContrttoJTF.setDocument(new PermessoPerScrivere());
        }
    }//GEN-LAST:event_inputValoreContrttoJTFFocusGained

    private void inputValoreContrttoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputValoreContrttoJTFFocusLost
       if(inputValoreContrttoJTF.getText().equals("")) {
           inputValoreContrttoJTF.setDocument(new PermessoPerNonScrivere());
            inputValoreContrttoJTF.setText("Valore Contrattuale");
            inputValoreContrttoJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputValoreContrttoJTFFocusLost

    private void inputCfAtletaJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCfAtletaJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCfAtletaJTFActionPerformed

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
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrareContrattoSponsor().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JTextField cognomeJTF;
    private javax.swing.JTextField dataNascitaJTF;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputCfAtletaJTF;
    private com.toedter.calendar.JDateChooser inputDataFineJDC;
    private com.toedter.calendar.JDateChooser inputDataInizioJDC;
    private javax.swing.JTextField inputIdSponsorJTF;
    private javax.swing.JTextField inputValoreContrttoJTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeJTF;
    private javax.swing.JTextField nomeSponsorJTF;
    private javax.swing.JTextField ruoloJTF;
    // End of variables declaration//GEN-END:variables
}
