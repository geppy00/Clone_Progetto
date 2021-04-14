
package view.registrare;

import controller.ControllerProcuratore;
import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.SezioneProcuratoreView;

public class RegistraProcuratore extends javax.swing.JFrame {

   
    public RegistraProcuratore() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeJL = new javax.swing.JLabel();
        cognomeJL = new javax.swing.JLabel();
        nazioneJL = new javax.swing.JLabel();
        sessoJCB = new javax.swing.JComboBox<>();
        indirizzoJL = new javax.swing.JLabel();
        dataNascitaJDC = new com.toedter.calendar.JDateChooser();
        telefonoJL = new javax.swing.JLabel();
        codiceFiscaleJL = new javax.swing.JLabel();
        ibanJL = new javax.swing.JLabel();
        inputNomeJTF = new javax.swing.JTextField();
        sessoJL = new javax.swing.JLabel();
        InputCognomeJTF = new javax.swing.JTextField();
        inputNazioneJTF = new javax.swing.JTextField();
        InputTelefonoJTF = new javax.swing.JTextField();
        InputCodiceFiscaleJTF = new javax.swing.JTextField();
        InputIbanJTF = new javax.swing.JTextField();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnRegistraJB = new javax.swing.JButton();
        inputIndirizzoJTF = new javax.swing.JTextField();
        dataNascitaJL = new javax.swing.JLabel();
        matricolaJL = new javax.swing.JLabel();
        inputMatricolaJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeJL.setText("Nome");

        cognomeJL.setText("Cognome");

        nazioneJL.setText("Nazione");
        nazioneJL.setToolTipText("");

        sessoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maschio", "Femmina", "Altro" }));

        indirizzoJL.setText("Indirizzo");

        dataNascitaJDC.setDateFormatString("yyyy/MM/dd");

        telefonoJL.setText("Telefono");

        codiceFiscaleJL.setText("Codice Fiscale");

        ibanJL.setText("Iban");

        sessoJL.setText("Sesso");

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        btnRegistraJB.setText("REGISTRA");
        btnRegistraJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraJBActionPerformed(evt);
            }
        });

        dataNascitaJL.setText("Data di nascita");

        matricolaJL.setText("Matricola");
        matricolaJL.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(indirizzoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputIndirizzoJTF))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ibanJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputIbanJTF))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(codiceFiscaleJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputCodiceFiscaleJTF))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(telefonoJL)
                        .addGap(2, 2, 2)
                        .addComponent(InputTelefonoJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cognomeJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputCognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nazioneJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNazioneJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomeJTF))
                    .addComponent(btnTornaIndietroJB)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(matricolaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputMatricolaJTF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistraJB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataNascitaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNascitaJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sessoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sessoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJL)
                    .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cognomeJL)
                            .addComponent(InputCognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataNascitaJL)
                            .addComponent(dataNascitaJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazioneJL)
                    .addComponent(inputNazioneJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(indirizzoJL)
                        .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sessoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sessoJL)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonoJL)
                            .addComponent(InputTelefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codiceFiscaleJL)
                            .addComponent(InputCodiceFiscaleJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ibanJL)
                            .addComponent(InputIbanJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matricolaJL)
                            .addComponent(inputMatricolaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btnTornaIndietroJB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistraJB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
       SezioneProcuratoreView sezioneProcuratore = new SezioneProcuratoreView();
       sezioneProcuratore.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnRegistraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraJBActionPerformed
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        String sessoPreso = (String) sessoJCB.getSelectedItem();
        String matricolaPresa = inputMatricolaJTF.getText();
        String nomePreso = inputNomeJTF.getText();
        String cognomePreso = InputCognomeJTF.getText();
        String nazionePresa = inputNazioneJTF.getText();
        String indirizzoPreso = inputIndirizzoJTF.getText();
        java.sql.Date dataNascitaPresoSql = new java.sql.Date(dataNascitaJDC.getDate().getTime());
        String telefonoPreso = InputTelefonoJTF.getText();
        String codiceFiscalePreso = InputCodiceFiscaleJTF.getText();
        String ibanPreso = InputIbanJTF.getText();
        
        try {
            controllerProcuratore.registraProcuratore(matricolaPresa, nomePreso, cognomePreso, sessoPreso, nazionePresa, indirizzoPreso, (java.sql.Date) dataNascitaPresoSql, telefonoPreso, codiceFiscalePreso, ibanPreso);
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraProcuratore.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnRegistraJBActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistraProcuratore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistraProcuratore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistraProcuratore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistraProcuratore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputCodiceFiscaleJTF;
    private javax.swing.JTextField InputCognomeJTF;
    private javax.swing.JTextField InputIbanJTF;
    private javax.swing.JTextField InputTelefonoJTF;
    private javax.swing.JButton btnRegistraJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel codiceFiscaleJL;
    private javax.swing.JLabel cognomeJL;
    private com.toedter.calendar.JDateChooser dataNascitaJDC;
    private javax.swing.JLabel dataNascitaJL;
    private javax.swing.JLabel ibanJL;
    private javax.swing.JLabel indirizzoJL;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputMatricolaJTF;
    private javax.swing.JTextField inputNazioneJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JLabel matricolaJL;
    private javax.swing.JLabel nazioneJL;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JComboBox<String> sessoJCB;
    private javax.swing.JLabel sessoJL;
    private javax.swing.JLabel telefonoJL;
    // End of variables declaration//GEN-END:variables
}
