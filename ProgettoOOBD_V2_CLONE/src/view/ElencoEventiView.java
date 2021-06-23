
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
import view.modificaDati.ModificaEvento;

public class ElencoEventiView extends javax.swing.JFrame {

    private String idSponsor;
    
    /*COSTRUTTORI*/
    public ElencoEventiView(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
         tblDatiEventoJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tblDatiEventoJT.getTableHeader().setOpaque(false);
         tblDatiEventoJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tblDatiEventoJT.getTableHeader().setForeground(new Color(255,255,255));
         tblDatiEventoJT.setRowHeight(25);
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(ElencoEventiView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ElencoEventiView() {
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTornaIndietroJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiEventoJT = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTornaIndietroJB.setBackground(new java.awt.Color(255, 255, 255));
        btnTornaIndietroJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px.png"))); // NOI18N
        btnTornaIndietroJB.setBorder(null);
        btnTornaIndietroJB.setFocusable(false);
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 60, 30));

        tblDatiEventoJT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblDatiEventoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Evento", "Titolo", "Indirizzo Evento", "Data Inizio", "Ora Inizio", "Data Fine", "Ora Fine", "Valore Gettone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiEventoJT.setFocusable(false);
        tblDatiEventoJT.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblDatiEventoJT.setRowHeight(25);
        tblDatiEventoJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiEventoJT.setShowVerticalLines(false);
        tblDatiEventoJT.getTableHeader().setReorderingAllowed(false);
        tblDatiEventoJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiEventoJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiEventoJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 720, 260));

        jPanel3.setBackground(new java.awt.Color(46, 117, 233));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DEGLI EVENTI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SezioneEventiView sezioneEventiView = new SezioneEventiView(this.getIdSponsor());
        sezioneEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void tblDatiEventoJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiEventoJTMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int row = tblDatiEventoJT.getSelectedRow();
            int idEvento = Integer.parseInt((String) tblDatiEventoJT.getValueAt(row, 0));
            
            ModificaEvento modificaEvento = new ModificaEvento(this.getIdSponsor(), idEvento);
            modificaEvento.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_tblDatiEventoJTMouseClicked

    /*METODI*/
    private void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select * from evento Where idsponsor ="+this.getIdSponsor()+";";
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
                
                String tbDataAtleta[] = {idEvento, titolo, luogoEvento, dataInizio, oraInizio, dataFine, oraFine, gettoneValue};
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
                new ElencoEventiView().setVisible(true);
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
    private javax.swing.JTable tblDatiEventoJT;
    // End of variables declaration//GEN-END:variables
}
