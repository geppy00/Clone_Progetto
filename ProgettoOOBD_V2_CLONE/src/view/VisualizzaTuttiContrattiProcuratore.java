
package view;

import controller.ControllerProcuratore;
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
import view.SezioneGestioneContrattiView;


public class VisualizzaTuttiContrattiProcuratore extends javax.swing.JFrame {



    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public VisualizzaTuttiContrattiProcuratore(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(VisualizzaTuttiContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public VisualizzaTuttiContrattiProcuratore() {
        
    }

    /*METODI*/
    public void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select atleta.nome, contratto.idsponsor, contratto.idclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"';";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String nomeAtleta = rs.getString("nome");
                String idSponsor = String.valueOf(rs.getString("idsponsor"));
                String idClub = String.valueOf(rs.getString("idclub"));
                String dataInizio = dateFormat.format(rs.getDate("datastart"));
                String dataFine = dateFormat.format(rs.getDate("dataend"));
                String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));
                
                String tbDataAtleta[] = {nomeAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale};
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
    
    
    public void stampaDatiInBaseFiltro() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        
        String opzUser = opzProcuratoreFiltroJCB.getSelectedItem().toString();
        System.out.println("OPZIONE USATA="+opzUser);
        
        switch(opzUser) {
            case "Contratti con CLUB":
                sql="select atleta.nome, contratto.idclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idsponsor IS NULL;";
                try {
                    connection = new DataAccessObject().connectionToDatabase();
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        String nomeAtleta = rs.getString("nome");
                        String idSponsor = "/////////////////";
                        String idClub = String.valueOf(rs.getString("idclub"));
                        String dataInizio = dateFormat.format(rs.getDate("datastart"));
                        String dataFine = dateFormat.format(rs.getDate("dataend"));
                        String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));

                        String tbDataAtleta[] = {nomeAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale};
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
            break;
            
            case "Contratti con SPONSOR":
                sql = "select atleta.nome, contratto.idsponsor, contratto.datastart, contratto.dataend, contratto.valore_contrattuale from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idclub IS NULL;";
                try {
                    connection = new DataAccessObject().connectionToDatabase();
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        String nomeAtleta = rs.getString("nome");
                        String idSponsor = String.valueOf(rs.getString("idsponsor"));
                        String idClub = "/////////////////";
                        String dataInizio = dateFormat.format(rs.getDate("datastart"));
                        String dataFine = dateFormat.format(rs.getDate("dataend"));
                        String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));

                        String tbDataAtleta[] = {nomeAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale};
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
            break;
            
            case "Senza Contratti":
                sql = "select atleta.nome from atleta JOIN contratto ON atleta.codfiscale<>contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"';";
                try {
                    connection = new DataAccessObject().connectionToDatabase();
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        String nomeAtleta = rs.getString("nome");
                        String idSponsor = "/////////////////";
                        String idClub = "/////////////////";
                        String dataInizio = "/////////////////";
                        String dataFine = "/////////////////";
                        String valoreContrattuale = "/////////////////";

                        String tbDataAtleta[] = {nomeAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale};
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
            break;
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiContrattoJT = new javax.swing.JTable();
        opzProcuratoreFiltroJCB = new javax.swing.JComboBox<>();
        btnAnnullaJB = new javax.swing.JButton();
        btnRpristinaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatiContrattoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ATLETA", "ID Sponsor", "ID Club", "Anno Stipulazione", "Anno fine", "Valore contrattuale"
            }
        ));
        jScrollPane1.setViewportView(tblDatiContrattoJT);

        opzProcuratoreFiltroJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratti con CLUB", "Contratti con SPONSOR", "Senza Contratti" }));
        opzProcuratoreFiltroJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opzProcuratoreFiltroJCBActionPerformed(evt);
            }
        });

        btnAnnullaJB.setText("TORNA INDIETRO");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        btnRpristinaJB.setText("RIPRISTINA");
        btnRpristinaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRpristinaJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAnnullaJB)
                        .addGap(108, 108, 108)
                        .addComponent(btnRpristinaJB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(opzProcuratoreFiltroJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(opzProcuratoreFiltroJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnnullaJB)
                            .addComponent(btnRpristinaJB))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void opzProcuratoreFiltroJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opzProcuratoreFiltroJCBActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrattoJT.getModel();
            tblModel.setRowCount(0);
            stampaDatiInBaseFiltro();
        } catch (ExceptionDao ex) {
            Logger.getLogger(VisualizzaTuttiContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opzProcuratoreFiltroJCBActionPerformed

    private void btnRpristinaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRpristinaJBActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrattoJT.getModel();
            tblModel.setRowCount(0);
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(VisualizzaTuttiContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRpristinaJBActionPerformed

    
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
                new VisualizzaTuttiContrattiProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnRpristinaJB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opzProcuratoreFiltroJCB;
    private javax.swing.JTable tblDatiContrattoJT;
    // End of variables declaration//GEN-END:variables
}
