
package view;

import controller.ControllerLogin;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginView extends javax.swing.JFrame {
    
    private String idCopiato;
    
    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jMessagge.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sceltaAccessoJCB = new javax.swing.JComboBox<>();
        inputIndirizzoJTF = new javax.swing.JTextField();
        passwordPJTF = new javax.swing.JPasswordField();
        btnAccediJB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLogoutJB = new javax.swing.JButton();
        jMessagge = new javax.swing.JPanel();
        jLMessaggio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCloseMessagio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sceltaAccessoJCB.setBackground(new java.awt.Color(9, 46, 119));
        sceltaAccessoJCB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        sceltaAccessoJCB.setForeground(new java.awt.Color(231, 231, 231));
        sceltaAccessoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procuratore", "Atleta", "Sponsor", "Admin", "Club" }));
        sceltaAccessoJCB.setBorder(null);
        sceltaAccessoJCB.setFocusable(false);
        sceltaAccessoJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaAccessoJCBActionPerformed(evt);
            }
        });
        jPanel1.add(sceltaAccessoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 310, 30));

        inputIndirizzoJTF.setBackground(new java.awt.Color(9, 46, 119));
        inputIndirizzoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        inputIndirizzoJTF.setForeground(new java.awt.Color(231, 231, 231));
        inputIndirizzoJTF.setText("User Name");
        inputIndirizzoJTF.setBorder(null);
        inputIndirizzoJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIndirizzoJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIndirizzoJTFFocusLost(evt);
            }
        });
        jPanel1.add(inputIndirizzoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 310, 30));

        passwordPJTF.setBackground(new java.awt.Color(9, 46, 119));
        passwordPJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        passwordPJTF.setForeground(new java.awt.Color(231, 231, 231));
        passwordPJTF.setText("password");
        passwordPJTF.setBorder(null);
        passwordPJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordPJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordPJTFFocusLost(evt);
            }
        });
        jPanel1.add(passwordPJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 310, 30));

        btnAccediJB.setBackground(new java.awt.Color(46, 204, 113));
        btnAccediJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAccediJB.setForeground(new java.awt.Color(255, 255, 255));
        btnAccediJB.setText("Entrare");
        btnAccediJB.setBorder(null);
        btnAccediJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccediJB.setFocusPainted(false);
        btnAccediJB.setFocusable(false);
        btnAccediJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccediJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAccediJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 80, 30));

        jButton1.setBackground(new java.awt.Color(231, 76, 60));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Annulla");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_male_user_64px_2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 70, 70));

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
        jPanel1.add(btnLogoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 40));

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
                .addGap(18, 18, 18)
                .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jMessaggeLayout.setVerticalGroup(
            jMessaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCloseMessagio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jMessagge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 310, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*GET AND SET*/
    public String getIdCopiato() {
        return idCopiato;
    }

    public void setIdCopiato(String idCopiato) {
        this.idCopiato = idCopiato;
    }
    
    /*ACTION PERFOMED*/
    private void btnAccediJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccediJBActionPerformed
       String userName = inputIndirizzoJTF.getText();
       String password = passwordPJTF.getText();
       String scelta = sceltaAccessoJCB.getSelectedItem().toString();
       
       ControllerLogin loginController = new ControllerLogin();
       
        try {
            setIdCopiato(loginController.verificaLogin(userName, password, scelta));
            if(getIdCopiato() == null){ 
                jMessagge.setVisible(false);
                jMessagge.setBackground(new Color(231,76,60));
                jLMessaggio.setText("Credenziale Sbagliate");
                jMessagge.setVisible(true);
             
            }else{
                jMessagge.setVisible(false);
               //HO SCELTO DI USARE LO SWITCH PERCHE' VA DIRETTAMENTE NEL CASO INTERESSATO
               switch(scelta) {
                   case "Admin":
                        AdminView adminview = new AdminView();
                        adminview.setVisible(true);
                        this.setVisible(false);
                   break;
                   
                   case "Procuratore":
                       ProcuratoreView procuratoreView = new ProcuratoreView(getIdCopiato());
                       procuratoreView.setVisible(true);
                       this.setVisible(false);
                   break;
                   
                   case "Sponsor":
                        SponsorView sponsorView = new SponsorView(getIdCopiato());
                        sponsorView.setVisible(true);
                        this.setVisible(false);
                   break;
                   
                   case "Atleta":
                       AtletaView atletaView = new AtletaView(getIdCopiato());
                       atletaView.setVisible(true);
                       this.setVisible(false);
                   break;
                   
                   case "Club":
                       ClubView clubView = new ClubView(getIdCopiato());
                       clubView.setVisible(true);
                       this.setVisible(false);
                   break;
               }
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAccediJBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sceltaAccessoJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaAccessoJCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sceltaAccessoJCBActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    private void inputIndirizzoJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIndirizzoJTFFocusGained
        if(inputIndirizzoJTF.getText().equals("User Name")){
            inputIndirizzoJTF.setText("");
            inputIndirizzoJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_inputIndirizzoJTFFocusGained

    private void inputIndirizzoJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIndirizzoJTFFocusLost
        if(inputIndirizzoJTF.getText().equals("")){
            inputIndirizzoJTF.setText("User Name");
            inputIndirizzoJTF.setForeground(new Color(231,231,231));
            
        }
    }//GEN-LAST:event_inputIndirizzoJTFFocusLost

    private void passwordPJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordPJTFFocusGained
        if(passwordPJTF.getText().equals("password")){
            passwordPJTF.setText("");
            passwordPJTF.setForeground(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_passwordPJTFFocusGained

    private void passwordPJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordPJTFFocusLost
         if(passwordPJTF.getText().equals("")){
            passwordPJTF.setText("password");
            passwordPJTF.setForeground(new Color(231,231,231));
            
        }
    }//GEN-LAST:event_passwordPJTFFocusLost

    private void btnCloseMessagioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMessagioMouseClicked
        jMessagge.setVisible(false);
    }//GEN-LAST:event_btnCloseMessagioMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccediJB;
    private javax.swing.JLabel btnCloseMessagio;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLMessaggio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jMessagge;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordPJTF;
    private javax.swing.JComboBox<String> sceltaAccessoJCB;
    // End of variables declaration//GEN-END:variables
}
