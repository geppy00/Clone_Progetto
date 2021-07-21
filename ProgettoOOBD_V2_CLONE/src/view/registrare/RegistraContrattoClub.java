
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
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Atleta;
import view.SezioneGestioneContrattiView;


public class RegistraContrattoClub extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();
    
    /*DATI IMPORTANTI*/
    private String idProcuratore;
    private ArrayList<Atleta> datiAtleta = new ArrayList<Atleta>();
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
    
    /*COSTRUTTORI*/
    public RegistraContrattoClub(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        jPMessage.setVisible(false);
        
        
    }
    
    public RegistraContrattoClub() {}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cognomeJTF = new javax.swing.JTextField();
        nomeJTF = new javax.swing.JTextField();
        ruoloJTF = new javax.swing.JTextField();
        inputNomeClubJTF = new javax.swing.JTextField();
        dataNascitaJTF = new javax.swing.JTextField();
        inputIdClubJTF = new javax.swing.JTextField();
        DataInizioJDC = new com.toedter.calendar.JDateChooser();
        inputValContrattoJTF = new javax.swing.JTextField();
        DataFineJDC = new com.toedter.calendar.JDateChooser();
        btnCercaJB = new javax.swing.JButton();
        inputCfAtletaJTF = new javax.swing.JTextField();
        btnAnnullaJB = new javax.swing.JButton();
        btnStipulaContratto = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cognomeJTF.setEditable(false);
        cognomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        cognomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cognomeJTF.setForeground(new java.awt.Color(221, 231, 231));
        cognomeJTF.setText("Cognome");
        cognomeJTF.setBorder(null);
        jPanel1.add(cognomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 310, 30));

        nomeJTF.setEditable(false);
        nomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        nomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nomeJTF.setForeground(new java.awt.Color(221, 231, 231));
        nomeJTF.setText("Nome ");
        nomeJTF.setBorder(null);
        jPanel1.add(nomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 320, 30));

        ruoloJTF.setEditable(false);
        ruoloJTF.setBackground(new java.awt.Color(9, 46, 119));
        ruoloJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ruoloJTF.setForeground(new java.awt.Color(221, 231, 231));
        ruoloJTF.setText("Ruolo");
        ruoloJTF.setBorder(null);
        jPanel1.add(ruoloJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 310, 30));

        inputNomeClubJTF.setEditable(false);
        inputNomeClubJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeClubJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeClubJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputNomeClubJTF.setText("Nome Club");
        inputNomeClubJTF.setBorder(null);
        jPanel1.add(inputNomeClubJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 310, 30));

        dataNascitaJTF.setEditable(false);
        dataNascitaJTF.setBackground(new java.awt.Color(9, 46, 119));
        dataNascitaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dataNascitaJTF.setForeground(new java.awt.Color(221, 231, 231));
        dataNascitaJTF.setText("Data di Nascita");
        dataNascitaJTF.setBorder(null);
        jPanel1.add(dataNascitaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 320, 30));

        inputIdClubJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdClubJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdClubJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputIdClubJTF.setText("ID Club");
        inputIdClubJTF.setBorder(null);
        inputIdClubJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIdClubJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIdClubJTFFocusLost(evt);
            }
        });
        inputIdClubJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdClubJTFActionPerformed(evt);
            }
        });
        jPanel1.add(inputIdClubJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 320, 30));

        DataInizioJDC.setMaxSelectableDate(new java.util.Date(253370764884000L));
        DataInizioJDC.setMinSelectableDate(new java.util.Date(-62135769516000L));
        DataInizioJDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataInizioJDCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DataInizioJDCMouseEntered(evt);
            }
        });
        DataInizioJDC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DataInizioJDCPropertyChange(evt);
            }
        });
        jPanel1.add(DataInizioJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 320, 30));

        inputValContrattoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputValContrattoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputValContrattoJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputValContrattoJTF.setText("Valore Contrattuale");
        inputValContrattoJTF.setBorder(null);
        inputValContrattoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputValContrattoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputValContrattoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputValContrattoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 640, 30));

        DataFineJDC.setMaxSelectableDate(new java.util.Date(253370764884000L));
        DataFineJDC.setMinSelectableDate(new java.util.Date(-62135769516000L));
        jPanel1.add(DataFineJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 310, 30));

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
        jPanel1.add(btnCercaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 90, 30));

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
        jPanel1.add(inputCfAtletaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 550, 30));

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
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 80, 30));

        btnStipulaContratto.setBackground(new java.awt.Color(46, 204, 113));
        btnStipulaContratto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnStipulaContratto.setForeground(new java.awt.Color(255, 255, 255));
        btnStipulaContratto.setText("Stabilisce");
        btnStipulaContratto.setActionCommand("Stabilisca");
        btnStipulaContratto.setBorder(null);
        btnStipulaContratto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStipulaContratto.setFocusPainted(false);
        btnStipulaContratto.setFocusable(false);
        btnStipulaContratto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStipulaContrattoActionPerformed(evt);
            }
        });
        jPanel1.add(btnStipulaContratto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 90, 30));

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
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 640, 40));

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
       sezioneGestioneContrattiView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnStipulaContrattoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStipulaContrattoActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String idAtleta = inputCfAtletaJTF.getText();
        int idClub = 0;
        java.sql.Date dataInizio = null;
        java.sql.Date dataFine = null;
        float valContratto = 0;
        
        try {
            dataInizio = new java.sql.Date(DataInizioJDC.getDate().getTime());
            dataFine = new java.sql.Date(DataFineJDC.getDate().getTime());
            idClub = Integer.parseInt(inputIdClubJTF.getText());
            valContratto = Float.parseFloat(inputValContrattoJTF.getText());
        }catch(NullPointerException npe) {
            Toolkit.getDefaultToolkit().beep();
            messageError.showMessage(false, true, "warning","Data non Valida, inserisca una Data Valida" ,errorMessage , jPMessage, btnCloseMessage);
        }catch(NumberFormatException nfe) {
            Toolkit.getDefaultToolkit().beep();
            messageError.showMessage(false, true, "warning","Inserisce Un Numero Valido" ,errorMessage , jPMessage, btnCloseMessage);
        }
        
        if(controlloConvalidazione.controllaStipulaContratto(idAtleta, String.valueOf(idClub), dataInizio, dataFine, String.valueOf(valContratto)) == true) {
            if(datiAtleta.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                messageError.showMessage(false, true, "warning","L'Atleta Con Codice Fiscale "+idAtleta+" Non Esiste" ,errorMessage , jPMessage, btnCloseMessage);
                
            }
            else {
                try {
                    controllerProcuratore.registraContratto(idAtleta, idClub, dataInizio, dataFine, valContratto, "CLUB");
                    messageError.showMessage(false, true, "success","L'Atleta "+idAtleta+" Contratto Stabiltto con Sucesso" ,errorMessage , jPMessage, btnCloseMessage);
                } catch (ExceptionDao ex) {
                    Logger.getLogger(RegistraContrattoClub.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            messageError.showMessage(false, true, "warning","L'Atleta "+idAtleta+"Mancano Campi Obbligatori da Compilare" ,errorMessage , jPMessage, btnCloseMessage);
               
        }
    }//GEN-LAST:event_btnStipulaContrattoActionPerformed

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String idAtleta = inputCfAtletaJTF.getText();
        
        if(controlloConvalidazione.controlloAtleta(idAtleta) == true) {
            try {
                datiAtleta = controllerProcuratore.cercaSportivo(idAtleta);
                if(datiAtleta.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    messageError.showMessage(false, true, "warning","L'Atleta "+idAtleta+" Non è Stato Trovato" ,errorMessage , jPMessage, btnCloseMessage);  
                }
                else {
                    //messageError.closeFiestraMessage(jPMessage);
                    messageError.showMessage(false, true, "success", "Atleta Trovato Con Successo", errorMessage, jPMessage, btnCloseMessage);
                    datiAtleta.forEach((Atleta atleta)->{
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
             //this.messaggioErrore(false, true, "warning", "Campo Vuoto, Scrive Il Codice Fiscale Dell'Atleta");
             messageError.showMessage(false, true, "warning","Campo Vuoto, Scrive Il Codice Fiscale Dell'Atleta " ,this.errorMessage , this.jPMessage, this.btnCloseMessage);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void inputIdClubJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdClubJTFActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        int idClub = Integer.parseInt(inputIdClubJTF.getText());
        
        if(controlloConvalidazione.controllaId(String.valueOf(idClub)) == true) {
            try {
                messageError.closeFiestraMessage(jPMessage);
                String nomeClub = controllerProcuratore.cercaClub(idClub);
                if(controlloConvalidazione.controllaNome(nomeClub) == true)
                    inputNomeClubJTF.setText(nomeClub);
                else {
                    Toolkit.getDefaultToolkit().beep();
                    inputNomeClubJTF.setText("");
                     messageError.showMessage(false, true, "warning","Club con ID"+idClub+" Non è stato Trovato" ,errorMessage , jPMessage, btnCloseMessage);
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraContrattoClub.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
             messageError.showMessage(false, true, "warning","Scrive L'ID Del Club" ,errorMessage , jPMessage, btnCloseMessage);
            
        }
    }//GEN-LAST:event_inputIdClubJTFActionPerformed
    
    private void DataInizioJDCPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DataInizioJDCPropertyChange
        Date dataInizio = new Date();
        dataInizio = DataInizioJDC.getDate();
        if (dataInizio == null) {  
            // Il form è stato appena creato e nessuna data è stata inserita
            dataInizio = Calendar.getInstance().getTime();
            DataInizioJDC.setDate(dataInizio);
        } 
        
        int nextYear = (DataInizioJDC.getDate().getYear()) + 1;
        DataInizioJDC.getDate().setYear(nextYear);
        dataInizio.setYear(nextYear);
        DataFineJDC.setMinSelectableDate(dataInizio);
    }//GEN-LAST:event_DataInizioJDCPropertyChange

    private void DataInizioJDCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataInizioJDCMouseEntered
        
        
    }//GEN-LAST:event_DataInizioJDCMouseEntered

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
            inputCfAtletaJTF.setForeground(new Color(231,231,231));
            
        }
    }//GEN-LAST:event_inputCfAtletaJTFFocusLost

    private void inputIdClubJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdClubJTFFocusGained
      if(inputIdClubJTF.getText().equals("ID Club")){
            inputIdClubJTF.setText("");
            inputIdClubJTF.setForeground(new Color(255,255,255));
            inputIdClubJTF.setDocument(new PermessoPerScrivere()); 
        }
    }//GEN-LAST:event_inputIdClubJTFFocusGained

    private void inputIdClubJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdClubJTFFocusLost
        if(inputIdClubJTF.getText().equals("")){
            inputIdClubJTF.setDocument(new PermessoPerNonScrivere());
            inputIdClubJTF.setText("ID Club");
            inputIdClubJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputIdClubJTFFocusLost

    private void inputValContrattoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputValContrattoJTFFocusGained
       if(inputValContrattoJTF.getText().equals("Valore Contrattuale")){
           inputIdClubJTF.setDocument(new PermessoPerNonScrivere());
           inputValContrattoJTF.setText("");
           inputValContrattoJTF.setForeground(new Color(255,255,255));
           inputValContrattoJTF.setDocument(new PermessoPerScrivere());
        }
    }//GEN-LAST:event_inputValContrattoJTFFocusGained

    private void inputValContrattoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputValContrattoJTFFocusLost
      
        if(inputValContrattoJTF.getText().equals("")){
            inputValContrattoJTF.setDocument(new PermessoPerNonScrivere());
            inputValContrattoJTF.setText("Valore Contrattuale");
            inputValContrattoJTF.setForeground(new Color(255,255,255));
        }
       
    }//GEN-LAST:event_inputValContrattoJTFFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    public void DataInizioJDCMouseClicked(java.awt.event.MouseEvent evt) {
       
    }
    
     /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }
    
    /*MAIN*/
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraContrattoClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataFineJDC;
    private com.toedter.calendar.JDateChooser DataInizioJDC;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnStipulaContratto;
    private javax.swing.JTextField cognomeJTF;
    private javax.swing.JTextField dataNascitaJTF;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputCfAtletaJTF;
    private javax.swing.JTextField inputIdClubJTF;
    private javax.swing.JTextField inputNomeClubJTF;
    private javax.swing.JTextField inputValContrattoJTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeJTF;
    private javax.swing.JTextField ruoloJTF;
    // End of variables declaration//GEN-END:variables
}
