
package view.registrare;

import controller.ControllerSportivo;
import dao.ExceptionDao;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistraInvitato extends javax.swing.JFrame {

    private String idAtleta;
    private int idEvento;
    
    /*COSTRUTTORI*/
    public RegistraInvitato(String idAtleta, int idEvento) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idAtleta = idAtleta;
        this.idEvento = idEvento;
    }

    public RegistraInvitato() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnYesJB = new javax.swing.JButton();
        btnNoJB = new javax.swing.JButton();
        adviceJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnYesJB.setText("SI");
        btnYesJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesJBActionPerformed(evt);
            }
        });

        btnNoJB.setText("NO");
        btnNoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoJBActionPerformed(evt);
            }
        });

        adviceJL.setText("SEI SICURO DI VOLER PARTECIPARE A QUESTO EVENTO?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnYesJB, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(adviceJL)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(adviceJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYesJB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnYesJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        try {
            controllerSportivo.registraInvitato(this.getIdAtleta(), this.getIdEvento(), 1);
            this.setVisible(false);
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraInvitato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnYesJBActionPerformed

    private void btnNoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();
        try {
            controllerSportivo.registraInvitato(this.getIdAtleta(), this.getIdEvento(), 0);
            this.setVisible(false);
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraInvitato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNoJBActionPerformed

     /*GET AND SET*/
    public String getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(String idAtleta) {
        this.idAtleta = idAtleta;
    }
    
     public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
    
   /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraInvitato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adviceJL;
    private javax.swing.JButton btnNoJB;
    private javax.swing.JButton btnYesJB;
    // End of variables declaration//GEN-END:variables
}
