
package view.elimina;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sponsor;
import view.SezioneSponsorView;

public class EliminaSponsor extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI PER LO SPONSOR*/
    private ArrayList<Sponsor> datiSponsor = new ArrayList<Sponsor>();
    
    public EliminaSponsor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeSponsorJL = new javax.swing.JLabel();
        inputNomeSponsorJTF = new javax.swing.JTextField();
        btnCercaSponsorJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visualizzaDatiSponsorJT = new javax.swing.JTable();
        btnEliminaSponsorJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeSponsorJL.setText("Nome Sponsor");

        btnCercaSponsorJB.setText("CERCA");
        btnCercaSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaSponsorJBActionPerformed(evt);
            }
        });

        visualizzaDatiSponsorJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id Sponsor", "Nome", "Indirizzo", "Numero Telefono"
            }
        ));
        jScrollPane1.setViewportView(visualizzaDatiSponsorJT);

        btnEliminaSponsorJB.setText("ELIMINA");
        btnEliminaSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaSponsorJBActionPerformed(evt);
            }
        });

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.setToolTipText("");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(nomeSponsorJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomeSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCercaSponsorJB)
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminaSponsorJB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeSponsorJL)
                    .addComponent(inputNomeSponsorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCercaSponsorJB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminaSponsorJB, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       SezioneSponsorView sezioneSportivoView = new SezioneSponsorView();
       sezioneSportivoView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnCercaSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaSponsorJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        String nomeSponsorPreso = inputNomeSponsorJTF.getText();
        
        if(controlloConvalidazione.controlloCercaSponsor(nomeSponsorPreso) == true) {
            try {
                datiSponsor = controllerSponsor.cercaSponsor(nomeSponsorPreso);
                if(datiSponsor.isEmpty())
                    JOptionPane.showMessageDialog(this, "SPONSOR "+nomeSponsorPreso+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                else{
                    DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiSponsorJT.getModel();
                    tblModel.setRowCount(0);
                    datiSponsor.forEach((Sponsor sponsor) -> {
                        tblModel.addRow(new Object[]{
                            sponsor.getIdSponsor(),
                            sponsor.getNome(),
                            sponsor.getIndirizzo(),
                            sponsor.getTelefono()
                        });
                        visualizzaDatiSponsorJT.setModel(tblModel);
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(EliminaSponsor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LO SPONSOR DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnCercaSponsorJBActionPerformed

    private void btnEliminaSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaSponsorJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        String nomeSponsorPreso = inputNomeSponsorJTF.getText();
        
        if(controlloConvalidazione.controlloCercaSponsor(nomeSponsorPreso) == false)
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LO SPONSOR DA ELIMINARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        else {
            if(datiSponsor.isEmpty())
                JOptionPane.showMessageDialog(this, "SPONSOR "+nomeSponsorPreso+" NON ESISTE\nNON POSSIBILE ELIMINARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            else {
                try {
                    controllerSponsor.eliminaSponsor(nomeSponsorPreso);
                    DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiSponsorJT.getModel();
                    tblModel.setRowCount(0);
                    JOptionPane.showMessageDialog(this, "✓ ELIMINAZIONE EFFETTUATA CON SUCCESSO", "ELIMINAZIONE", JOptionPane.INFORMATION_MESSAGE);
                } catch (ExceptionDao ex) {
                    Logger.getLogger(EliminaSponsor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminaSponsorJBActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaSponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaSponsorJB;
    private javax.swing.JButton btnEliminaSponsorJB;
    private javax.swing.JTextField inputNomeSponsorJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeSponsorJL;
    private javax.swing.JTable visualizzaDatiSponsorJT;
    // End of variables declaration//GEN-END:variables
}
