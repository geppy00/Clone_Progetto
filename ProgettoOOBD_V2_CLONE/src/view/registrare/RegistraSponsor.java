
package view.registrare;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.SezioneSponsorView;

public class RegistraSponsor extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*COSTRUTTORE*/
    public RegistraSponsor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeSponsorJL = new javax.swing.JLabel();
        inputNomeSponsorJTF = new javax.swing.JTextField();
        indirizzoJL = new javax.swing.JLabel();
        inputIndirizzoJTF = new javax.swing.JTextField();
        telefonoJL = new javax.swing.JLabel();
        inputTelefonoJTF = new javax.swing.JTextField();
        btnRegistraJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeSponsorJL.setText("Nome");

        indirizzoJL.setText("indirizzo");

        telefonoJL.setText("Telefono");

        btnRegistraJB.setText("REGISTRA");
        btnRegistraJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraJBActionPerformed(evt);
            }
        });

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
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
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(indirizzoJL)
                                    .addComponent(nomeSponsorJL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputNomeSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telefonoJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputTelefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistraJB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeSponsorJL)
                    .addComponent(inputNomeSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indirizzoJL)
                    .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoJL)
                    .addComponent(inputTelefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistraJB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneSponsorView sezioneSponsorView = new SezioneSponsorView();
        sezioneSponsorView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnRegistraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        
        String nomeSponsor = inputNomeSponsorJTF.getText();
        String indirizzoSponsor = inputIndirizzoJTF.getText();
        String telefonoSponsor = inputTelefonoJTF.getText();
        
        if(controlloConvalidazione.controlloRegistraSponsor(nomeSponsor, indirizzoSponsor, telefonoSponsor) == true) {
            try {
                controllerSponsor.registraSponsor(nomeSponsor, indirizzoSponsor, telefonoSponsor);
                JOptionPane.showMessageDialog(this, "✓ REGISTRAZIONE EFFETTUATA CON SUCCESSO", "REGISTRAZIONE", JOptionPane.INFORMATION_MESSAGE);
            } catch (ExceptionDao ex) {
                Logger.getLogger(RegistraSponsor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnRegistraJBActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraSponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnRegistraJB;
    private javax.swing.JLabel indirizzoJL;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNomeSponsorJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JLabel nomeSponsorJL;
    private javax.swing.JLabel telefonoJL;
    // End of variables declaration//GEN-END:variables
}
