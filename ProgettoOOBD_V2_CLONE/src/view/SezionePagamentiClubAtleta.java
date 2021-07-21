
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

public class SezionePagamentiClubAtleta extends javax.swing.JFrame {

    private String idAtleta;
    
    /*COSTRUTTORI*/
    public SezionePagamentiClubAtleta(String idAtleta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAtleta = idAtleta;
        
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
            
            tblPagamentiClubJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            tblPagamentiClubJT.getTableHeader().setOpaque(false);
            tblPagamentiClubJT.getTableHeader().setBackground(new Color(32, 136, 203));
            tblPagamentiClubJT.getTableHeader().setForeground(new Color(255,255,255));
        
        try {
            stampaDatiTabellaPagamenti();
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezionePagamentiClubAtleta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public SezionePagamentiClubAtleta() {
        
    }

    /*METODI*/
    private void stampaDatiTabellaPagamenti() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select stipendio.idclub, club.nomeclub, stipendio.val_stipendio, stipendio.idstipendio from stipendio join club on stipendio.idclub=club.idclub WHERE stipendio.idatleta='"+this.getIdAtleta()+"';";
       
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idClub = String.valueOf(rs.getInt("idclub"));
                String nomeClub = rs.getString("nomeclub");
                String importo = String.valueOf(rs.getDouble("val_stipendio"));
                String codicePagamento = String.valueOf(rs.getInt("idstipendio"));
               
                String tbDataAtleta[] = {idClub, nomeClub, importo, codicePagamento};
                DefaultTableModel tblModel = (DefaultTableModel)tblPagamentiClubJT.getModel();
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
        tblPagamentiClubJT = new javax.swing.JTable();
        jLDataAttuale = new javax.swing.JLabel();
        btnTornaIndietroJB1 = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPagamentiClubJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblPagamentiClubJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Club", "Nome Club", "Importo", "Codice Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPagamentiClubJT.setFocusable(false);
        tblPagamentiClubJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblPagamentiClubJT.setShowVerticalLines(false);
        tblPagamentiClubJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPagamentiClubJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 727, 200));

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");
        jPanel1.add(jLDataAttuale, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btnTornaIndietroJB1.setBackground(new java.awt.Color(11, 58, 151));
        btnTornaIndietroJB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnTornaIndietroJB1.setBorder(null);
        btnTornaIndietroJB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTornaIndietroJB1.setFocusable(false);
        btnTornaIndietroJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 40, 40));

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTornaIndietroJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJB1ActionPerformed
        SezioneIntroitiAtleta sezioneIntroitiAtleta = new SezioneIntroitiAtleta(this.getIdAtleta());
        sezioneIntroitiAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJB1ActionPerformed

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
                new SezionePagamentiClubAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnTornaIndietroJB1;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPagamentiClubJT;
    // End of variables declaration//GEN-END:variables
}
