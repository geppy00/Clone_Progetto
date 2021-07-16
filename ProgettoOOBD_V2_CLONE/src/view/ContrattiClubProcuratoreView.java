
package view;

import controller.ControllerSponsor;
import dao.DataAccessObject;
import dao.ExceptionDao;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
         
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        
         tblDatiContrattiClubJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblDatiContrattiClubJT.getTableHeader().setOpaque(false);
         tblDatiContrattiClubJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblDatiContrattiClubJT.getTableHeader().setForeground(new Color(255,255,255));
         tblDatiContrattiClubJT.setRowHeight(25);
        
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

        jLDataAttuale = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiContrattiClubJT = new javax.swing.JTable();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();
        jLDataAttuale1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatiContrattiClubJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        tblDatiContrattiClubJT.setFocusable(false);
        tblDatiContrattiClubJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiContrattiClubJT.setShowVerticalLines(false);
        tblDatiContrattiClubJT.getTableHeader().setReorderingAllowed(false);
        tblDatiContrattiClubJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiContrattiClubJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiContrattiClubJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 750, 240));

        btnTornaIndietroJB.setBackground(new java.awt.Color(11, 58, 151));
        btnTornaIndietroJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnTornaIndietroJB.setToolTipText("");
        btnTornaIndietroJB.setBorder(null);
        btnTornaIndietroJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTornaIndietroJB.setFocusPainted(false);
        btnTornaIndietroJB.setFocusable(false);
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 40, 49));

        btnLogoutJB.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnLogoutJB.setBorder(null);
        btnLogoutJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB.setFocusPainted(false);
        btnLogoutJB.setFocusable(false);
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 40));

        jLDataAttuale1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale1.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale1.setText("13/01/2023");
        jPanel1.add(jLDataAttuale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
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

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

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
                new ContrattiClubProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLDataAttuale1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatiContrattiClubJT;
    // End of variables declaration//GEN-END:variables
}
