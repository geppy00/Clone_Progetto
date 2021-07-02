
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
        this.setLocationRelativeTo(null);
    }

    public ModificaPagamento() {
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adviceJL = new javax.swing.JLabel();
        idDestinatarioJL = new javax.swing.JLabel();
        inputIdDestinatarioJTF = new javax.swing.JTextField();
        dataPagamentoJL = new javax.swing.JLabel();
        inputDataCercareJDC = new com.toedter.calendar.JDateChooser();
        advice2JL = new javax.swing.JLabel();
        importoJL = new javax.swing.JLabel();
        inputImportoJTF = new javax.swing.JTextField();
        btnAnnullaJB = new javax.swing.JButton();
        btnModificaJB = new javax.swing.JButton();
        btnCercaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adviceJL.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        adviceJL.setText("INSERISCI I DATI DEL PAGAMENTO EFFETTUATO");

        idDestinatarioJL.setText("ID Destinatario");

        dataPagamentoJL.setText("Data Pagamento");

        inputDataCercareJDC.setDateFormatString("yyyy-MM-dd");

        advice2JL.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        advice2JL.setText("RISULTATO RICERCA");

        importoJL.setText("Importo Registrato");

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        btnModificaJB.setText("MODIFICA");
        btnModificaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaJBActionPerformed(evt);
            }
        });

        btnCercaJB.setText("CERCA");
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 92, Short.MAX_VALUE)
                        .addComponent(adviceJL)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idDestinatarioJL)
                                            .addComponent(dataPagamentoJL))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputIdDestinatarioJTF)
                                            .addComponent(inputDataCercareJDC, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(importoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputImportoJTF)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCercaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(advice2JL)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adviceJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idDestinatarioJL)
                            .addComponent(inputIdDestinatarioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataPagamentoJL)
                            .addComponent(inputDataCercareJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCercaJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(advice2JL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importoJL)
                    .addComponent(inputImportoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
    private javax.swing.JLabel advice2JL;
    private javax.swing.JLabel adviceJL;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnModificaJB;
    private javax.swing.JLabel dataPagamentoJL;
    private javax.swing.JLabel idDestinatarioJL;
    private javax.swing.JLabel importoJL;
    private com.toedter.calendar.JDateChooser inputDataCercareJDC;
    private javax.swing.JTextField inputIdDestinatarioJTF;
    private javax.swing.JTextField inputImportoJTF;
    // End of variables declaration//GEN-END:variables
}
