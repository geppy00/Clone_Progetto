
package view;

import controller.ControllerLogin;
import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LoginView extends javax.swing.JFrame {
    
    private String idCopiato;
    
    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameJL = new javax.swing.JLabel();
        usernameJTF = new javax.swing.JTextField();
        passwordJL = new javax.swing.JLabel();
        sceltaAccessoJCB = new javax.swing.JComboBox<>();
        btnAccediJB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        passwordPJTF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameJL.setText("Username");

        passwordJL.setText("Password");

        sceltaAccessoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procuratore", "Atleta", "Sponsor", "Admin", "Club" }));
        sceltaAccessoJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaAccessoJCBActionPerformed(evt);
            }
        });

        btnAccediJB.setText("ACCEDI");
        btnAccediJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccediJBActionPerformed(evt);
            }
        });

        jButton1.setText("cancelare");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccediJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(passwordJL)
                    .addComponent(sceltaAccessoJCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameJTF)
                    .addComponent(usernameJL)
                    .addComponent(passwordPJTF))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(usernameJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(sceltaAccessoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccediJB)
                    .addComponent(jButton1))
                .addGap(25, 25, 25))
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
       String userName = usernameJTF.getText();
       String password = passwordPJTF.getText();
       String scelta = sceltaAccessoJCB.getSelectedItem().toString();
       
       ControllerLogin loginController = new ControllerLogin();
       
        try {
            setIdCopiato(loginController.verificaLogin(userName, password, scelta));
            System.out.println("CODICE ACCESSO "+getIdCopiato());
            if(getIdCopiato() == null){ 
                JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nDATI SBAGLIATI", "ERRORE", JOptionPane.ERROR_MESSAGE);
             
            }else{
               JOptionPane.showMessageDialog(this, "DATI CORRETI\n\t\tBENVENUTO", "ACCESSO", JOptionPane.INFORMATION_MESSAGE);
               
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sceltaAccessoJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaAccessoJCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sceltaAccessoJCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccediJB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel passwordJL;
    private javax.swing.JPasswordField passwordPJTF;
    private javax.swing.JComboBox<String> sceltaAccessoJCB;
    private javax.swing.JLabel usernameJL;
    private javax.swing.JTextField usernameJTF;
    // End of variables declaration//GEN-END:variables
}
