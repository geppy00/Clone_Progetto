
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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;

public class PercentualiGuadagnoProcuratoreView extends javax.swing.JFrame {

    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public PercentualiGuadagnoProcuratoreView(String idProcuratore) {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            this.idProcuratore = idProcuratore;
           
            stampaDatiAtltetaTbl();
        } catch (ExceptionDao ex) {
            Logger.getLogger(PercentualiGuadagnoProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public PercentualiGuadagnoProcuratoreView() {
         
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiAtletiJT = new javax.swing.JTable();
        btnAnnullaJB = new javax.swing.JButton();
        valContrattoJL = new javax.swing.JLabel();
        montanteContrattoJTF = new javax.swing.JTextField();
        guadagnoJL = new javax.swing.JLabel();
        guadagnoJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatiAtletiJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "Nome", "Cognome", "Data Nascita", "Club"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiAtletiJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiAtletiJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiAtletiJT);

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        valContrattoJL.setText("Montante Contrattuale");

        montanteContrattoJTF.setEditable(false);

        guadagnoJL.setText("Guadagno");

        guadagnoJTF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnnullaJB)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(valContrattoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(montanteContrattoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(guadagnoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(guadagnoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 251, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montanteContrattoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valContrattoJL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guadagnoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guadagnoJL))
                .addGap(39, 39, 39)
                .addComponent(btnAnnullaJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*EVENTI*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        ProcuratoreView procuratoreView = new ProcuratoreView(this.getIdProcuratore());
        procuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed


    private void tblDatiAtletiJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiAtletiJTMouseClicked
        //String idAtleta = (String) tblDatiAtletiJT.getModel().getValueAt(evt.getX(), evt.getY());
        int row = tblDatiAtletiJT.getSelectedRow();
        int column = tblDatiAtletiJT.getSelectedColumn();
        String idAtleta = (String) tblDatiAtletiJT.getValueAt(row, 0);
        System.out.println("idAtleta="+idAtleta);
        
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        try {
            double valoreContrattuale = controllerProcuratore.prendiValoreContrattuale(idAtleta);
            if(valoreContrattuale != -1) {
                montanteContrattoJTF.setText(String.valueOf(valoreContrattuale));
                double guadagnoProcuratore = (3*valoreContrattuale)/100;
                guadagnoJTF.setText(String.valueOf(guadagnoProcuratore));
            }
            else {
                montanteContrattoJTF.setText(" ");
                guadagnoJTF.setText(" ");
                JOptionPane.showMessageDialog(null, "!! ATLETA SENZA CONTRATTO !!");
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(PercentualiGuadagnoProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblDatiAtletiJTMouseClicked


    /*METODI*/
    public void stampaDatiAtltetaTbl() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "SELECT atleta.nome, atleta.cognome, atleta.datanascita, atleta.codfiscale, club.nomeclub from atleta JOIN club ON atleta.codclub=club.idclub WHERE atleta.codprocuratore= '"+this.getIdProcuratore()+"' ORDER BY atleta.nome;";
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        System.out.println("ID PROC="+this.getIdProcuratore());
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String cognomeAtleta = rs.getString("cognome");
                String dataPagamento = dateFormat.format(rs.getDate("datanascita"));
                String nomeClub = rs.getString("nomeclub");
               
                
                /*int idClub = rs.getInt("codclub");
                String nomeClub = controllerProcuratore.cercaClub(idClub);*/
                
                System.out.println("NOME CLUB="+nomeClub);
                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta, dataPagamento, nomeClub};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiAtletiJT.getModel();
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
                new PercentualiGuadagnoProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JLabel guadagnoJL;
    private javax.swing.JTextField guadagnoJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField montanteContrattoJTF;
    private javax.swing.JTable tblDatiAtletiJT;
    private javax.swing.JLabel valContrattoJL;
    // End of variables declaration//GEN-END:variables
}
