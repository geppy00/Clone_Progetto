
package view.elimina;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import convalidazione.MessageError;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
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
    private MessageError messageError = new MessageError();  
    
    /*DATI PER LO SPONSOR*/
    private ArrayList<Sponsor> datiSponsor = new ArrayList<Sponsor>();
    private int idSponsor;
    
    public EliminaSponsor() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.jMessagge.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputNomeSponsorJTF = new javax.swing.JTextField();
        btnCercaSponsorJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visualizzaDatiSponsorJT = new javax.swing.JTable();
        btnAnnullaJB = new javax.swing.JButton();
        btnEliminaSponsorJB = new javax.swing.JButton();
        jMessagge = new javax.swing.JPanel();
        jLMessaggio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        btnLogoutJB2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputNomeSponsorJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputNomeSponsorJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputNomeSponsorJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputNomeSponsorJTF.setText("Nome Sponsor");
        inputNomeSponsorJTF.setBorder(null);
        inputNomeSponsorJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNomeSponsorJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNomeSponsorJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputNomeSponsorJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 360, 30));

        btnCercaSponsorJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaSponsorJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaSponsorJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaSponsorJB.setText("Cerca");
        btnCercaSponsorJB.setBorder(null);
        btnCercaSponsorJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaSponsorJB.setFocusPainted(false);
        btnCercaSponsorJB.setFocusable(false);
        btnCercaSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaSponsorJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCercaSponsorJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 110, 30));

        visualizzaDatiSponsorJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        visualizzaDatiSponsorJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id Sponsor", "Nome", "Indirizzo", "Numero Telefono"
            }
        ));
        visualizzaDatiSponsorJT.setFocusable(false);
        visualizzaDatiSponsorJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        visualizzaDatiSponsorJT.setShowVerticalLines(false);
        visualizzaDatiSponsorJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(visualizzaDatiSponsorJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 470, 130));

        btnAnnullaJB.setBackground(new java.awt.Color(231, 76, 60));
        btnAnnullaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAnnullaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnullaJB.setText("Anulla");
        btnAnnullaJB.setToolTipText("");
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.setFocusPainted(false);
        btnAnnullaJB.setFocusable(false);
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 133, 30));

        btnEliminaSponsorJB.setBackground(new java.awt.Color(46, 204, 113));
        btnEliminaSponsorJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEliminaSponsorJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminaSponsorJB.setText("Elimina");
        btnEliminaSponsorJB.setBorder(null);
        btnEliminaSponsorJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminaSponsorJB.setFocusPainted(false);
        btnEliminaSponsorJB.setFocusable(false);
        btnEliminaSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaSponsorJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminaSponsorJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 133, 30));

        jMessagge.setBackground(new java.awt.Color(231, 76, 60));

        jLMessaggio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLMessaggio.setForeground(new java.awt.Color(255, 255, 255));
        jLMessaggio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMessaggio.setText("Credenziale Sbagliate");

        jLabel3.setBackground(new java.awt.Color(231, 76, 60));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_20px.png"))); // NOI18N
        jLabel3.setFocusable(false);

        btnCloseMessage.setBackground(new java.awt.Color(231, 76, 60));
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

        javax.swing.GroupLayout jMessaggeLayout = new javax.swing.GroupLayout(jMessagge);
        jMessagge.setLayout(jMessaggeLayout);
        jMessaggeLayout.setHorizontalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMessaggeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnCloseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jMessaggeLayout.setVerticalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMessaggeLayout.createSequentialGroup()
                .addGroup(jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCloseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLMessaggio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanel1.add(jMessagge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 470, 30));

        btnLogoutJB2.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnLogoutJB2.setBorder(null);
        btnLogoutJB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB2.setFocusPainted(false);
        btnLogoutJB2.setFocusable(false);
        btnLogoutJB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJB2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
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
                if(datiSponsor.isEmpty()) {
                    Toolkit.getDefaultToolkit().beep();
                    //JOptionPane.showMessageDialog(this, "SPONSOR "+nomeSponsorPreso+" NON TROVATO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    messageError.showMessage(false, true, "warning", "Sponsor "+nomeSponsorPreso+" Non Trovato", jLMessaggio, jMessagge, btnCloseMessage);
                }
                else {
                    messageError.showMessage(false, true, "success", "Sponsor "+nomeSponsorPreso+" Trovato", jLMessaggio, jMessagge, btnCloseMessage);
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
        else {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LO SPONSOR DA CERCARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Scrivere Nel Campo Lo Sponsor Da Cercare", jLMessaggio, jMessagge, btnCloseMessage);
        }
    }//GEN-LAST:event_btnCercaSponsorJBActionPerformed

    private void btnEliminaSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaSponsorJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        String nomeSponsorPreso = inputNomeSponsorJTF.getText();
        
        if(controlloConvalidazione.controlloCercaSponsor(nomeSponsorPreso) == false) {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nSCRIVERE NEL CAMPO LO SPONSOR DA ELIMINARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning", "Scrivere Nel Campo Lo Sponsor Da Eliminare", jLMessaggio, jMessagge, btnCloseMessage);
        }
        else {
            if(datiSponsor.isEmpty()) {
                Toolkit.getDefaultToolkit().beep();
                //JOptionPane.showMessageDialog(this, "SPONSOR "+nomeSponsorPreso+" NON ESISTE\nNON POSSIBILE ELIMINARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                messageError.showMessage(false, true, "warning", "Sponsor "+nomeSponsorPreso+" Non Esiste Non Possibile Eliminarlo", jLMessaggio, jMessagge, btnCloseMessage);
            }
            else {
                try {
                    this.setIdSponsor((Integer) visualizzaDatiSponsorJT.getModel().getValueAt(0, 0));
                    controllerSponsor.eliminaSponsor(nomeSponsorPreso, this.getIdSponsor());
                    DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiSponsorJT.getModel();
                    tblModel.setRowCount(0);
                    //JOptionPane.showMessageDialog(this, "✓ ELIMINAZIONE EFFETTUATA CON SUCCESSO", "ELIMINAZIONE", JOptionPane.INFORMATION_MESSAGE);
                    messageError.showMessage(false, true, "success", "Eliminazione Effettuata Con Successo", jLMessaggio, jMessagge, btnCloseMessage);
                } catch (ExceptionDao ex) {
                    Logger.getLogger(EliminaSponsor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminaSponsorJBActionPerformed

    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        this.jMessagge.setVisible(false);
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void inputNomeSponsorJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeSponsorJTFFocusGained
        if(inputNomeSponsorJTF.getText().equals("Nome Sponsor")){
            inputNomeSponsorJTF.setText("");
            inputNomeSponsorJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputNomeSponsorJTFFocusGained

    private void inputNomeSponsorJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeSponsorJTFFocusLost
       if(inputNomeSponsorJTF.getText().equals("")){
            inputNomeSponsorJTF.setText("Nome Sponsor");
            inputNomeSponsorJTF.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_inputNomeSponsorJTFFocusLost

    private void btnLogoutJB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB2ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    /*GET AND SET*/
    public int getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(int idSponsor) {
        this.idSponsor = idSponsor;
    }

    
    /*MAIN*/
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
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnEliminaSponsorJB;
    private javax.swing.JButton btnLogoutJB2;
    private javax.swing.JTextField inputNomeSponsorJTF;
    private javax.swing.JLabel jLMessaggio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jMessagge;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable visualizzaDatiSponsorJT;
    // End of variables declaration//GEN-END:variables
}
