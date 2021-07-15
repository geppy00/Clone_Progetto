
package view.registrare;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import convalidazione.PermessoPerScrivere;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.SezioneEventiView;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;

public class RegistraEventoSponsor extends javax.swing.JFrame {

    /*DATI IMPORTANTI*/
    private String idSponsor;
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*COSTRUTTORI*/
    public RegistraEventoSponsor(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        jPMessage.setVisible(false);
    }
    
    public RegistraEventoSponsor() {}
    
    /*METODI*/
    private java.sql.Time stringToTime(String oraStr) {
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        
        try {
            java.sql.Time timeValue = new java.sql.Time(formatter.parse(oraStr).getTime());
            return timeValue;
        } catch(NullPointerException nex) {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN ORARIO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            this.messaggioErrore(false, true, "warning", "Inserisca Un Orario Valido");
        } catch (ParseException ex) {
            Logger.getLogger(RegistraEventoSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputTitoloJTF = new javax.swing.JTextField();
        scegliDataFineJDC = new com.toedter.calendar.JDateChooser();
        scegliDataInizioJDC = new com.toedter.calendar.JDateChooser();
        inputLuogoEventoJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescrizioneJTA = new javax.swing.JTextArea();
        inputGettoneEventoJTF = new javax.swing.JTextField();
        btnCreaEventoJB = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();
        btnAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputTitoloJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputTitoloJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputTitoloJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputTitoloJTF.setText("Titolo Dell'Evento");
        inputTitoloJTF.setBorder(null);
        inputTitoloJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTitoloJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTitoloJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputTitoloJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 310, 30));

        scegliDataFineJDC.setDateFormatString("yyyy-MM-dd HH:mm:ss");
        jPanel1.add(scegliDataFineJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 310, 30));

        scegliDataInizioJDC.setDateFormatString("yyyy-MM-dd HH:mm:ss");
        scegliDataInizioJDC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                scegliDataInizioJDCPropertyChange(evt);
            }
        });
        jPanel1.add(scegliDataInizioJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 310, 30));

        inputLuogoEventoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputLuogoEventoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputLuogoEventoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputLuogoEventoJTF.setText("Luogo Evento");
        inputLuogoEventoJTF.setBorder(null);
        inputLuogoEventoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputLuogoEventoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputLuogoEventoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputLuogoEventoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 310, 30));

        inputDescrizioneJTA.setBackground(new java.awt.Color(9, 46, 119));
        inputDescrizioneJTA.setColumns(20);
        inputDescrizioneJTA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputDescrizioneJTA.setForeground(new java.awt.Color(231, 231, 231));
        inputDescrizioneJTA.setRows(5);
        inputDescrizioneJTA.setText("Descrizione");
        inputDescrizioneJTA.setToolTipText("");
        inputDescrizioneJTA.setBorder(null);
        inputDescrizioneJTA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputDescrizioneJTAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputDescrizioneJTAFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(inputDescrizioneJTA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 630, 170));

        inputGettoneEventoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputGettoneEventoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputGettoneEventoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputGettoneEventoJTF.setText("Gettone");
        inputGettoneEventoJTF.setBorder(null);
        inputGettoneEventoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputGettoneEventoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputGettoneEventoJTFFocusLost(evt);
            }
        });
        inputGettoneEventoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGettoneEventoJTFActionPerformed(evt);
            }
        });
        jPanel1.add(inputGettoneEventoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 630, 30));

        btnCreaEventoJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCreaEventoJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCreaEventoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCreaEventoJB.setText("Crea");
        btnCreaEventoJB.setBorder(null);
        btnCreaEventoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreaEventoJB.setFocusPainted(false);
        btnCreaEventoJB.setFocusable(false);
        btnCreaEventoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaEventoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreaEventoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 80, 30));

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
                .addComponent(jLabel1)
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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 630, 40));

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, 40));

        btnAnnulla.setBackground(new java.awt.Color(231, 76, 60));
        btnAnnulla.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAnnulla.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnulla.setText("Annulla");
        btnAnnulla.setBorder(null);
        btnAnnulla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnulla.setFocusPainted(false);
        btnAnnulla.setFocusable(false);
        btnAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnulla, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnCreaEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaEventoJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        String descrizione = inputDescrizioneJTA.getText();
        String titolo = inputTitoloJTF.getText();
        String luogo = inputLuogoEventoJTF.getText();
        java.sql.Date dataInizio = null;
        java.sql.Date dataFine = null;
        SimpleDateFormat localDateFormat = null;
        String oraInizio = null;
        String oraFine = null;
        double gettoneValue = 0;
                
        try {
            dataInizio = new java.sql.Date(scegliDataInizioJDC.getDate().getTime());
            dataFine = new java.sql.Date(scegliDataFineJDC.getDate().getTime());
            localDateFormat = new SimpleDateFormat("HH:mm:ss"); //RIGA 171 E 172 SERVONO PER RICAVRE L'ORARIO
            oraInizio = localDateFormat.format(dataInizio);
            oraFine = localDateFormat.format(dataFine);
        }catch(NullPointerException nex) {
            Toolkit.getDefaultToolkit().beep();
            this.messaggioErrore(false, true, "warning", "Inserisca Una Data con Orario Valido");
        }
        java.sql.Time oraInizioTime = stringToTime(oraInizio);
        java.sql.Time oraFineTime = stringToTime(oraFine);

        try {
            gettoneValue = Double.parseDouble(inputGettoneEventoJTF.getText());
        }catch(NumberFormatException nfe) {
            Toolkit.getDefaultToolkit().beep();
            this.messaggioErrore(false, true, "warning", "Inserisca Un Numero Valido");
        }

        if(controlloConvalidazione.controlloRegistraEvento(String.valueOf(dataInizio), String.valueOf(dataFine), luogo, titolo, String.valueOf(gettoneValue)) == true) {
            if(controlloConvalidazione.controlloDescrizioneEvento(descrizione) == true) {
                try {
                    this.jPMessage.setVisible(false);
                    controllerSponsor.registraEvento(gettoneValue, titolo, luogo, dataInizio, oraInizioTime, dataFine, oraFineTime, Integer.parseInt(this.getIdSponsor()), descrizione);
                } catch (ExceptionDao ex) {
                    Logger.getLogger(RegistraEventoSponsor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                Toolkit.getDefaultToolkit().beep();
                this.messaggioErrore(false, true, "warning", "Inserisca Al Massimo 280 Caratteri");
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            this.messaggioErrore(false, true, "warning", "Uno O Più Campi Obbliggatori Sono Vuoti");
        }
    }//GEN-LAST:event_btnCreaEventoJBActionPerformed

    private void scegliDataInizioJDCPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_scegliDataInizioJDCPropertyChange
        Date dataInizio = new Date();
        dataInizio = scegliDataInizioJDC.getDate();
        if (dataInizio == null) {  
            // Il form è stato appena creato e nessuna data è stata inserita
            dataInizio = Calendar.getInstance().getTime();
            scegliDataInizioJDC.setDate(dataInizio);
        }
        scegliDataFineJDC.setMinSelectableDate(dataInizio);
    }//GEN-LAST:event_scegliDataInizioJDCPropertyChange

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaActionPerformed
        SezioneEventiView sezioneEventiView = new SezioneEventiView(this.getIdSponsor());
        sezioneEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaActionPerformed

    private void inputTitoloJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTitoloJTFFocusGained
        if(inputTitoloJTF.getText().equals("Titolo Dell'Evento")){
            inputTitoloJTF.setText("");
            inputTitoloJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputTitoloJTFFocusGained

    private void inputTitoloJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTitoloJTFFocusLost
        if(inputTitoloJTF.getText().equals("")){
            inputTitoloJTF.setText("Titolo Dell'Evento");
            inputTitoloJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputTitoloJTFFocusLost

    private void inputLuogoEventoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputLuogoEventoJTFFocusGained
        if(inputLuogoEventoJTF.getText().equals("Luogo Evento")){
            inputLuogoEventoJTF.setText("");
            inputLuogoEventoJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputLuogoEventoJTFFocusGained

    private void inputLuogoEventoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputLuogoEventoJTFFocusLost
       if(inputLuogoEventoJTF.getText().equals("")){
            inputLuogoEventoJTF.setText("Luogo Evento");
            inputLuogoEventoJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputLuogoEventoJTFFocusLost

    private void inputGettoneEventoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputGettoneEventoJTFFocusGained
        if(inputGettoneEventoJTF.getText().equals("Gettone")){
            inputGettoneEventoJTF.setText("");
            inputGettoneEventoJTF.setForeground(new Color(255,255,255));
           //inputGettoneEventoJTF.setDocument(new PermessoPerScrivere());
            
        }
        
    }//GEN-LAST:event_inputGettoneEventoJTFFocusGained

    private void inputGettoneEventoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputGettoneEventoJTFFocusLost
      if(inputGettoneEventoJTF.getText().equals("")){
            inputGettoneEventoJTF.setText("Gettone");
            inputGettoneEventoJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputGettoneEventoJTFFocusLost

    private void inputDescrizioneJTAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputDescrizioneJTAFocusGained
        if(inputDescrizioneJTA.getText().equals("Descrizione")){
            inputDescrizioneJTA.setText("");
            inputDescrizioneJTA.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputDescrizioneJTAFocusGained

    private void inputDescrizioneJTAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputDescrizioneJTAFocusLost
         if(inputDescrizioneJTA.getText().equals("")){
            inputDescrizioneJTA.setText("Descrizione");
            inputDescrizioneJTA.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputDescrizioneJTAFocusLost

    private void inputGettoneEventoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGettoneEventoJTFActionPerformed
        
    }//GEN-LAST:event_inputGettoneEventoJTFActionPerformed

    public void messaggioErrore(boolean valueFalse,boolean valueTrue, String controll, String messaggio){
        
                    if(controll.equals("success")){
                        jPMessage.setVisible(valueFalse);
                        errorMessage.setText(messaggio);
                        jPMessage.setBackground(new Color(46,204,113));
                        btnCloseMessage.setBackground(new Color(46,204,113));
                        jPMessage.setVisible(valueTrue);
                    }else if(controll.equals("warning")){
                        jPMessage.setVisible(valueFalse);
                        errorMessage.setText(messaggio);
                        jPMessage.setBackground(new Color(231,76,60));
                        btnCloseMessage.setBackground(new Color(231,76,60));
                        jPMessage.setVisible(valueTrue);
                    }
                    
    }
    
    /*GET AND SET*/
    public String getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(String idSponsor) {
        this.idSponsor = idSponsor;
    }

    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraEventoSponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulla;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnCreaEventoJB;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextArea inputDescrizioneJTA;
    private javax.swing.JTextField inputGettoneEventoJTF;
    private javax.swing.JTextField inputLuogoEventoJTF;
    private javax.swing.JTextField inputTitoloJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser scegliDataFineJDC;
    private com.toedter.calendar.JDateChooser scegliDataInizioJDC;
    // End of variables declaration//GEN-END:variables
}
