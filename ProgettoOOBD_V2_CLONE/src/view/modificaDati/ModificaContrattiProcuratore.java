
package view.modificaDati;

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
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Contratto;
import view.SezioneGestioneContrattiView;


public class ModificaContrattiProcuratore extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();  
    
    /*DATI IMPORTANTI*/
    private String idProcuratore;
    private int idContratto;
    private String flag;
    private ArrayList<Contratto> datiContratto = new ArrayList<Contratto>();
    
    /*COSTRUTTORI*/
    public ModificaContrattiProcuratore(String idProcuratore, int idContratto, String flag) {
        this.flag = flag;
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        this.idContratto = idContratto;
        jPMessage.setVisible(false);
        if(this.getFlag().equals("CLUB")) {
            InputIdJTF.setText(String.valueOf(this.getIdContratto()));
            InputIdJTF.setEditable(false);
            IdJL.setText("ID Club");
        }
        else if(this.getFlag().equals("SPONSOR")) {
            InputIdJTF.setText(String.valueOf(this.getIdContratto()));
            InputIdJTF.setEditable(false);
            IdJL.setText("ID Sponsor");
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nERRORE FATALE NON E' STATO POSSIBILE RICAVARE I DATI RIPROVARE", "ERRORE FATALE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Errore Fatale Non E' Stato Possibile Leggere I Dati Riprovare", errorMessage, jPMessage, btnCloseMessage);
            try {
                java.util.concurrent.TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(ModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
        
        stampaDatiContratto(this.getIdContratto());
        
        this.setVisible(true);
    }
    
    public ModificaContrattiProcuratore() {
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DataInizioJDC = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        btnLogoutJB1 = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        InputIdJTF = new javax.swing.JTextField();
        inputIdContrattoJTF = new javax.swing.JTextField();
        inputValoreContrattualeJTF = new javax.swing.JTextField();
        inputIdAtletaJTF = new javax.swing.JTextField();
        inputDataFineJDC = new com.toedter.calendar.JDateChooser();
        inputDataInizioJDC = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        IdJL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnModificaJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        DataInizioJDC.setMaxSelectableDate(new java.util.Date(253370764884000L));
        DataInizioJDC.setMinSelectableDate(new java.util.Date(-62135769516000L));

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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 510, 40));

        InputIdJTF.setBackground(new java.awt.Color(9, 46, 119));
        InputIdJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        InputIdJTF.setForeground(new java.awt.Color(221, 231, 231));
        InputIdJTF.setBorder(null);
        InputIdJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputIdJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputIdJTFFocusLost(evt);
            }
        });
        InputIdJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIdJTFActionPerformed(evt);
            }
        });
        jPanel1.add(InputIdJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 510, 30));

        inputIdContrattoJTF.setEditable(false);
        inputIdContrattoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdContrattoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdContrattoJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputIdContrattoJTF.setBorder(null);
        inputIdContrattoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIdContrattoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIdContrattoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputIdContrattoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 250, 30));

        inputValoreContrattualeJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputValoreContrattualeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputValoreContrattualeJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputValoreContrattualeJTF.setBorder(null);
        inputValoreContrattualeJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputValoreContrattualeJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputValoreContrattualeJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputValoreContrattualeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 510, 30));

        inputIdAtletaJTF.setEditable(false);
        inputIdAtletaJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdAtletaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdAtletaJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputIdAtletaJTF.setBorder(null);
        jPanel1.add(inputIdAtletaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 250, 30));

        inputDataFineJDC.setMaxSelectableDate(new java.util.Date(253370764884000L));
        inputDataFineJDC.setMinSelectableDate(new java.util.Date(-62135769516000L));
        inputDataFineJDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputDataFineJDCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputDataFineJDCMouseEntered(evt);
            }
        });
        inputDataFineJDC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputDataFineJDCPropertyChange(evt);
            }
        });
        jPanel1.add(inputDataFineJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 250, 30));

        inputDataInizioJDC.setMaxSelectableDate(new java.util.Date(253370764884000L));
        inputDataInizioJDC.setMinSelectableDate(new java.util.Date(-62135769516000L));
        inputDataInizioJDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputDataInizioJDCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputDataInizioJDCMouseEntered(evt);
            }
        });
        inputDataInizioJDC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputDataInizioJDCPropertyChange(evt);
            }
        });
        jPanel1.add(inputDataInizioJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 250, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Fine");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 80, 30));

        IdJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        IdJL.setForeground(new java.awt.Color(255, 255, 255));
        IdJL.setText("ID Sponsor");
        jPanel1.add(IdJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 80, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Contratto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 100, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data Inizio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 80, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Valore Contrattuale");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 140, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Atleta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 60, 30));

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
        jPanel1.add(btnModificaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 90, 30));

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
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 80, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void inputDataFineJDCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputDataFineJDCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataFineJDCMouseClicked

    private void inputDataFineJDCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputDataFineJDCMouseEntered

    }//GEN-LAST:event_inputDataFineJDCMouseEntered

    private void inputDataFineJDCPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputDataFineJDCPropertyChange
       
    }//GEN-LAST:event_inputDataFineJDCPropertyChange

    private void inputDataInizioJDCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputDataInizioJDCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataInizioJDCMouseClicked

    private void inputDataInizioJDCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputDataInizioJDCMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataInizioJDCMouseEntered

    private void inputDataInizioJDCPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputDataInizioJDCPropertyChange
        Date dataInizio = new Date();
        if(this.getFlag().equals("CLUB")) {
            if(this.inputDataInizioJDC.getDate() == null) {
                // Il form è stato appena creato e nessuna data è stata inserita
                dataInizio = Calendar.getInstance().getTime();
                inputDataInizioJDC.setDate(dataInizio);
            }
            dataInizio = inputDataInizioJDC.getDate();
            int nextYear = (inputDataInizioJDC.getDate().getYear()) + 1;
            inputDataInizioJDC.getDate().setYear(nextYear);
            dataInizio.setYear(nextYear);
            inputDataFineJDC.setMinSelectableDate(dataInizio);
        }
        else if(this.getFlag().equals("SPONSOR")) {
            if(this.inputDataInizioJDC.getDate() == null) {
                // Il form è stato appena creato e nessuna data è stata inserita
                dataInizio = Calendar.getInstance().getTime();
                inputDataInizioJDC.setDate(dataInizio);
            }
            inputDataFineJDC.setMinSelectableDate(dataInizio);
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nERRORE FATALE NON E' STATO POSSIBILE RICAVARE I DATI RIPROVARE", "ERRORE FATALE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Errore Fatale Non E' Stato Possibile Leggere I Dati Riprovare", errorMessage, jPMessage, btnCloseMessage);
            try {
                java.util.concurrent.TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(ModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_inputDataInizioJDCPropertyChange

    private void btnModificaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaJBActionPerformed
         int idSponsor, idClub;
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String idAtleta = inputIdAtletaJTF.getText();
        java.sql.Date dataInizio = null;
        java.sql.Date dataFine = null;        
        float valoreContrattuale = 0;
        int numeroContratto = 0;
        
        if(this.getFlag().equals("CLUB"))//inputIdSponsorJTF.getText().equals("")
            idSponsor = 0;
        else
            idSponsor = Integer.parseInt(InputIdJTF.getText());
        
        if(this.getFlag().equals("SPONSOR"))//inputIdClubJTF.getText().equals("")
            idClub = 0;
        else
            idClub = Integer.parseInt(InputIdJTF.getText());
      
        if(controlloConvalidazione.controllaId(String.valueOf(this.getIdContratto())) == true) {
            if(datiContratto.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                //JOptionPane.showMessageDialog(this, "CONTRATTO NUMERO "+this.getIdContratto()+" NON ESISTE\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                messageError.showMessage(false, true, "warning", "Contratto Numero "+this.getIdContratto()+" Non Esiste Non Possibile Modificarlo", errorMessage, jPMessage, btnCloseMessage);
            }
            else{
                try {
                    dataInizio = new java.sql.Date(inputDataInizioJDC.getDate().getTime());
                    dataFine = new java.sql.Date(inputDataFineJDC.getDate().getTime());
                    valoreContrattuale = Float.parseFloat(inputValoreContrattualeJTF.getText());
                    numeroContratto = Integer.parseInt(inputIdContrattoJTF.getText());
                }catch(NullPointerException npe) {
                    Toolkit.getDefaultToolkit().beep();
                    //JOptionPane.showMessageDialog(this, "INSERIRE UNA DATA VALIDA", "WARNING", JOptionPane.WARNING_MESSAGE);
                    messageError.showMessage(false, true, "warning", "Inserire Una Data Valida", errorMessage, jPMessage, btnCloseMessage);
                }catch(NumberFormatException nfe) {
                    Toolkit.getDefaultToolkit().beep();
                    //JOptionPane.showMessageDialog(this, "Inserire Un Numero Valido", "WARNING", JOptionPane.WARNING_MESSAGE);
                    messageError.showMessage(false, true, "warning", "Inserire Un Numero Valido", errorMessage, jPMessage, btnCloseMessage);
                }

                if(controlloConvalidazione.controllaModificaContratto(String.valueOf(idClub), String.valueOf(idSponsor), dataInizio, dataFine, String.valueOf(valoreContrattuale)) == true) {
                    try {
                        boolean check = controllerProcuratore.modificaContratto(numeroContratto, idAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale);
                        if(check == true) {
                            //JOptionPane.showMessageDialog(this, "✓ MODIFICA DEL CONTRATTO CON ID "+this.getIdContratto()+" EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                            messageError.showMessage(false, true, "success", "Modifica Del Contratto Con Id "+this.getIdContratto()+" Effettuata Con Successo", errorMessage, jPMessage, btnCloseMessage);
                        }
                        else {
                            Toolkit.getDefaultToolkit().beep();
                            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
                            messageError.showMessage(false, true, "warning", "Uno O Piu' Campi Mancanti", errorMessage, jPMessage, btnCloseMessage);
                        }
                    } catch (ExceptionDao ex) {
                        Logger.getLogger(ModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
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
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nERRORE FATALE NON E' STATO POSSIBILE RICAVARE I DATI RIPROVARE", "ERRORE FATALE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Errore Fatale Non E' Stato Possibile Leggere I Dati Riprovare", errorMessage, jPMessage, btnCloseMessage);
            SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
            sezioneGestioneContrattiView.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnModificaJBActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void InputIdJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputIdJTFFocusGained
        //InputIdJTF.setDocument(new PermessoPerScrivere());
    }//GEN-LAST:event_InputIdJTFFocusGained

    private void InputIdJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputIdJTFFocusLost
        //InputIdJTF.setDocument(new PermessoPerNonScrivere());
    }//GEN-LAST:event_InputIdJTFFocusLost

    private void inputValoreContrattualeJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputValoreContrattualeJTFFocusGained
        inputValoreContrattualeJTF.setDocument(new PermessoPerScrivere());
    }//GEN-LAST:event_inputValoreContrattualeJTFFocusGained

    private void inputValoreContrattualeJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputValoreContrattualeJTFFocusLost
        inputValoreContrattualeJTF.setDocument(new PermessoPerNonScrivere());
    }//GEN-LAST:event_inputValoreContrattualeJTFFocusLost

    private void inputIdContrattoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdContrattoJTFFocusGained
        //inputIdContrattoJTF.setDocument(new PermessoPerScrivere());
    }//GEN-LAST:event_inputIdContrattoJTFFocusGained

    private void inputIdContrattoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdContrattoJTFFocusLost
        //inputIdContrattoJTF.setDocument(new PermessoPerNonScrivere());
    }//GEN-LAST:event_inputIdContrattoJTFFocusLost

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void InputIdJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIdJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputIdJTFActionPerformed

    /*METODI*/
    private void stampaDatiContratto(int idContratto) {
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        if(controlloConvalidazione.controllaId(String.valueOf(this.getIdContratto())) == true) {
            try {
                datiContratto = controllerProcuratore.prendiDatiContratto(idContratto);
                if(datiContratto.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    //JOptionPane.showMessageDialog(this, "CONTRATTO CON "+this.getIdContratto()+" NON ESISTE\nNON POSSIBILE MODIFICARLO\n\t\t\tRIPROVARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    messageError.showMessage(false, true, "warning", "Contratto Con Id "+this.getIdContratto()+" Non Esiste Non Possibile Modificarlo Riprovare", errorMessage, jPMessage, btnCloseMessage);
                    SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
                    sezioneGestioneContrattiView.setVisible(true);
                    this.setVisible(false);
                }
                else {
                    datiContratto.forEach((Contratto contratto) -> {
                        if(this.getFlag().equals("SPONSOR"))
                            InputIdJTF.setText(String.valueOf(contratto.getIdSponsor()));
                        else if(this.getFlag().equals("CLUB"))
                            InputIdJTF.setText(String.valueOf(String.valueOf(contratto.getIdClub())));
                        inputDataInizioJDC.setDate(contratto.getDataStart());
                        inputDataFineJDC.setDate(contratto.getDataEnd());
                        inputValoreContrattualeJTF.setText(String.valueOf(contratto.getValoreContratto()));
                        inputIdAtletaJTF.setText(contratto.getIdAtleta());
                        inputIdContrattoJTF.setText(String.valueOf(contratto.getNumeroContratto()));
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(ModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nERRORE FATALE NON E' STATO POSSIBILE RICAVARE I DATI RIPROVARE", "ERRORE FATALE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Errore Fatale Non E' Stato Possibile Leggere I Dati Riprovare", errorMessage, jPMessage, btnCloseMessage);
            SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
            sezioneGestioneContrattiView.setVisible(true);
            this.setVisible(false);
        }
    }
    
    
     /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }
   
    public int getIdContratto() {
        return idContratto;
    }

    public void setIdContratto(int idContratto) {
        this.idContratto = idContratto;
    }
      
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }


    /*MAIN*/
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaContrattiProcuratore().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataInizioJDC;
    private javax.swing.JLabel IdJL;
    private javax.swing.JTextField InputIdJTF;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnModificaJB;
    private javax.swing.JLabel errorMessage;
    private com.toedter.calendar.JDateChooser inputDataFineJDC;
    private com.toedter.calendar.JDateChooser inputDataInizioJDC;
    private javax.swing.JTextField inputIdAtletaJTF;
    private javax.swing.JTextField inputIdContrattoJTF;
    private javax.swing.JTextField inputValoreContrattualeJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
