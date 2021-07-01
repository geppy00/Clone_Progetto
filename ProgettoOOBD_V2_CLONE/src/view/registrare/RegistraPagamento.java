
package view.registrare;

import controller.ControllerClub;
import convalidazione.ControlloConvalidazione;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.sql.Connection;
import view.SezionePagamentoView;
import  java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;

public class RegistraPagamento extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private String idClubStr;
    private int idClub;
    
    public RegistraPagamento(String idClub) {
        initComponents();
        this.idClubStr = idClub;
        this.setLocationRelativeTo(null);
        
        try {
            this.stampaDati();
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public RegistraPagamento() { 
        
    }
    
    /*METODI*/
    private void stampaDati() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "SELECT atleta.codfiscale, atleta.nome, atleta.cognome FROM atleta join club on atleta.codclub=club.idclub WHERE atleta.codclub="+Integer.parseInt(this.getIdClubStr())+";";
        
        System.out.println("SQL="+sql);
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");
               
                String tbDataAtleta[] = {idAtleta, nome, cognome};
                DefaultTableModel tblModel = (DefaultTableModel)elencoAtletiJT.getModel();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        importoJL = new javax.swing.JLabel();
        inputImportoJTF = new javax.swing.JTextField();
        btnPagaJB = new javax.swing.JButton();
        idDestinatarioJL = new javax.swing.JLabel();
        inputIdDestinatarioJTF = new javax.swing.JTextField();
        btnAnnullaJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        elencoAtletiJT = new javax.swing.JTable();
        elencoAtletiJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        importoJL.setText("INSERISCI IMPORTO");

        btnPagaJB.setText("PAGA");
        btnPagaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagaJBActionPerformed(evt);
            }
        });

        idDestinatarioJL.setText("ID Destinatario");

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        elencoAtletiJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "Nome", "Cognome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(elencoAtletiJT);

        elencoAtletiJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elencoAtletiJL.setText("ELENCO ATLETI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(importoJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputImportoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idDestinatarioJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIdDestinatarioJTF)))
                        .addGap(18, 18, 18)
                        .addComponent(btnPagaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnnullaJB))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elencoAtletiJL, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(importoJL)
                            .addComponent(inputImportoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idDestinatarioJL)
                            .addComponent(inputIdDestinatarioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPagaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(elencoAtletiJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnPagaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        LocalDate dataPagamento = java.time.LocalDate.now();
        Date javaDate = Date.valueOf(dataPagamento); 
        String importoStr = inputImportoJTF.getText();
        double importo = 0; 
       
        try{
            importo = Float.parseFloat(importoStr);
        }catch(NumberFormatException nex) {
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN NUMERO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        
        String idDestinatario = inputIdDestinatarioJTF.getText();
        this.setIdClub(Integer.parseInt(idClubStr));

        if(controlloConvalidazione.controlloRegistraPagamento(importoStr, idDestinatario) == true) {
            try {
                controllerClub.effettuaPagamento(importo, idDestinatario, this.getIdClub(), (java.sql.Date) javaDate);
                JOptionPane.showMessageDialog(this, "PAGAMENTO EFFETTUATO CON SUCCESSO\nRiepilogo\nImporto: "+importo+"\nDestinatario: "+idDestinatario+"\nData Pagamento: "+javaDate+"\nID Mittente: "+this.getIdClub(), "REGISTRAZIONE PAGAMENTO", JOptionPane.INFORMATION_MESSAGE);
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnPagaJBActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezionePagamentoView sezionePagamentoView = new SezionePagamentoView(this.getIdClubStr());
        sezionePagamentoView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    
    /*GET AND SET*/
    public String getIdClubStr() {
        return idClubStr;
    }

    public void setIdClubStr(String idClubStr) {
        this.idClubStr = idClubStr;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    
    /*MAIN PER APRIRE FINESTRA*/
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnPagaJB;
    private javax.swing.JLabel elencoAtletiJL;
    private javax.swing.JTable elencoAtletiJT;
    private javax.swing.JLabel idDestinatarioJL;
    private javax.swing.JLabel importoJL;
    private javax.swing.JTextField inputIdDestinatarioJTF;
    private javax.swing.JTextField inputImportoJTF;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
