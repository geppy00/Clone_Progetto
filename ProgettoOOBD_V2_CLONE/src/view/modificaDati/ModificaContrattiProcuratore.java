
package view.modificaDati;

import controller.ControllerProcuratore;
import dao.ExceptionDao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contratto;
import view.SezioneModificaContrattoProcuratore;

public class ModificaContrattiProcuratore extends javax.swing.JFrame {

    private String idProcuratore;
    private int idContratto;
    
    /*COSTRUTTORI*/
    public ModificaContrattiProcuratore(String idProcuratore, int idContratto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        this.idContratto = idContratto;
        
        stampaDatiContratto(this.getIdContratto());
    }
    
    public ModificaContrattiProcuratore() {
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idSponsorJL = new javax.swing.JLabel();
        inputIdSponsorJTF = new javax.swing.JTextField();
        idClubJL = new javax.swing.JLabel();
        inputIdClubJTF = new javax.swing.JTextField();
        dataInizioJL = new javax.swing.JLabel();
        dataFineJL = new javax.swing.JLabel();
        inputDataInizioJDC = new com.toedter.calendar.JDateChooser();
        inputDataFineJDC = new com.toedter.calendar.JDateChooser();
        valoreContrattualeJL = new javax.swing.JLabel();
        inputValoreContrattualeJTF = new javax.swing.JTextField();
        cfAtletaJL = new javax.swing.JLabel();
        inputIdAtletaJTF = new javax.swing.JTextField();
        btnAnnullaJB = new javax.swing.JButton();
        btnModificaJB = new javax.swing.JButton();
        idContrattoJL = new javax.swing.JLabel();
        inputIdContrattoJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idSponsorJL.setText("ID Sponsor");

        idClubJL.setText("ID Club");

        dataInizioJL.setText("Data Inizio");

        dataFineJL.setText("Data Fine");

        valoreContrattualeJL.setText("Valore Contrattuale");

        cfAtletaJL.setText("Codice Fiscale Atleta");

        inputIdAtletaJTF.setEditable(false);

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        btnModificaJB.setText("MODIFICA");
        btnModificaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaJBActionPerformed(evt);
            }
        });

        idContrattoJL.setText("ID Contratto");

        inputIdContrattoJTF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idContrattoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputIdContrattoJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cfAtletaJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputIdAtletaJTF))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(valoreContrattualeJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputValoreContrattualeJTF))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dataFineJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputDataFineJDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idSponsorJL)
                                .addComponent(dataInizioJL))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputIdSponsorJTF)
                                .addComponent(inputDataInizioJDC, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(idClubJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputIdClubJTF))))
                .addGap(59, 59, 59)
                .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnModificaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idSponsorJL)
                                    .addComponent(inputIdSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idClubJL)
                                    .addComponent(inputIdClubJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(dataInizioJL))
                            .addComponent(inputDataInizioJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataFineJL)
                            .addComponent(inputDataFineJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModificaJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valoreContrattualeJL)
                    .addComponent(inputValoreContrattualeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cfAtletaJL)
                    .addComponent(inputIdAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idContrattoJL)
                    .addComponent(inputIdContrattoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*METODI*/
    private void stampaDatiContratto(int idContratto) {
        ArrayList<Contratto> datiContratto = new ArrayList<Contratto>();
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        try {
            datiContratto = controllerProcuratore.prendiDatiContratto(idContratto);
           
            datiContratto.forEach((Contratto contratto)->{
                inputIdSponsorJTF.setText(String.valueOf(contratto.getIdSponsor()));
                inputIdClubJTF.setText(String.valueOf(contratto.getIdClub()));
                inputDataInizioJDC.setDate(contratto.getDataStart());
                inputDataFineJDC.setDate(contratto.getDataEnd());
                inputValoreContrattualeJTF.setText(String.valueOf(contratto.getValoreContratto()));
                inputIdAtletaJTF.setText(contratto.getIdAtleta());
                inputIdContrattoJTF.setText(String.valueOf(contratto.getNumeroContratto()));
            });
        } catch (ExceptionDao ex) {
            Logger.getLogger(ModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneModificaContrattoProcuratore sezioneModificaContrattoProcuratore = new SezioneModificaContrattoProcuratore(this.getIdProcuratore());  
        sezioneModificaContrattoProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnModificaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaJBActionPerformed
        int numeroContratto = Integer.parseInt(inputIdContrattoJTF.getText());
        String idAtleta = inputIdAtletaJTF.getText();
        int idSponsor = Integer.parseInt(inputIdSponsorJTF.getText());
        int idClub = Integer.parseInt(inputIdClubJTF.getText());
        java.sql.Date dataInizio = (java.sql.Date) inputDataInizioJDC.getDate();
        java.sql.Date dataFine = (java.sql.Date) inputDataFineJDC.getDate();
        float valoreContrattuale = Float.parseFloat(inputValoreContrattualeJTF.getText());
        
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        try {
            controllerProcuratore.modificaContratto(numeroContratto, idAtleta, idSponsor, idClub, dataInizio, dataFine, valoreContrattuale);
            
            SezioneModificaContrattoProcuratore sezioneModificaContrattoProcuratore = new SezioneModificaContrattoProcuratore(this.getIdProcuratore());
            sezioneModificaContrattoProcuratore.setVisible(true);
            this.setVisible(false);
        } catch (ExceptionDao ex) {
            Logger.getLogger(ModificaContrattiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificaJBActionPerformed

    
     /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }
   
    public int getIdContratto() {
        return idContratto;
    }

    public void setIdContratto(int idContratto) {
        this.idContratto = idContratto;
    }

    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaContrattiProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnModificaJB;
    private javax.swing.JLabel cfAtletaJL;
    private javax.swing.JLabel dataFineJL;
    private javax.swing.JLabel dataInizioJL;
    private javax.swing.JLabel idClubJL;
    private javax.swing.JLabel idContrattoJL;
    private javax.swing.JLabel idSponsorJL;
    private com.toedter.calendar.JDateChooser inputDataFineJDC;
    private com.toedter.calendar.JDateChooser inputDataInizioJDC;
    private javax.swing.JTextField inputIdAtletaJTF;
    private javax.swing.JTextField inputIdClubJTF;
    private javax.swing.JTextField inputIdContrattoJTF;
    private javax.swing.JTextField inputIdSponsorJTF;
    private javax.swing.JTextField inputValoreContrattualeJTF;
    private javax.swing.JLabel valoreContrattualeJL;
    // End of variables declaration//GEN-END:variables
}
