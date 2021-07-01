
package view.elimina;

import controller.ControllerSportivo;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Atleta;
import view.SezioneAtletaView;

public class EliminaAtleta extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI DEL PROCURATORE*/
    private ArrayList<Atleta> datiAtleta =  new ArrayList<Atleta>();
    
    public EliminaAtleta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codeFiscaleJL = new javax.swing.JLabel();
        InputCodiceFiscaleJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAtletaJT = new javax.swing.JTable();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnEliminaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codeFiscaleJL.setText("Codice Fiscale");

        btnCercaJB.setText("CERCA");
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });

        tableAtletaJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cognome", "Sesso", "Nazionalità", "Indirizzo", "Data Nascita", "Telefono", "Codice Fiscale", "Ruolo Atleta", "Peso", "ID Procuratore Associato", "Iban Atleta"
            }
        ));
        jScrollPane1.setViewportView(tableAtletaJT);

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        btnEliminaJB.setText("ELIMINA");
        btnEliminaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codeFiscaleJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputCodiceFiscaleJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCercaJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTornaIndietroJB)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(btnEliminaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeFiscaleJL)
                    .addComponent(InputCodiceFiscaleJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCercaJB)
                    .addComponent(btnTornaIndietroJB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminaJB, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SezioneAtletaView sezioneAtleta = new SezioneAtletaView();
        sezioneAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        String codiceFiscaleAtletaPreso = InputCodiceFiscaleJTF.getText();
        
        if(controlloConvalidazione.controlloCercaAtleta(codiceFiscaleAtletaPreso) == true) {
            try {
                datiAtleta = controllerSportivo.cercaSportivo(codiceFiscaleAtletaPreso);
                if(datiAtleta.isEmpty())
                    JOptionPane.showMessageDialog(this, "ATLETA "+codiceFiscaleAtletaPreso+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                else{
                    JOptionPane.showMessageDialog(this, "✓ ATLETA "+codiceFiscaleAtletaPreso+" TROVATO", "TROVATO", JOptionPane.INFORMATION_MESSAGE);
                    DefaultTableModel tblModel = (DefaultTableModel)tableAtletaJT.getModel();
                    tblModel.setRowCount(0);
                    datiAtleta.forEach((Atleta atleta)->{
                        tblModel.addRow(new Object[]{
                            atleta.getNome(),
                            atleta.getCognmome(),
                            atleta.getSesso(),
                            atleta.getNazione(),
                            atleta.getIndirizzo(),
                            atleta.getDataNascita(),
                            atleta.getTelefono(),
                            atleta.getCodiceFiscale(),
                            atleta.getRuolo(),
                            atleta.getPeso(),
                            atleta.getIdProcuratore(),
                            atleta.getIban()
                        });
                        tableAtletaJT.setModel(tblModel);
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(EliminaAtleta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CODICE FISCALE DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnEliminaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        String codiceFiscaleAtletaPreso = InputCodiceFiscaleJTF.getText();
        
        if(controlloConvalidazione.controlloCercaAtleta(codiceFiscaleAtletaPreso) == false)
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CODICE FISCALE DA ELIMINARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        else{
            if(datiAtleta.isEmpty())
                JOptionPane.showMessageDialog(this, "ATLETA "+codiceFiscaleAtletaPreso+" NON ESISTE\nNON POSSIBILE ELIMINARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            else {
                try {
                    controllerSportivo.eliminaSportivo(codiceFiscaleAtletaPreso);
                    DefaultTableModel tblModel = (DefaultTableModel)tableAtletaJT.getModel();
                    tblModel.setRowCount(0);
                    JOptionPane.showMessageDialog(this, "✓ ELIMINAZIONE EFFETTUATA CON SUCCESSO", "ELIMINAZIONE", JOptionPane.INFORMATION_MESSAGE);
                } catch (ExceptionDao ex) {
                    Logger.getLogger(EliminaAtleta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminaJBActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputCodiceFiscaleJTF;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnEliminaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel codeFiscaleJL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAtletaJT;
    // End of variables declaration//GEN-END:variables
}
