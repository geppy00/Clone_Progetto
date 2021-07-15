
package view.elimina;

import controller.ControllerSportivo;
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
         jPMessage.setVisible(false);
         tableAtletaJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         tableAtletaJT.getTableHeader().setOpaque(false);
         tableAtletaJT.getTableHeader().setBackground(new Color(32, 136, 203));
         tableAtletaJT.getTableHeader().setForeground(new Color(255,255,255));
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InputCodiceFiscaleJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAtletaJT = new javax.swing.JTable();
        btnEliminaJB = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();
        btnTornaIndietroJB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InputCodiceFiscaleJTF.setBackground(new java.awt.Color(9, 46, 119));
        InputCodiceFiscaleJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        InputCodiceFiscaleJTF.setForeground(new java.awt.Color(231, 231, 231));
        InputCodiceFiscaleJTF.setText("Codice Fiscale");
        InputCodiceFiscaleJTF.setBorder(null);
        InputCodiceFiscaleJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputCodiceFiscaleJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputCodiceFiscaleJTFFocusLost(evt);
            }
        });
        jPanel1.add(InputCodiceFiscaleJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 920, 30));

        btnCercaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaJB.setText("Cerca");
        btnCercaJB.setBorder(null);
        btnCercaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCercaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 120, 30));

        tableAtletaJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableAtletaJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cognome", "Sesso", "Nazionalità", "Indirizzo", "Data Nascita", "Telefono", "Codice Fiscale", "Ruolo Atleta", "Peso", "ID Procuratore", "Iban Atleta"
            }
        ));
        tableAtletaJT.setFocusable(false);
        tableAtletaJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tableAtletaJT.setShowVerticalLines(false);
        tableAtletaJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableAtletaJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1040, 240));

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
        jPanel1.add(btnEliminaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 160, 40));

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
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 740, 40));

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, -1, 40));

        btnTornaIndietroJB1.setBackground(new java.awt.Color(11, 58, 151));
        btnTornaIndietroJB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnTornaIndietroJB1.setBorder(null);
        btnTornaIndietroJB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTornaIndietroJB1.setFocusPainted(false);
        btnTornaIndietroJB1.setFocusable(false);
        btnTornaIndietroJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        String codiceFiscaleAtletaPreso = InputCodiceFiscaleJTF.getText();
        
        if(controlloConvalidazione.controlloCercaAtleta(codiceFiscaleAtletaPreso) == true) {
            try {
                datiAtleta = controllerSportivo.cercaSportivo(codiceFiscaleAtletaPreso);
                if(datiAtleta.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "ATLETA "+codiceFiscaleAtletaPreso+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
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
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CODICE FISCALE DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnEliminaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        String codiceFiscaleAtletaPreso = InputCodiceFiscaleJTF.getText();
        
        if(controlloConvalidazione.controlloCercaAtleta(codiceFiscaleAtletaPreso) == false) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CODICE FISCALE DA ELIMINARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(datiAtleta.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "ATLETA "+codiceFiscaleAtletaPreso+" NON ESISTE\nNON POSSIBILE ELIMINARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
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

    private void InputCodiceFiscaleJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputCodiceFiscaleJTFFocusGained
       if(InputCodiceFiscaleJTF.getText().equals("Codice Fiscale")){
           InputCodiceFiscaleJTF.setText("");
           InputCodiceFiscaleJTF.setForeground(new Color(255,255,255));
       }
    }//GEN-LAST:event_InputCodiceFiscaleJTFFocusGained

    private void InputCodiceFiscaleJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputCodiceFiscaleJTFFocusLost
        if(InputCodiceFiscaleJTF.getText().equals("")){
           InputCodiceFiscaleJTF.setText("Codice Fiscale");
           InputCodiceFiscaleJTF.setForeground(new Color(231,231,231));
       }
    }//GEN-LAST:event_InputCodiceFiscaleJTFFocusLost

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnTornaIndietroJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJB1ActionPerformed
       SezioneAtletaView sezioneAtleta = new SezioneAtletaView();
        sezioneAtleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJB1ActionPerformed


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
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnEliminaJB;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnTornaIndietroJB1;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAtletaJT;
    // End of variables declaration//GEN-END:variables
}
