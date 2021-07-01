
package view.modificaDati;

import controller.ControllerProcuratore;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Admin;
import model.Procuratore;
import view.AdminView;


public class ModificaDatiProcuratore extends javax.swing.JFrame {
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private static final String FORMAT = "yyyy/MM/dd";
    
    /*DATI DEL PROCURATORE*/
    private ArrayList<Procuratore> datiProcuratore =  new ArrayList<Procuratore>();
    
    public ModificaDatiProcuratore() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        matricolaJL = new javax.swing.JLabel();
        nomeJL = new javax.swing.JLabel();
        cognomeJL = new javax.swing.JLabel();
        sessoJL = new javax.swing.JLabel();
        nazioneJL = new javax.swing.JLabel();
        indirizzoJL = new javax.swing.JLabel();
        dataNascitaJL = new javax.swing.JLabel();
        telefonoJL = new javax.swing.JLabel();
        codiceFiscaleJL = new javax.swing.JLabel();
        ibanJL = new javax.swing.JLabel();
        inputMatricolaJTF = new javax.swing.JTextField();
        inputNomeJTF = new javax.swing.JTextField();
        inputCognomeJTF = new javax.swing.JTextField();
        inputSessoJTF = new javax.swing.JTextField();
        inputNazioneJTF = new javax.swing.JTextField();
        inputIndirizzoJTF = new javax.swing.JTextField();
        inputTelefonoJTF = new javax.swing.JTextField();
        inputCodiceFiscaleJTF = new javax.swing.JTextField();
        inputIbanJTF = new javax.swing.JTextField();
        inserisciMatricolaJL = new javax.swing.JLabel();
        inputMatricolaDaCercareJTF = new javax.swing.JTextField();
        btnCercaJTF = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        btnModificaJB = new javax.swing.JButton();
        cambiaDataNascitaJDC = new com.toedter.calendar.JDateChooser();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        matricolaJL.setText("Matricola");

        nomeJL.setText("Nome");

        cognomeJL.setText("Cognome");

        sessoJL.setText("Sesso");

        nazioneJL.setText("Nazione");

        indirizzoJL.setText("Indirizzo");

        dataNascitaJL.setText("Data Nascita");

        telefonoJL.setText("Telefono");

        codiceFiscaleJL.setText("Codice Fiscale");

        ibanJL.setText("IBAN");

        inserisciMatricolaJL.setText("INSERISCI LA MATRICOLA");

        btnCercaJTF.setText("CERCA");
        btnCercaJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJTFActionPerformed(evt);
            }
        });

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

        cambiaDataNascitaJDC.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ibanJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputIbanJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codiceFiscaleJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCodiceFiscaleJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(telefonoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTelefonoJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataNascitaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cambiaDataNascitaJDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(indirizzoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputIndirizzoJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nazioneJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNazioneJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sessoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSessoJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cognomeJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCognomeJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(matricolaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputMatricolaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomeJTF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(inputMatricolaDaCercareJTF))
                            .addComponent(inserisciMatricolaJL))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCercaJTF)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matricolaJL)
                            .addComponent(inputMatricolaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inserisciMatricolaJL))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeJL)
                            .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cognomeJL)
                            .addComponent(inputCognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(inputMatricolaDaCercareJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCercaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessoJL)
                    .addComponent(inputSessoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazioneJL)
                    .addComponent(inputNazioneJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indirizzoJL)
                    .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataNascitaJL)
                    .addComponent(cambiaDataNascitaJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoJL)
                    .addComponent(inputTelefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCodiceFiscaleJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codiceFiscaleJL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIbanJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibanJL))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       AdminView adminPage = new AdminView();
       adminPage.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    public String convertiDate(java.util.Date dataDiNascita){
        DateFormat df = new SimpleDateFormat(FORMAT);
        String strDate = df.format(dataDiNascita);
        return strDate;
    }
    
    private void btnCercaJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJTFActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        String matricolaCopiata = inputMatricolaDaCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaProcuratore(matricolaCopiata) == true) {
            try {
                datiProcuratore = controllerProcuratore.cercaProcuratore(matricolaCopiata);
                if(datiProcuratore.isEmpty())
                    JOptionPane.showMessageDialog(this, "PROCURATORE "+matricolaCopiata+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                else{
                    JOptionPane.showMessageDialog(this, "✓ PROCURATORE "+matricolaCopiata+" TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    datiProcuratore.forEach((Procuratore procuratore)->{
                        inputMatricolaJTF.setText(procuratore.getCode_procuratore());
                        inputNomeJTF.setText(procuratore.getNome());
                        inputCognomeJTF.setText(procuratore.getCognome());
                        inputSessoJTF.setText(procuratore.getSesso());
                        inputNazioneJTF.setText(procuratore.getNazione());
                        inputIndirizzoJTF.setText(procuratore.getIndirizzo());
                        inputTelefonoJTF.setText(procuratore.getTelefono());
                        inputCodiceFiscaleJTF.setText(procuratore.getCodFiscale());
                        inputIbanJTF.setText(procuratore.getIban());
                        cambiaDataNascitaJDC.setDate(procuratore.getDataNascita());
                    });
                }
            } catch (ExceptionDao ex) {
                    Logger.getLogger(ModificaDatiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LA MATRICOLA DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btnCercaJTFActionPerformed

    private void btnModificaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        java.sql.Date dataNascitaPresoSql = null;
        String matricolaDaModificare = inputMatricolaDaCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaProcuratore(matricolaDaModificare) == true) {
            if(datiProcuratore.isEmpty())
                JOptionPane.showMessageDialog(this, "PROCURATORE "+matricolaDaModificare+" NON ESISTE\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            else {
                String matricolaNuova = inputMatricolaJTF.getText();
                String nomeNuovo = inputNomeJTF.getText();
                String cognomeNuovo = inputCognomeJTF.getText();
                String sessoNuovo = inputSessoJTF.getText();
                String nazioneNuova = inputNazioneJTF.getText();
                String indirizzoNuovo = inputIndirizzoJTF.getText();
                String telefonoNuovo = inputTelefonoJTF.getText();
                String codiceFiscaleNuovo = inputCodiceFiscaleJTF.getText();
                String ibanNuovo = inputIbanJTF.getText();

                try {
                    dataNascitaPresoSql = new java.sql.Date(cambiaDataNascitaJDC.getDate().getTime());
                } catch(NullPointerException nex) {
                    JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERISCI UNA DATA VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }

                if(controlloConvalidazione.controlloModificaProcuratore(matricolaNuova, nomeNuovo, cognomeNuovo, sessoNuovo, nazioneNuova, indirizzoNuovo, telefonoNuovo, codiceFiscaleNuovo, ibanNuovo, String.valueOf(dataNascitaPresoSql)) == true) {
                    try {
                        controllerProcuratore.aggiornaProcuratore(matricolaNuova, nomeNuovo, cognomeNuovo, sessoNuovo, nazioneNuova, indirizzoNuovo, (java.sql.Date) dataNascitaPresoSql, telefonoNuovo, codiceFiscaleNuovo, ibanNuovo, matricolaDaModificare);
                        JOptionPane.showMessageDialog(this, "✓ MODIFICA DEL PROCURATORE "+matricolaDaModificare+" EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                    } catch (ExceptionDao ex) {
                        Logger.getLogger(ModificaDatiProcuratore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                    JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE LA MATRICOLA PER TROVARE IL PROCURATORE DA MODIFICARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnModificaJBActionPerformed

    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaDatiProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJTF;
    private javax.swing.JButton btnModificaJB;
    private com.toedter.calendar.JDateChooser cambiaDataNascitaJDC;
    private javax.swing.JLabel codiceFiscaleJL;
    private javax.swing.JLabel cognomeJL;
    private javax.swing.JLabel dataNascitaJL;
    private javax.swing.JLabel ibanJL;
    private javax.swing.JLabel indirizzoJL;
    private javax.swing.JTextField inputCodiceFiscaleJTF;
    private javax.swing.JTextField inputCognomeJTF;
    private javax.swing.JTextField inputIbanJTF;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputMatricolaDaCercareJTF;
    private javax.swing.JTextField inputMatricolaJTF;
    private javax.swing.JTextField inputNazioneJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JTextField inputSessoJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel inserisciMatricolaJL;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel matricolaJL;
    private javax.swing.JLabel nazioneJL;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JLabel sessoJL;
    private javax.swing.JLabel telefonoJL;
    // End of variables declaration//GEN-END:variables
}
