
package view.registrare;

import controller.ControllerClub;
import dao.ExceptionDao;
import view.SezionePagamentoView;
import  java.sql.Date;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistraPagamento extends javax.swing.JFrame {

    private String idClubStr;
    private int idClub;
    
    public RegistraPagamento(String idClub) {
        initComponents();
        this.idClubStr = idClub;
        this.setLocationRelativeTo(null);
    }

    public RegistraPagamento() { 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        importoJL = new javax.swing.JLabel();
        inputImportoJTF = new javax.swing.JTextField();
        btnPagaJB = new javax.swing.JButton();
        idDestinatarioJL = new javax.swing.JLabel();
        inputIdDestinatarioJTF = new javax.swing.JTextField();
        btnAnnullaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        importoJL.setText("INSERISCI IMPORTO");

        btnPagaJB.setText("PAGA");
        btnPagaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagaJBActionPerformed(evt);
            }
        });

        idDestinatarioJL.setText("ID Destinatario");

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(importoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputImportoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idDestinatarioJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputIdDestinatarioJTF)))
                .addGap(18, 18, 18)
                .addComponent(btnPagaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnnullaJB)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(importoJL)
                            .addComponent(inputImportoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idDestinatarioJL)
                            .addComponent(inputIdDestinatarioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPagaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnPagaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagaJBActionPerformed
       ControllerClub controllerClub = new ControllerClub();
       LocalDate dataPagamento = java.time.LocalDate.now();
       Date javaDate = Date.valueOf(dataPagamento); 
       String importoStr = inputImportoJTF.getText();
       double importo = Float.parseFloat(importoStr);
       String idDestinatario = inputIdDestinatarioJTF.getText();
       this.setIdClub(Integer.parseInt(idClubStr));
    
       System.out.println("ID CLUB= "+this.getIdClub());
       System.out.println("DATA CURRENT= "+javaDate);
       
        try {
            boolean checkPagamento = controllerClub.effettuaPagamento(importo, idDestinatario, this.getIdClub(), (java.sql.Date) javaDate);
            if(checkPagamento == true) 
                JOptionPane.showMessageDialog(null, "PAGAMENTO EFFETTUATO CON SUCCESSO\nRiepilogo\nImporto: "+importo+"\nDestinatario: "+idDestinatario+"\nData Pagamento: "+javaDate+"\nID Mittente: "+this.getIdClub());
            else
                JOptionPane.showMessageDialog(null, "!! PAGAMENTO FALLITO !!");
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPagaJBActionPerformed

    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezionePagamentoView sezionePagamentoView = new SezionePagamentoView(this.getIdClubStr());
        sezionePagamentoView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    
    /*GET AND SET*/
    public String getIdClubStr() {
        return idClubStr;
    }

    public void setIdClubStr(String idClubStr) {
        this.idClubStr = idClubStr;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    
    /*MAIN PER APRIRE FINESTRA*/
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnPagaJB;
    private javax.swing.JLabel idDestinatarioJL;
    private javax.swing.JLabel importoJL;
    private javax.swing.JTextField inputIdDestinatarioJTF;
    private javax.swing.JTextField inputImportoJTF;
    // End of variables declaration//GEN-END:variables
}
