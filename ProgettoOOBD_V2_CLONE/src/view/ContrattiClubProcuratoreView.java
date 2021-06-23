
package view;

import dao.DataAccessObject;
import dao.ExceptionDao;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;
import view.SezioneGestioneContrattiView;
import view.VisualizzaTuttiContrattiProcuratore;
import view.modificaDati.ModificaContrattiProcuratore;


public class ContrattiClubProcuratoreView extends javax.swing.JFrame {

    private String idProcuratore;
    
    /*COSTRUTTORE*/
    public ContrattiClubProcuratoreView(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(ContrattiClubProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ContrattiClubProcuratoreView() {
        
    }


    /*METODI*/
    private void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String sql="select atleta.codfiscale, atleta.nome, atleta.cognome, contratto.idclub, club.nomeclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, contratto.numero_contratto from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta join club on contratto.idclub=club.idclub WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idsponsor IS NULL;";
        
            try {
                connection = new DataAccessObject().connectionToDatabase();
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idAtleta = rs.getString("codfiscale");
                    String nomeAtleta = rs.getString("nome");
                    String cognome = rs.getString("cognome");
                    String idClub = String.valueOf(rs.getString("idclub"));
                    String nomeClub = rs.getString("nomeclub");
                    String dataInizio = dateFormat.format(rs.getDate("datastart"));
                    String dataFine = dateFormat.format(rs.getDate("dataend"));
                    String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));
                    String idContratto = String.valueOf(rs.getInt("numero_contratto"));
                        
                    String tbDataAtleta[] = {idAtleta, nomeAtleta, cognome, idClub, nomeClub, dataInizio, dataFine, valoreContrattuale, idContratto};
                    DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrattiClubJT.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiContrattiClubJT = new javax.swing.JTable();
        btnTornaIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatiContrattiClubJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CF Atleta", "Nome Atleta", "Cognome Atleta", "ID Club", "Nome Club", "Data Inizio", "Data Fine", "Valore Contrattuale", "ID Contratto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiContrattiClubJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiContrattiClubJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiContrattiClubJT);

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.setToolTipText("");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(355, Short.MAX_VALUE)
                .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void tblDatiContrattiClubJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiContrattiClubJTMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int row = tblDatiContrattiClubJT.getSelectedRow();
            int idContratto = Integer.parseInt((String) tblDatiContrattiClubJT.getValueAt(row, 8));
            
            ModificaContrattiProcuratore modificaContrattiProcuratore = new ModificaContrattiProcuratore(this.getIdProcuratore(), idContratto, "CLUB");
            modificaContrattiProcuratore.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_tblDatiContrattiClubJTMouseClicked

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

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
                new ContrattiClubProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatiContrattiClubJT;
    // End of variables declaration//GEN-END:variables
}
