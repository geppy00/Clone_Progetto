
package view;

import controller.ControllerProcuratore;
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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;

public class PercentualiGuadagnoProcuratoreView extends javax.swing.JFrame {
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private String idProcuratore;
    private ArrayList<Double> datiPagamentiClub = new ArrayList<Double>();
    private ArrayList<Double> datiPagamentiSponsor = new ArrayList<Double>();
    private ArrayList<Double> datiPagamentiEvento = new ArrayList<Double>();
        
    
    /*COSTRUTTORI*/
    public PercentualiGuadagnoProcuratoreView(String idProcuratore) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;

        try {
            this.stampaDatiAtltetaTbl();
        } catch (ExceptionDao ex) {
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nERRORE FATALE PROVARE AD RIAPRIRE LA FINESTRA", "ERRORE", JOptionPane.ERROR_MESSAGE);
            ProcuratoreView procuratoreView = new ProcuratoreView(this.getIdProcuratore());
            procuratoreView.setVisible(true);
            this.setVisible(false);
        }
    }
    
    public PercentualiGuadagnoProcuratoreView() {
         
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiClubJT = new javax.swing.JTable();
        btnAnnullaJB = new javax.swing.JButton();
        totaleGuadagnojL = new javax.swing.JLabel();
        totaleGuadagnoJTF = new javax.swing.JTextField();
        valoreContrattualeJL = new javax.swing.JLabel();
        totaleValoreContrattualeJTF = new javax.swing.JTextField();
        totaleGettoniJL = new javax.swing.JLabel();
        totaleGettoniJTF = new javax.swing.JTextField();
        btnCalcolaJB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatiSponsorJT = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatiEventiJT = new javax.swing.JTable();
        atletaMaggiorGuadagnoJL = new javax.swing.JLabel();
        atletaMigliorGuadagnoJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatiClubJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "Nome", "Cognome", "Data Nascita", "ID Contratto Club", "Club", "Valore Club"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiClubJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiClubJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiClubJT);

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        totaleGuadagnojL.setText("TOTALE GUADAGNO");

        totaleGuadagnoJTF.setEditable(false);

        valoreContrattualeJL.setText("TOTALE VALORE CONTRATTUALE");

        totaleValoreContrattualeJTF.setEditable(false);

        totaleGettoniJL.setText("TOTALE GETTONI");

        totaleGettoniJTF.setEditable(false);

        btnCalcolaJB.setText("CALCOLA");
        btnCalcolaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcolaJBActionPerformed(evt);
            }
        });

        tblDatiSponsorJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "Nome", "Cognome", "Data Nascita", "ID Contratto Sponsor", "Sponsor", "Valore Sponsor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDatiSponsorJT);

        tblDatiEventiJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "Nome", "Cognome", "Data Nascita", "Nome Evento", "Gettone Evento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDatiEventiJT);

        atletaMaggiorGuadagnoJL.setText("Atleta Maggior Guadagno");

        atletaMigliorGuadagnoJTF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnnullaJB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valoreContrattualeJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totaleValoreContrattualeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(atletaMaggiorGuadagnoJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atletaMigliorGuadagnoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(828, 828, 828)
                                .addComponent(btnCalcolaJB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(totaleGettoniJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totaleGettoniJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(280, 280, 280)
                                .addComponent(totaleGuadagnojL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totaleGuadagnoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 126, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valoreContrattualeJL)
                    .addComponent(totaleValoreContrattualeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totaleGettoniJL)
                    .addComponent(totaleGettoniJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totaleGuadagnojL)
                    .addComponent(totaleGuadagnoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atletaMaggiorGuadagnoJL)
                    .addComponent(atletaMigliorGuadagnoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnullaJB)
                    .addComponent(btnCalcolaJB))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*EVENTI*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        ProcuratoreView procuratoreView = new ProcuratoreView(this.getIdProcuratore());
        procuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed


    private void tblDatiClubJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiClubJTMouseClicked
        //String idAtleta = (String) tblDatiAtletiJT.getModel().getValueAt(evt.getX(), evt.getY());
        /*int row = tblDatiAtletiJT.getSelectedRow();
        String idAtleta = (String) tblDatiAtletiJT.getValueAt(row, 0);
        System.out.println("idAtleta="+idAtleta);
        
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        try {
            double valoreContrattualeClub = controllerProcuratore.prendiValoreContrattuale(idAtleta);
            if(valoreContrattualeClub != -1) {
                montanteContrattoJTF.setText(String.valueOf(valoreContrattualeClub));
                double guadagnoProcuratore = (3*valoreContrattualeClub)/100;
                guadagnoJTF.setText(String.valueOf(guadagnoProcuratore));
            }
            else {
                montanteContrattoJTF.setText(" ");
                guadagnoJTF.setText(" ");
                JOptionPane.showMessageDialog(null, "!! ATLETA SENZA CONTRATTO !!");
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(PercentualiGuadagnoProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_tblDatiClubJTMouseClicked

    private void btnCalcolaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcolaJBActionPerformed
        int i;
        double sommaContrattiClub = 0;
        double sommaContrattiSponsor = 0;
        double sommaGettone = 0;
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        for(i = 0; i<datiPagamentiClub.size(); i++) {
            sommaContrattiClub = sommaContrattiClub + datiPagamentiClub.get(i);
        }
        
        for(i = 0; i<datiPagamentiSponsor.size(); i++) {
            sommaContrattiSponsor = sommaContrattiSponsor + datiPagamentiSponsor.get(i);
        }
        
        double sommaTotaleContratto = ((sommaContrattiClub + sommaContrattiSponsor) * 3) / 100;
        System.out.println("SOMMA DEI CONTARTTI = "+sommaTotaleContratto);
        
        for(i = 0; i<datiPagamentiEvento.size(); i++) {
            sommaGettone = sommaGettone + datiPagamentiEvento.get(i);
        }
        
        double sommaTotaleGettoni = (sommaGettone * 10) / 100;
        System.out.println("SOMMA DEI GETTONI = "+sommaTotaleGettoni);
        
        double sommaTotale = sommaTotaleContratto + sommaTotaleGettoni;
        
        System.out.println("TOTALE GUADAGNO = "+sommaTotale);
        
        totaleValoreContrattualeJTF.setText(String.valueOf(sommaTotaleContratto));
        totaleGettoniJTF.setText(String.valueOf(sommaTotaleGettoni));
        totaleGuadagnoJTF.setText(String.valueOf(sommaTotale));
        
        try {
            String nomeAtletaMigliorGuadagno = controllerProcuratore.prendiAtletaMaggiorGuadagno(this.getIdProcuratore());
            if(controlloConvalidazione.controlloAtleta(nomeAtletaMigliorGuadagno) == true)
                atletaMigliorGuadagnoJTF.setText(nomeAtletaMigliorGuadagno);
            else
                JOptionPane.showMessageDialog(this, "NON E' STATO POSSIBILE RICERCARE L'ATLETA MIGLIORE\n\t\tRIPROVARE", "WARNING", JOptionPane.WARNING_MESSAGE);
        } catch (ExceptionDao ex) {
            Logger.getLogger(PercentualiGuadagnoProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCalcolaJBActionPerformed

    /*METODI*/
    private String prendiNomeSponsor() throws ExceptionDao {
       ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
       return controllerProcuratore.prendiNomeSponsorPerContratti();
    }

  
    public void stampaDatiAtltetaTbl() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select atleta.codfiscale, atleta.nome, atleta.cognome, atleta.datanascita, contratto.numero_contratto, club.nomeclub, contratto.valore_contrattuale FROM contratto JOIN atleta ON contratto.idatleta=atleta.codfiscale JOIN club ON contratto.idclub=club.idclub WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"';";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
 
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String cognomeAtleta = rs.getString("cognome");
                String dataNascita = dateFormat.format(rs.getDate("datanascita"));
                String numeroContrattoClub = String.valueOf(rs.getInt("numero_contratto"));
                String nomeClub = rs.getString("nomeclub");
                String valoreContrattualeClub = String.valueOf(rs.getDouble("valore_contrattuale"));
                
                datiPagamentiClub.add(rs.getDouble("valore_contrattuale"));
                
                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta, dataNascita, numeroContrattoClub, nomeClub, valoreContrattualeClub};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiClubJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA ATLETA FALLITA "+e);
        }
        
        sql = "select atleta.codfiscale, atleta.nome, atleta.cognome, atleta.datanascita, contratto.numero_contratto, sponsor.nomesponsor, contratto.valore_contrattuale FROM contratto JOIN atleta ON contratto.idatleta=atleta.codfiscale JOIN sponsor ON contratto.idsponsor=sponsor.idsponsor WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idclub IS NULL;";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String cognomeAtleta = rs.getString("cognome");
                String dataNascita = dateFormat.format(rs.getDate("datanascita"));
                String numeroContrattoSponsor = String.valueOf(rs.getInt("numero_contratto"));
                String nomeSponsor = rs.getString("nomesponsor");
                String valoreContrattualeSponsor = String.valueOf(rs.getDouble("valore_contrattuale"));
                
                datiPagamentiSponsor.add(rs.getDouble("valore_contrattuale"));
                
                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta, dataNascita, numeroContrattoSponsor, nomeSponsor, valoreContrattualeSponsor};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiSponsorJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA ATLETA FALLITA "+e);
        }
        
        sql="select atleta.codfiscale, atleta.nome, atleta.cognome, atleta.datanascita, evento.titolo, evento.gettonevalue FROM invitatti JOIN atleta ON invitatti.idatleta=atleta.codfiscale JOIN evento ON invitatti.idevento=evento.idevento WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND invitatti.status_presenza=1;";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String cognomeAtleta = rs.getString("cognome");
                String dataNascita = dateFormat.format(rs.getDate("datanascita"));
                String nomeEvento = rs.getString("titolo");
                String gettoneEvento = String.valueOf(rs.getDouble("gettonevalue"));
                
                datiPagamentiEvento.add(rs.getDouble("gettonevalue"));
                
                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta, dataNascita, nomeEvento, gettoneEvento};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventiJT.getModel();
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
                new PercentualiGuadagnoProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atletaMaggiorGuadagnoJL;
    private javax.swing.JTextField atletaMigliorGuadagnoJTF;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCalcolaJB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDatiClubJT;
    private javax.swing.JTable tblDatiEventiJT;
    private javax.swing.JTable tblDatiSponsorJT;
    private javax.swing.JLabel totaleGettoniJL;
    private javax.swing.JTextField totaleGettoniJTF;
    private javax.swing.JTextField totaleGuadagnoJTF;
    private javax.swing.JLabel totaleGuadagnojL;
    private javax.swing.JTextField totaleValoreContrattualeJTF;
    private javax.swing.JLabel valoreContrattualeJL;
    // End of variables declaration//GEN-END:variables
}
