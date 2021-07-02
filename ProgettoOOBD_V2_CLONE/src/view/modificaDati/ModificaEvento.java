
package view.modificaDati;

import controller.ControllerSponsor;
import convalidazione.ControlloConvalidazione;
import dao.ExceptionDao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Evento;
import view.ElencoEventiView;
import view.registrare.RegistraEventoSponsor;

public class ModificaEvento extends javax.swing.JFrame {
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    
    /*DATI IMPORTANTI*/
    private ArrayList<Evento> datiEvento = new ArrayList<Evento>();
    private int idEvento;
    private String idSponsor;
    
    /*COSTRUTTORI*/
    public ModificaEvento(String idSponsor, int idEvento) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        this.idEvento = idEvento;
   
        this.stampaDati();
    }
    
    public ModificaEvento() {
        
    }


    /*METODI*/
    private void stampaDati() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        
        if(controlloConvalidazione.controlloIdEvento(String.valueOf(this.getIdEvento())) == true) {
            try {
                datiEvento = controllerSponsor.prendiDatiEvento(this.getIdEvento());
                if(datiEvento.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "EVENTO CON ID UGUALE AD "+this.getIdEvento()+" NON TROVATO\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
                    elencoEventiView.setVisible(true);
                    this.setVisible(false);
                }
                else {
                    datiEvento.forEach((Evento evento) -> {
                        idEventoJTF.setText(String.valueOf(this.getIdEvento()));
                        inputGettoneEventoJTF.setText(String.valueOf(evento.getGettoneValue()));
                        inputTitoloJTF.setText(evento.getTitolo());
                        inpuIndirizzoJTF.setText(evento.getLuogoEvento());
                        inputDataInizioJDC.setDate(evento.getDataInizio());
                        inputOraInizioJTF.setText(String.valueOf(evento.getOraInizio()));
                        inputDataFineJDC.setDate(evento.getDataFine());
                        inputOraFineJTF.setText(String.valueOf(evento.getOraFine()));
                        inputDescrizioneJTA.setText(evento.getDescrizione());
                    });
                }
            } catch (ExceptionDao ex) {
                //Logger.getLogger(ModificaEvento.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "CI E' STATO UN PROBLEMA NEL RICAVARE I DATI\nCI SCUSIAMO PER L'INCONVENINETE", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "CI E' STATO UN PROBLEMA NEL RICAVARE I DATI\nRIPROVA A SELEZIONE QUESTO EVENTO", "WARNING", JOptionPane.WARNING_MESSAGE);
            ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
            elencoEventiView.setVisible(true);
            this.setVisible(false);
        }
    }
    
    private java.sql.Time stringToTime(String oraStr) {
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        
        try {
            java.sql.Time timeValue = new java.sql.Time(formatter.parse(oraStr).getTime());
            return timeValue;
        } catch (ParseException ex) {
            //Logger.getLogger(RegistraEventoSponsor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN ORARIO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificaJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();
        idEventoJL = new javax.swing.JLabel();
        idEventoJTF = new javax.swing.JTextField();
        titoloJL = new javax.swing.JLabel();
        inputTitoloJTF = new javax.swing.JTextField();
        indirizzoJL = new javax.swing.JLabel();
        inpuIndirizzoJTF = new javax.swing.JTextField();
        dataInizioJL = new javax.swing.JLabel();
        inputDataInizioJDC = new com.toedter.calendar.JDateChooser();
        oraInizioJL = new javax.swing.JLabel();
        inputOraInizioJTF = new javax.swing.JTextField();
        dataFineJL = new javax.swing.JLabel();
        inputDataFineJDC = new com.toedter.calendar.JDateChooser();
        oraFineJL = new javax.swing.JLabel();
        inputOraFineJTF = new javax.swing.JTextField();
        descrizioneJL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescrizioneJTA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        inputGettoneEventoJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnModificaJB.setText("MODIFICA");
        btnModificaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaJBActionPerformed(evt);
            }
        });

        btnAnnullaJB.setText("ANNULLA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        idEventoJL.setText("ID Evento");

        idEventoJTF.setEditable(false);

        titoloJL.setText("Titolo");

        inputTitoloJTF.setToolTipText("");

        indirizzoJL.setText("Indirizzo Evento");

        dataInizioJL.setText("data Inizio ");

        oraInizioJL.setText("Ora Inizio");

        dataFineJL.setText("data Fine");
        dataFineJL.setToolTipText("");

        oraFineJL.setText("Ora Fine");

        descrizioneJL.setText("Descrizione");

        inputDescrizioneJTA.setColumns(20);
        inputDescrizioneJTA.setRows(5);
        jScrollPane1.setViewportView(inputDescrizioneJTA);

        jLabel1.setText("Valore Gettone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnnullaJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificaJB)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(dataInizioJL)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(titoloJL)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(inputTitoloJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(idEventoJL)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(idEventoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(58, 58, 58)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dataFineJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputDataInizioJDC, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputDataFineJDC, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(78, 78, 78)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(oraFineJL)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(inputOraFineJTF))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(oraInizioJL)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(inputOraInizioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(indirizzoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inpuIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputGettoneEventoJTF))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descrizioneJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEventoJL)
                    .addComponent(idEventoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(inputGettoneEventoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titoloJL)
                    .addComponent(inputTitoloJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indirizzoJL)
                    .addComponent(inpuIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(oraInizioJL)
                        .addComponent(inputOraInizioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataInizioJL))
                    .addComponent(inputDataInizioJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dataFineJL)
                        .addComponent(inputDataFineJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oraFineJL))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputOraFineJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descrizioneJL)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificaJB)
                    .addComponent(btnAnnullaJB))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
        elencoEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnModificaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaJBActionPerformed
        ControllerSponsor controllerSponsor = new ControllerSponsor();
        
        if(controlloConvalidazione.controlloIdEvento(String.valueOf(this.getIdEvento())) == true) {
            String titolo = inputTitoloJTF.getText();
            String indirizzo = inpuIndirizzoJTF.getText();
            java.sql.Date dataInizio = null;
            java.sql.Date dataFine = null;
            double gettoneValue = 0;
            
            try {
            dataInizio = new java.sql.Date(inputDataInizioJDC.getDate().getTime());
            dataFine = new java.sql.Date(inputDataFineJDC.getDate().getTime());
            }catch(NullPointerException nex) {
                JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UNA DATA VALIDA", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            
            String oraInizio = inputOraInizioJTF.getText();
            java.sql.Time oraInizioTime = stringToTime(oraInizio);
            String oraFine = inputOraFineJTF.getText();
            java.sql.Time oraFineTime = stringToTime(oraFine);
            
            try {
                gettoneValue = Double.parseDouble(inputGettoneEventoJTF.getText());
            }catch(NumberFormatException nfe) {
                 JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nINSERIRE UN NUMERO VALIDO", "ERRORE", JOptionPane.ERROR_MESSAGE);
            }
            
            String descrizione = inputDescrizioneJTA.getText();
            
            if(controlloConvalidazione.controlloDescrizioneEvento(descrizione) == true) {
                if(controlloConvalidazione.controlloModificaEvento(String.valueOf(dataInizio), String.valueOf(dataFine), titolo, titolo, String.valueOf(gettoneValue), String.valueOf(oraInizioTime), String.valueOf(oraFineTime)) == true) {
                    if(datiEvento.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "EVENTO CON ID "+this.getIdEvento()+" NON ESISTE\nNON POSSIBILE MODIFICARLO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                        ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
                        elencoEventiView.setVisible(true);
                        this.setVisible(false);
                    }
                    else {
                        try {
                            controllerSponsor.aggiornaEvento(gettoneValue, this.getIdEvento(), titolo, indirizzo, dataInizio, oraInizioTime, dataFine, oraFineTime, Integer.parseInt(this.getIdSponsor()), descrizione);
                            JOptionPane.showMessageDialog(this, "✓ MODIFICA DELL' EVENTO CON ID"+this.getIdEvento()+" EFFETTUATA CON SUCCESSO", "MODIFICA", JOptionPane.INFORMATION_MESSAGE);
                            ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
                            elencoEventiView.setVisible(true);
                            this.setVisible(false);
                        } catch (ExceptionDao ex) {
                            Logger.getLogger(ModificaEvento.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
            else
                JOptionPane.showMessageDialog(this, "DESCRIZIONE MASSIMO 280 CARATTERI", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "CI E' STATO UN PROBLEMA NEL RICAVARE I DATI\nRIPROVA A SELEZIONE QUESTO EVENTO", "WARNING", JOptionPane.WARNING_MESSAGE);
            ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
            elencoEventiView.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnModificaJBActionPerformed

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
                new ModificaEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnModificaJB;
    private javax.swing.JLabel dataFineJL;
    private javax.swing.JLabel dataInizioJL;
    private javax.swing.JLabel descrizioneJL;
    private javax.swing.JLabel idEventoJL;
    private javax.swing.JTextField idEventoJTF;
    private javax.swing.JLabel indirizzoJL;
    private javax.swing.JTextField inpuIndirizzoJTF;
    private com.toedter.calendar.JDateChooser inputDataFineJDC;
    private com.toedter.calendar.JDateChooser inputDataInizioJDC;
    private javax.swing.JTextArea inputDescrizioneJTA;
    private javax.swing.JTextField inputGettoneEventoJTF;
    private javax.swing.JTextField inputOraFineJTF;
    private javax.swing.JTextField inputOraInizioJTF;
    private javax.swing.JTextField inputTitoloJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel oraFineJL;
    private javax.swing.JLabel oraInizioJL;
    private javax.swing.JLabel titoloJL;
    // End of variables declaration//GEN-END:variables
}
