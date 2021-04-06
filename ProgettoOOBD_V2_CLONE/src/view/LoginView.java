
package view;

import controller.ControllerLogin;
import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JFrame {
    
    
    public LoginView() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameJL = new javax.swing.JLabel();
        usernameJTF = new javax.swing.JTextField();
        passwordJL = new javax.swing.JLabel();
        passwordJTF = new javax.swing.JTextField();
        sceltaAccessoJCB = new javax.swing.JComboBox<>();
        btnAccediJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameJL.setText("Username");

        passwordJL.setText("Password");

        sceltaAccessoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procuratore", "Atleta", "Sponsor", "Admin" }));

        btnAccediJB.setText("ACCEDI");
        btnAccediJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccediJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordJL)
                                        .addGap(18, 18, 18)
                                        .addComponent(passwordJTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(usernameJL)
                                        .addGap(18, 18, 18)
                                        .addComponent(usernameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(sceltaAccessoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 149, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAccediJB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJL)
                    .addComponent(usernameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJL)
                    .addComponent(passwordJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(sceltaAccessoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnAccediJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccediJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccediJBActionPerformed
       String userName = usernameJTF.getText();
       String password = passwordJTF.getText();
       String scelta = sceltaAccessoJCB.getSelectedItem().toString();
       
       ControllerLogin loginController = new ControllerLogin();
       
        try {
            boolean verificaDiLogin = loginController.verificaLogin(userName, password, scelta);
            if(verificaDiLogin == false){ 
                JOptionPane.showMessageDialog(null, "!!Dati Sbagliati!!");
                this.dispose();
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAccediJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccediJB;
    private javax.swing.JLabel passwordJL;
    private javax.swing.JTextField passwordJTF;
    private javax.swing.JComboBox<String> sceltaAccessoJCB;
    private javax.swing.JLabel usernameJL;
    private javax.swing.JTextField usernameJTF;
    // End of variables declaration//GEN-END:variables
}
