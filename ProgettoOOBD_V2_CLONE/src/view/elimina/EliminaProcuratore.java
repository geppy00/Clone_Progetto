
package view.elimina;

import controller.ControllerProcuratore;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Admin;
import model.Procuratore;
import view.SezioneProcuratoreView;


public class EliminaProcuratore extends javax.swing.JFrame {
     
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI DEL PROCURATORE*/
    private ArrayList<Procuratore> datiProcuratore =  new ArrayList<Procuratore>();
    
    public EliminaProcuratore() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matricolaJL = new javax.swing.JLabel();
        inputMatricolaJTF = new javax.swing.JTextField();
        btnCercaProcuratoreEliminareJB = new javax.swing.JButton();
        btnEliminaJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAnnullaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        matricolaJL.setText("Matricola da eliminare");

        btnCercaProcuratoreEliminareJB.setText("CERCA");
        btnCercaProcuratoreEliminareJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaProcuratoreEliminareJBActionPerformed(evt);
            }
        });

        btnEliminaJB.setText("ELIMINA");
        btnEliminaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaJBActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "code procuratore", "nome", "cognome", "sesso", "nazione", "indirizzo", "data nascita", "telefono", "codfiscale", "iban procuratore"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(matricolaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputMatricolaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCercaProcuratoreEliminareJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnnullaJB)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(btnEliminaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matricolaJL)
                    .addComponent(inputMatricolaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCercaProcuratoreEliminareJB)
                    .addComponent(btnAnnullaJB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCercaProcuratoreEliminareJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaProcuratoreEliminareJBActionPerformed
       ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
       String matricolaPresa = inputMatricolaJTF.getText();
       
      
       if(controlloConvalidazione.controlloCercaProcuratore(matricolaPresa) == true) {
            try {
                datiProcuratore = controllerProcuratore.cercaProcuratore(matricolaPresa);
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.setRowCount(0);
                if(datiProcuratore.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "PROCURATORE "+matricolaPresa+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "✓ PROCURATORE "+matricolaPresa+" TROVATO", "TROVATO", JOptionPane.INFORMATION_MESSAGE);
                    //DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();

                    datiProcuratore.forEach((Procuratore procuratore)->{
                        tblModel.addRow(new Object[]{
                        procuratore.getCode_procuratore(),
                        procuratore.getNome(),
                        procuratore.getCognome(),
                        procuratore.getSesso(),
                        procuratore.getNazione(),
                        procuratore.getIndirizzo(),
                        procuratore.getDataNascita(),
                        procuratore.getTelefono(),
                        procuratore.getCodFiscale(),
                        procuratore.getIban()
                        });
                        jTable1.setModel(tblModel);
                    });
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(EliminaProcuratore.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       else {
           Toolkit.getDefaultToolkit().beep();
           JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LA MATRICOLA DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
       }
           
    }//GEN-LAST:event_btnCercaProcuratoreEliminareJBActionPerformed

    private void btnEliminaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaJBActionPerformed
       ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
       String matricolaPresa = inputMatricolaJTF.getText();
       
        if(controlloConvalidazione.controlloCercaProcuratore(matricolaPresa) == false) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LA MATRICOLA DA ELIMINARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if(datiProcuratore.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "PROCURATORE "+matricolaPresa+" NON ESISTE\nNON POSSIBILE ELIMINARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                     controllerProcuratore.eliminaProcuratore(matricolaPresa);
                     DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                     tblModel.setRowCount(0);
                     JOptionPane.showMessageDialog(this, "✓ ELIMINAZIONE EFFETTUATA CON SUCCESSO", "ELIMINAZIONE", JOptionPane.INFORMATION_MESSAGE);
                 } catch (ExceptionDao ex) {
                    Toolkit.getDefaultToolkit().beep();
                    //Logger.getLogger(EliminaProcuratore.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "PROCURATORE "+matricolaPresa+" POSSIEDE UNO O PIU' ATLTETI NEL SISTEMA\nNON POSSIBILE ELIMINARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                 }
            }     
        }
    }//GEN-LAST:event_btnEliminaJBActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneProcuratoreView sezioneProcuratore = new SezioneProcuratoreView();
        sezioneProcuratore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaProcuratore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaProcuratoreEliminareJB;
    private javax.swing.JButton btnEliminaJB;
    private javax.swing.JTextField inputMatricolaJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel matricolaJL;
    // End of variables declaration//GEN-END:variables
}
