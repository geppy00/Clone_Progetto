
package view.modificaDati;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Evento;
import view.ElencoEventiView;
import view.registrare.RegistraEventoSponsor;

public class ModificaEvento extends javax.swing.JFrame {
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private ArrayList<Evento> datiEvento = new ArrayList<Evento>();
    private int idEvento;
    private String idSponsor;
    
    /*COSTRUTTORI*/
    public ModificaEvento(String idSponsor, int idEvento) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        this.idEvento = idEvento;
        jPMessage.setVisible(false);
        this.stampaDati();
    }
    
    public ModificaEvento() {
        
    }


    /*METODI*/
    private void stampaDati() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        
        if(controlloConvalidazione.controlloIdEvento(String.valueOf(this.getIdEvento())) == true) {
            try {
                datiEvento = controllerSponsor.prendiDatiEvento(this.getIdEvento());
                if(datiEvento.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "EVENTO CON ID UGUALE AD "+this.getIdEvento()+" NON TROVATO\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
                    elencoEventiView.setVisible(true);
                    this.setVisible(false);
                }
                else {
                    datiEvento.forEach((Evento evento) -> {
                        idEventoJTF.setText(String.valueOf(this.getIdEvento()));
                        inputGettoneEventoJTF.setText(String.valueOf(evento.getGettoneValue()));
                        inputOraFineJTF.setText(evento.getTitolo());
                        inpuIndirizzoJTF.setText(evento.getLuogoEvento());
                        inputDataInizioJDC.setDate(evento.getDataInizio());
                        inputOraInizioJTF.setText(String.valueOf(evento.getOraInizio()));
                        inputDataFineJDC.setDate(evento.getDataFine());
                        inputOraFineJTF.setText(String.valueOf(evento.getOraFine()));
                        inputDescrizioneJTA.setText(evento.getDescrizione());
                    });
                }
            } catch (ExceptionDao ex) {
                Toolkit.getDefaultToolkit().beep();
                //Logger.getLogger(ModificaEvento.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "CI E' STATO UN PROBLEMA NEL RICAVARE I DATI\nCI SCUSIAMO PER L'INCONVENINETE", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "CI E' STATO UN PROBLEMA NEL RICAVARE I DATI\nRIPROVA A SELEZIONE QUESTO EVENTO", "WARNING", JOptionPane.WARNING_MESSAGE);
            ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
            elencoEventiView.setVisible(true);
            this.setVisible(false);
        }
    }
    
    private java.sql.Time stringToTime(String oraStr) {
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        
        try {
            java.sql.Time timeValue = new java.sql.Time(formatter.parse(oraStr).getTime());
            return timeValue;
        } catch (ParseException ex) {
            Toolkit.getDefaultToolkit().beep();
            //Logger.getLogger(RegistraEventoSponsor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN ORARIO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputOraFineJTF = new javax.swing.JTextField();
        inputDataFineJDC = new com.toedter.calendar.JDateChooser();
        inputDataInizioJDC = new com.toedter.calendar.JDateChooser();
        inputTitoloJTF = new javax.swing.JTextField();
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
        idEventoJTF = new javax.swing.JTextField();
        inputOraInizioJTF = new javax.swing.JTextField();
        inpuIndirizzoJTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputOraFineJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputOraFineJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputOraFineJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputOraFineJTF.setBorder(null);
        jPanel1.add(inputOraFineJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 310, 30));

        inputDataFineJDC.setDateFormatString("yyyy-MM-dd HH:mm:ss");
        jPanel1.add(inputDataFineJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 310, 30));

        inputDataInizioJDC.setDateFormatString("yyyy-MM-dd HH:mm:ss");
        inputDataInizioJDC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputDataInizioJDCPropertyChange(evt);
            }
        });
        jPanel1.add(inputDataInizioJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 310, 30));

        inputTitoloJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputTitoloJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputTitoloJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputTitoloJTF.setBorder(null);
        jPanel1.add(inputTitoloJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 310, 30));

        inputDescrizioneJTA.setBackground(new java.awt.Color(9, 46, 119));
        inputDescrizioneJTA.setColumns(20);
        inputDescrizioneJTA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputDescrizioneJTA.setForeground(new java.awt.Color(255, 255, 255));
        inputDescrizioneJTA.setRows(5);
        inputDescrizioneJTA.setToolTipText("");
        inputDescrizioneJTA.setBorder(null);
        jScrollPane1.setViewportView(inputDescrizioneJTA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 630, 130));

        inputGettoneEventoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputGettoneEventoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputGettoneEventoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputGettoneEventoJTF.setBorder(null);
        inputGettoneEventoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGettoneEventoJTFActionPerformed(evt);
            }
        });
        jPanel1.add(inputGettoneEventoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 310, 30));

        btnCreaEventoJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCreaEventoJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCreaEventoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCreaEventoJB.setText("Modifica");
        btnCreaEventoJB.setBorder(null);
        btnCreaEventoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreaEventoJB.setFocusPainted(false);
        btnCreaEventoJB.setFocusable(false);
        btnCreaEventoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaEventoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreaEventoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 80, 30));

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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 630, 40));

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
        jPanel1.add(btnAnnulla, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 80, 30));

        idEventoJTF.setEditable(false);
        idEventoJTF.setBackground(new java.awt.Color(9, 46, 119));
        idEventoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        idEventoJTF.setForeground(new java.awt.Color(231, 231, 231));
        idEventoJTF.setBorder(null);
        jPanel1.add(idEventoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 310, 30));

        inputOraInizioJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputOraInizioJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputOraInizioJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputOraInizioJTF.setBorder(null);
        jPanel1.add(inputOraInizioJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 310, 30));

        inpuIndirizzoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inpuIndirizzoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inpuIndirizzoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inpuIndirizzoJTF.setBorder(null);
        inpuIndirizzoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpuIndirizzoJTFActionPerformed(evt);
            }
        });
        jPanel1.add(inpuIndirizzoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 310, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Indirizzo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 70, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID Evento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Titolo ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gettone");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 70, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ora Fine");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 80, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Data Fine");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 80, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Data Inizio");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 80, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Descrizione");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 80, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ora Inzio");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDataInizioJDCPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputDataInizioJDCPropertyChange
        Date dataInizio = new Date();
        dataInizio = inputDataInizioJDC.getDate();
        if (dataInizio == null) {
            // Il form è stato appena creato e nessuna data è stata inserita
            dataInizio = Calendar.getInstance().getTime();
            inputDataInizioJDC.setDate(dataInizio);
        }
        inputDataFineJDC.setMinSelectableDate(dataInizio);
    }//GEN-LAST:event_inputDataInizioJDCPropertyChange

    private void inputGettoneEventoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGettoneEventoJTFActionPerformed

    }//GEN-LAST:event_inputGettoneEventoJTFActionPerformed

    private void btnCreaEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaEventoJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        
        if(controlloConvalidazione.controlloIdEvento(String.valueOf(this.getIdEvento())) == true) {
            String titolo = inputTitoloJTF.getText();
            String indirizzo = inpuIndirizzoJTF.getText();
            java.sql.Date dataInizio = null;
            java.sql.Date dataFine = null;
            double gettoneValue = 0;
            
            try {
            dataInizio = new java.sql.Date(inputDataInizioJDC.getDate().getTime());
            dataFine = new java.sql.Date(inputDataFineJDC.getDate().getTime());
            }catch(NullPointerException nex) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UNA DATA VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            
            String oraInizio = inputOraInizioJTF.getText();
            java.sql.Time oraInizioTime = stringToTime(oraInizio);
            String oraFine = inputOraFineJTF.getText();
            java.sql.Time oraFineTime = stringToTime(oraFine);
            
            try {
                gettoneValue = Double.parseDouble(inputGettoneEventoJTF.getText());
            }catch(NumberFormatException nfe) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN NUMERO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            
            String descrizione = inputDescrizioneJTA.getText();
            
            if(controlloConvalidazione.controlloDescrizioneEvento(descrizione) == true) {
                if(controlloConvalidazione.controlloModificaEvento(String.valueOf(dataInizio), String.valueOf(dataFine), titolo, titolo, String.valueOf(gettoneValue), String.valueOf(oraInizioTime), String.valueOf(oraFineTime)) == true) {
                    if(datiEvento.isEmpty()) {
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(this, "EVENTO CON ID "+this.getIdEvento()+" NON ESISTE\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                        ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
                        elencoEventiView.setVisible(true);
                        this.setVisible(false);
                    }
                    else {
                        try {
                            controllerSponsor.aggiornaEvento(gettoneValue, this.getIdEvento(), titolo, indirizzo, dataInizio, oraInizioTime, dataFine, oraFineTime, Integer.parseInt(this.getIdSponsor()), descrizione);
                            JOptionPane.showMessageDialog(this, "✓ MODIFICA DELL' EVENTO CON ID"+this.getIdEvento()+" EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                            ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
                            elencoEventiView.setVisible(true);
                            this.setVisible(false);
                        } catch (ExceptionDao ex) {
                            Logger.getLogger(ModificaEvento.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
            else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "DESCRIZIONE MASSIMO 280 CARATTERI", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "CI E' STATO UN PROBLEMA NEL RICAVARE I DATI\nRIPROVA A SELEZIONE QUESTO EVENTO", "WARNING", JOptionPane.WARNING_MESSAGE);
            ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
            elencoEventiView.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCreaEventoJBActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaActionPerformed
        ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
        elencoEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaActionPerformed

    private void inpuIndirizzoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpuIndirizzoJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpuIndirizzoJTFActionPerformed

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
                new ModificaEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulla;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnCreaEventoJB;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField idEventoJTF;
    private javax.swing.JTextField inpuIndirizzoJTF;
    private com.toedter.calendar.JDateChooser inputDataFineJDC;
    private com.toedter.calendar.JDateChooser inputDataInizioJDC;
    private javax.swing.JTextArea inputDescrizioneJTA;
    private javax.swing.JTextField inputGettoneEventoJTF;
    private javax.swing.JTextField inputOraFineJTF;
    private javax.swing.JTextField inputOraInizioJTF;
    private javax.swing.JTextField inputTitoloJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
