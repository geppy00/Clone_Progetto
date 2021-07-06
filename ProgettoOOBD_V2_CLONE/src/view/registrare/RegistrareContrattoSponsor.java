
package view.registrare;

import controller.ControllerProcuratore;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Atleta;
import view.SezioneGestioneContrattiView;


public class RegistrareContrattoSponsor extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private String idProcuratore;
    private ArrayList<Atleta> datiAtleta = new ArrayList<Atleta>();
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
    
    /*COSTRUTTORE*/
    public RegistrareContrattoSponsor(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
    }
    
    public RegistrareContrattoSponsor() {
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        titoloJL = new javax.swing.JLabel();
        cfAtletaJL = new javax.swing.JLabel();
        inputCfAtletaJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        nomeJL = new javax.swing.JLabel();
        nomeJTF = new javax.swing.JTextField();
        cognomeJL = new javax.swing.JLabel();
        cognomeJTF = new javax.swing.JTextField();
        dataNascitaJL = new javax.swing.JLabel();
        dataNascitaJTF = new javax.swing.JTextField();
        ruoloJL = new javax.swing.JLabel();
        ruoloJTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idSponsorJL = new javax.swing.JLabel();
        inputIdSponsorJTF = new javax.swing.JTextField();
        nomeSponsorJL = new javax.swing.JLabel();
        nomeSponsorJTF = new javax.swing.JTextField();
        dataInizioJL = new javax.swing.JLabel();
        inputDataInizioJDC = new com.toedter.calendar.JDateChooser();
        dataFineJL = new javax.swing.JLabel();
        inputDataFineJDC = new com.toedter.calendar.JDateChooser();
        btnAnnullaJB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        valContrattoJL = new javax.swing.JLabel();
        inputValoreContrttoJTF = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titoloJL.setText("REGISTRARE CONTRATTO SPONSOR");

        cfAtletaJL.setText("CF Atleta");

        btnCercaJB.setText("CERCA");
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });

        nomeJL.setText("Nome");

        nomeJTF.setEditable(false);
        nomeJTF.setToolTipText("");

        cognomeJL.setText("Cognome");

        cognomeJTF.setEditable(false);

        dataNascitaJL.setText("Data di Nascita");

        dataNascitaJTF.setEditable(false);

        ruoloJL.setText("Ruolo");

        ruoloJTF.setEditable(false);

        jLabel1.setText("__________________________________________________________________________________________________");

        idSponsorJL.setText("ID Sponsor");
        idSponsorJL.setToolTipText("");

        inputIdSponsorJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdSponsorJTFActionPerformed(evt);
            }
        });

        nomeSponsorJL.setText("Nome Sponsor");

        nomeSponsorJTF.setEditable(false);

        dataInizioJL.setText("Data Inizio");

        dataFineJL.setText("Data Fine");

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        jButton1.setText("REGISTRA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        valContrattoJL.setText("Valore Contratto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(dataNascitaJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataNascitaJTF))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nomeJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ruoloJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ruoloJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cognomeJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(valContrattoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputValoreContrttoJTF))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(idSponsorJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputIdSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(dataInizioJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputDataInizioJDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nomeSponsorJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nomeSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dataFineJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputDataFineJDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAnnullaJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cfAtletaJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCfAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCercaJB)
                                .addGap(212, 212, 212))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(titoloJL)
                                .addGap(226, 226, 226))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cfAtletaJL)
                    .addComponent(inputCfAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCercaJB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJL)
                    .addComponent(nomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cognomeJL)
                    .addComponent(cognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNascitaJL)
                    .addComponent(dataNascitaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruoloJL, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruoloJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSponsorJL)
                    .addComponent(inputIdSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeSponsorJL)
                    .addComponent(nomeSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataInizioJL)
                    .addComponent(dataFineJL)
                    .addComponent(inputDataInizioJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDataFineJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valContrattoJL)
                    .addComponent(inputValoreContrttoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       SezioneGestioneContrattiView sezioneGestioneContrattiView = new SezioneGestioneContrattiView(this.getIdProcuratore());
       sezioneGestioneContrattiView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String idAtleta = inputCfAtletaJTF.getText();
        
        if(controlloConvalidazione.controlloAtleta(idAtleta) == true) {
            try {
                datiAtleta = controllerProcuratore.cercaSportivo(idAtleta);
                if(datiAtleta.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "ATLETA "+idAtleta+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "✓ ATLETA "+idAtleta+" TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    datiAtleta.forEach((Atleta atleta)->{
                        nomeJTF.setText(atleta.getNome());
                        cognomeJTF.setText(atleta.getCognmome());
                        dataNascitaJTF.setText(dateFormat.format(atleta.getDataNascita()));
                        ruoloJTF.setText(atleta.getRuolo());
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraContrattoClub.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CODICE FISCALE DELL'ATLETA DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void inputIdSponsorJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdSponsorJTFActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        int idSponsor = Integer.parseInt(inputIdSponsorJTF.getText());
        
        if(controlloConvalidazione.controllaId(String.valueOf(idSponsor)) == true) {
            try {
                String nomeSponsor = controllerProcuratore.cercaSponsor(idSponsor);
                if(controlloConvalidazione.controllaNome(nomeSponsor) == true)
                    nomeSponsorJTF.setText(nomeSponsor);
                else {
                    Toolkit.getDefaultToolkit().beep();
                    nomeSponsorJTF.setText(" ");
                    JOptionPane.showMessageDialog(this, "SPONSOR CON ID "+idSponsor+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistrareContrattoSponsor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE L'ID DELLO SPONSOR DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inputIdSponsorJTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String idAtleta = inputCfAtletaJTF.getText();
        int idSponsor = 0;
        java.sql.Date dataInizio = null;
        java.sql.Date dataFine = null;
        float valContratto = 0;        
        
        try {
            dataInizio = new java.sql.Date(inputDataInizioJDC.getDate().getTime());
            dataFine = new java.sql.Date(inputDataFineJDC.getDate().getTime());
            idSponsor = Integer.parseInt(inputIdSponsorJTF.getText());
            valContratto = Float.parseFloat(inputValoreContrttoJTF.getText());
        }catch(NullPointerException npe) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "INSERIRE UNA DATA VALIDA", "WARNING", JOptionPane.WARNING_MESSAGE);
        }catch(NumberFormatException nfe) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "INSERIRE UN NUMERO VALIDO", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        
        if(controlloConvalidazione.controllaStipulaContratto(idAtleta, String.valueOf(idSponsor), String.valueOf(dataInizio), String.valueOf(dataFine), String.valueOf(valContratto)) == true) {
            if(datiAtleta.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "ATLETA CON CODICE FISCALE "+idAtleta+" NON ESISTE\n\t\tNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                    JOptionPane.showMessageDialog(this, "✓ REGISTRAZIONE DEL CONTRATTO EFFETTUATA CON SUCCESSO", "REGISTRAZIONE", JOptionPane.INFORMATION_MESSAGE);
                    controllerProcuratore.registraContratto(idAtleta, idSponsor, dataInizio, dataFine, valContratto, "SPONSOR");
                } catch (ExceptionDao ex) {
                    Logger.getLogger(RegistraContrattoClub.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


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
                new RegistrareContrattoSponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JLabel cfAtletaJL;
    private javax.swing.JLabel cognomeJL;
    private javax.swing.JTextField cognomeJTF;
    private javax.swing.JLabel dataFineJL;
    private javax.swing.JLabel dataInizioJL;
    private javax.swing.JLabel dataNascitaJL;
    private javax.swing.JTextField dataNascitaJTF;
    private javax.swing.JLabel idSponsorJL;
    private javax.swing.JTextField inputCfAtletaJTF;
    private com.toedter.calendar.JDateChooser inputDataFineJDC;
    private com.toedter.calendar.JDateChooser inputDataInizioJDC;
    private javax.swing.JTextField inputIdSponsorJTF;
    private javax.swing.JTextField inputValoreContrttoJTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JTextField nomeJTF;
    private javax.swing.JLabel nomeSponsorJL;
    private javax.swing.JTextField nomeSponsorJTF;
    private javax.swing.JLabel ruoloJL;
    private javax.swing.JTextField ruoloJTF;
    private javax.swing.JLabel titoloJL;
    private javax.swing.JLabel valContrattoJL;
    // End of variables declaration//GEN-END:variables
}
