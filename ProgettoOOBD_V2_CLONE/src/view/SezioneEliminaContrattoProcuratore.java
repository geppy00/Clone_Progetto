
package view;

import dao.DataAccessObject;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    
    /*COSTRUTTORI*/
    public SezioneEliminaContrattoProcuratore(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        try {
            this.stampaDatiTabella();
        } catch (ExceptionDao ex) {
            //Logger.getLogger(SezioneEliminaContrattoProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nERRORE FATALE NON E' STATO POSSIBILE RICAVARE I DATI RIPROVARE", "ERRORE FATALE", JOptionPane.ERROR_MESSAGE);
            SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
            sezioneGestioneContrattiView.setVisible(true);
            this.setVisible(false);
        }
    }
    
    public SezioneEliminaContrattoProcuratore() {
        
    }

    /*METODI*/
    private void stampaDatiTabella() throws ExceptionDao {
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

        btnTornaIndietroJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContrattiClubJT = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContrattiSponsorJT = new javax.swing.JTable();
        contrattiConClubJL = new javax.swing.JLabel();
        contrattiConSponsorJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

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
        tblContrattiClubJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContrattiClubJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContrattiClubJT);

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
        tblContrattiSponsorJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContrattiSponsorJTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblContrattiSponsorJT);

        contrattiConClubJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contrattiConClubJL.setText("CONTRATTI CON CLUB");

        contrattiConSponsorJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contrattiConSponsorJL.setText("CONTRATTI CON SPONSOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(contrattiConClubJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(contrattiConSponsorJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrattiConClubJL)
                    .addComponent(contrattiConSponsorJL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

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
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel contrattiConClubJL;
    private javax.swing.JLabel contrattiConSponsorJL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblContrattiClubJT;
    private javax.swing.JTable tblContrattiSponsorJT;
    // End of variables declaration//GEN-END:variables
}
