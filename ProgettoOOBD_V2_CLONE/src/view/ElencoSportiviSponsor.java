
package view;

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
import refactorCode.FinallyException;


public class ElencoSportiviSponsor extends javax.swing.JFrame {

    private String idSponsor;
    
    /*COSTRUTTORI*/
    public ElencoSportiviSponsor() {
        
    }
    
    public ElencoSportiviSponsor(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
            
            tblDatiSportiviJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            tblDatiSportiviJT.getTableHeader().setOpaque(false);
            tblDatiSportiviJT.getTableHeader().setBackground(new Color(32, 136, 203));
            tblDatiSportiviJT.getTableHeader().setForeground(new Color(255,255,255));
           
        
        try {
            visualizzaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(ElencoSportiviSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    /*METODI*/
    private void visualizzaDatiTabella() throws ExceptionDao {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select contratto.idatleta, atleta.nome, atleta.cognome, contratto.datastart, contratto.dataend from contratto JOIN atleta ON atleta.codfiscale=contratto.idatleta WHERE contratto.idclub IS NULL AND idsponsor="+this.getIdSponsor()+";";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("idatleta");
                String nomeAtleta = rs.getString("nome");
                String cognome = rs.getString("cognome");
                String dataInizio = dateFormat.format(rs.getDate("datastart"));
                String dataFine = dateFormat.format(rs.getDate("dataend"));
                
                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognome, dataInizio, dataFine};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiSportiviJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA ATLETI FALLITA "+e);
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
        tblDatiSportiviJT = new javax.swing.JTable();
        btnTornaIndietroJB = new javax.swing.JButton();
        jLDataAttuale = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatiSportiviJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatiSportiviJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codice Fiscale", "Nome", "Cognome", "Anno Stipulazione", "Anno Termine"
            }
        ));
        tblDatiSportiviJT.setFocusable(false);
        tblDatiSportiviJT.setRequestFocusEnabled(false);
        tblDatiSportiviJT.setRowHeight(25);
        tblDatiSportiviJT.setRowMargin(0);
        tblDatiSportiviJT.setSelectionBackground(new java.awt.Color(232, 57, 97));
        tblDatiSportiviJT.setShowVerticalLines(false);
        tblDatiSportiviJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDatiSportiviJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 670, 248));

        btnTornaIndietroJB.setBackground(new java.awt.Color(11, 58, 151));
        btnTornaIndietroJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnTornaIndietroJB.setBorder(null);
        btnTornaIndietroJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTornaIndietroJB.setFocusable(false);
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 40, 40));

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");
        jPanel1.add(jLDataAttuale, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SponsorView sponsorView = new SponsorView(this.getIdSponsor());
        sponsorView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

  
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
                new ElencoSportiviSponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatiSportiviJT;
    // End of variables declaration//GEN-END:variables
}
