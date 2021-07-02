
package view.modificaDati;

import controller.ControllerClub;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Club;
import view.SezioneClub;


public class ModificaDatiClub extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI DEL PROCURATORE*/
    private ArrayList<Club> datiClub = new ArrayList<Club>();
    
    public ModificaDatiClub() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeJL = new javax.swing.JLabel();
        inputNomeCercareJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        datiRiportatiJL = new javax.swing.JLabel();
        nomeInJL = new javax.swing.JLabel();
        indirizzoInJL = new javax.swing.JLabel();
        telefonoInJL = new javax.swing.JLabel();
        inputNomeJTF = new javax.swing.JTextField();
        inputIndirizzoJTF = new javax.swing.JTextField();
        inputTelefonoJTF = new javax.swing.JTextField();
        btnModificaJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeJL.setText("Nome Club");

        btnCercaJB.setText("CERCA");
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });

        datiRiportatiJL.setText("TUTTI I DATI RIPORTATI");

        nomeInJL.setText("Nome");

        indirizzoInJL.setText("Indirizzo");

        telefonoInJL.setText("Telefono");

        btnModificaJB.setText("MODIFICA");
        btnModificaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaJBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addComponent(datiRiportatiJL)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(nomeInJL)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(nomeJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(inputNomeCercareJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCercaJB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(indirizzoInJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(telefonoInJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputTelefonoJTF)))))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTornaIndietroJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificaJB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJL)
                    .addComponent(inputNomeCercareJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCercaJB))
                .addGap(18, 18, 18)
                .addComponent(datiRiportatiJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeInJL)
                    .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indirizzoInJL)
                    .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoInJL)
                    .addComponent(inputTelefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificaJB)
                    .addComponent(btnTornaIndietroJB))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SezioneClub sezioneClub = new SezioneClub();
        sezioneClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        String nomeClubCercare = inputNomeCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaClub(nomeClubCercare) == true) {
            try {
                datiClub = controllerClub.cercaClub(nomeClubCercare);
                if(datiClub.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "CLUB "+nomeClubCercare+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "✓ CLUB "+nomeClubCercare+" TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    datiClub.forEach((Club club) -> {
                        inputNomeJTF.setText(club.getNomeClub());
                        inputIndirizzoJTF.setText(club.getIndirizzo());
                        inputTelefonoJTF.setText(club.getTelefono());
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(ModificaDatiClub.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CLUB DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnModificaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        String nomeClubCercare = inputNomeCercareJTF.getText();
        
        if(controlloConvalidazione.controlloCercaClub(nomeClubCercare) == true) {
            if(datiClub.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "CLUB "+nomeClubCercare+" NON ESISTE\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            else {
                String nome = inputNomeJTF.getText();
                String indirizzo = inputIndirizzoJTF.getText();
                String telefono = inputTelefonoJTF.getText();
                if(controlloConvalidazione.controlloModificaClub(nome, indirizzo, telefono) == true) {
                    try {
                        controllerClub.aggiornaClub(nomeClubCercare, nome, indirizzo, telefono);
                        JOptionPane.showMessageDialog(this, "✓ MODIFICA DEL CLUB "+nomeClubCercare+" EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                    } catch (ExceptionDao ex) {
                        Logger.getLogger(ModificaDatiClub.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE IL NOME PER TROVARE IL CLUB DA MODIFICARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificaJBActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaDatiClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnModificaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel datiRiportatiJL;
    private javax.swing.JLabel indirizzoInJL;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNomeCercareJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel nomeInJL;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JLabel telefonoInJL;
    // End of variables declaration//GEN-END:variables
}
