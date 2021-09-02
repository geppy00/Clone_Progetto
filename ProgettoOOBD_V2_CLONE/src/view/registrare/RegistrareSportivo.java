
package view.registrare;

import controller.ControllerSportivo;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;
import view.SezioneAtletaView;

public class RegistrareSportivo extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();
    
    /*COSTRUTTORE*/
    public RegistrareSportivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jPMessage.setVisible(false);
        
        tblDatiClubJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblDatiClubJT.getTableHeader().setOpaque(false);
        tblDatiClubJT.getTableHeader().setBackground(new Color(32, 136, 203));
        tblDatiClubJT.getTableHeader().setForeground(new Color(255,255,255));
        
        try {
            this.stampaDatiTabellaClub();
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistrareSportivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*METODI*/
    private void stampaDatiTabellaClub() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select * from club;";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idClub = String.valueOf(rs.getInt("idclub"));
                String nome = rs.getString("nomeclub");
                
                String tbDataAtleta[] = {idClub, nome};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiClubJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
           
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA CLUB FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiClubJT = new javax.swing.JTable();
        inputIndirizzoJTF = new javax.swing.JTextField();
        inputNomeJTF = new javax.swing.JTextField();
        inputIdClubJTF = new javax.swing.JTextField();
        inputCognomeJTF = new javax.swing.JTextField();
        inputSessoJTF = new javax.swing.JComboBox<>();
        inputNazioneJTF = new javax.swing.JTextField();
        DataNascitaJDC = new com.toedter.calendar.JDateChooser();
        inputTelefonoJTF = new javax.swing.JTextField();
        inputCodiceFiscaleJTF = new javax.swing.JTextField();
        inputRuoloAtletaJTF = new javax.swing.JTextField();
        inputPesoJTF = new javax.swing.JTextField();
        inputIbanAtletaJTF = new javax.swing.JTextField();
        inputIDProcuratoreJTF = new javax.swing.JTextField();
        btnAnnullaJB = new javax.swing.JButton();
        btnRegistraJB = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatiClubJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatiClubJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Club", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiClubJT.setFocusable(false);
        tblDatiClubJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiClubJT.setShowVerticalLines(false);
        tblDatiClubJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDatiClubJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 390, 320));

        inputIndirizzoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIndirizzoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIndirizzoJTF.setForeground(new java.awt.Color(231, 231, 231));
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
        jPanel1.add(inputIndirizzoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 310, 30));

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
        jPanel1.add(inputNomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 310, 30));

        inputIdClubJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdClubJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdClubJTF.setForeground(new java.awt.Color(231, 231, 231));
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
        jPanel1.add(inputIdClubJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 310, 30));

        inputCognomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputCognomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputCognomeJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputCognomeJTF.setText("Cognome");
        inputCognomeJTF.setBorder(null);
        inputCognomeJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCognomeJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCognomeJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputCognomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 310, 30));

        inputSessoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputSessoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputSessoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputSessoJTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maschio", "Femmina", "Altro" }));
        inputSessoJTF.setBorder(null);
        jPanel1.add(inputSessoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 310, 30));

        inputNazioneJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNazioneJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNazioneJTF.setForeground(new java.awt.Color(231, 231, 231));
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
        jPanel1.add(inputNazioneJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 310, 30));
        jPanel1.add(DataNascitaJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 630, 30));

        inputTelefonoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputTelefonoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputTelefonoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputTelefonoJTF.setText("Telefono");
        inputTelefonoJTF.setBorder(null);
        inputTelefonoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTelefonoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTelefonoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputTelefonoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 310, 30));

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
        jPanel1.add(inputCodiceFiscaleJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 310, 30));

        inputRuoloAtletaJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputRuoloAtletaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputRuoloAtletaJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputRuoloAtletaJTF.setText("Ruolo");
        inputRuoloAtletaJTF.setBorder(null);
        inputRuoloAtletaJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputRuoloAtletaJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputRuoloAtletaJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputRuoloAtletaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 310, 30));

        inputPesoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputPesoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputPesoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputPesoJTF.setText("Peso");
        inputPesoJTF.setBorder(null);
        inputPesoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPesoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPesoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputPesoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 310, 30));

        inputIbanAtletaJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIbanAtletaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIbanAtletaJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIbanAtletaJTF.setText("IBAN");
        inputIbanAtletaJTF.setBorder(null);
        inputIbanAtletaJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIbanAtletaJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIbanAtletaJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputIbanAtletaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 310, 30));

        inputIDProcuratoreJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIDProcuratoreJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIDProcuratoreJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIDProcuratoreJTF.setText("ID Dell'Procuratore Corrispondente");
        inputIDProcuratoreJTF.setBorder(null);
        inputIDProcuratoreJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIDProcuratoreJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIDProcuratoreJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputIDProcuratoreJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 310, 30));

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
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 110, 30));

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
        jPanel1.add(btnRegistraJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 109, 30));

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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 630, 40));

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneAtletaView sezioneAtletaView = new SezioneAtletaView();
        sezioneAtletaView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnRegistraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        java.sql.Date dataNascitaPresoSql = null;
        float pesoPreso = 0;

        String nomePreso = inputNomeJTF.getText();
        String cognomePreso = inputCognomeJTF.getText();
        String sessoPreso = (String) inputSessoJTF.getSelectedItem();
        String nazionePreso = inputNazioneJTF.getText();

        try {
            dataNascitaPresoSql = new java.sql.Date(DataNascitaJDC.getDate().getTime());
        } catch(NullPointerException nex) {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UNA DATA VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
            getMessageError().showMessage(false, true, "warning","Inserire Una Data Valida" , getErrorMessage(), getjPMessage(), getBtnCloseMessage());
        }

        String telefonoPreso = inputTelefonoJTF.getText();
        String codiceFiscalePreso = inputCodiceFiscaleJTF.getText();
        String ruoloAtletaPreso = inputRuoloAtletaJTF.getText();
        String pesoStr = inputPesoJTF.getText();
        
        try {
            pesoPreso = Float.parseFloat(pesoStr);
        } catch(NumberFormatException nex) {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN NUMERO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            getMessageError().showMessage(false, true, "warning","Inserire Un Numero Valido" , getErrorMessage(), getjPMessage(), getBtnCloseMessage());
        }
        
        String ibanPreso = inputIbanAtletaJTF.getText();
        String idProcuratore = inputIDProcuratoreJTF.getText();
        String indirizzoPreso = inputIndirizzoJTF.getText();

        int idClub;
        if(inputIdClubJTF.getText().equals("") || inputIdClubJTF.getText().equals("ID Club"))
            idClub = 0;
        else
            idClub = Integer.parseInt(inputIdClubJTF.getText());

        if(controlloConvalidazione.controlloRegistraAtleta(nomePreso, cognomePreso, nazionePreso, indirizzoPreso, dataNascitaPresoSql, codiceFiscalePreso, idProcuratore) == true) {
            try {
                controllerSportivo.registraSportivo(nomePreso, cognomePreso, sessoPreso, nazionePreso, indirizzoPreso, dataNascitaPresoSql, telefonoPreso, codiceFiscalePreso, ruoloAtletaPreso, pesoPreso, idProcuratore, ibanPreso, idClub);
                //JOptionPane.showMessageDialog(this, "✓ REGISTRAZIONE EFFETTUATA CON SUCCESSO", "REGISTRAZIONE", JOptionPane.INFORMATION_MESSAGE);
                getMessageError().showMessage(false, true, "success", "Registrazione Effettuata Con Successo", getErrorMessage(), getjPMessage(), getBtnCloseMessage());
            } catch (ExceptionDao ex) {
                //Logger.getLogger(RegistrareSportivo.class.getName()).log(Level.SEVERE, null, ex);
                getMessageError().showMessage(false, true, "warning","Procuratore Con ID "+inputIDProcuratoreJTF.getText()+" Non Presente Nel Sistema" , getErrorMessage(), getjPMessage(), getBtnCloseMessage());
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
            getMessageError().showMessage(false, true, "warning","Uno O Piu' Campi Mancanti" , getErrorMessage(), getjPMessage(), getBtnCloseMessage());
        }
    }//GEN-LAST:event_btnRegistraJBActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        getjPMessage().setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
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
            inputNomeJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputNomeJTFFocusLost

    private void inputCognomeJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCognomeJTFFocusGained
        if(inputCognomeJTF.getText().equals("Cognome")){
            inputCognomeJTF.setText("");
            inputCognomeJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputCognomeJTFFocusGained

    private void inputCognomeJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCognomeJTFFocusLost
       if(inputCognomeJTF.getText().equals("")){
            inputCognomeJTF.setText("Cognome");
            inputCognomeJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputCognomeJTFFocusLost

    private void inputCodiceFiscaleJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodiceFiscaleJTFFocusGained
        if(inputCodiceFiscaleJTF.getText().equals("Codice Fiscale")){
            inputCodiceFiscaleJTF.setText("");
            inputCodiceFiscaleJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputCodiceFiscaleJTFFocusGained

    private void inputCodiceFiscaleJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodiceFiscaleJTFFocusLost
        if(inputCodiceFiscaleJTF.getText().equals("")){
            inputCodiceFiscaleJTF.setText("Codice Fiscale");
            inputCodiceFiscaleJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputCodiceFiscaleJTFFocusLost

    private void inputIndirizzoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIndirizzoJTFFocusGained
       if(inputIndirizzoJTF.getText().equals("Indirizzo")){
            inputIndirizzoJTF.setText("");
            inputIndirizzoJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputIndirizzoJTFFocusGained

    private void inputIndirizzoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIndirizzoJTFFocusLost
        if(inputIndirizzoJTF.getText().equals("")){
            inputIndirizzoJTF.setText("Indirizzo");
            inputIndirizzoJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputIndirizzoJTFFocusLost

    private void inputIbanAtletaJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIbanAtletaJTFFocusGained
        if(inputIbanAtletaJTF.getText().equals("IBAN")){
            inputIbanAtletaJTF.setText("");
            inputIbanAtletaJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputIbanAtletaJTFFocusGained

    private void inputIbanAtletaJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIbanAtletaJTFFocusLost
        if(inputIbanAtletaJTF.getText().equals("")){
            inputIbanAtletaJTF.setText("IBAN");
            inputIbanAtletaJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputIbanAtletaJTFFocusLost

    private void inputPesoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPesoJTFFocusGained
         if(inputPesoJTF.getText().equals("Peso")){
            inputPesoJTF.setText("");
            inputPesoJTF.setForeground(new Color(255,255,255));
            inputPesoJTF.setDocument(new PermessoPerScrivere());
        }
    }//GEN-LAST:event_inputPesoJTFFocusGained

    private void inputPesoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPesoJTFFocusLost
       if(inputPesoJTF.getText().equals("")){
            inputPesoJTF.setDocument(new PermessoPerNonScrivere());
            inputPesoJTF.setText("Peso");
            inputPesoJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputPesoJTFFocusLost

    private void inputTelefonoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTelefonoJTFFocusGained
         if(inputTelefonoJTF.getText().equals("Telefono")){
            inputTelefonoJTF.setText("");
            inputTelefonoJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputTelefonoJTFFocusGained

    private void inputTelefonoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTelefonoJTFFocusLost
        if(inputTelefonoJTF.getText().equals("")){
            inputTelefonoJTF.setText("Telefono");
            inputTelefonoJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputTelefonoJTFFocusLost

    private void inputNazioneJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNazioneJTFFocusGained
       if(inputNazioneJTF.getText().equals("Nazione")){
            inputNazioneJTF.setText("");
            inputNazioneJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputNazioneJTFFocusGained

    private void inputNazioneJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNazioneJTFFocusLost
        if(inputNazioneJTF.getText().equals("")){
            inputNazioneJTF.setText("Nazione");
            inputNazioneJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputNazioneJTFFocusLost

    private void inputRuoloAtletaJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputRuoloAtletaJTFFocusGained
        if(inputRuoloAtletaJTF.getText().equals("Ruolo")){
            inputRuoloAtletaJTF.setText("");
            inputRuoloAtletaJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputRuoloAtletaJTFFocusGained

    private void inputRuoloAtletaJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputRuoloAtletaJTFFocusLost
         if(inputRuoloAtletaJTF.getText().equals("")){
            inputRuoloAtletaJTF.setText("Ruolo");
            inputRuoloAtletaJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputRuoloAtletaJTFFocusLost

    private void inputIDProcuratoreJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIDProcuratoreJTFFocusGained
        if(inputIDProcuratoreJTF.getText().equals("ID Dell'Procuratore Corrispondente")){
            inputIDProcuratoreJTF.setText("");
            inputIDProcuratoreJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputIDProcuratoreJTFFocusGained

    private void inputIDProcuratoreJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIDProcuratoreJTFFocusLost
        if(inputIDProcuratoreJTF.getText().equals("")){
            inputIDProcuratoreJTF.setText("ID Dell'Procuratore Corrispondente");
            inputIDProcuratoreJTF.setForeground(new Color(231,231,231));
        }
    }//GEN-LAST:event_inputIDProcuratoreJTFFocusLost

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

   
    /*MAIN*/
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrareSportivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataNascitaJDC;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnRegistraJB;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputCodiceFiscaleJTF;
    private javax.swing.JTextField inputCognomeJTF;
    private javax.swing.JTextField inputIDProcuratoreJTF;
    private javax.swing.JTextField inputIbanAtletaJTF;
    private javax.swing.JTextField inputIdClubJTF;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNazioneJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JTextField inputPesoJTF;
    private javax.swing.JTextField inputRuoloAtletaJTF;
    private javax.swing.JComboBox<String> inputSessoJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatiClubJT;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnCloseMessage() {
        return btnCloseMessage;
    }

    public void setBtnCloseMessage(javax.swing.JButton btnCloseMessage) {
        this.btnCloseMessage = btnCloseMessage;
    }

    public javax.swing.JLabel getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(javax.swing.JLabel errorMessage) {
        this.errorMessage = errorMessage;
    }

    public javax.swing.JPanel getjPMessage() {
        return jPMessage;
    }

    public void setjPMessage(javax.swing.JPanel jPMessage) {
        this.jPMessage = jPMessage;
    }
    
    public MessageError getMessageError() {
        return messageError;
    }

    public void setMessageError(MessageError messageError) {
        this.messageError = messageError;
    }

}
