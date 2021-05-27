
package view.modificaDati;

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
import view.VisualizzaTuttiContrattiProcuratore;

public class ModificaContrattiProcuratore extends javax.swing.JFrame {

    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public ModificaContrattiProcuratore(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(VisualizzaTuttiContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ModificaContrattiProcuratore() {
         
    }

    /*METODI*/
    public void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select atleta.codfiscale, contratto.idsponsor, contratto.idclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, atleta.nome from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"';";
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
                
                String tbDataAtleta[] = {idAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale, nomeAtleta};
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
    
    
    public void stampaDatiInBaseFiltro() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        
        String opzUser = opzioneFiltroJCB.getSelectedItem().toString();
        System.out.println("OPZIONE USATA="+opzUser);
        
        switch(opzUser) {
            case "Contratti con CLUB":
                sql="select atleta.codfiscale, contratto.idclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, atleta.nome from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idsponsor IS NULL;";
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
                        
                        String tbDataAtleta[] = {idAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale, nomeAtleta};
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
                sql = "select atleta.codfiscale, contratto.idsponsor, contratto.datastart, contratto.dataend, contratto.valore_contrattuale, atleta.nome from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idclub IS NULL;";
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
                        
                        String tbDataAtleta[] = {idAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale, nomeAtleta};
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
                "ID Atleta", "ID Sponsor", "ID Club", "Data Inizio", "Data Fine", "Valore Contratto", "Nome Atleta"
            }
        ));
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

        btnRipristinaJB.setText("RIPRISTINA");

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
            Logger.getLogger(ModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opzioneFiltroJCBActionPerformed

    private void tblDatiContrttoJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiContrttoJTMouseClicked
        /*int row = tblDatiContrttoJT.getSelectedRow();
        
        String idAtleta = (String) tblDatiContrttoJT.getValueAt(row, 0);
        
        int idSponsor;
        if(tblDatiContrttoJT.getValueAt(row, 1).equals("null"))
            idSponsor = -1;
        else
            idSponsor = Integer.parseInt((String) tblDatiContrttoJT.getValueAt(row, 1));
        
        int idClub;
        if(tblDatiContrttoJT.getValueAt(row, 2).equals("null"))
            idClub = -1;
        else
            idClub = Integer.parseInt((String) tblDatiContrttoJT.getValueAt(row, 2));
        
        //java.sql.Date dataInizio = (java.sql.Date) tblDatiContrttoJT.getValueAt(row, 3);
        //java.sql.Date dataFine = (java.sql.Date) tblDatiContrttoJT.getValueAt(row, 4);
        
        java.sql.Date dataInizio = null;
        java.sql.Date dataFine = null;
        
        try {
            dataInizio = stringToSqlDate((String) tblDatiContrttoJT.getValueAt(row, 3));
            dataFine = stringToSqlDate((String) tblDatiContrttoJT.getValueAt(row, 4));
        } catch (Exception ex) {
            Logger.getLogger(ModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        float valContratto = Float.parseFloat((String) tblDatiContrttoJT.getValueAt(row, 5));
        
        ConfermaModificaContrattiProcuratore confermaModificaContrattiProcuratore = new ConfermaModificaContrattiProcuratore(this.getIdProcuratore(), idAtleta, idSponsor, idClub, dataInizio, dataFine, valContratto);
        confermaModificaContrattiProcuratore.setVisible(true);*/
    }//GEN-LAST:event_tblDatiContrttoJTMouseClicked

    private void tblDatiContrttoJTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatiContrttoJTKeyPressed
        int row = tblDatiContrttoJT.getSelectedRow();
        
        String idAtleta = (String) tblDatiContrttoJT.getValueAt(row, 0);
        
        int idSponsor;
        if(tblDatiContrttoJT.getValueAt(row, 1).equals("null"))
            idSponsor = -1;
        else
            idSponsor = Integer.parseInt((String) tblDatiContrttoJT.getValueAt(row, 1));
        
        int idClub;
        if(tblDatiContrttoJT.getValueAt(row, 2).equals("null"))
            idClub = -1;
        else
            idClub = Integer.parseInt((String) tblDatiContrttoJT.getValueAt(row, 2));
        
        //java.sql.Date dataInizio = (java.sql.Date) tblDatiContrttoJT.getValueAt(row, 3);
        //java.sql.Date dataFine = (java.sql.Date) tblDatiContrttoJT.getValueAt(row, 4);
        
        java.sql.Date dataInizio = null;
        java.sql.Date dataFine = null;
        
        try {
            dataInizio = stringToSqlDate((String) tblDatiContrttoJT.getValueAt(row, 3));
            dataFine = stringToSqlDate((String) tblDatiContrttoJT.getValueAt(row, 4));
        } catch (Exception ex) {
            Logger.getLogger(ModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        float valContratto = Float.parseFloat((String) tblDatiContrttoJT.getValueAt(row, 5));
        
        ConfermaModificaContrattiProcuratore confermaModificaContrattiProcuratore = new ConfermaModificaContrattiProcuratore(this.getIdProcuratore(), idAtleta, idSponsor, idClub, dataInizio, dataFine, valContratto);
        confermaModificaContrattiProcuratore.setVisible(true);
    }//GEN-LAST:event_tblDatiContrttoJTKeyPressed

    
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
                new ModificaContrattiProcuratore().setVisible(true);
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
