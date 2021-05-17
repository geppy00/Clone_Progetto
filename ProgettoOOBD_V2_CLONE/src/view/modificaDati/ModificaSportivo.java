
package view.modificaDati;

import controller.ControllerSportivo;
import dao.ExceptionDao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Atleta;
import view.SezioneAtletaView;

public class ModificaSportivo extends javax.swing.JFrame {
    
    public ModificaSportivo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codiceFiscaleJL = new javax.swing.JLabel();
        inputCodiceFiscaleJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();
        nomeJL = new javax.swing.JLabel();
        inputNomeJTF = new javax.swing.JTextField();
        cognomeJL = new javax.swing.JLabel();
        inputCognomeJTF = new javax.swing.JTextField();
        sessoJL = new javax.swing.JLabel();
        inputSessoJTF = new javax.swing.JTextField();
        nazioneJL = new javax.swing.JLabel();
        inputNazioneJTF = new javax.swing.JTextField();
        indirizzoJL = new javax.swing.JLabel();
        inputIndirizzoJTF = new javax.swing.JTextField();
        dataNascitaJL = new javax.swing.JLabel();
        inputDataNascitaJDC = new com.toedter.calendar.JDateChooser();
        telefonoJL = new javax.swing.JLabel();
        inputTelefonoJTF = new javax.swing.JTextField();
        codeFiscaleJL = new javax.swing.JLabel();
        inputCodiceFiscaleModificatoJTF = new javax.swing.JTextField();
        ruoloAtletaJL = new javax.swing.JLabel();
        inputRuoloJTF = new javax.swing.JTextField();
        pesoJL = new javax.swing.JLabel();
        inputPesoJTF = new javax.swing.JTextField();
        idProcuratoreAssociatoJL = new javax.swing.JLabel();
        inputProcuratoreAssociatoJTF = new javax.swing.JTextField();
        ibanJL = new javax.swing.JLabel();
        inputIbanJTF = new javax.swing.JTextField();
        btnAggiornaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codiceFiscaleJL.setText("CODICE FISCALE");

        btnCercaJB.setText("CERCA");
        btnCercaJB.setToolTipText("");
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        nomeJL.setText("Nome");

        inputNomeJTF.setToolTipText("");

        cognomeJL.setText("Cognome");

        sessoJL.setText("Sesso");

        nazioneJL.setText("Nazionalità");

        indirizzoJL.setText("Indirizzo");

        dataNascitaJL.setText("Data di Nascita");
        dataNascitaJL.setToolTipText("");

        telefonoJL.setText("Telefono");

        codeFiscaleJL.setText("Codice Fiscale");

        ruoloAtletaJL.setText("Ruolo Atleta");

        pesoJL.setText("Peso");

        idProcuratoreAssociatoJL.setText("ID Procuratore Associato");

        ibanJL.setText("IBAN");

        btnAggiornaJB.setText("AGGIORNA");
        btnAggiornaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaJBActionPerformed(evt);
            }
        });

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nomeJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cognomeJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputCognomeJTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sessoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputSessoJTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nazioneJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputNazioneJTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(indirizzoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputIndirizzoJTF)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telefonoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputTelefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codeFiscaleJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputCodiceFiscaleModificatoJTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ruoloAtletaJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputRuoloJTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pesoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputPesoJTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idProcuratoreAssociatoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputProcuratoreAssociatoJTF))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dataNascitaJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputDataNascitaJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ibanJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIbanJTF)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTornaIndietroJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAggiornaJB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(codiceFiscaleJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCodiceFiscaleJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCercaJB)
                                .addGap(38, 38, 38)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codiceFiscaleJL)
                    .addComponent(inputCodiceFiscaleJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCercaJB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJL)
                    .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoJL)
                    .addComponent(inputTelefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cognomeJL)
                    .addComponent(inputCognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeFiscaleJL)
                    .addComponent(inputCodiceFiscaleModificatoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessoJL)
                    .addComponent(inputSessoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruoloAtletaJL)
                    .addComponent(inputRuoloJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazioneJL)
                    .addComponent(inputNazioneJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoJL)
                    .addComponent(inputPesoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indirizzoJL)
                    .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProcuratoreAssociatoJL)
                    .addComponent(inputProcuratoreAssociatoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataNascitaJL)
                    .addComponent(inputDataNascitaJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ibanJL)
                        .addComponent(inputIbanJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTornaIndietroJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAggiornaJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        String CodiceFiscalePreso = inputCodiceFiscaleJTF.getText();
        ArrayList<Atleta> datiAtleta =  new ArrayList<Atleta>();
        
        try {
            datiAtleta = controllerSportivo.cercaSportivo(CodiceFiscalePreso);
            datiAtleta.forEach((Atleta atleta)->{
                inputCodiceFiscaleModificatoJTF.setText(atleta.getCodiceFiscale());
                inputCognomeJTF.setText(atleta.getCognmome());
                inputDataNascitaJDC.setDate(atleta.getDataNascita());
                inputIbanJTF.setText(atleta.getIban());
                inputIndirizzoJTF.setText(atleta.getIndirizzo());
                inputNazioneJTF.setText(atleta.getNazione());
                inputNomeJTF.setText(atleta.getNome());
                String pesoSTR = Float.toString(atleta.getPeso());
                inputPesoJTF.setText(pesoSTR);
                inputProcuratoreAssociatoJTF.setText(atleta.getIdProcuratore());
                inputRuoloJTF.setText(atleta.getRuolo());
                inputSessoJTF.setText(atleta.getSesso());
                inputTelefonoJTF.setText(atleta.getTelefono());
            });
        } catch (ExceptionDao ex) {
            Logger.getLogger(ModificaSportivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
       SezioneAtletaView sezioneAtletaView = new SezioneAtletaView();
       sezioneAtletaView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnAggiornaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        String codiceFiscalePreso = inputCodiceFiscaleJTF.getText();
        
        String nome = inputNomeJTF.getText();
        String cognome = inputCognomeJTF.getText();
        String sesso = inputSessoJTF.getText();
        String nazionalita = inputNazioneJTF.getText();
        String indirizzo = inputIndirizzoJTF.getText();
        java.sql.Date dataNascitaSql = new java.sql.Date(inputDataNascitaJDC.getDate().getTime()); 
        String telefono = inputTelefonoJTF.getText();
        String codiceFiscale = inputCodiceFiscaleModificatoJTF.getText();
        String ruolo = inputRuoloJTF.getText();
        String pesoStr = inputPesoJTF.getText();
        float peso = Float.parseFloat(pesoStr);
        String idProcuratore = inputProcuratoreAssociatoJTF.getText();
        String iban = inputIbanJTF.getText();
        
        System.out.println("NAZIONE: "+nazionalita);
        
        try {
            controllerSportivo.aggiornaSportivo(codiceFiscalePreso, nome, cognome, sesso, nazionalita, indirizzo, dataNascitaSql, telefono, codiceFiscale, ruolo, peso, idProcuratore, iban);
        } catch (ExceptionDao ex) {
            Logger.getLogger(ModificaSportivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAggiornaJBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaSportivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel codeFiscaleJL;
    private javax.swing.JLabel codiceFiscaleJL;
    private javax.swing.JLabel cognomeJL;
    private javax.swing.JLabel dataNascitaJL;
    private javax.swing.JLabel ibanJL;
    private javax.swing.JLabel idProcuratoreAssociatoJL;
    private javax.swing.JLabel indirizzoJL;
    private javax.swing.JTextField inputCodiceFiscaleJTF;
    private javax.swing.JTextField inputCodiceFiscaleModificatoJTF;
    private javax.swing.JTextField inputCognomeJTF;
    private com.toedter.calendar.JDateChooser inputDataNascitaJDC;
    private javax.swing.JTextField inputIbanJTF;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNazioneJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JTextField inputPesoJTF;
    private javax.swing.JTextField inputProcuratoreAssociatoJTF;
    private javax.swing.JTextField inputRuoloJTF;
    private javax.swing.JTextField inputSessoJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel nazioneJL;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JLabel pesoJL;
    private javax.swing.JLabel ruoloAtletaJL;
    private javax.swing.JLabel sessoJL;
    private javax.swing.JLabel telefonoJL;
    // End of variables declaration//GEN-END:variables
}
