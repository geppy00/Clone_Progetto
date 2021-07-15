
package view.registrare;

import controller.ControllerProcuratore;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.SezioneProcuratoreView;

public class RegistraProcuratore extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
   
    public RegistraProcuratore() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jPMessage.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        inputIndirizzoJTF = new javax.swing.JTextField();
        inputNazioneJTF = new javax.swing.JTextField();
        InputCodiceFiscaleJTF = new javax.swing.JTextField();
        inputMatricolaJTF = new javax.swing.JTextField();
        InputTelefonoJTF = new javax.swing.JTextField();
        InputIbanJTF = new javax.swing.JTextField();
        dataNascitaJDC = new com.toedter.calendar.JDateChooser();
        InputCognomeJTF = new javax.swing.JTextField();
        btnAnnullaJB = new javax.swing.JButton();
        btnRegistraJB = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();
        inputNomeJTF = new javax.swing.JTextField();
        sessoJCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(11, 58, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(inputIndirizzoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 310, 30));

        inputNazioneJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNazioneJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNazioneJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputNazioneJTF.setText("Nazione");
        inputNazioneJTF.setBorder(null);
        inputNazioneJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNazioneJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNazioneJTFFocusLost(evt);
            }
        });
        jPanel2.add(inputNazioneJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 320, 30));

        InputCodiceFiscaleJTF.setBackground(new java.awt.Color(9, 46, 119));
        InputCodiceFiscaleJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        InputCodiceFiscaleJTF.setForeground(new java.awt.Color(221, 231, 231));
        InputCodiceFiscaleJTF.setText("Codice Fiscale");
        InputCodiceFiscaleJTF.setBorder(null);
        InputCodiceFiscaleJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputCodiceFiscaleJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputCodiceFiscaleJTFFocusLost(evt);
            }
        });
        jPanel2.add(InputCodiceFiscaleJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 310, 30));

        inputMatricolaJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputMatricolaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputMatricolaJTF.setForeground(new java.awt.Color(221, 231, 231));
        inputMatricolaJTF.setText("Matricola");
        inputMatricolaJTF.setBorder(null);
        inputMatricolaJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputMatricolaJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputMatricolaJTFFocusLost(evt);
            }
        });
        jPanel2.add(inputMatricolaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 310, 30));

        InputTelefonoJTF.setBackground(new java.awt.Color(9, 46, 119));
        InputTelefonoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        InputTelefonoJTF.setForeground(new java.awt.Color(221, 231, 231));
        InputTelefonoJTF.setText("Telefono");
        InputTelefonoJTF.setBorder(null);
        InputTelefonoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputTelefonoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputTelefonoJTFFocusLost(evt);
            }
        });
        jPanel2.add(InputTelefonoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 320, 30));

        InputIbanJTF.setBackground(new java.awt.Color(9, 46, 119));
        InputIbanJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        InputIbanJTF.setForeground(new java.awt.Color(221, 231, 231));
        InputIbanJTF.setText("IBAN");
        InputIbanJTF.setBorder(null);
        InputIbanJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputIbanJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputIbanJTFFocusLost(evt);
            }
        });
        InputIbanJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIbanJTFActionPerformed(evt);
            }
        });
        jPanel2.add(InputIbanJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 320, 30));

        dataNascitaJDC.setMaxSelectableDate(new java.util.Date(253370764884000L));
        dataNascitaJDC.setMinSelectableDate(new java.util.Date(-62135769516000L));
        dataNascitaJDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataNascitaJDCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dataNascitaJDCMouseEntered(evt);
            }
        });
        dataNascitaJDC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dataNascitaJDCPropertyChange(evt);
            }
        });
        jPanel2.add(dataNascitaJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 320, 30));

        InputCognomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        InputCognomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        InputCognomeJTF.setForeground(new java.awt.Color(231, 231, 231));
        InputCognomeJTF.setText("Cognome");
        InputCognomeJTF.setBorder(null);
        InputCognomeJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputCognomeJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputCognomeJTFFocusLost(evt);
            }
        });
        jPanel2.add(InputCognomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 310, 30));

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
        jPanel2.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 80, 30));

        btnRegistraJB.setBackground(new java.awt.Color(46, 204, 113));
        btnRegistraJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRegistraJB.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistraJB.setText("Registra");
        btnRegistraJB.setActionCommand("Stabilisca");
        btnRegistraJB.setBorder(null);
        btnRegistraJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistraJB.setFocusPainted(false);
        btnRegistraJB.setFocusable(false);
        btnRegistraJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistraJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 90, 30));

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

        jPanel2.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 640, 40));

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
        jPanel2.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, 40));

        inputNomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputNomeJTF.setText("Nome");
        inputNomeJTF.setBorder(null);
        inputNomeJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNomeJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNomeJTFFocusLost(evt);
            }
        });
        inputNomeJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeJTFActionPerformed(evt);
            }
        });
        jPanel2.add(inputNomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 320, 30));

        sessoJCB.setBackground(new java.awt.Color(9, 46, 119));
        sessoJCB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        sessoJCB.setForeground(new java.awt.Color(231, 231, 231));
        sessoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maschio", "Femmina", "Altro" }));
        sessoJCB.setBorder(null);
        sessoJCB.setFocusable(false);
        jPanel2.add(sessoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 310, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputIbanJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputIbanJTFFocusGained
        if(InputIbanJTF.getText().equals("ID Club")){
            InputIbanJTF.setText("");
            InputIbanJTF.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_InputIbanJTFFocusGained

    private void InputIbanJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputIbanJTFFocusLost
        if(InputIbanJTF.getText().equals("")){
            InputIbanJTF.setText("ID Club");
            InputIbanJTF.setForeground(new Color(231,231,231));

        }
    }//GEN-LAST:event_InputIbanJTFFocusLost

    private void InputIbanJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIbanJTFActionPerformed
        
    }//GEN-LAST:event_InputIbanJTFActionPerformed

    private void dataNascitaJDCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataNascitaJDCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascitaJDCMouseClicked

    private void dataNascitaJDCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataNascitaJDCMouseEntered

    }//GEN-LAST:event_dataNascitaJDCMouseEntered

    private void dataNascitaJDCPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dataNascitaJDCPropertyChange
        
    }//GEN-LAST:event_dataNascitaJDCPropertyChange

    private void InputCognomeJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputCognomeJTFFocusGained
        if(InputCognomeJTF.getText().equals("Cognome")){
            InputCognomeJTF.setText("");
            InputCognomeJTF.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_InputCognomeJTFFocusGained

    private void InputCognomeJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputCognomeJTFFocusLost
        if(InputCognomeJTF.getText().equals("")){
            InputCognomeJTF.setText("Cognome");
            InputCognomeJTF.setForeground(new Color(231,231,231));

        }
    }//GEN-LAST:event_InputCognomeJTFFocusLost

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       SezioneProcuratoreView sezioneProcuratore = new SezioneProcuratoreView();
       sezioneProcuratore.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnRegistraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();


        java.sql.Date dataNascitaPresoSql = null;

        String sessoPreso = (String) sessoJCB.getSelectedItem();
        String matricolaPresa = inputMatricolaJTF.getText();
        String nomePreso = inputNomeJTF.getText();
        String cognomePreso = InputCognomeJTF.getText();
        String nazionePresa = inputNazioneJTF.getText();
        String indirizzoPreso = inputIndirizzoJTF.getText();

        try {
            dataNascitaPresoSql = new java.sql.Date(dataNascitaJDC.getDate().getTime());
        }catch(NullPointerException nex) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UNA DATA VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }

        String telefonoPreso = InputTelefonoJTF.getText();
        String codiceFiscalePreso = InputCodiceFiscaleJTF.getText();
        String ibanPreso = InputIbanJTF.getText();       
        String strDate = String.valueOf(dataNascitaPresoSql);

        if(controlloConvalidazione.controlloRegistraProcuratore(matricolaPresa, nomePreso, cognomePreso, nazionePresa, indirizzoPreso, strDate, codiceFiscalePreso) == true) {
            try {
                controllerProcuratore.registraProcuratore(matricolaPresa, nomePreso, cognomePreso, sessoPreso, nazionePresa, indirizzoPreso, (java.sql.Date) dataNascitaPresoSql, telefonoPreso, codiceFiscalePreso, ibanPreso);
                JOptionPane.showMessageDialog(this, "✓ REGISTRAZIONE EFFETTUATA CON SUCCESSO", "REGISTRAZIONE", JOptionPane.INFORMATION_MESSAGE);
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistraJBActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void inputNomeJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeJTFFocusGained
      if(inputNomeJTF.getText().equals("Nome")){
            inputNomeJTF.setText("");
            inputNomeJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputNomeJTFFocusGained

    private void inputNomeJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeJTFFocusLost
      if(inputNomeJTF.getText().equals("")){
            inputNomeJTF.setText("Nome");
            inputNomeJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputNomeJTFFocusLost

    private void inputNazioneJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNazioneJTFFocusGained
        if(inputNazioneJTF.getText().equals("Nazione")){
            inputNazioneJTF.setText("");
            inputNazioneJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputNazioneJTFFocusGained

    private void inputNazioneJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNazioneJTFFocusLost
       if(inputNazioneJTF.getText().equals("")){
            inputNazioneJTF.setText("Nazione");
            inputNazioneJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputNazioneJTFFocusLost

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

    private void InputTelefonoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputTelefonoJTFFocusGained
        if(InputTelefonoJTF.getText().equals("Telefono")){
            InputTelefonoJTF.setText("");
            InputTelefonoJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_InputTelefonoJTFFocusGained

    private void InputTelefonoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputTelefonoJTFFocusLost
        if(InputTelefonoJTF.getText().equals("")){
            InputTelefonoJTF.setText("Telefono");
            InputTelefonoJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_InputTelefonoJTFFocusLost

    private void InputCodiceFiscaleJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputCodiceFiscaleJTFFocusGained
       if(InputCodiceFiscaleJTF.getText().equals("Codice Fiscale")){
            InputCodiceFiscaleJTF.setText("");
            InputCodiceFiscaleJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_InputCodiceFiscaleJTFFocusGained

    private void InputCodiceFiscaleJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputCodiceFiscaleJTFFocusLost
        if(InputCodiceFiscaleJTF.getText().equals("")){
            InputCodiceFiscaleJTF.setText("Codice Fiscale");
            InputCodiceFiscaleJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_InputCodiceFiscaleJTFFocusLost

    private void inputMatricolaJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMatricolaJTFFocusGained
       if(inputMatricolaJTF.getText().equals("Matricola")){
            inputMatricolaJTF.setText("");
            inputMatricolaJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputMatricolaJTFFocusGained

    private void inputMatricolaJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMatricolaJTFFocusLost
        if(inputMatricolaJTF.getText().equals("")){
            inputMatricolaJTF.setText("Matricola");
            inputMatricolaJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputMatricolaJTFFocusLost

    private void inputNomeJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeJTFActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputCodiceFiscaleJTF;
    private javax.swing.JTextField InputCognomeJTF;
    private javax.swing.JTextField InputIbanJTF;
    private javax.swing.JTextField InputTelefonoJTF;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnRegistraJB;
    private com.toedter.calendar.JDateChooser dataNascitaJDC;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputMatricolaJTF;
    private javax.swing.JTextField inputNazioneJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> sessoJCB;
    // End of variables declaration//GEN-END:variables
}
