
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
import view.registrare.RegistraInvitato;

public class GestioneEventiAtleta extends javax.swing.JFrame {

    private String idAtleta;
    
    /*COSTRUTTORE*/
    public GestioneEventiAtleta(String idAtleta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAtleta = idAtleta;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        
         tblDatiEventoJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblDatiEventoJT.getTableHeader().setOpaque(false);
         tblDatiEventoJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblDatiEventoJT.getTableHeader().setForeground(new Color(255,255,255));
         
        
        try {
            stampaDati();
        } catch (ExceptionDao ex) {
            Logger.getLogger(GestioneEventiAtleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public GestioneEventiAtleta() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiEventoJT = new javax.swing.JTable();
        btnAnnullaJB = new javax.swing.JButton();
        jLDataAttuale = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatiEventoJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatiEventoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Evento", "Nome", "Luogo", "Data Evento", "Ora ", "Data Fine", "Ora Fine", "Gettone Evento", "Sponsor Organizzatore"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiEventoJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiEventoJT.setShowVerticalLines(false);
        tblDatiEventoJT.getTableHeader().setReorderingAllowed(false);
        tblDatiEventoJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiEventoJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiEventoJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 1120, 254));

        btnAnnullaJB.setBackground(new java.awt.Color(11, 58, 151));
        btnAnnullaJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.setFocusPainted(false);
        btnAnnullaJB.setFocusable(false);
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 50, 23));

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");
        jPanel1.add(jLDataAttuale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, -1, -1));

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        AtletaView atletaView = new AtletaView(this.getIdAtleta());
        atletaView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void tblDatiEventoJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiEventoJTMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int row = tblDatiEventoJT.getSelectedRow();
            int idEvento = Integer.parseInt((String) tblDatiEventoJT.getValueAt(row, 0));
            
            RegistraInvitato registraInvitato = new RegistraInvitato(this.getIdAtleta(), idEvento);
            registraInvitato.setVisible(true);
            
            //((DefaultTableModel)tblDatiEventoJT.getModel()).removeRow(row);
        }
    }//GEN-LAST:event_tblDatiEventoJTMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    /*METODI*/
    private void stampaDati() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "SELECT evento.idevento, evento.titolo, evento.luogoevento, evento.data_inizioevento, evento.ora_inizio_evento, evento.data_fineevento, evento.ora_fine_evento, evento.gettonevalue, sponsor.nomesponsor  from contratto join sponsor on contratto.idsponsor = sponsor.idsponsor and contratto.idatleta = '"+this.getIdAtleta()+"' join evento on evento.idsponsor = sponsor.idsponsor join atleta on contratto.idatleta = atleta.codfiscale;";
        String descrizione = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm:ss"); 
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idEvento = String.valueOf(rs.getInt("idevento"));
                String titolo = rs.getString("titolo");
                String luogoEvento = rs.getString("luogoevento");
                String dataInizio = dateFormat.format(rs.getDate("data_inizioevento"));
                String oraInizio = localDateFormat.format(rs.getTime("ora_inizio_evento"));
                String dataFine = dateFormat.format(rs.getDate("data_fineevento"));
                String oraFine = localDateFormat.format(rs.getTime("ora_fine_evento"));
                String gettoneValue = String.valueOf(rs.getDouble("gettonevalue"));
                String nomeSponsor = rs.getString("nomesponsor");
                
                String tbDataAtleta[] = {idEvento, titolo, luogoEvento, dataInizio, oraInizio, dataFine, oraFine, gettoneValue, nomeSponsor};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventoJT.getModel();
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
                new GestioneEventiAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatiEventoJT;
    // End of variables declaration//GEN-END:variables
}
