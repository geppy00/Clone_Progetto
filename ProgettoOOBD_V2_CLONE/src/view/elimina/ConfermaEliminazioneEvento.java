
package view.elimina;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConfermaEliminazioneEvento extends javax.swing.JFrame {

    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private String idSponsor;
    private int idEvento;
    
    /*COSTRUTTORI*/
    public ConfermaEliminazioneEvento(String idSponsor, int idEvento) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        this.idEvento = idEvento;
    }
    
    public ConfermaEliminazioneEvento() {
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adviceJL = new javax.swing.JLabel();
        btnYesJB = new javax.swing.JButton();
        btnNoJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adviceJL.setText("SEI SICURO DI VOLER ELIMINARE QUESTO EVENTO?");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnYesJB, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(adviceJL))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(adviceJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYesJB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoJBActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnNoJBActionPerformed

    private void btnYesJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        
        if(controlloConvalidazione.controlloIdEvento(String.valueOf(this.getIdEvento())) == true) {
            try {
                controllerSponsor.eliminaEvento(this.getIdEvento(), Integer.parseInt(this.getIdSponsor()));
                JOptionPane.showMessageDialog(this, "✓ ELIMINAZIONE EFFETTUATA CON SUCCESSO", "ELIMINAZIONE", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            } catch (ExceptionDao ex) {
                Logger.getLogger(ConfermaEliminazioneEvento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "CI E' STATO UN PROBLEMA NEL RICAVARE I DATI\nRIPROVA A SELEZIONE QUESTO EVENTO", "WARNING", JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
        }
            
    }//GEN-LAST:event_btnYesJBActionPerformed


    /*GET AND SET*/
    public String getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(String idSponsor) {
        this.idSponsor = idSponsor;
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
                new ConfermaEliminazioneEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adviceJL;
    private javax.swing.JButton btnNoJB;
    private javax.swing.JButton btnYesJB;
    // End of variables declaration//GEN-END:variables
}
