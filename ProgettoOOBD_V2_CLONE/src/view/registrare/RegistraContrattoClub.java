
package view.registrare;

import controller.ControllerProcuratore;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Atleta;
import view.SezioneGestioneContrattiView;


public class RegistraContrattoClub extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private String idProcuratore;
    private ArrayList<Atleta> datiAtleta = new ArrayList<Atleta>();
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
    
    /*COSTRUTTORI*/
    public RegistraContrattoClub(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
    }
    
    public RegistraContrattoClub() {
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        titoloJL = new javax.swing.JLabel();
        CfAtletaJL = new javax.swing.JLabel();
        inputCfAtletaJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        adviceJL = new javax.swing.JLabel();
        nomeJL = new javax.swing.JLabel();
        nomeJTF = new javax.swing.JTextField();
        cognomeJL = new javax.swing.JLabel();
        cognomeJTF = new javax.swing.JTextField();
        dataNascitaJL = new javax.swing.JLabel();
        dataNascitaJTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ruoloJTF = new javax.swing.JTextField();
        lineaJL = new javax.swing.JLabel();
        nomeClubJL = new javax.swing.JLabel();
        inputNomeClubJTF = new javax.swing.JTextField();
        idClubJL = new javax.swing.JLabel();
        inputIdClubJTF = new javax.swing.JTextField();
        dataInizioJL = new javax.swing.JLabel();
        DataInizioJDC = new com.toedter.calendar.JDateChooser();
        dataFineJL = new javax.swing.JLabel();
        DataFineJDC = new com.toedter.calendar.JDateChooser();
        btnStipulaContratto = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        valEconomicoJL = new javax.swing.JLabel();
        inputValContrattoJTF = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titoloJL.setText("STIPULA UN NUOVO CONTRATTO CLUB");

        CfAtletaJL.setText("Codice Fiscale Atleta");

        btnCercaJB.setText("CERCA");
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });

        adviceJL.setText("DATI DELL'ATLETA");

        nomeJL.setText("Nome");

        nomeJTF.setEditable(false);

        cognomeJL.setText("Cognome");

        cognomeJTF.setEditable(false);

        dataNascitaJL.setText("Data Nascita");

        dataNascitaJTF.setEditable(false);

        jLabel1.setText("Ruolo");

        ruoloJTF.setEditable(false);

        lineaJL.setText("_______________________________________________________________________________________________");

        nomeClubJL.setText("Nome Club");

        inputNomeClubJTF.setEditable(false);

        idClubJL.setText("ID Club");

        inputIdClubJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdClubJTFActionPerformed(evt);
            }
        });

        dataInizioJL.setText("Data Inizio");

        DataInizioJDC.setMaxSelectableDate(new java.util.Date(253370764884000L));
        DataInizioJDC.setMinSelectableDate(new java.util.Date(-62135769516000L));
        DataInizioJDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataInizioJDCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DataInizioJDCMouseEntered(evt);
            }
        });
        DataInizioJDC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DataInizioJDCPropertyChange(evt);
            }
        });

        dataFineJL.setText("Data Fine");

        DataFineJDC.setMaxSelectableDate(new java.util.Date(253370764884000L));
        DataFineJDC.setMinSelectableDate(new java.util.Date(-62135769516000L));

        btnStipulaContratto.setText("REGISTRA");
        btnStipulaContratto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStipulaContrattoActionPerformed(evt);
            }
        });

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        valEconomicoJL.setText("Valore Contrattuale");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineaJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(titoloJL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(adviceJL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(CfAtletaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCfAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCercaJB))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(dataNascitaJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataNascitaJTF))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nomeJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cognomeJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ruoloJTF)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStipulaContratto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dataInizioJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataInizioJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idClubJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIdClubJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataFineJL)
                            .addComponent(nomeClubJL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataFineJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNomeClubJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valEconomicoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputValContrattoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CfAtletaJL)
                    .addComponent(inputCfAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCercaJB))
                .addGap(18, 18, 18)
                .addComponent(adviceJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJL)
                    .addComponent(nomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cognomeJL)
                    .addComponent(cognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataNascitaJL)
                            .addComponent(dataNascitaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ruoloJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineaJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeClubJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idClubJL)
                    .addComponent(inputIdClubJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeClubJL))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataInizioJL)
                    .addComponent(DataInizioJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFineJL)
                    .addComponent(DataFineJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valEconomicoJL)
                    .addComponent(inputValContrattoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStipulaContratto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnStipulaContrattoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStipulaContrattoActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String idAtleta = inputCfAtletaJTF.getText();
        int idClub = 0;
        java.sql.Date dataInizio = null;
        java.sql.Date dataFine = null;
        float valContratto = 0;
        
        try {
            dataInizio = new java.sql.Date(DataInizioJDC.getDate().getTime());
            dataFine = new java.sql.Date(DataFineJDC.getDate().getTime());
            idClub = Integer.parseInt(inputIdClubJTF.getText());
            valContratto = Float.parseFloat(inputValContrattoJTF.getText());
        }catch(NullPointerException npe) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "INSERIRE UNA DATA VALIDA", "WARNING", JOptionPane.WARNING_MESSAGE);
        }catch(NumberFormatException nfe) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "INSERIRE UN NUMERO VALIDO", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        
        if(controlloConvalidazione.controllaStipulaContratto(idAtleta, String.valueOf(idClub), String.valueOf(dataInizio), String.valueOf(dataFine), String.valueOf(valContratto)) == true) {
            if(datiAtleta.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "ATLETA CON CODICE FISCALE "+idAtleta+" NON ESISTE\n\t\tNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                    controllerProcuratore.registraContratto(idAtleta, idClub, dataInizio, dataFine, valContratto, "CLUB");
                    JOptionPane.showMessageDialog(this, "✓ REGISTRAZIONE DEL CONTRATTO EFFETTUATA CON SUCCESSO", "REGISTRAZIONE", JOptionPane.INFORMATION_MESSAGE);
                } catch (ExceptionDao ex) {
                    Logger.getLogger(RegistraContrattoClub.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnStipulaContrattoActionPerformed

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

    private void inputIdClubJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdClubJTFActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        int idClub = Integer.parseInt(inputIdClubJTF.getText());
        
        if(controlloConvalidazione.controllaId(String.valueOf(idClub)) == true) {
            try {
                String nomeClub = controllerProcuratore.cercaClub(idClub);
                if(controlloConvalidazione.controllaNome(nomeClub) == true)
                    inputNomeClubJTF.setText(nomeClub);
                else {
                    Toolkit.getDefaultToolkit().beep();
                    inputNomeClubJTF.setText(" ");
                    JOptionPane.showMessageDialog(this, "CLUB CON ID "+idClub+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraContrattoClub.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE L'ID DEL CLUB DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inputIdClubJTFActionPerformed

    
    
    private void DataInizioJDCPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DataInizioJDCPropertyChange
        Date dataInizio = new Date();
        dataInizio = DataInizioJDC.getDate();
        if (dataInizio == null) {  
            // Il form è stato appena creato e nessuna data è stata inserita
            dataInizio = Calendar.getInstance().getTime();
            DataInizioJDC.setDate(dataInizio);
        } 
        
        int nextYear = (DataInizioJDC.getDate().getYear()) + 1;
        DataInizioJDC.getDate().setYear(nextYear);
        dataInizio.setYear(nextYear);
        DataFineJDC.setMinSelectableDate(dataInizio);
    }//GEN-LAST:event_DataInizioJDCPropertyChange

    private void DataInizioJDCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataInizioJDCMouseEntered
        
        
    }//GEN-LAST:event_DataInizioJDCMouseEntered

    public void DataInizioJDCMouseClicked(java.awt.event.MouseEvent evt) {
       
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
                new RegistraContrattoClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CfAtletaJL;
    private com.toedter.calendar.JDateChooser DataFineJDC;
    private com.toedter.calendar.JDateChooser DataInizioJDC;
    private javax.swing.JLabel adviceJL;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnStipulaContratto;
    private javax.swing.JLabel cognomeJL;
    private javax.swing.JTextField cognomeJTF;
    private javax.swing.JLabel dataFineJL;
    private javax.swing.JLabel dataInizioJL;
    private javax.swing.JLabel dataNascitaJL;
    private javax.swing.JTextField dataNascitaJTF;
    private javax.swing.JLabel idClubJL;
    private javax.swing.JTextField inputCfAtletaJTF;
    private javax.swing.JTextField inputIdClubJTF;
    private javax.swing.JTextField inputNomeClubJTF;
    private javax.swing.JTextField inputValContrattoJTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lineaJL;
    private javax.swing.JLabel nomeClubJL;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JTextField nomeJTF;
    private javax.swing.JTextField ruoloJTF;
    private javax.swing.JLabel titoloJL;
    private javax.swing.JLabel valEconomicoJL;
    // End of variables declaration//GEN-END:variables
}
