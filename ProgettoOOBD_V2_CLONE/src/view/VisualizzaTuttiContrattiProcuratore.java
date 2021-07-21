
package view;

import controller.ControllerProcuratore;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
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
import javax.swing.table.TableColumn;
import refactorCode.FinallyException;
import view.SezioneGestioneContrattiView;


public class VisualizzaTuttiContrattiProcuratore extends javax.swing.JFrame {



    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public VisualizzaTuttiContrattiProcuratore(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        
        
         tblContrattiClubJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblContrattiClubJT.getTableHeader().setOpaque(false);
         tblContrattiClubJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblContrattiClubJT.getTableHeader().setForeground(new Color(255,255,255));
         
         tblContrattiSponsorJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblContrattiSponsorJT.getTableHeader().setOpaque(false);
         tblContrattiSponsorJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblContrattiSponsorJT.getTableHeader().setForeground(new Color(255,255,255));
         
         tblNessunContrattoJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblNessunContrattoJT.getTableHeader().setOpaque(false);
         tblNessunContrattoJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblNessunContrattoJT.getTableHeader().setForeground(new Color(255,255,255));
        
        try { 
            stampaTuttiContratti();
        } catch (ExceptionDao ex) {
            Logger.getLogger(VisualizzaTuttiContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public VisualizzaTuttiContrattiProcuratore() {
        
    }

    /*METODI*/
    private void stampaTuttiContratti() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select atleta.codfiscale, atleta.nome, club.nomeclub, contratto.datastart, contratto.dataend from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta join club on contratto.idclub=club.idclub WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idsponsor IS NULL;";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        
        /*CONTRATTI CON CLUB*/
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String nomeClub = rs.getString("nomeclub");
                String dataInizio = dateFormat.format(rs.getDate("datastart"));
                String dataFine = dateFormat.format(rs.getDate("dataend"));

                String tbDataAtleta[] = {idAtleta, nomeAtleta, nomeClub, dataInizio, dataFine};
                DefaultTableModel tblModel = (DefaultTableModel)tblContrattiClubJT.getModel();
                tblModel.addRow(tbDataAtleta);
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
        sql = "select atleta.codfiscale, atleta.nome, sponsor.nomesponsor, contratto.datastart, contratto.dataend from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta join sponsor on contratto.idsponsor=sponsor.idsponsor WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idclub IS NULL;"; 
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String nomeSponsor = rs.getString("nomesponsor");
                String dataInizio = dateFormat.format(rs.getDate("datastart"));
                String dataFine = dateFormat.format(rs.getDate("dataend"));

                String tbDataAtleta[] = {idAtleta, nomeAtleta, nomeSponsor, dataInizio, dataFine};
                DefaultTableModel tblModel = (DefaultTableModel)tblContrattiSponsorJT.getModel();
                tblModel.addRow(tbDataAtleta);
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
        
         /*NESSUN CONTRATTO*/
        sql = "select atleta.codfiscale, atleta.nome, atleta.cognome from atleta WHERE NOT EXISTS(SELECT contratto.idatleta from contratto where contratto.idatleta=atleta.codfiscale) AND atleta.codprocuratore='"+this.getIdProcuratore()+"';"; 
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String cognomeAtleta = rs.getString("cognome");

                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta};
                DefaultTableModel tblModel = (DefaultTableModel)tblNessunContrattoJT.getModel();
                tblModel.addRow(tbDataAtleta);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContrattiClubJT = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContrattiSponsorJT = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNessunContrattoJT = new javax.swing.JTable();
        btnAnnullaJB1 = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblContrattiClubJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblContrattiClubJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CF Atleta", "Nome Atleta", "Club", "Data Inizio", "Data Fine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContrattiClubJT.setFocusable(false);
        tblContrattiClubJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblContrattiClubJT.setShowVerticalLines(false);
        tblContrattiClubJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblContrattiClubJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 680, 140));

        tblContrattiSponsorJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblContrattiSponsorJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CF Atleta", "Nome Atleta", "Sponsor", "Data Inizio", "Data Fine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContrattiSponsorJT.setFocusable(false);
        tblContrattiSponsorJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblContrattiSponsorJT.setShowVerticalLines(false);
        tblContrattiSponsorJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblContrattiSponsorJT);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 680, 132));

        tblNessunContrattoJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblNessunContrattoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CF Atleta", "Nome", "Cognome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNessunContrattoJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblNessunContrattoJT.setShowVerticalLines(false);
        tblNessunContrattoJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblNessunContrattoJT);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 680, 132));

        btnAnnullaJB1.setBackground(new java.awt.Color(11, 58, 151));
        btnAnnullaJB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnAnnullaJB1.setBorder(null);
        btnAnnullaJB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB1.setFocusPainted(false);
        btnAnnullaJB1.setFocusable(false);
        btnAnnullaJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 40, 23));

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnullaJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJB1ActionPerformed
        SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
        sezioneGestioneContrattiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJB1ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    
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
    private javax.swing.JButton btnAnnullaJB1;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblContrattiClubJT;
    private javax.swing.JTable tblContrattiSponsorJT;
    private javax.swing.JTable tblNessunContrattoJT;
    // End of variables declaration//GEN-END:variables
}
