
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;

public class ElencoPartecipantiSponsor extends javax.swing.JFrame {

    private String idSponsor;
    
    /*COSTRUTTORE*/
    public ElencoPartecipantiSponsor(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        
         tblDatiPartecipantiJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblDatiPartecipantiJT.getTableHeader().setOpaque(false);
         tblDatiPartecipantiJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblDatiPartecipantiJT.getTableHeader().setForeground(new Color(255,255,255));
         tblDatiPartecipantiJT.setRowHeight(25);
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(ElencoPartecipantiSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ElencoPartecipantiSponsor() {}
 
    /*METODI*/
    private void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "SELECT invitatti.idivitati, invitatti.idatleta, atleta.nome, evento.idevento, evento.titolo, evento.data_inizioevento, evento.data_fineevento FROM invitatti JOIN evento ON invitatti.idevento=evento.idevento JOIN atleta ON invitatti.idatleta=atleta.codfiscale WHERE invitatti.status_presenza=1 AND evento.idsponsor="+this.getIdSponsor()+";";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
 
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idIvitati = String.valueOf(rs.getInt("idivitati"));
                String idAtleta = rs.getString("idatleta");
                String nome = rs.getString("nome");
                String idEvento = String.valueOf(rs.getInt("idevento"));
                String titolo = rs.getString("titolo");
                String data_inizioevento = dateFormat.format(rs.getDate("data_inizioevento"));
                String data_fineevento = dateFormat.format(rs.getDate("data_fineevento"));
                
                String tbDataAtleta[] = {idIvitati, idAtleta, nome, idEvento, titolo, data_inizioevento, data_fineevento};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiPartecipantiJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA PARTECIPANTI FALLITA "+e);
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
        tblDatiPartecipantiJT = new javax.swing.JTable();
        btnTornaIndietroJB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatiPartecipantiJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Partecipante", "CF Atleta", "Partecipante", "ID Evento", "Evento", "Data Inizo", "Data Fine"
            }
        ));
        tblDatiPartecipantiJT.setFocusable(false);
        tblDatiPartecipantiJT.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblDatiPartecipantiJT.setRequestFocusEnabled(false);
        tblDatiPartecipantiJT.setRowHeight(25);
        tblDatiPartecipantiJT.setRowMargin(0);
        tblDatiPartecipantiJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiPartecipantiJT.setShowVerticalLines(false);
        tblDatiPartecipantiJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDatiPartecipantiJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 740, 280));

        btnTornaIndietroJB.setBackground(new java.awt.Color(255, 255, 255));
        btnTornaIndietroJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px.png"))); // NOI18N
        btnTornaIndietroJB.setBorder(null);
        btnTornaIndietroJB.setFocusable(false);
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 40, -1));

        jPanel3.setBackground(new java.awt.Color(46, 117, 233));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DEI PARTICIPANTI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SezioneEventiView sezioneEventiView = new SezioneEventiView(this.getIdSponsor());
        sezioneEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    /*GET AND SET*/
    public String getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(String idSponsor) {
        this.idSponsor = idSponsor;
    }
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElencoPartecipantiSponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatiPartecipantiJT;
    // End of variables declaration//GEN-END:variables
}
