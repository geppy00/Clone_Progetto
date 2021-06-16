
package view;

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

public class SezioneModificaContrattoProcuratore extends javax.swing.JFrame {

    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public SezioneModificaContrattoProcuratore(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(VisualizzaTuttiContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SezioneModificaContrattoProcuratore() {
         
    }

    /*METODI*/
    public void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select atleta.codfiscale, contratto.idsponsor, contratto.idclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, atleta.nome, contratto.numero_contratto from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"';";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String idSponsor = String.valueOf(rs.getString("idsponsor"));
                String idClub = String.valueOf(rs.getString("idclub"));
                String dataInizio = dateFormat.format(rs.getDate("datastart"));
                String dataFine = dateFormat.format(rs.getDate("dataend"));
                String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));
                String nomeAtleta = rs.getString("nome");
                String idContratto = String.valueOf(rs.getInt("numero_contratto"));
                
                String tbDataAtleta[] = {idAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale, nomeAtleta, idContratto};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrttoJT.getModel();
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
    
    
    private void stampaDatiInBaseFiltro() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        
        String opzUser = opzioneFiltroJCB.getSelectedItem().toString();
        System.out.println("OPZIONE USATA="+opzUser);
        
        switch(opzUser) {
            case "Contratti con CLUB":
                sql="select atleta.codfiscale, contratto.idclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, atleta.nome, contratto.numero_contratto from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idsponsor IS NULL;";
                try {
                    connection = new DataAccessObject().connectionToDatabase();
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        String idAtleta = rs.getString("codfiscale");
                        String idSponsor = "/////////////////";
                        String idClub = String.valueOf(rs.getString("idclub"));
                        String dataInizio = dateFormat.format(rs.getDate("datastart"));
                        String dataFine = dateFormat.format(rs.getDate("dataend"));
                        String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));
                        String nomeAtleta = rs.getString("nome");
                        String idContratto = String.valueOf(rs.getInt("numero_contratto"));
                        
                        String tbDataAtleta[] = {idAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale, nomeAtleta, idContratto};
                        DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrttoJT.getModel();
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
                sql = "select atleta.codfiscale, contratto.idsponsor, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, atleta.nome, contratto.numero_contratto from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idclub IS NULL;";
                try {
                    connection = new DataAccessObject().connectionToDatabase();
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        String idAtleta = rs.getString("codfiscale");
                        String idSponsor = String.valueOf(rs.getString("idsponsor"));
                        String idClub = "/////////////////";
                        String dataInizio = dateFormat.format(rs.getDate("datastart"));
                        String dataFine = dateFormat.format(rs.getDate("dataend"));
                        String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));
                        String nomeAtleta = rs.getString("nome");
                        String idContratto = String.valueOf(rs.getInt("numero_contratto"));
                        
                        String tbDataAtleta[] = {idAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale, nomeAtleta, idContratto};
                        DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrttoJT.getModel();
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
    
    public java.sql.Date stringToSqlDate(String sDate) throws Exception {
        
        Date javaDate = new SimpleDateFormat("yyyy-mm-dd").parse(sDate);
        java.sql.Date sqlDate = new java.sql.Date(javaDate.getTime()); //Conversione data da java a sql per inserirla nel database
        
        return sqlDate;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiContrttoJT = new javax.swing.JTable();
        opzioneFiltroJCB = new javax.swing.JComboBox<>();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnRipristinaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatiContrttoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "ID Sponsor", "ID Club", "Data Inizio", "Data Fine", "Valore Contratto", "Nome Atleta", "ID Contratto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiContrttoJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiContrttoJTMouseClicked(evt);
            }
        });
        tblDatiContrttoJT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDatiContrttoJTKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiContrttoJT);

        opzioneFiltroJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratti con CLUB", "Contratti con SPONSOR" }));
        opzioneFiltroJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opzioneFiltroJCBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        btnRipristinaJB.setText("RIPRISTINA");
        btnRipristinaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRipristinaJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTornaIndietroJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRipristinaJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(opzioneFiltroJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(opzioneFiltroJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTornaIndietroJB)
                            .addComponent(btnRipristinaJB))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void opzioneFiltroJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opzioneFiltroJCBActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrttoJT.getModel();
            tblModel.setRowCount(0);
            stampaDatiInBaseFiltro();
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezioneModificaContrattoProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opzioneFiltroJCBActionPerformed

    private void tblDatiContrttoJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiContrttoJTMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            System.out.println("mouse premuto 2 volte");
            evt.consume();
            int row = tblDatiContrttoJT.getSelectedRow();
            int idContratto = Integer.parseInt((String) tblDatiContrttoJT.getValueAt(row, 7));
            System.out.println("ID CONTRATTO="+idContratto);
            
            
        }
    }//GEN-LAST:event_tblDatiContrttoJTMouseClicked

    private void tblDatiContrttoJTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatiContrttoJTKeyPressed

    }//GEN-LAST:event_tblDatiContrttoJTKeyPressed

    private void btnRipristinaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRipristinaJBActionPerformed
        try {
            stampaDatiInBaseFiltro();
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezioneModificaContrattoProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRipristinaJBActionPerformed

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
                new SezioneModificaContrattoProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRipristinaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opzioneFiltroJCB;
    private javax.swing.JTable tblDatiContrttoJT;
    // End of variables declaration//GEN-END:variables
}
