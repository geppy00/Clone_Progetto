
package view;

import dao.DataAccessObject;
import dao.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;
import view.elimina.EliminaContrattoProcuratore;

public class SezioneEliminaContrattoProcuratore extends javax.swing.JFrame {

    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public SezioneEliminaContrattoProcuratore(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezioneEliminaContrattoProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public SezioneEliminaContrattoProcuratore() {
        
    }

    /*METODI*/
    private void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select contratto.numero_contratto, atleta.codfiscale, contratto.idsponsor, contratto.idclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, atleta.nome from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"';";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idContratto = String.valueOf(rs.getInt("numero_contratto"));
                String idAtleta = rs.getString("codfiscale");
                String idSponsor = String.valueOf(rs.getString("idsponsor"));
                String idClub = String.valueOf(rs.getString("idclub"));
                String dataInizio = dateFormat.format(rs.getDate("datastart"));
                String dataFine = dateFormat.format(rs.getDate("dataend"));
                String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));
                String nomeAtleta = rs.getString("nome");
                
                String tbDataAtleta[] = {idContratto, idAtleta, nomeAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrattoJT.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiContrattoJT = new javax.swing.JTable();
        btnTornaIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatiContrattoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Contratto", "Codice Atleta", "Nome Atleta", "ID Sponsor", "ID Club", "Data Inizio", "Data Fine", "Valore"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiContrattoJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiContrattoJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiContrattoJT);

        btnTornaIndietroJB.setText("TORNA INDIETRO");
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
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void tblDatiContrattoJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiContrattoJTMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int row = tblDatiContrattoJT.getSelectedRow(); 
            int idContratto = Integer.parseInt((String) tblDatiContrattoJT.getValueAt(row, 0));
            String idAtleta = (String) tblDatiContrattoJT.getValueAt(row, 1);
            System.out.println("IDATLETA= "+idAtleta);
            
            EliminaContrattoProcuratore eliminaContrattoProcuratore = new EliminaContrattoProcuratore(this.getIdProcuratore(), idContratto, idAtleta);
            eliminaContrattoProcuratore.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_tblDatiContrattoJTMouseClicked

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
                new SezioneEliminaContrattoProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatiContrattoJT;
    // End of variables declaration//GEN-END:variables
}
