
package view;

import controller.ControllerSponsor;
import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SponsorView extends javax.swing.JFrame {

    /*INFORMAZIONI IMPORTANTI*/
    private String idSponsor;
    
    /*CONTROLLER PER SPONSOR*/
    ControllerSponsor ControllerSponsor = new ControllerSponsor();
    
    /*COSTRUTTORI*/
    public SponsorView(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        
        try {
            nomeUtenteJL.setText(ControllerSponsor.prendiNomeUtente(Integer.parseInt(this.getIdSponsor())));
        } catch (ExceptionDao ex) {
            Logger.getLogger(SponsorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SponsorView() {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        benvenutoJL = new javax.swing.JLabel();
        btnVisualizzaSportiviJB = new javax.swing.JButton();
        btnGestioneEventiJB = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();
        nomeUtenteJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        benvenutoJL.setText("USER:");

        btnVisualizzaSportiviJB.setText("ELENCO SPORTIVI");
        btnVisualizzaSportiviJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizzaSportiviJBActionPerformed(evt);
            }
        });

        btnGestioneEventiJB.setText("GESTIONE EVENTI");
        btnGestioneEventiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioneEventiJBActionPerformed(evt);
            }
        });

        btnLogoutJB.setText("LOGOUT");
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnVisualizzaSportiviJB, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(btnGestioneEventiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(benvenutoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeUtenteJL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnLogoutJB, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(benvenutoJL)
                    .addComponent(nomeUtenteJL))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizzaSportiviJB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestioneEventiJB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btnLogoutJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnGestioneEventiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioneEventiJBActionPerformed
        SezioneEventiView sezioneEventiView = new SezioneEventiView(this.getIdSponsor());
        sezioneEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGestioneEventiJBActionPerformed

    private void btnVisualizzaSportiviJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizzaSportiviJBActionPerformed
        ElencoSportiviSponsor elencoSportiviSponsor = new ElencoSportiviSponsor(this.getIdSponsor());
        elencoSportiviSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVisualizzaSportiviJBActionPerformed

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed

    
    /*GET AND SET*/
    public String getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(String idSponsor) {
        this.idSponsor = idSponsor;
    }

    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SponsorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel benvenutoJL;
    private javax.swing.JButton btnGestioneEventiJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JButton btnVisualizzaSportiviJB;
    private javax.swing.JLabel nomeUtenteJL;
    // End of variables declaration//GEN-END:variables
}
