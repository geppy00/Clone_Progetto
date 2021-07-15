
package view;

import dao.DataAccessObject;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Font;
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
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;
import view.modificaDati.ModificaContrattiProcuratore;

public class ContrattiSponsorProcuratoreView extends javax.swing.JFrame {

    private String idProcuratore;
    
     /*COSTRUTTORE*/
    public ContrattiSponsorProcuratoreView(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        
         tblDatiContrattiSponsorJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblDatiContrattiSponsorJT.getTableHeader().setOpaque(false);
         tblDatiContrattiSponsorJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblDatiContrattiSponsorJT.getTableHeader().setForeground(new Color(255,255,255));
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(ContrattiSponsorProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ContrattiSponsorProcuratoreView() {
        
    }
    
     /*METODI*/
    private void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String sql="select atleta.codfiscale, atleta.nome, atleta.cognome, contratto.idsponsor, sponsor.nomesponsor, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, contratto.numero_contratto from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta join sponsor on contratto.idsponsor=sponsor.idsponsor WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idclub IS NULL;";
        
            try {
                connection = new DataAccessObject().connectionToDatabase();
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idAtleta = rs.getString("codfiscale");
                    String nomeAtleta = rs.getString("nome");
                    String cognome = rs.getString("cognome");
                    String idSponsor = String.valueOf(rs.getString("idsponsor"));
                    String nomeSponsor = rs.getString("nomesponsor");
                    String dataInizio = dateFormat.format(rs.getDate("datastart"));
                    String dataFine = dateFormat.format(rs.getDate("dataend"));
                    String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));
                    String idContratto = String.valueOf(rs.getInt("numero_contratto"));
                        
                    String tbDataAtleta[] = {idAtleta, nomeAtleta, cognome, idSponsor, nomeSponsor, dataInizio, dataFine, valoreContrattuale, idContratto};
                    DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrattiSponsorJT.getModel();
                    tblModel.addRow(tbDataAtleta);
                }
                rs.close();
                pStmt.close();
                connection.close();
            } catch(SQLException e) {
                throw new ExceptionDao("ERRORE RICERCA CONTRATTI FALLITA "+e);
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
        tblDatiContrattiSponsorJT = new javax.swing.JTable();
        jLDataAttuale = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatiContrattiSponsorJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatiContrattiSponsorJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CF Atleta", "Nome Atleta", "Cognome Atleta", "ID Sponsor", "Nome Sponsor", "Data Inizio", "Data Fine", "Valore Contrattuale", "ID Contratto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiContrattiSponsorJT.setFocusable(false);
        tblDatiContrattiSponsorJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiContrattiSponsorJT.getTableHeader().setReorderingAllowed(false);
        tblDatiContrattiSponsorJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiContrattiSponsorJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiContrattiSponsorJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 990, 210));

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");
        jPanel1.add(jLDataAttuale, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, -1, -1));

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, 40));

        btnAnnullaJB.setBackground(new java.awt.Color(11, 58, 151));
        btnAnnullaJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.setFocusPainted(false);
        btnAnnullaJB.setFocusable(false);
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 40, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTIONJ PERFOMED*/
    private void tblDatiContrattiSponsorJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiContrattiSponsorJTMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int row = tblDatiContrattiSponsorJT.getSelectedRow();
            int idContratto = Integer.parseInt((String) tblDatiContrattiSponsorJT.getValueAt(row, 8));
            
            ModificaContrattiProcuratore modificaContrattiProcuratore = new ModificaContrattiProcuratore(this.getIdProcuratore(), idContratto, "SPONSOR");
            modificaContrattiProcuratore.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_tblDatiContrattiSponsorJTMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
         SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

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
                new ContrattiSponsorProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatiContrattiSponsorJT;
    // End of variables declaration//GEN-END:variables
}
