
package view.elimina;

import controller.ControllerClub;
import dao.ExceptionDao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Club;
import view.SezioneClub;


public class EliminaClub extends javax.swing.JFrame {


    public EliminaClub() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeJL = new javax.swing.JLabel();
        inputNomeJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datiClubTabellaJT = new javax.swing.JTable();
        btnEliminaJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeJL.setText("Nome Club");

        btnCercaJB.setText("CERCA");
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });

        datiClubTabellaJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CLUB", "NOME", "INDIRIZZO", "TELEFONO"
            }
        ));
        jScrollPane1.setViewportView(datiClubTabellaJT);

        btnEliminaJB.setText("ELIMINA");
        btnEliminaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaJBActionPerformed(evt);
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
                        .addGap(108, 108, 108)
                        .addComponent(nomeJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCercaJB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEliminaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTornaIndietroJB)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJL)
                    .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCercaJB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminaJB)
                    .addComponent(btnTornaIndietroJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        ArrayList<Club> datiClub = new ArrayList<Club>();
        String nomeClubCercare = inputNomeJTF.getText();
        
        try {
            datiClub = controllerClub.cercaClub(nomeClubCercare);
            
            if(datiClub != null) {
                JOptionPane.showMessageDialog(null, "CLUB trovato");
                DefaultTableModel tblModel = (DefaultTableModel)datiClubTabellaJT.getModel();
                datiClub.forEach((Club club) -> {
                    tblModel.addRow(new Object[]{
                        club.getIdClub(),
                        club.getNomeClub(),
                        club.getIndirizzo(),
                        club.getTelefono()
                    });
                    datiClubTabellaJT.setModel(tblModel);
                });
            }
            else
                JOptionPane.showMessageDialog(null, "CLUB non trovato");
        } catch (ExceptionDao ex) {
            Logger.getLogger(EliminaClub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnEliminaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        String nomeClubCercare = inputNomeJTF.getText();
        
        try {
            controllerClub.eliminaClub(nomeClubCercare);
            DefaultTableModel tblModel = (DefaultTableModel)datiClubTabellaJT.getModel();
            tblModel.setRowCount(0);
        } catch (ExceptionDao ex) {
            Logger.getLogger(EliminaClub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminaJBActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnEliminaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JTable datiClubTabellaJT;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeJL;
    // End of variables declaration//GEN-END:variables
}
