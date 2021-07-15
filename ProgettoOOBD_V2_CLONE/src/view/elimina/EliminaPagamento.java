
package view.elimina;

import controller.ControllerClub;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.SezionePagamentoView;
import view.modificaDati.ModificaPagamento;


public class EliminaPagamento extends javax.swing.JFrame {
    
    /*DATI IMPORTANTI*/ 
    private String idAtletaCercare; 
    private String idClub;
    private double importo;
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
     
    /*COSTRUTTORI*/
    public EliminaPagamento(String idClub) {
        initComponents();
        this.idClub = idClub;
        this.setLocationRelativeTo(null);
        jMessagge.setVisible(false);
    }
    
    public EliminaPagamento() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputIdDestinatarioJTF = new javax.swing.JTextField();
        inputDataCercareJDC = new com.toedter.calendar.JDateChooser();
        btnCercaJB = new javax.swing.JButton();
        inputImportoJTF = new javax.swing.JTextField();
        btnEliminaJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        destinatarioJL = new javax.swing.JLabel();
        dataPagamentoJL = new javax.swing.JLabel();
        btnLogoutJB1 = new javax.swing.JButton();
        jMessagge = new javax.swing.JPanel();
        jLMessaggio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCloseMessagio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputIdDestinatarioJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdDestinatarioJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdDestinatarioJTF.setForeground(new java.awt.Color(255, 255, 255));
        inputIdDestinatarioJTF.setBorder(null);
        jPanel1.add(inputIdDestinatarioJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 360, 30));

        inputDataCercareJDC.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(inputDataCercareJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 360, 29));

        btnCercaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCercaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCercaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCercaJB.setText("Cerca");
        btnCercaJB.setBorder(null);
        btnCercaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCercaJB.setFocusPainted(false);
        btnCercaJB.setFocusable(false);
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCercaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 360, 30));

        inputImportoJTF.setEditable(false);
        inputImportoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputImportoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputImportoJTF.setBorder(null);
        jPanel1.add(inputImportoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 360, 30));

        btnEliminaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnEliminaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEliminaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminaJB.setText("Elimina");
        btnEliminaJB.setToolTipText("");
        btnEliminaJB.setBorder(null);
        btnEliminaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminaJB.setFocusPainted(false);
        btnEliminaJB.setFocusable(false);
        btnEliminaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 81, 40));

        btnAnnullaJB.setBackground(new java.awt.Color(231, 76, 60));
        btnAnnullaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAnnullaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnullaJB.setText("Annulla");
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.setFocusPainted(false);
        btnAnnullaJB.setFocusable(false);
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 82, 39));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Importo Registrato");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 30));

        destinatarioJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        destinatarioJL.setForeground(new java.awt.Color(255, 255, 255));
        destinatarioJL.setText("ID Destinatario");
        jPanel1.add(destinatarioJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 30));

        dataPagamentoJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dataPagamentoJL.setForeground(new java.awt.Color(255, 255, 255));
        dataPagamentoJL.setText("Data Pagamento");
        jPanel1.add(dataPagamentoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 30));

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 40));

        jMessagge.setBackground(new java.awt.Color(231, 76, 60));

        jLMessaggio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLMessaggio.setForeground(new java.awt.Color(255, 255, 255));
        jLMessaggio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMessaggio.setText("Credenziale Sbagliate");

        jLabel3.setBackground(new java.awt.Color(231, 76, 60));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_20px.png"))); // NOI18N
        jLabel3.setFocusable(false);

        btnCloseMessagio.setBackground(new java.awt.Color(231, 76, 60));
        btnCloseMessagio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_delete_20px.png"))); // NOI18N
        btnCloseMessagio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMessagio.setFocusable(false);
        btnCloseMessagio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMessagioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jMessaggeLayout = new javax.swing.GroupLayout(jMessagge);
        jMessagge.setLayout(jMessaggeLayout);
        jMessaggeLayout.setHorizontalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMessaggeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLMessaggio, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jMessaggeLayout.setVerticalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jMessagge, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 360, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
       this.setIdAtletaCercare(inputIdDestinatarioJTF.getText());
       ControllerClub controllerClub = new ControllerClub();
       java.sql.Date dataPagamentoCercare = null;
       
       try{
            dataPagamentoCercare = new java.sql.Date(inputDataCercareJDC.getDate().getTime());
        }catch(NullPointerException nex) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERISCI UNA DATA VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
       
        if(controlloConvalidazione.controlloCercaPagamento(String.valueOf(dataPagamentoCercare), this.getIdAtletaCercare()) == true) {
            try {
                importo = controllerClub.cercaPagamento(dataPagamentoCercare, Integer.parseInt(this.getIdClub()), this.getIdAtletaCercare());
                if(importo == -1) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "IMPORTO NON TROVATO\nNON POSSIBILE ELIMINARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "✓ PAGAMENTO TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    inputImportoJTF.setText(Double.toString(importo));
                }
            }catch (ExceptionDao ex) {
                Logger.getLogger(ModificaPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI PER LA RICERCA", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       SezionePagamentoView sezionePagamentoView = new SezionePagamentoView(this.getIdClub());
       sezionePagamentoView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnEliminaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        this.setIdAtletaCercare(inputIdDestinatarioJTF.getText());
        java.sql.Date dataPagamentoCercare = null;
        
        try {
            importo = Double.parseDouble(inputImportoJTF.getText());
        }catch(NumberFormatException nfe) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nNON POSSIBILE ELIMINARE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        try{
            dataPagamentoCercare = new java.sql.Date(inputDataCercareJDC.getDate().getTime());
        }catch(NullPointerException nex) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERISCI UNA DATA VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        
        if(controlloConvalidazione.controlloCercaPagamento(String.valueOf(dataPagamentoCercare), this.getIdAtletaCercare()) == true) {
            try {
                importo = controllerClub.cercaPagamento(dataPagamentoCercare, Integer.parseInt(this.getIdClub()), idAtletaCercare);
                if(importo == -1) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "IMPORTO NON TROVATO\nNON POSSIBILE ELIMINARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    controllerClub.eliminaPagamento(dataPagamentoCercare, Integer.parseInt(this.getIdClub()), this.getIdAtletaCercare(), importo);
                    JOptionPane.showMessageDialog(this, "✓ ELIMINAZIONE DEL PAGAMENTO EFFETTUATA CON SUCCESSO", "ELIMINAZIONE", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(ModificaPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI PER LA RICERCA NON POSSIBILE EFFETTUARE L'ELIMINAZIONE", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminaJBActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnCloseMessagioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMessagioMouseClicked
        jMessagge.setVisible(false);
    }//GEN-LAST:event_btnCloseMessagioMouseClicked


    /*GET AND SET*/
    public String getIdClub() {
        return idClub;
    }

    public void setIdClub(String idClub) {
        this.idClub = idClub;
    }
    
    public String getIdAtletaCercare() {
        return idAtletaCercare;
    }

    public void setIdAtletaCercare(String idAtletaCercare) {
        this.idAtletaCercare = idAtletaCercare;
    }
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JLabel btnCloseMessagio;
    private javax.swing.JButton btnEliminaJB;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JLabel dataPagamentoJL;
    private javax.swing.JLabel destinatarioJL;
    private com.toedter.calendar.JDateChooser inputDataCercareJDC;
    private javax.swing.JTextField inputIdDestinatarioJTF;
    private javax.swing.JTextField inputImportoJTF;
    private javax.swing.JLabel jLMessaggio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jMessagge;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
