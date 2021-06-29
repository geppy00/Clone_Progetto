
package view.modificaDati;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Sponsor;
import view.SezioneSponsorView;

public class ModificaSponsor extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI DELLO SPONSOR*/
    private ArrayList<Sponsor> datiSponsor = new ArrayList<Sponsor>();
    
    public ModificaSponsor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sponsorCercareJL = new javax.swing.JLabel();
        inputNomeSponsorCercareJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        nomeJL = new javax.swing.JLabel();
        inputNomeSponsorJTF = new javax.swing.JTextField();
        infoJL = new javax.swing.JLabel();
        indirizzoJL = new javax.swing.JLabel();
        inputIndirizzoJTF = new javax.swing.JTextField();
        telefonoJL = new javax.swing.JLabel();
        inputTelefonoJTF = new javax.swing.JTextField();
        btnAggiornaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sponsorCercareJL.setText("SPONSOR DA CERCARE");

        btnCercaJB.setText("CERCA");
        btnCercaJB.setToolTipText("");
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        nomeJL.setText("Nome");

        infoJL.setText("INFORMAZIONI SPONSOR");

        indirizzoJL.setText("Indirizzo");

        telefonoJL.setText("Numero telefono");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telefonoJL)
                                    .addComponent(indirizzoJL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(inputTelefonoJTF))
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeJL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputNomeSponsorCercareJTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sponsorCercareJL, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCercaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputNomeSponsorJTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(infoJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAggiornaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sponsorCercareJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputNomeSponsorCercareJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCercaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(infoJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeJL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indirizzoJL)
                    .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoJL)
                    .addComponent(inputTelefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAggiornaJB, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneSponsorView sezioneSponsorView = new SezioneSponsorView();
        sezioneSponsorView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        String nomeSponsorCercare = inputNomeSponsorCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaSponsor(nomeSponsorCercare) == true) {
            try {
                datiSponsor = controllerSponsor.cercaSponsor(nomeSponsorCercare);
                if(datiSponsor.isEmpty())
                    JOptionPane.showMessageDialog(this, "SPONSOR "+nomeSponsorCercare+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                else {
                    JOptionPane.showMessageDialog(this, "✓ SPONSOR "+nomeSponsorCercare+" TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    datiSponsor.forEach((Sponsor sponsor) -> {
                        inputNomeSponsorJTF.setText(sponsor.getNome());
                        inputIndirizzoJTF.setText(sponsor.getIndirizzo());
                        inputTelefonoJTF.setText(sponsor.getTelefono());
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(ModificaSponsor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LO SPONSOR DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnAggiornaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        String nomeSponsorCercare = inputNomeSponsorCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaSponsor(nomeSponsorCercare) == true) {
            if(datiSponsor.isEmpty())
                    JOptionPane.showMessageDialog(this, "SPONSOR "+nomeSponsorCercare+" NON ESISTE\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            else {
                String nomeDaAggiornare = inputNomeSponsorJTF.getText();
                String indirizzoDaAggiornare = inputIndirizzoJTF.getText();
                String telefonoDaAggiornare = inputTelefonoJTF.getText();
                
                if(controlloConvalidazione.controlloModificaSponsor(nomeDaAggiornare, indirizzoDaAggiornare, telefonoDaAggiornare) == true) {
                    try {
                        controllerSponsor.aggiornaSponsor(nomeDaAggiornare, indirizzoDaAggiornare, telefonoDaAggiornare, nomeSponsorCercare);
                        JOptionPane.showMessageDialog(this, "✓ MODIFICA DELLO SPONSOR "+nomeSponsorCercare+" EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                    } catch (ExceptionDao ex) {
                        Logger.getLogger(ModificaSponsor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                    JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LO SPONSOR DA CERCARE\nPER POTERLO MODIFICARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAggiornaJBActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaSponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaJB;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JLabel indirizzoJL;
    private javax.swing.JLabel infoJL;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNomeSponsorCercareJTF;
    private javax.swing.JTextField inputNomeSponsorJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JLabel sponsorCercareJL;
    private javax.swing.JLabel telefonoJL;
    // End of variables declaration//GEN-END:variables
}
