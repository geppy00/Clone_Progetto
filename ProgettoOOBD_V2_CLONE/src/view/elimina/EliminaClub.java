
package view.elimina;

import controller.ControllerClub;
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
import model.Club;
import view.SezioneClub;


public class EliminaClub extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI DEL CLUB*/
    private ArrayList<Club> datiClub = new ArrayList<Club>();
    private int idClub; 
    
    /*COSTRUTTORE*/
    public EliminaClub() {
        initComponents();
        this.setLocationRelativeTo(null);
         jPMessage.setVisible(false);
         datiClubTabellaJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
         datiClubTabellaJT.getTableHeader().setOpaque(false);
         datiClubTabellaJT.getTableHeader().setBackground(new Color(32, 136, 203));
         datiClubTabellaJT.getTableHeader().setForeground(new Color(255,255,255));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputNomeJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        btnEliminaJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datiClubTabellaJT = new javax.swing.JTable();
        btnLogoutJB = new javax.swing.JButton();
        jPMessage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnTornaIndietroJB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputNomeJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputNomeJTF.setText("Nome Club");
        inputNomeJTF.setBorder(null);
        inputNomeJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNomeJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNomeJTFFocusLost(evt);
            }
        });
        inputNomeJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeJTFActionPerformed(evt);
            }
        });
        jPanel1.add(inputNomeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 580, 30));

        btnCercaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaJB.setText("Cerca");
        btnCercaJB.setToolTipText("");
        btnCercaJB.setBorder(null);
        btnCercaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaJB.setFocusPainted(false);
        btnCercaJB.setFocusable(false);
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCercaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 90, 30));

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
        jPanel1.add(btnEliminaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 120, 30));

        datiClubTabellaJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        datiClubTabellaJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CLUB", "NOME", "INDIRIZZO", "TELEFONO"
            }
        ));
        datiClubTabellaJT.setFocusable(false);
        datiClubTabellaJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        datiClubTabellaJT.setShowVerticalLines(false);
        datiClubTabellaJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(datiClubTabellaJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 670, 170));

        btnLogoutJB.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnLogoutJB.setBorder(null);
        btnLogoutJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB.setFocusPainted(false);
        btnLogoutJB.setFocusable(false);
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, 40));

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

        jPanel1.add(jPMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 610, 40));

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
        jPanel1.add(btnTornaIndietroJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        String nomeClubCercare = inputNomeJTF.getText();
        
        if(controlloConvalidazione.controlloCercaClub(nomeClubCercare) == true) {
            try {
                DefaultTableModel tblModel = (DefaultTableModel)datiClubTabellaJT.getModel();
                tblModel.setRowCount(0);
                datiClub = controllerClub.cercaClub(nomeClubCercare);
                if(datiClub.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "CLUB "+nomeClubCercare+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "✓ CLUB "+nomeClubCercare+" TROVATO", "TROVATO", JOptionPane.INFORMATION_MESSAGE);
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
            } catch (ExceptionDao ex) {
                Logger.getLogger(EliminaClub.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CLUB DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnEliminaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        String nomeClubCercare = inputNomeJTF.getText();
        
        if(controlloConvalidazione.controlloCercaClub(nomeClubCercare) == false) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO IL CLUB DA ELIMINARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if(datiClub.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "CLUB "+nomeClubCercare+" NON ESISTE\nNON POSSIBILE ELIMINARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                    this.setIdClub((Integer) datiClubTabellaJT.getModel().getValueAt(0, 0));
                    controllerClub.eliminaClub(nomeClubCercare, this.getIdClub());
                    DefaultTableModel tblModel = (DefaultTableModel)datiClubTabellaJT.getModel();
                    tblModel.setRowCount(0);
                    JOptionPane.showMessageDialog(this, "✓ ELIMINAZIONE EFFETTUATA CON SUCCESSO", "ELIMINAZIONE", JOptionPane.INFORMATION_MESSAGE);
                } catch (ExceptionDao ex) {
                    Logger.getLogger(EliminaClub.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminaJBActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        jPMessage.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void inputNomeJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeJTFFocusGained
      if(inputNomeJTF.getText().equals("Nome Club")){
            inputNomeJTF.setText("");
            inputNomeJTF.setForeground(new Color(255,255,255));
      }
    }//GEN-LAST:event_inputNomeJTFFocusGained

    private void inputNomeJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeJTFFocusLost
        if(inputNomeJTF.getText().equals("")){
            inputNomeJTF.setText("Nome Club");
            inputNomeJTF.setForeground(new Color(231,231,231));
      }
    }//GEN-LAST:event_inputNomeJTFFocusLost

    private void inputNomeJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeJTFActionPerformed

    private void btnTornaIndietroJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJB1ActionPerformed
        SezioneClub sezioneClub = new SezioneClub();
        sezioneClub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJB1ActionPerformed

    /*GET AND SET*/
    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }



    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnEliminaJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnTornaIndietroJB1;
    private javax.swing.JTable datiClubTabellaJT;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
