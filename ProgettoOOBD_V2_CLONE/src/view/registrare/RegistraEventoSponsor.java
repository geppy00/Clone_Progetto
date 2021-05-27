
package view.registrare;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JOptionPane;

public class RegistraEventoSponsor extends javax.swing.JFrame {

    private String idSponsor;
    
    /*COSTRUTTORI*/
    public RegistraEventoSponsor(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
    }
    
    public RegistraEventoSponsor() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titoloJL = new javax.swing.JLabel();
        dataEventoJL = new javax.swing.JLabel();
        scegliDataInizioJDC = new com.toedter.calendar.JDateChooser();
        luogoEventoJL = new javax.swing.JLabel();
        inputLuogoEventoJTF = new javax.swing.JTextField();
        dataOraFineJL = new javax.swing.JLabel();
        scegliDataFineJDC = new com.toedter.calendar.JDateChooser();
        titoloEventoJL = new javax.swing.JLabel();
        inputTitoloJTF = new javax.swing.JTextField();
        descrizioneJL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescrizioneJTA = new javax.swing.JTextArea();
        btnCreaEventoJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titoloJL.setText("CREA IL TUO EVENTO");

        dataEventoJL.setText("Data/Ora Inizio Evento");

        scegliDataInizioJDC.setDateFormatString("yyyy-MM-dd HH:mm:ss");

        luogoEventoJL.setText("Luogo Evento");

        dataOraFineJL.setText("Data/Ora Fine Evento");

        scegliDataFineJDC.setDateFormatString("yyyy-MM-dd HH:mm:ss");

        titoloEventoJL.setText("Titolo Evento");

        descrizioneJL.setText("Descrizione Evento");
        descrizioneJL.setToolTipText("");

        inputDescrizioneJTA.setColumns(20);
        inputDescrizioneJTA.setRows(5);
        jScrollPane1.setViewportView(inputDescrizioneJTA);

        btnCreaEventoJB.setText("CREA");
        btnCreaEventoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaEventoJBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
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
                                .addGap(251, 251, 251)
                                .addComponent(titoloJL))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(descrizioneJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(dataOraFineJL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scegliDataFineJDC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(dataEventoJL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scegliDataInizioJDC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(luogoEventoJL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inputLuogoEventoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(titoloEventoJL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inputTitoloJTF)))))))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTornaIndietroJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreaEventoJB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titoloEventoJL)
                        .addComponent(inputTitoloJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(luogoEventoJL)
                                .addComponent(inputLuogoEventoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titoloJL)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataEventoJL)
                                    .addComponent(scegliDataInizioJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataOraFineJL)
                            .addComponent(scegliDataFineJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descrizioneJL)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreaEventoJB)
                    .addComponent(btnTornaIndietroJB))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnCreaEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaEventoJBActionPerformed
       String descrizione = inputDescrizioneJTA.getText();
       String titolo = inputTitoloJTF.getText();
       String luogo = inputLuogoEventoJTF.getText();
       java.sql.Date dataInizio = new java.sql.Date(scegliDataInizioJDC.getDate().getTime());
       java.sql.Date dataFine = new java.sql.Date(scegliDataInizioJDC.getDate().getTime());
       
       SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm:ss"); //RIGA 171 E 172 SERVONO PER RICAVRE L'ORARIO
       String oraInizio = localDateFormat.format(dataInizio);
       String oraFine = localDateFormat.format(dataFine);
       System.out.println("Ora INIZIO="+oraInizio+" ORA FINE="+oraFine);
       
       if(descrizione == null || descrizione.length() > 280 || descrizione.length() == 0) {
           JOptionPane.showMessageDialog(null, "!! Hai sfiorato la soglia MASSIMA(280 caratteri) !!");
       }
           
    }//GEN-LAST:event_btnCreaEventoJBActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    
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
                new RegistraEventoSponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreaEventoJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel dataEventoJL;
    private javax.swing.JLabel dataOraFineJL;
    private javax.swing.JLabel descrizioneJL;
    private javax.swing.JTextArea inputDescrizioneJTA;
    private javax.swing.JTextField inputLuogoEventoJTF;
    private javax.swing.JTextField inputTitoloJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel luogoEventoJL;
    private com.toedter.calendar.JDateChooser scegliDataFineJDC;
    private com.toedter.calendar.JDateChooser scegliDataInizioJDC;
    private javax.swing.JLabel titoloEventoJL;
    private javax.swing.JLabel titoloJL;
    // End of variables declaration//GEN-END:variables
}
