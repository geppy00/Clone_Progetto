
package view.registrare;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.SezioneEventiView;
import java.text.DateFormat;
import java.text.ParseException;

public class RegistraEventoSponsor extends javax.swing.JFrame {

    /*DATI IMPORTANTI*/
    private String idSponsor;
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*COSTRUTTORI*/
    public RegistraEventoSponsor(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
    }
    
    public RegistraEventoSponsor() {
        
    }
    
    /*METODI*/
    private java.sql.Time stringToTime(String oraStr) {
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        
        try {
            java.sql.Time timeValue = new java.sql.Time(formatter.parse(oraStr).getTime());
            return timeValue;
        } catch(NullPointerException nex){
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN ORARIO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(RegistraEventoSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
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
        gettoneEventoJL = new javax.swing.JLabel();
        inputGettoneEventoJTF = new javax.swing.JTextField();

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

        gettoneEventoJL.setText("Gettone Evento");

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
                                                .addComponent(inputTitoloJTF))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(descrizioneJL)
                                            .addComponent(gettoneEventoJL))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputGettoneEventoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gettoneEventoJL)
                    .addComponent(inputGettoneEventoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreaEventoJB)
                    .addComponent(btnTornaIndietroJB))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnCreaEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaEventoJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        String descrizione = inputDescrizioneJTA.getText();
        String titolo = inputTitoloJTF.getText();
        String luogo = inputLuogoEventoJTF.getText();
        java.sql.Date dataInizio = null;
        java.sql.Date dataFine = null;
        SimpleDateFormat localDateFormat = null;
        String oraInizio = null;
        String oraFine = null;
        double gettoneValue = 0;
                
        try {
            dataInizio = new java.sql.Date(scegliDataInizioJDC.getDate().getTime());
            dataFine = new java.sql.Date(scegliDataFineJDC.getDate().getTime());
            localDateFormat = new SimpleDateFormat("HH:mm:ss"); //RIGA 171 E 172 SERVONO PER RICAVRE L'ORARIO
            oraInizio = localDateFormat.format(dataInizio);
            oraFine = localDateFormat.format(dataFine);
        }catch(NullPointerException nex) {
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UNA DATA CON ORARIO VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        java.sql.Time oraInizioTime = stringToTime(oraInizio);
        java.sql.Time oraFineTime = stringToTime(oraFine);

        try {
            gettoneValue = Double.parseDouble(inputGettoneEventoJTF.getText());
        }catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN NUMERO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }

        if(controlloConvalidazione.controlloRegistraEvento(String.valueOf(dataInizio), String.valueOf(dataFine), luogo, titolo, String.valueOf(gettoneValue)) == true) {
            if(controlloConvalidazione.controlloDescrizioneEvento(descrizione) == true) {
                try {
                    controllerSponsor.registraEvento(gettoneValue, titolo, luogo, dataInizio, oraInizioTime, dataFine, oraFineTime, Integer.parseInt(this.getIdSponsor()), descrizione);
                } catch (ExceptionDao ex) {
                    Logger.getLogger(RegistraEventoSponsor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
                JOptionPane.showMessageDialog(this, "DESCRIZIONE MASSIMO 280 CARATTERI", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nUNO O PIU' CAMPI MANCANTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnCreaEventoJBActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SezioneEventiView sezioneEventiView = new SezioneEventiView(this.getIdSponsor());
        sezioneEventiView.setVisible(true);
        this.setVisible(false);
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
    private javax.swing.JLabel gettoneEventoJL;
    private javax.swing.JTextArea inputDescrizioneJTA;
    private javax.swing.JTextField inputGettoneEventoJTF;
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
