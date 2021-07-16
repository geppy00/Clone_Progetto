
package view;

import controller.ControllerClub;
import convalidazione.ControlloConvalidazione;
import convalidazione.PermessoPerNonScrivere;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Stipendio;
import refactorCode.FinallyException;

public class SezioneVisualizzaPagamenti extends javax.swing.JFrame {

     /*DATI IMPORTANTI*/
    private ArrayList<Stipendio> datiStipendio = new ArrayList<Stipendio>();
    private String[] tbData;
    private String idClub;
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    public SezioneVisualizzaPagamenti(String idClub) {
        initComponents();
        this.idClub = idClub;
        
        
         visualizzaDatiPagamentiJB.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         visualizzaDatiPagamentiJB.getTableHeader().setOpaque(false);
         visualizzaDatiPagamentiJB.getTableHeader().setBackground(new Color(32, 136, 203));
         visualizzaDatiPagamentiJB.getTableHeader().setForeground(new Color(255,255,255));
        try {
            this.visualizzaTuttiPagamenti();
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezioneVisualizzaPagamenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
    }
    public SezioneVisualizzaPagamenti(){}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        inputIdAtletaJTF = new javax.swing.JTextField();
        btnCercaAtletaJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visualizzaDatiPagamentiJB = new javax.swing.JTable();
        btnAnnullaJB2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(11, 58, 151));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setFocusPainted(false);
        btnClose.setFocusable(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, 40));

        inputIdAtletaJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdAtletaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdAtletaJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIdAtletaJTF.setText("ID Atleta");
        inputIdAtletaJTF.setBorder(null);
        inputIdAtletaJTF.setFocusable(false);
        inputIdAtletaJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIdAtletaJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIdAtletaJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputIdAtletaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 580, 30));

        btnCercaAtletaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaAtletaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaAtletaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaAtletaJB.setText("Cerca");
        btnCercaAtletaJB.setBorder(null);
        btnCercaAtletaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaAtletaJB.setFocusPainted(false);
        btnCercaAtletaJB.setFocusable(false);
        btnCercaAtletaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaAtletaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCercaAtletaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 80, 30));

        visualizzaDatiPagamentiJB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        visualizzaDatiPagamentiJB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pagamento", "Importo", "Status Pagamento", "Data Pagamento", "ID Atleta", "ID Mittente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        visualizzaDatiPagamentiJB.setSelectionBackground(new java.awt.Color(232, 57, 95));
        visualizzaDatiPagamentiJB.setShowVerticalLines(false);
        visualizzaDatiPagamentiJB.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(visualizzaDatiPagamentiJB);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 660, 200));

        btnAnnullaJB2.setBackground(new java.awt.Color(11, 58, 151));
        btnAnnullaJB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnAnnullaJB2.setBorder(null);
        btnAnnullaJB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB2.setFocusPainted(false);
        btnAnnullaJB2.setFocusable(false);
        btnAnnullaJB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJB2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 40, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void inputIdAtletaJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdAtletaJTFFocusGained
       if(inputIdAtletaJTF.getText().equals("ID Atleta")){
           inputIdAtletaJTF.setDocument(new PermessoPerNonScrivere());
            inputIdAtletaJTF.setText("");
            inputIdAtletaJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputIdAtletaJTFFocusGained

    private void inputIdAtletaJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdAtletaJTFFocusLost
        if(inputIdAtletaJTF.getText().equals("")){
            inputIdAtletaJTF.setDocument(new PermessoPerNonScrivere());
            inputIdAtletaJTF.setText("ID Atleta");
            inputIdAtletaJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputIdAtletaJTFFocusLost

    private void btnAnnullaJB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnnullaJB2ActionPerformed

    private void btnCercaAtletaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaAtletaJBActionPerformed
       String idAtleta = inputIdAtletaJTF.getText();
        ControllerClub controllerClub = new ControllerClub();
        
        if(controlloConvalidazione.controlloVisuallizzaPagamentiAtleta(idAtleta) == true) {
            try {
                datiStipendio = controllerClub.cercaPagamentiAtleta(idAtleta, Integer.parseInt(this.getIdClub()));
                if(datiStipendio.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "ATLETA "+idAtleta+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiPagamentiJB.getModel();
                    tblModel.setRowCount(0);
                    datiStipendio.forEach((Stipendio stipendio) -> {
                        tblModel.addRow(new Object[]{
                            stipendio.getIdStipendio(),
                            stipendio.getValoreStipendio(),
                            stipendio.getStatusPagamento(),
                            stipendio.getDataPagamento(),
                            stipendio.getIdAtleta(),
                            stipendio.getIdClub()
                        });
                        visualizzaDatiPagamentiJB.setModel(tblModel);
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(SezioneVisualizzaPagamenti.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nCAMPO DI RICERCA MANCANTE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCercaAtletaJBActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    
    /*GET AND SET*/
    public String getIdClub() {
        return idClub;
    }

    public void setIdClub(String idClub) {
        this.idClub = idClub;
    }
    
    public String[] getTbData() {
        return tbData;
    }

    public void setTbData(String[] tbData) {
        this.tbData = tbData;
    }
    
     public void visualizzaTuttiPagamenti() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String sql = "SELECT * FROM stipendio WHERE idclub="+this.getIdClub()+";";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idStipendio = Integer.toString(rs.getInt("idstipendio"));
                String valoreStipendio = Double.toString(rs.getDouble("val_stipendio"));
                
                String statusPagamento;
                if(rs.getInt("status_pagamento") == 1)
                    statusPagamento = "Pagato";
                else
                    statusPagamento = "NON Pagato";
                
                String dataPagamento = dateFormat.format(rs.getDate("data_pagamento"));
                String idAtleta = rs.getString("idatleta");
                String idClub = Integer.toString(rs.getInt("idclub"));
                
                //Array di stringhe per inserire i dati nella jtable
                String tbData[]= {idStipendio, valoreStipendio, statusPagamento, dataPagamento, idAtleta, idClub};
                DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiPagamentiJB.getModel();
                //Aggiungiamo ogni stringa dell'array nella jtable
                tblModel.addRow(tbData);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA PAGAMENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SezioneVisualizzaPagamenti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
           
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SezioneVisualizzaPagamenti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SezioneVisualizzaPagamenti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneVisualizzaPagamenti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB2;
    private javax.swing.JButton btnCercaAtletaJB;
    private javax.swing.JButton btnClose;
    private javax.swing.JTextField inputIdAtletaJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable visualizzaDatiPagamentiJB;
    // End of variables declaration//GEN-END:variables
}
