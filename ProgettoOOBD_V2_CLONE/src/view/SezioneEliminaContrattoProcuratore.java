
package view;

import convalidazione.MessageError;
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;
import view.elimina.EliminaContrattoProcuratore;

public class SezioneEliminaContrattoProcuratore extends javax.swing.JFrame {

    /*DATI IMPORTANTI*/
    private String idProcuratore;
    private int idContratto;
    private String idAtleta;
    
    /*CONTROLLI*/
    private MessageError messageError = new MessageError();
    
    /*COSTRUTTORI*/
    public SezioneEliminaContrattoProcuratore(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        this.jPanel2.setVisible(false);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        
         tblContrattiClubJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblContrattiClubJT.getTableHeader().setOpaque(false);
         tblContrattiClubJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblContrattiClubJT.getTableHeader().setForeground(new Color(255,255,255));
         
         tblContrattiSponsorJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblContrattiSponsorJT.getTableHeader().setOpaque(false);
         tblContrattiSponsorJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblContrattiSponsorJT.getTableHeader().setForeground(new Color(255,255,255));
        
        try {
            this.stampaDatiTabellaEliContratto();
        } catch (ExceptionDao ex) {
            //Logger.getLogger(SezioneEliminaContrattoProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nERRORE FATALE NON E' STATO POSSIBILE RICAVARE I DATI RIPROVARE", "ERRORE FATALE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Errore Fatale Non E' Stato Possibile Ricavare I dati Riprovare" , jLabel3, jPanel2, btnClose);
            SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
            sezioneGestioneContrattiView.setVisible(true);
            this.setVisible(false);
        }
    }
    
    public SezioneEliminaContrattoProcuratore() {
        
    }

    /*METODI*/
    private void stampaDatiTabellaEliContratto() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select atleta.codfiscale, atleta.nome, club.nomeclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, contratto.numero_contratto from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta join club on contratto.idclub=club.idclub WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idsponsor IS NULL;";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        
        /*CONTRATTI CON CLUB*/
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtletaPreso = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String nomeClub = rs.getString("nomeclub");
                String dataInizio = dateFormat.format(rs.getDate("datastart"));
                String dataFine = dateFormat.format(rs.getDate("dataend"));
                String valore = String.valueOf(rs.getDouble("valore_contrattuale"));
                String idContrattoPreso = String.valueOf(rs.getInt("numero_contratto"));

                String tbDataClub[] = {idAtletaPreso, nomeAtleta, nomeClub, dataInizio, dataFine, valore, idContrattoPreso};
                DefaultTableModel tblModelClub = (DefaultTableModel)tblContrattiClubJT.getModel();
                tblModelClub.addRow(tbDataClub);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA CONTRATTO CLUB FALLITA "+e);
        }

        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
        
         /*CONTRATTI CON SPONSOR*/
        sql = "select atleta.codfiscale, atleta.nome, sponsor.nomesponsor, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, contratto.numero_contratto from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta join sponsor on contratto.idsponsor=sponsor.idsponsor WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idclub IS NULL;"; 
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtletaPreso = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String nomeSponsor = rs.getString("nomesponsor");
                String dataInizio = dateFormat.format(rs.getDate("datastart"));
                String dataFine = dateFormat.format(rs.getDate("dataend"));
                String valore = String.valueOf(rs.getDouble("valore_contrattuale"));
                String idContrattoPreso = String.valueOf(rs.getInt("numero_contratto"));

                String tbDataSponsor[] = {idAtletaPreso, nomeAtleta, nomeSponsor, dataInizio, dataFine, valore, idContrattoPreso};
                DefaultTableModel tblModelSponsor = (DefaultTableModel)tblContrattiSponsorJT.getModel();
                tblModelSponsor.addRow(tbDataSponsor);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA CONTRATTO SPONSOR FALLITA "+e);
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
        tblContrattiClubJT = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContrattiSponsorJT = new javax.swing.JTable();
        jLDataAttuale = new javax.swing.JLabel();
        btnLogoutJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnClose1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblContrattiClubJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblContrattiClubJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CF Atleta", "Nome Atleta", "Club", "Data Inizio", "Data Fine", "Valore ", "ID Contratto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContrattiClubJT.setFocusable(false);
        tblContrattiClubJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblContrattiClubJT.setShowVerticalLines(false);
        tblContrattiClubJT.getTableHeader().setReorderingAllowed(false);
        tblContrattiClubJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContrattiClubJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContrattiClubJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 720, 150));

        tblContrattiSponsorJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblContrattiSponsorJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CF Atleta", "Nome Atleta", "Sponsor", "Data Inizio", "Data Fine", "Valore", "ID Contratto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContrattiSponsorJT.setFocusable(false);
        tblContrattiSponsorJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblContrattiSponsorJT.setShowVerticalLines(false);
        tblContrattiSponsorJT.getTableHeader().setReorderingAllowed(false);
        tblContrattiSponsorJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContrattiSponsorJTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblContrattiSponsorJT);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 720, 170));

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");
        jPanel1.add(jLDataAttuale, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        btnLogoutJB.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnLogoutJB.setBorder(null);
        btnLogoutJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB.setFocusPainted(false);
        btnLogoutJB.setFocusable(false);
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 5, -1, -1));

        jPanel2.setBackground(new java.awt.Color(46, 204, 113));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_26px.png"))); // NOI18N

        btnClose.setBackground(new java.awt.Color(46, 204, 113));
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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 730, 30));

        btnClose1.setBackground(new java.awt.Color(11, 58, 151));
        btnClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnClose1.setBorder(null);
        btnClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose1.setFocusPainted(false);
        btnClose1.setFocusable(false);
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblContrattiClubJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContrattiClubJTMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int row = tblContrattiClubJT.getSelectedRow();
            this.setIdContratto(Integer.parseInt((String) tblContrattiClubJT.getValueAt(row, 6)));
            this.setIdAtleta((String) tblContrattiSponsorJT.getValueAt(row, 0));
            
            EliminaContrattoProcuratore eliminaContrattoProcuratore = new EliminaContrattoProcuratore(this.getIdProcuratore(), this.getIdContratto(), this.getIdAtleta());
            eliminaContrattoProcuratore.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_tblContrattiClubJTMouseClicked

    private void tblContrattiSponsorJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContrattiSponsorJTMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int row = tblContrattiSponsorJT.getSelectedRow();
            this.setIdContratto(Integer.parseInt((String) tblContrattiSponsorJT.getValueAt(row, 6)));
            this.setIdAtleta((String) tblContrattiSponsorJT.getValueAt(row, 0));
            
            EliminaContrattoProcuratore eliminaContrattoProcuratore = new EliminaContrattoProcuratore(this.getIdProcuratore(), this.getIdContratto(), this.getIdAtleta());
            eliminaContrattoProcuratore.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_tblContrattiSponsorJTMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.jPanel2.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnClose1ActionPerformed

      /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }
    
    public String getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }

    public int getIdContratto() {
        return idContratto;
    }

    public void setIdContratto(int idContratto) {
        this.idContratto = idContratto;
    }


    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneEliminaContrattoProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblContrattiClubJT;
    private javax.swing.JTable tblContrattiSponsorJT;
    // End of variables declaration//GEN-END:variables
}
