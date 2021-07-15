
package view.modificaDati;

import controller.ControllerClub;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.SezionePagamentoView;


public class ModificaPagamento extends javax.swing.JFrame {

    /*DATI IMPORTANTI*/
    private String idAtletaCercare; 
    private String idClub;
    private double importo;
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*COSTRUTTORI*/
    public ModificaPagamento(String idClub) {
        initComponents();
        this.idClub = idClub;
        jMessagge1.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    public ModificaPagamento() {
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMessagge = new javax.swing.JPanel();
        jLMessaggio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCloseMessagio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        inputImportoJTF = new javax.swing.JTextField();
        inputDataCercareJDC = new com.toedter.calendar.JDateChooser();
        inputIdDestinatarioJTF = new javax.swing.JTextField();
        dataPagamentoJL = new javax.swing.JLabel();
        btnCercaJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        btnModificaJB = new javax.swing.JButton();
        btnLogoutJB1 = new javax.swing.JButton();
        jMessagge1 = new javax.swing.JPanel();
        jLMessaggio1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCloseMessagio1 = new javax.swing.JLabel();
        dataPagamentoJL1 = new javax.swing.JLabel();

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
                .addGap(59, 59, 59)
                .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jMessaggeLayout.setVerticalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputImportoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputImportoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputImportoJTF.setForeground(new java.awt.Color(255, 255, 255));
        inputImportoJTF.setBorder(null);
        jPanel1.add(inputImportoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 430, 30));

        inputDataCercareJDC.setBackground(new java.awt.Color(9, 46, 119));
        inputDataCercareJDC.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(inputDataCercareJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 330, 30));

        inputIdDestinatarioJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIdDestinatarioJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inputIdDestinatarioJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIdDestinatarioJTF.setText("ID Destinatario");
        inputIdDestinatarioJTF.setBorder(null);
        jPanel1.add(inputIdDestinatarioJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 330, 30));

        dataPagamentoJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dataPagamentoJL.setForeground(new java.awt.Color(255, 255, 255));
        dataPagamentoJL.setText("Importo");
        jPanel1.add(dataPagamentoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 20));

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
        jPanel1.add(btnCercaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 90, 90));

        btnAnnullaJB.setBackground(new java.awt.Color(231, 76, 60));
        btnAnnullaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAnnullaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnullaJB.setText("Anulla");
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.setFocusPainted(false);
        btnAnnullaJB.setFocusable(false);
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 102, 30));

        btnModificaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnModificaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnModificaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnModificaJB.setText("Modifica");
        btnModificaJB.setBorder(null);
        btnModificaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificaJB.setFocusPainted(false);
        btnModificaJB.setFocusable(false);
        btnModificaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 102, 30));

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
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, 40));

        jMessagge1.setBackground(new java.awt.Color(231, 76, 60));

        jLMessaggio1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLMessaggio1.setForeground(new java.awt.Color(255, 255, 255));
        jLMessaggio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMessaggio1.setText("Credenziale Sbagliate");

        jLabel4.setBackground(new java.awt.Color(231, 76, 60));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_20px.png"))); // NOI18N
        jLabel4.setFocusable(false);

        btnCloseMessagio1.setBackground(new java.awt.Color(231, 76, 60));
        btnCloseMessagio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_delete_20px.png"))); // NOI18N
        btnCloseMessagio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMessagio1.setFocusable(false);
        btnCloseMessagio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMessagio1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jMessagge1Layout = new javax.swing.GroupLayout(jMessagge1);
        jMessagge1.setLayout(jMessagge1Layout);
        jMessagge1Layout.setHorizontalGroup(
            jMessagge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMessagge1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLMessaggio1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btnCloseMessagio1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jMessagge1Layout.setVerticalGroup(
            jMessagge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMessaggio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCloseMessagio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jMessagge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 430, 30));

        dataPagamentoJL1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dataPagamentoJL1.setForeground(new java.awt.Color(255, 255, 255));
        dataPagamentoJL1.setText("Data Del Pagamento");
        jPanel1.add(dataPagamentoJL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
       SezionePagamentoView sezionePagamentoView = new SezionePagamentoView(this.getIdClub());
       sezionePagamentoView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnModificaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaJBActionPerformed
        ControllerClub controllerClub = new ControllerClub();
        
        try {
            importo = Double.parseDouble(inputImportoJTF.getText());
        }catch(NumberFormatException nex) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN NUMERO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        
        this.setIdAtletaCercare(inputIdDestinatarioJTF.getText());
        java.sql.Date dataPagamentoCercare = null;
        
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
                    JOptionPane.showMessageDialog(this, "IMPORTO NON TROVATO\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    controllerClub.modificaPagamento(dataPagamentoCercare, Integer.parseInt(this.getIdClub()), this.getIdAtletaCercare(), importo);
                    JOptionPane.showMessageDialog(this, "✓ MODIFICA DEL PAGAMENTO EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(ModificaPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI PER LA RICERCA NON POSSIBILE EFFETTUARE LA MODIFICA", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificaJBActionPerformed

    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
       this.setIdAtletaCercare(inputIdDestinatarioJTF.getText());
       java.sql.Date dataPagamentoCercare = null;
       ControllerClub controllerClub = new ControllerClub();
       
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
                    JOptionPane.showMessageDialog(this, "IMPORTO NON TROVATO\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "✓ PAGAMENTO TROVATO CON SUCCESSO", "RICERCA", JOptionPane.INFORMATION_MESSAGE);
                    inputImportoJTF.setText(Double.toString(importo));
                }
            } catch (ExceptionDao ex) {
                Logger.getLogger(ModificaPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI PER LA RICERCA", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    private void btnCloseMessagioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMessagioMouseClicked
        jMessagge.setVisible(false);
    }//GEN-LAST:event_btnCloseMessagioMouseClicked

    private void btnCloseMessagio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMessagio1MouseClicked
        jMessagge.setVisible(false);
    }//GEN-LAST:event_btnCloseMessagio1MouseClicked


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
                new ModificaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JLabel btnCloseMessagio;
    private javax.swing.JLabel btnCloseMessagio1;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JButton btnModificaJB;
    private javax.swing.JLabel dataPagamentoJL;
    private javax.swing.JLabel dataPagamentoJL1;
    private com.toedter.calendar.JDateChooser inputDataCercareJDC;
    private javax.swing.JTextField inputIdDestinatarioJTF;
    private javax.swing.JTextField inputImportoJTF;
    private javax.swing.JLabel jLMessaggio;
    private javax.swing.JLabel jLMessaggio1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jMessagge;
    private javax.swing.JPanel jMessagge1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
