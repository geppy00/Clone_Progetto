
package view.elimina;

import controller.ControllerProcuratore;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Font;
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
        
        jPMessage.setVisible(false);
        
         jTBDati.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         jTBDati.getTableHeader().setOpaque(false);
         jTBDati.getTableHeader().setBackground(new Color(32, 136, 203));
         jTBDati.getTableHeader().setForeground(new Color(255,255,255));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCercaProcuratoreEliminareJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        inputMatricolaJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBDati = new javax.swing.JTable();
        btnEliminaJB = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCercaProcuratoreEliminareJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaProcuratoreEliminareJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaProcuratoreEliminareJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaProcuratoreEliminareJB.setText("CERCA");
        btnCercaProcuratoreEliminareJB.setBorder(null);
        btnCercaProcuratoreEliminareJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaProcuratoreEliminareJB.setFocusPainted(false);
        btnCercaProcuratoreEliminareJB.setFocusable(false);
        btnCercaProcuratoreEliminareJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaProcuratoreEliminareJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCercaProcuratoreEliminareJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 130, 30));

        btnAnnullaJB.setBackground(new java.awt.Color(231, 76, 60));
        btnAnnullaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAnnullaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnullaJB.setText("Annulla");
        btnAnnullaJB.setActionCommand("Annulla");
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, 120, 30));

        inputMatricolaJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputMatricolaJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputMatricolaJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputMatricolaJTF.setText("Matricola da Eliminare");
        inputMatricolaJTF.setBorder(null);
        inputMatricolaJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputMatricolaJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputMatricolaJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputMatricolaJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 820, 30));

        jTBDati.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTBDati.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "code procuratore", "nome", "cognome", "sesso", "nazione", "indirizzo", "data nascita", "telefono", "codfiscale", "iban procuratore"
            }
        ));
        jTBDati.setFocusable(false);
        jTBDati.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTBDati.setShowVerticalLines(false);
        jTBDati.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTBDati);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 950, 180));

        btnEliminaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnEliminaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEliminaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminaJB.setText("Elimina");
        btnEliminaJB.setBorder(null);
        btnEliminaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminaJB.setFocusPainted(false);
        btnEliminaJB.setFocusable(false);
        btnEliminaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 120, 30));

        jPMessage.setBackground(new java.awt.Color(46, 204, 113));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_26px.png"))); // NOI18N

        errorMessage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 255, 255));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("Contratto stabilitto con sucesso ");

        btnCloseMessage.setBackground(new java.awt.Color(46, 204, 113));
        btnCloseMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnCloseMessage.setBorder(null);
        btnCloseMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMessage.setFocusPainted(false);
        btnCloseMessage.setFocusable(false);
        btnCloseMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseMessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMessageLayout = new javax.swing.GroupLayout(jPMessage);
        jPMessage.setLayout(jPMessageLayout);
        jPMessageLayout.setHorizontalGroup(
            jPMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMessageLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCloseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMessageLayout.setVerticalGroup(
            jPMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCloseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 610, 40));

        btnLogoutJB1.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnLogoutJB1.setBorder(null);
        btnLogoutJB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB1.setFocusPainted(false);
        btnLogoutJB1.setFocusable(false);
        btnLogoutJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCercaProcuratoreEliminareJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaProcuratoreEliminareJBActionPerformed
       ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
       String matricolaPresa = inputMatricolaJTF.getText();
       
      
       if(controlloConvalidazione.controlloCercaProcuratore(matricolaPresa) == true) {
            try {
                datiProcuratore = controllerProcuratore.cercaProcuratore(matricolaPresa);
                DefaultTableModel tblModel = (DefaultTableModel)jTBDati.getModel();
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
                        jTBDati.setModel(tblModel);
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
                     DefaultTableModel tblModel = (DefaultTableModel)jTBDati.getModel();
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

    private void inputMatricolaJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMatricolaJTFFocusGained
       if(inputMatricolaJTF.getText().equals("Matricola da Eliminare")){
            inputMatricolaJTF.setText("");
            inputMatricolaJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputMatricolaJTFFocusGained

    private void inputMatricolaJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMatricolaJTFFocusLost
        if(inputMatricolaJTF.getText().equals("")){
            inputMatricolaJTF.setText("Matricola da Eliminare");
            inputMatricolaJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputMatricolaJTFFocusLost

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    
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
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnEliminaJB;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputMatricolaJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBDati;
    // End of variables declaration//GEN-END:variables
}
