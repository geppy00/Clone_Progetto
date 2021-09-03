
package view.registrare;

import controller.ControllerLogin;
import convalidazione.ControlloConvalidazione;
import convalidazione.MessageError;
import convalidazione.PermessoPerNonScrivere;
import convalidazione.PermessoPerScrivere;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;
import view.AdminView;


public class RegistraNuovoProfilo extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();

    /*COSTRUTTORE*/
    public RegistraNuovoProfilo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
         jPMessage.setVisible(false);
         tableDatiUtenteJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tableDatiUtenteJT.getTableHeader().setOpaque(false);
         tableDatiUtenteJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tableDatiUtenteJT.getTableHeader().setForeground(new Color(255,255,255));
         
        try {
            stampaDatiUtenteNellaTabella();
        } catch (ExceptionDao ex) {
            Toolkit.getDefaultToolkit().beep();
            //Logger.getLogger(RegistraNuovoProfilo.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(this, "NON E' STATO POSSIBILE STAMPARE I DATI NELLA TABELLA\n\t\tRIPROVA", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Non E' Stato Possibile Stampare I dati Nella Tabella Riprovare" , errorMessage, jPMessage, btnCloseMessage);
            try {
                java.util.concurrent.TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex1) {
                Logger.getLogger(RegistraNuovoProfilo.class.getName()).log(Level.SEVERE, null, ex1);
            }
            AdminView adminView = new AdminView();
            adminView.setVisible(true);
            this.setVisible(false);
        }
        
        this.setVisible(true);
    }
    
    /*METODI*/
    private void stampaDatiUtenteNellaTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = null;
        String opzUser = opzUserJCB.getSelectedItem().toString();
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            
            switch(opzUser) {
            case "Procuratore":
                sql = "SELECT * FROM procuratore;";
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idProcuratore = rs.getString("code_procuratore");
                    String nomeProcuratore = rs.getString("nome");
                    String indirizzoProcuratore = rs.getString("indirizzo");
                    String telefonoProcuratore = rs.getString("telefono");
                    
                    String tbDataProcuratore[] = {idProcuratore, nomeProcuratore, indirizzoProcuratore, telefonoProcuratore};
                    DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                    tblModel.addRow(tbDataProcuratore);
                }
                rs.close();
                pStmt.close();
                connection.close();
            break;
                
            case "Atleta":
                sql = "SELECT * FROM atleta;";
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idAtleta = rs.getString("codfiscale");
                    String nomeAtleta = rs.getString("nome");
                    String indirizzoAtleta = rs.getString("indirizzo");
                    String telefonoAtleta = rs.getString("telefono");
                    
                    String tbDataAtleta[] = {idAtleta, nomeAtleta, indirizzoAtleta, telefonoAtleta};
                    DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                    tblModel.addRow(tbDataAtleta);
                }
                rs.close();
                pStmt.close();
                connection.close();
            break;
                
            case "Sponsor":
                sql = "SELECT * FROM sponsor;";
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idSponsor = rs.getString("idsponsor");
                    String nomeSponsor = rs.getString("nomesponsor");
                    String indirizzoSponsor = rs.getString("indirizzo");
                    String telefonoSponsor = rs.getString("telefono");
                    
                    String tbDataSponsor[] = {idSponsor, nomeSponsor, indirizzoSponsor, telefonoSponsor};
                    DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                    tblModel.addRow(tbDataSponsor);
                }
                rs.close();
                pStmt.close();
                connection.close();
            break;
                
            case "Club":
                sql = "SELECT * FROM club;";
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idclub = rs.getString("idclub");
                    String nomeclub = rs.getString("nomeclub");
                    String indirizzoclub = rs.getString("indirizzo");
                    String telefonoclub = rs.getString("telefono");
                    
                    String tbDataClub[] = {idclub, nomeclub, indirizzoclub, telefonoclub};
                    DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                    tblModel.addRow(tbDataClub);
                }
                rs.close();
                pStmt.close();
                connection.close();
            break;
            }
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA PAGAMENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        opzUserJCB = new javax.swing.JComboBox<>();
        inputUsernameJTF = new javax.swing.JTextField();
        inputIdCorrispondenteJTF = new javax.swing.JTextField();
        btnRegistraJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatiUtenteJT = new javax.swing.JTable();
        btnLogoutJB1 = new javax.swing.JButton();
        btnRispristinaJB = new javax.swing.JButton();
        btnLogoutJB2 = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        inputConfermaPasswordJTF = new javax.swing.JPasswordField();
        inputPasswordJTF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opzUserJCB.setBackground(new java.awt.Color(9, 46, 119));
        opzUserJCB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        opzUserJCB.setForeground(new java.awt.Color(255, 255, 255));
        opzUserJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procuratore", "Atleta", "Sponsor", "Club" }));
        opzUserJCB.setBorder(null);
        opzUserJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opzUserJCBActionPerformed(evt);
            }
        });
        jPanel1.add(opzUserJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 240, 30));

        inputUsernameJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputUsernameJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputUsernameJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputUsernameJTF.setText("User Name");
        inputUsernameJTF.setBorder(null);
        inputUsernameJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputUsernameJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputUsernameJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputUsernameJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, 30));

        inputIdCorrispondenteJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdCorrispondenteJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdCorrispondenteJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIdCorrispondenteJTF.setText("ID Corrispondente");
        inputIdCorrispondenteJTF.setBorder(null);
        inputIdCorrispondenteJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIdCorrispondenteJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIdCorrispondenteJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputIdCorrispondenteJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 500, 30));

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
        jPanel1.add(btnRegistraJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 500, 40));

        tableDatiUtenteJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Indirizzo", "Telefono"
            }
        ));
        tableDatiUtenteJT.setFocusable(false);
        tableDatiUtenteJT.setShowVerticalLines(false);
        tableDatiUtenteJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableDatiUtenteJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 430, 270));

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 40, 40));

        btnRispristinaJB.setBackground(new java.awt.Color(11, 58, 151));
        btnRispristinaJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_refresh_32px.png"))); // NOI18N
        btnRispristinaJB.setBorder(null);
        btnRispristinaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRispristinaJB.setFocusPainted(false);
        btnRispristinaJB.setFocusable(false);
        btnRispristinaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRispristinaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnRispristinaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 40, 40));

        btnLogoutJB2.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnLogoutJB2.setBorder(null);
        btnLogoutJB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB2.setFocusPainted(false);
        btnLogoutJB2.setFocusable(false);
        btnLogoutJB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJB2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 40, 40));

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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 640, 40));

        inputConfermaPasswordJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputConfermaPasswordJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputConfermaPasswordJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputConfermaPasswordJTF.setText("Conferma Password");
        inputConfermaPasswordJTF.setBorder(null);
        inputConfermaPasswordJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputConfermaPasswordJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputConfermaPasswordJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputConfermaPasswordJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 240, 30));

        inputPasswordJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputPasswordJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputPasswordJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputPasswordJTF.setText("Password");
        inputPasswordJTF.setBorder(null);
        inputPasswordJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPasswordJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPasswordJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputPasswordJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 250, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnRegistraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraJBActionPerformed
        ControllerLogin controllerLogin = new ControllerLogin();
        String password = inputPasswordJTF.getText();
        String confermaPassword = inputConfermaPasswordJTF.getText();
        String opzUser = opzUserJCB.getSelectedItem().toString();
        String username = inputUsernameJTF.getText();
        String idCorrispodente = inputIdCorrispondenteJTF.getText();
        boolean ripeti = false;
        
        if(controlloConvalidazione.controlloRegistraNuovoProfilo(username, password, confermaPassword, idCorrispodente) == true) {
            if(!(password.equals(confermaPassword))) {
               Toolkit.getDefaultToolkit().beep();
               //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nPASSWORD NON COINCIDONO", "ERRORE", JOptionPane.ERROR_MESSAGE);
               messageError.showMessage(false, true, "warning","Password Non Coincidono" , errorMessage, jPMessage, btnCloseMessage);
            } 
            else {
                try {
                    boolean check = controllerLogin.registraUtenteLogin(opzUser, username, password, idCorrispodente);
                    if(check == true)
                        //JOptionPane.showMessageDialog(this, "✓ REGISTRAZIONE DELL'UTENTE EFFETTUATA CON SUCCESSO", "REGISTRAZIONE", JOptionPane.INFORMATION_MESSAGE);
                        messageError.showMessage(false, true, "success", "Registrazione Effettuata Con Successo", errorMessage , jPMessage, btnCloseMessage);
                    else {
                        Toolkit.getDefaultToolkit().beep();
                        //JOptionPane.showMessageDialog(this, "!! REGISTRAZIONE FALLITA !!", "ERRORE", JOptionPane.ERROR_MESSAGE);
                        messageError.showMessage(false, true, "warning","Registrazione Fallita Riprova" , errorMessage, jPMessage, btnCloseMessage);
                    }
                }catch (ExceptionDao ex) {
                        //Logger.getLogger(RegistraNuovoProfilo.class.getName()).log(Level.SEVERE, null, ex);
                        messageError.showMessage(false, true, "warning","ID "+idCorrispodente+" Non E' Un "+opzUser+" Oppure Non Esiste" , errorMessage, jPMessage, btnCloseMessage);
                }
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Uno O Piu' Campi Mancanti" , errorMessage, jPMessage, btnCloseMessage);
        }
    }//GEN-LAST:event_btnRegistraJBActionPerformed

    private void opzUserJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opzUserJCBActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
            tblModel.setRowCount(0);
            stampaDatiUtenteNellaTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraNuovoProfilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opzUserJCBActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnRispristinaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRispristinaJBActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
        tblModel.setRowCount(0);
    }//GEN-LAST:event_btnRispristinaJBActionPerformed

    private void btnLogoutJB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB2ActionPerformed
        AdminView adminView = new AdminView();
        this.setVisible(false);
        adminView.setVisible(true);
    }//GEN-LAST:event_btnLogoutJB2ActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void inputUsernameJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUsernameJTFFocusGained
         if(inputUsernameJTF.getText().equals("User Name")){
            inputUsernameJTF.setText("");
            inputUsernameJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputUsernameJTFFocusGained

    private void inputUsernameJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUsernameJTFFocusLost
       if(inputUsernameJTF.getText().equals("")){
            inputUsernameJTF.setText("User Name");
            inputUsernameJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputUsernameJTFFocusLost

    private void inputIdCorrispondenteJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdCorrispondenteJTFFocusGained
       if(inputIdCorrispondenteJTF.getText().equals("ID Corrispondente")) {
            inputIdCorrispondenteJTF.setText("");
            inputIdCorrispondenteJTF.setForeground(new Color(255,255,255));
            String opzUser = opzUserJCB.getSelectedItem().toString();
            
            if(opzUser.equals("Sponsor") || opzUser.equals("Club"))
                inputIdCorrispondenteJTF.setDocument(new PermessoPerScrivere());
        }
    }//GEN-LAST:event_inputIdCorrispondenteJTFFocusGained

    private void inputIdCorrispondenteJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdCorrispondenteJTFFocusLost
      String opzUser = opzUserJCB.getSelectedItem().toString();
      
      if(inputIdCorrispondenteJTF.getText().equals("")) {
            if(opzUser.equals("Sponsor") || opzUser.equals("Club"))
                inputIdCorrispondenteJTF.setDocument(new PermessoPerNonScrivere());
            
            inputIdCorrispondenteJTF.setText("ID Corrispondente");
            inputIdCorrispondenteJTF.setForeground(new Color(255,255,255)); 
        }
    }//GEN-LAST:event_inputIdCorrispondenteJTFFocusLost

    private void inputPasswordJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPasswordJTFFocusGained
        if(inputPasswordJTF.getText().equals("Password")){
            inputPasswordJTF.setText("");
            inputPasswordJTF.setForeground(new Color(231,231,231));
            
        }
    }//GEN-LAST:event_inputPasswordJTFFocusGained

    private void inputPasswordJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPasswordJTFFocusLost
         if(inputPasswordJTF.getText().equals("")){
            inputPasswordJTF.setText("Password");
            inputPasswordJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputPasswordJTFFocusLost

    private void inputConfermaPasswordJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputConfermaPasswordJTFFocusGained
         if(inputConfermaPasswordJTF.getText().equals("Conferma Password")){
            inputConfermaPasswordJTF.setText("");
            inputConfermaPasswordJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputConfermaPasswordJTFFocusGained

    private void inputConfermaPasswordJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputConfermaPasswordJTFFocusLost
        if(inputPasswordJTF.getText().equals("")){
            inputPasswordJTF.setText("Conferma Password");
            inputPasswordJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputConfermaPasswordJTFFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    /*public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraNuovoProfilo().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnLogoutJB2;
    private javax.swing.JButton btnRegistraJB;
    private javax.swing.JButton btnRispristinaJB;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JPasswordField inputConfermaPasswordJTF;
    private javax.swing.JTextField inputIdCorrispondenteJTF;
    private javax.swing.JPasswordField inputPasswordJTF;
    private javax.swing.JTextField inputUsernameJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opzUserJCB;
    private javax.swing.JTable tableDatiUtenteJT;
    // End of variables declaration//GEN-END:variables
}
