
package view.elimina;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Font;
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
import model.Evento;
import model.Sponsor;
import refactorCode.FinallyException;
import view.SezioneEventiView;

public class EliminaEvento extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private String idSponsor;
    private int idEvento;
    private ArrayList<Evento> datiEvento = new ArrayList<Evento>();

    /*COSTRUTTORI*/
    public EliminaEvento(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        jPMessage.setVisible(false);
        
         tblDatiEventoJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblDatiEventoJT.getTableHeader().setOpaque(false);
         tblDatiEventoJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblDatiEventoJT.getTableHeader().setForeground(new Color(255,255,255));
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(EliminaEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public EliminaEvento() {
       
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiEventoJT = new javax.swing.JTable();
        btnCercaNomeJB = new javax.swing.JButton();
        inputNomeEventoJTF = new javax.swing.JTextField();
        inputDataEventoJDC = new com.toedter.calendar.JDateChooser();
        btnCercaDataJB = new javax.swing.JButton();
        nomeJL = new javax.swing.JLabel();
        dataJL = new javax.swing.JLabel();
        btnRispristinaJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(11, 58, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatiEventoJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatiEventoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Evento", "Nome", "Indirizzo", "Data Evento", "Ora Inizio", "Data Fine ", "Ora Fine", "Valore Gettone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiEventoJT.setFocusable(false);
        tblDatiEventoJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiEventoJT.setShowVerticalLines(false);
        tblDatiEventoJT.getTableHeader().setReorderingAllowed(false);
        tblDatiEventoJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiEventoJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiEventoJT);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 690, 230));

        btnCercaNomeJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaNomeJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaNomeJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaNomeJB.setText("Cerca");
        btnCercaNomeJB.setBorder(null);
        btnCercaNomeJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaNomeJB.setFocusPainted(false);
        btnCercaNomeJB.setFocusable(false);
        btnCercaNomeJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaNomeJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnCercaNomeJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 100, 30));

        inputNomeEventoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeEventoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeEventoJTF.setForeground(new java.awt.Color(255, 255, 255));
        inputNomeEventoJTF.setBorder(null);
        jPanel2.add(inputNomeEventoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 300, 31));
        jPanel2.add(inputDataEventoJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 300, 30));

        btnCercaDataJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaDataJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaDataJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaDataJB.setText("Cerca");
        btnCercaDataJB.setBorder(null);
        btnCercaDataJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaDataJB.setFocusPainted(false);
        btnCercaDataJB.setFocusable(false);
        btnCercaDataJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaDataJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnCercaDataJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 100, 30));

        nomeJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nomeJL.setForeground(new java.awt.Color(255, 255, 255));
        nomeJL.setText("Nome Evento");
        jPanel2.add(nomeJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        dataJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dataJL.setForeground(new java.awt.Color(255, 255, 255));
        dataJL.setText("Data Evento");
        jPanel2.add(dataJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        btnRispristinaJB.setBackground(new java.awt.Color(11, 58, 151));
        btnRispristinaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRispristinaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnRispristinaJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_refresh_32px.png"))); // NOI18N
        btnRispristinaJB.setActionCommand("Ripristina");
        btnRispristinaJB.setBorder(null);
        btnRispristinaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRispristinaJB.setFocusPainted(false);
        btnRispristinaJB.setFocusable(false);
        btnRispristinaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRispristinaJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnRispristinaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 50, -1));

        btnTornaIndietroJB.setBackground(new java.awt.Color(231, 76, 60));
        btnTornaIndietroJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnTornaIndietroJB.setForeground(new java.awt.Color(255, 255, 255));
        btnTornaIndietroJB.setText("Anulla");
        btnTornaIndietroJB.setToolTipText("");
        btnTornaIndietroJB.setBorder(null);
        btnTornaIndietroJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTornaIndietroJB.setFocusPainted(false);
        btnTornaIndietroJB.setFocusable(false);
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });
        jPanel2.add(btnTornaIndietroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 30));

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
        jPanel2.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, -1, 40));

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
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
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

        jPanel2.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 610, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*METODI*/
    private void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select * from evento Where idsponsor ="+this.getIdSponsor()+";";
        String descrizione = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm:ss"); 
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idEvento = String.valueOf(rs.getInt("idevento"));
                String titolo = rs.getString("titolo");
                String luogoEvento = rs.getString("luogoevento");
                String dataInizio = dateFormat.format(rs.getDate("data_inizioevento"));
                String oraInizio = localDateFormat.format(rs.getTime("ora_inizio_evento"));
                String dataFine = dateFormat.format(rs.getDate("data_fineevento"));
                String oraFine = localDateFormat.format(rs.getTime("ora_fine_evento"));
                String gettoneValue = String.valueOf(rs.getDouble("gettonevalue"));
                
                String tbDataAtleta[] = {idEvento, titolo, luogoEvento, dataInizio, oraInizio, dataFine, oraFine, gettoneValue};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventoJT.getModel();
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
    
    /*ACTION PERFOMED*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SezioneEventiView sezioneEventiView = new SezioneEventiView(this.getIdSponsor());
        sezioneEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnCercaNomeJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaNomeJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        String nomeEvento = inputNomeEventoJTF.getText();
        
        if(controlloConvalidazione.controlloEliminaEventoNome(nomeEvento) == true) {
            try {
                datiEvento = controllerSponsor.cercaNomeEvento(nomeEvento, Integer.parseInt(this.getIdSponsor()));
                if(datiEvento.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "EVENTO CON NOME "+nomeEvento+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "✓ EVENTO CON NOME "+nomeEvento+" TROVATO", "TROVATO", JOptionPane.INFORMATION_MESSAGE);
                    DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventoJT.getModel();
                    tblModel.setRowCount(0);
                    datiEvento.forEach((Evento evento) -> {
                        tblModel.addRow(new Object[]{
                            evento.getIdEvento(),
                            evento.getTitolo(),
                            evento.getLuogoEvento(),
                            evento.getDataInizio(),
                            evento.getOraInizio(),
                            evento.getDataFine(),
                            evento.getOraFine(),
                            evento.getGettoneValue(),
                        });
                        tblDatiEventoJT.setModel(tblModel);
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(EliminaEvento.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL NOME DELL'EVENTO DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCercaNomeJBActionPerformed

    private void btnRispristinaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRispristinaJBActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventoJT.getModel();
            tblModel.setRowCount(0);
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(EliminaEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRispristinaJBActionPerformed

    private void btnCercaDataJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaDataJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        java.sql.Date dataEvento = null;
        try{
            dataEvento = new java.sql.Date(inputDataEventoJDC.getDate().getTime());
        }catch(NullPointerException npe) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE UNA DATA VALIDA DA CERCARE", "WARNING", JOptionPane.WARNING_MESSAGE);
        }        
        
        
        if(controlloConvalidazione.controlloEliminaEventoData(String.valueOf(dataEvento)) == true) {
            try {
                datiEvento = controllerSponsor.cercaDataEvento(dataEvento, Integer.parseInt(this.getIdSponsor()));
                if(datiEvento.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "EVENTO CON DATA "+dataEvento+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "✓ EVENTO CON DATA "+dataEvento+" TROVATO", "TROVATO", JOptionPane.INFORMATION_MESSAGE);
                    DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventoJT.getModel();
                    tblModel.setRowCount(0);
                    datiEvento.forEach((Evento evento) -> {
                        tblModel.addRow(new Object[]{
                            evento.getIdEvento(),
                            evento.getTitolo(),
                            evento.getLuogoEvento(),
                            evento.getDataInizio(),
                            evento.getOraInizio(),
                            evento.getDataFine(),
                            evento.getOraFine(),
                        });
                        tblDatiEventoJT.setModel(tblModel);
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(EliminaEvento.class.getName()).log(Level.SEVERE, null, ex);
            } catch(NullPointerException nex){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nNON E' STATO POSSIBILE STAMPARE I DATI PERCHE' LA DATA INSERITA NON E' VALIDA", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LA DATA DELL'EVENTO DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCercaDataJBActionPerformed

    private void tblDatiEventoJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiEventoJTMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int row = tblDatiEventoJT.getSelectedRow();
            this.setIdEvento(Integer.parseInt((String) tblDatiEventoJT.getValueAt(row, 0)));
            
            ConfermaEliminazioneEvento confermaEliminazioneEvento = new ConfermaEliminazioneEvento(this.getIdSponsor(), this.getIdEvento());   
            confermaEliminazioneEvento.setVisible(true);
        }
    }//GEN-LAST:event_tblDatiEventoJTMouseClicked

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed


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
                new EliminaEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCercaDataJB;
    private javax.swing.JButton btnCercaNomeJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnRispristinaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel dataJL;
    private javax.swing.JLabel errorMessage;
    private com.toedter.calendar.JDateChooser inputDataEventoJDC;
    private javax.swing.JTextField inputNomeEventoJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JTable tblDatiEventoJT;
    // End of variables declaration//GEN-END:variables
}
