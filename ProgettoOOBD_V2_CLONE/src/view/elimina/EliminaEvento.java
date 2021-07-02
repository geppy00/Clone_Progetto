
package view.elimina;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Evento;
import model.Sponsor;
import refactorCode.FinallyException;
import view.SezioneEventiView;

public class EliminaEvento extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private String idSponsor;
    private int idEvento;
    private ArrayList<Evento> datiEvento = new ArrayList<Evento>();

    /*COSTRUTTORI*/
    public EliminaEvento(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        
        try {
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(EliminaEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public EliminaEvento() {
       
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiEventoJT = new javax.swing.JTable();
        btnTornaIndietroJB = new javax.swing.JButton();
        nomeJL = new javax.swing.JLabel();
        inputNomeEventoJTF = new javax.swing.JTextField();
        btnCercaNomeJB = new javax.swing.JButton();
        dataJL = new javax.swing.JLabel();
        inputDataEventoJDC = new com.toedter.calendar.JDateChooser();
        btnCercaDataJB = new javax.swing.JButton();
        btnRispristinaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatiEventoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Evento", "Nome", "Indirizzo", "Data Evento", "Ora Inizio", "Data Fine ", "Ora Fine", "Valore Gettone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiEventoJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiEventoJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiEventoJT);

        btnTornaIndietroJB.setText("ANNULLA");
        btnTornaIndietroJB.setToolTipText("");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        nomeJL.setText("Nome Evento");

        btnCercaNomeJB.setText("CERCA");
        btnCercaNomeJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaNomeJBActionPerformed(evt);
            }
        });

        dataJL.setText("Data Evento");

        inputDataEventoJDC.setDateFormatString("yyyy-MM-dd");

        btnCercaDataJB.setText("CERCA");
        btnCercaDataJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaDataJBActionPerformed(evt);
            }
        });

        btnRispristinaJB.setText("RIPRISTINA");
        btnRispristinaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRispristinaJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dataJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputDataEventoJDC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nomeJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomeEventoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btnRispristinaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCercaNomeJB)
                            .addComponent(btnCercaDataJB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeJL)
                            .addComponent(inputNomeEventoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCercaNomeJB))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataJL)
                            .addComponent(inputDataEventoJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCercaDataJB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(btnRispristinaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    /*ACTION PERFOMED*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SezioneEventiView sezioneEventiView = new SezioneEventiView(this.getIdSponsor());
        sezioneEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnCercaNomeJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaNomeJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        String nomeEvento = inputNomeEventoJTF.getText();
        
        if(controlloConvalidazione.controlloEliminaEventoNome(nomeEvento) == true) {
            try {
                datiEvento = controllerSponsor.cercaNomeEvento(nomeEvento, Integer.parseInt(this.getIdSponsor()));
                if(datiEvento.isEmpty())
                    JOptionPane.showMessageDialog(this, "EVENTO CON NOME "+nomeEvento+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                else {
                    JOptionPane.showMessageDialog(this, "✓ EVENTO CON NOME "+nomeEvento+" TROVATO", "TROVATO", JOptionPane.INFORMATION_MESSAGE);
                    DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventoJT.getModel();
                    tblModel.setRowCount(0);
                    datiEvento.forEach((Evento evento) -> {
                        tblModel.addRow(new Object[]{
                            evento.getIdEvento(),
                            evento.getTitolo(),
                            evento.getLuogoEvento(),
                            evento.getDataInizio(),
                            evento.getOraInizio(),
                            evento.getDataFine(),
                            evento.getOraFine(),
                            evento.getGettoneValue(),
                        });
                        tblDatiEventoJT.setModel(tblModel);
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(EliminaEvento.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL NOME DELL'EVENTO DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnCercaNomeJBActionPerformed

    private void btnRispristinaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRispristinaJBActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventoJT.getModel();
            tblModel.setRowCount(0);
            stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(EliminaEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRispristinaJBActionPerformed

    private void btnCercaDataJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaDataJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        java.sql.Date dataEvento = null;
        try{
            dataEvento = new java.sql.Date(inputDataEventoJDC.getDate().getTime());
        }catch(NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE UNA DATA VALIDA DA CERCARE", "WARNING", JOptionPane.WARNING_MESSAGE);
        }        
        
        
        if(controlloConvalidazione.controlloEliminaEventoData(String.valueOf(dataEvento)) == true) {
            try {
                datiEvento = controllerSponsor.cercaDataEvento(dataEvento, Integer.parseInt(this.getIdSponsor()));
                if(datiEvento.isEmpty())
                    JOptionPane.showMessageDialog(this, "EVENTO CON DATA "+dataEvento+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                else {
                    JOptionPane.showMessageDialog(this, "✓ EVENTO CON DATA "+dataEvento+" TROVATO", "TROVATO", JOptionPane.INFORMATION_MESSAGE);
                    DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventoJT.getModel();
                    tblModel.setRowCount(0);
                    datiEvento.forEach((Evento evento) -> {
                        tblModel.addRow(new Object[]{
                            evento.getIdEvento(),
                            evento.getTitolo(),
                            evento.getLuogoEvento(),
                            evento.getDataInizio(),
                            evento.getOraInizio(),
                            evento.getDataFine(),
                            evento.getOraFine(),
                        });
                        tblDatiEventoJT.setModel(tblModel);
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(EliminaEvento.class.getName()).log(Level.SEVERE, null, ex);
            } catch(NullPointerException nex){
                JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nNON E' STATO POSSIBILE STAMPARE I DATI PERCHE' LA DATA INSERITA NON E' VALIDA", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LA DATA DELL'EVENTO DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnCercaDataJBActionPerformed

    private void tblDatiEventoJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiEventoJTMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int row = tblDatiEventoJT.getSelectedRow();
            this.setIdEvento(Integer.parseInt((String) tblDatiEventoJT.getValueAt(row, 0)));
            
            ConfermaEliminazioneEvento confermaEliminazioneEvento = new ConfermaEliminazioneEvento(this.getIdSponsor(), this.getIdEvento());   
            confermaEliminazioneEvento.setVisible(true);
        }
    }//GEN-LAST:event_tblDatiEventoJTMouseClicked


    /*GET AND SET*/
    public String getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(String idSponsor) {
        this.idSponsor = idSponsor;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
    
    /*MAIN*/
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCercaDataJB;
    private javax.swing.JButton btnCercaNomeJB;
    private javax.swing.JButton btnRispristinaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel dataJL;
    private com.toedter.calendar.JDateChooser inputDataEventoJDC;
    private javax.swing.JTextField inputNomeEventoJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JTable tblDatiEventoJT;
    // End of variables declaration//GEN-END:variables
}
