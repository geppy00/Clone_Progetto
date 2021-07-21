
package view.registrare;

import controller.ControllerClub;
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
import view.SezionePagamentoView;
import  java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;

public class RegistraPagamento extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();
    
    /*DATI IMPORTANTI*/
    private String idClubStr;
    private int idClub;
    
    public RegistraPagamento(String idClub) {
        initComponents();
        this.idClubStr = idClub;
        this.setLocationRelativeTo(null);
        
        jPMessage.setVisible(false);
        
        elencoAtletiJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        elencoAtletiJT.getTableHeader().setOpaque(false);
        elencoAtletiJT.getTableHeader().setBackground(new Color(32, 136, 203));
        elencoAtletiJT.getTableHeader().setForeground(new Color(255,255,255));
        
        try {
            this.stampaDatiAtleta();
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public RegistraPagamento() { 
        
    }
    
    /*METODI*/
    private void stampaDatiAtleta() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "SELECT atleta.codfiscale, atleta.nome, atleta.cognome FROM atleta join club on atleta.codclub=club.idclub WHERE atleta.codclub="+Integer.parseInt(this.getIdClubStr())+";";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");
               
                String tbDataAtleta[] = {idAtleta, nome, cognome};
                DefaultTableModel tblModel = (DefaultTableModel)elencoAtletiJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
           
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA ATLETA FALLITA "+e);
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
        btnAnnullaJB = new javax.swing.JButton();
        btnPagaJB = new javax.swing.JButton();
        inputImportoJTF = new javax.swing.JTextField();
        inputIdDestinatarioJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        elencoAtletiJT = new javax.swing.JTable();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnnullaJB.setBackground(new java.awt.Color(231, 76, 60));
        btnAnnullaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAnnullaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnullaJB.setText("Annulla");
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 110, 30));

        btnPagaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnPagaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnPagaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnPagaJB.setText("Paga");
        btnPagaJB.setBorder(null);
        btnPagaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagaJB.setFocusPainted(false);
        btnPagaJB.setFocusable(false);
        btnPagaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 100, 30));

        inputImportoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputImportoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputImportoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputImportoJTF.setText("L'Importo");
        inputImportoJTF.setBorder(null);
        inputImportoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputImportoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputImportoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputImportoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 293, 30));

        inputIdDestinatarioJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdDestinatarioJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdDestinatarioJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIdDestinatarioJTF.setText("ID Destinatario");
        inputIdDestinatarioJTF.setBorder(null);
        inputIdDestinatarioJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIdDestinatarioJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIdDestinatarioJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputIdDestinatarioJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 293, 30));

        elencoAtletiJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        elencoAtletiJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "Nome", "Cognome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        elencoAtletiJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        elencoAtletiJT.setShowVerticalLines(false);
        elencoAtletiJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(elencoAtletiJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 591, 220));

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
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 590, 40));

        btnLogoutJB.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnLogoutJB.setBorder(null);
        btnLogoutJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB.setFocusPainted(false);
        btnLogoutJB.setFocusable(false);
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnPagaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        LocalDate dataPagamento = java.time.LocalDate.now();
        Date javaDate = Date.valueOf(dataPagamento); 
        String importoStr = inputImportoJTF.getText();
        double importo = 0; 
       
        try{
            importo = Float.parseFloat(importoStr);
        }catch(NumberFormatException nex) {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN NUMERO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Inserire Un Numero Valido" , errorMessage, jPMessage, btnCloseMessage);
        }
        
        String idDestinatario = inputIdDestinatarioJTF.getText();
        this.setIdClub(Integer.parseInt(idClubStr));

        if(controlloConvalidazione.controlloRegistraPagamento(importoStr, idDestinatario) == true) {
            try {
                controllerClub.effettuaPagamento(importo, idDestinatario, this.getIdClub(), (java.sql.Date) javaDate);
                //JOptionPane.showMessageDialog(this, "PAGAMENTO EFFETTUATO CON SUCCESSO\nRiepilogo\nImporto: "+importo+"\nDestinatario: "+idDestinatario+"\nData Pagamento: "+javaDate+"\nID Mittente: "+this.getIdClub(), "REGISTRAZIONE PAGAMENTO", JOptionPane.INFORMATION_MESSAGE);
                messageError.showMessage(false, true, "success", "Pagamento Effettuato Con Successo", errorMessage , jPMessage, btnCloseMessage);
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Uno O Piu' Campi Mancanti" , errorMessage, jPMessage, btnCloseMessage);
        }
    }//GEN-LAST:event_btnPagaJBActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezionePagamentoView sezionePagamentoView = new SezionePagamentoView(this.getIdClubStr());
        sezionePagamentoView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void inputImportoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputImportoJTFFocusGained
         if(inputImportoJTF.getText().equals("L'Importo")){
            inputImportoJTF.setText("");
            inputImportoJTF.setForeground(new Color(255,255,255));
            inputImportoJTF.setDocument(new PermessoPerScrivere());    
        }
    }//GEN-LAST:event_inputImportoJTFFocusGained

    private void inputImportoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputImportoJTFFocusLost
        if(inputImportoJTF.getText().equals("")){
            inputImportoJTF.setDocument(new PermessoPerNonScrivere());
            inputImportoJTF.setText("L'Importo");
            inputImportoJTF.setForeground(new Color(255,255,255)); 
        }
    }//GEN-LAST:event_inputImportoJTFFocusLost

    private void inputIdDestinatarioJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdDestinatarioJTFFocusGained
        if(inputIdDestinatarioJTF.getText().equals("ID Destinatario")){
            inputIdDestinatarioJTF.setText("");
            inputIdDestinatarioJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputIdDestinatarioJTFFocusGained

    private void inputIdDestinatarioJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdDestinatarioJTFFocusLost
        if(inputIdDestinatarioJTF.getText().equals("")){
            inputIdDestinatarioJTF.setText("ID Destinatario");
            inputIdDestinatarioJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputIdDestinatarioJTFFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    
    /*GET AND SET*/
    public String getIdClubStr() {
        return idClubStr;
    }

    public void setIdClubStr(String idClubStr) {
        this.idClubStr = idClubStr;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    
    /*MAIN PER APRIRE FINESTRA*/
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnPagaJB;
    private javax.swing.JTable elencoAtletiJT;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputIdDestinatarioJTF;
    private javax.swing.JTextField inputImportoJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
