
package view;

import controller.ControllerProcuratore;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;


public class RicercaGuadagniProcuratoreView extends javax.swing.JFrame {

    private String idProcuratore;
    
    /*COSTRUTTORE*/
    public RicercaGuadagniProcuratoreView(String idProcuratore) {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            this.idProcuratore = idProcuratore;
            stampaDatiAtltetaTbl();
        } catch (ExceptionDao ex) {
            Logger.getLogger(RicercaGuadagniProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public RicercaGuadagniProcuratoreView() {
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIntroitoSportivoJT = new javax.swing.JTable();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnRicercaPiuGuadagnoJB = new javax.swing.JButton();
        btnResetJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblIntroitoSportivoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CF Atleta", "Nome", "Cognome", "Stipendio CLUB", "Stipendio SPONSOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblIntroitoSportivoJT);

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        btnRicercaPiuGuadagnoJB.setText("CERCA");
        btnRicercaPiuGuadagnoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRicercaPiuGuadagnoJBActionPerformed(evt);
            }
        });

        btnResetJB.setText("RESET");
        btnResetJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetJBActionPerformed(evt);
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
                        .addComponent(btnRicercaPiuGuadagnoJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnResetJB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(136, 136, 136)
                        .addComponent(btnResetJB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTornaIndietroJB)
                            .addComponent(btnRicercaPiuGuadagnoJB))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
       ProcuratoreView procuratoreView = new ProcuratoreView(this.getIdProcuratore());
       procuratoreView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnRicercaPiuGuadagnoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRicercaPiuGuadagnoJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        try {
            String datiAtletaPiuRemunerativo[] = controllerProcuratore.prendiGuadagnoPiuAlto(getIdProcuratore());
            if(datiAtletaPiuRemunerativo != null) {
                DefaultTableModel tblModel = (DefaultTableModel)tblIntroitoSportivoJT.getModel();
                tblModel.setRowCount(0);
                tblModel.addRow(datiAtletaPiuRemunerativo);
            } 
            else {
                JOptionPane.showMessageDialog(null, "Atleta non trovato");
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(RicercaGuadagniProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRicercaPiuGuadagnoJBActionPerformed

    private void btnResetJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetJBActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel)tblIntroitoSportivoJT.getModel();
            tblModel.setRowCount(0);
            stampaDatiAtltetaTbl();
        } catch (ExceptionDao ex) {
            Logger.getLogger(RicercaGuadagniProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnResetJBActionPerformed

    
    /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }
    
    /*METODI*/
    public void stampaDatiAtltetaTbl() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select atleta.nome, atleta.cognome, atleta.codfiscale, stipendio.val_stipendio from atleta join stipendio ON atleta.codfiscale=stipendio.idatleta WHERE atleta.codprocuratore= '"+this.getIdProcuratore()+"' ORDER BY atleta.nome;";
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String cognomeAtleta = rs.getString("cognome");
                String valoreStipendio = String.valueOf(rs.getDouble("val_stipendio"));
               
                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta, valoreStipendio};
                DefaultTableModel tblModel = (DefaultTableModel)tblIntroitoSportivoJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA STIPENDI FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RicercaGuadagniProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResetJB;
    private javax.swing.JButton btnRicercaPiuGuadagnoJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTable tblIntroitoSportivoJT;
    // End of variables declaration//GEN-END:variables
}
