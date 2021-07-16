
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

public class SezioneContrattiClubStipulatiAtleta extends javax.swing.JFrame {

    private String idAtleta;
    
     /*COSTRUTTORE*/
    public SezioneContrattiClubStipulatiAtleta(String idAtleta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAtleta = idAtleta;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        
         tblDatiContrattiClubJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblDatiContrattiClubJT.getTableHeader().setOpaque(false);
         tblDatiContrattiClubJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblDatiContrattiClubJT.getTableHeader().setForeground(new Color(255,255,255));
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezioneGettoniEventoAtleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public SezioneContrattiClubStipulatiAtleta() {
        
    }

    
    /*METODI*/
    private void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select contratto.numero_contratto, contratto.idclub, club.nomeclub, contratto.datastart, contratto.dataend, contratto.valore_contrattuale from contratto join club on contratto.idclub=club.idclub WHERE contratto.idatleta='"+this.getIdAtleta()+"';";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String numeroContratto = String.valueOf(rs.getInt("numero_contratto"));
                String idClub = String.valueOf(rs.getInt("idclub"));
                String nomeClub = rs.getString("nomeclub");
                String dataStart = dateFormat.format(rs.getDate("datastart"));
                String dataEnd = dateFormat.format(rs.getDate("dataend"));
                String valoreContrattuale = String.valueOf(rs.getDouble("valore_contrattuale"));
                
                String tbDataAtleta[] = {numeroContratto, idClub, nomeClub, dataStart, dataEnd, valoreContrattuale};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiContrattiClubJT.getModel();
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
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiContrattiClubJT = new javax.swing.JTable();
        btnLogoutJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLDataAttuale = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatiContrattiClubJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatiContrattiClubJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Contratto", "ID Club", "Nome Club", "Data Inizio", "Data Fine", "Valore Contrattuale"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiContrattiClubJT.setFocusable(false);
        tblDatiContrattiClubJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiContrattiClubJT.setShowVerticalLines(false);
        tblDatiContrattiClubJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDatiContrattiClubJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 700, 230));

        btnLogoutJB.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnLogoutJB.setBorder(null);
        btnLogoutJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB.setFocusPainted(false);
        btnLogoutJB.setFocusable(false);
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 40));

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 0, 40, 40));

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");
        jPanel1.add(jLDataAttuale, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        SezioneIntroitiAtleta sezioneIntroitiAtleta = new SezioneIntroitiAtleta(this.getIdAtleta());
        sezioneIntroitiAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

      /*GET AND SET*/
    public String getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }
 
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneContrattiClubStipulatiAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatiContrattiClubJT;
    // End of variables declaration//GEN-END:variables
}
