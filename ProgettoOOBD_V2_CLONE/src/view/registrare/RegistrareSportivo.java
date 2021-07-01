
package view.registrare;

import controller.ControllerSportivo;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;
import view.SezioneAtletaView;

public class RegistrareSportivo extends javax.swing.JFrame {

   
    /*COSTRUTTORE*/
    public RegistrareSportivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            this.stampaDatiTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistrareSportivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*METODI*/
    private void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select * from club;";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idClub = String.valueOf(rs.getInt("idclub"));
                String nome = rs.getString("nomeclub");
                
                String tbDataAtleta[] = {idClub, nome};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiClubJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
           
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA ATLETA FALLITA "+e);
        }
        
        finally {
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeJL = new javax.swing.JLabel();
        inputNomeJTF = new javax.swing.JTextField();
        cognomeJL = new javax.swing.JLabel();
        inputCognomeJTF = new javax.swing.JTextField();
        sessoJL = new javax.swing.JLabel();
        inputSessoJTF = new javax.swing.JComboBox<>();
        nazioneJL = new javax.swing.JLabel();
        inputNazioneJTF = new javax.swing.JTextField();
        dataNascitaJL = new javax.swing.JLabel();
        DataNascitaJDC = new com.toedter.calendar.JDateChooser();
        telefonoJL = new javax.swing.JLabel();
        inputTelefonoJTF = new javax.swing.JTextField();
        codiceFiscaleJL = new javax.swing.JLabel();
        inputCodiceFiscaleJTF = new javax.swing.JTextField();
        ruoloAtletaJL = new javax.swing.JLabel();
        inputRuoloAtletaJTF = new javax.swing.JTextField();
        pesoJL = new javax.swing.JLabel();
        inputPesoJTF = new javax.swing.JTextField();
        ibanJL = new javax.swing.JLabel();
        inputIbanAtletaJTF = new javax.swing.JTextField();
        btnAnnullaJB = new javax.swing.JButton();
        btnRegistraJB = new javax.swing.JButton();
        idProcuratoreJL = new javax.swing.JLabel();
        inputIDProcuratoreJTF = new javax.swing.JTextField();
        indirizzoJL = new javax.swing.JLabel();
        inputIndirizzoJTF = new javax.swing.JTextField();
        idClubJL = new javax.swing.JLabel();
        inputIdClubJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiClubJT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeJL.setText("Nome");

        cognomeJL.setText("Cognome");

        sessoJL.setText("Sesso");

        inputSessoJTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maschio", "Femmina", "Altro" }));

        nazioneJL.setText("Nazionalità");

        dataNascitaJL.setText("Data Nascita");

        telefonoJL.setText("Telefono");

        codiceFiscaleJL.setText("Codice Fiscale");

        ruoloAtletaJL.setText("Ruolo Atleta");

        pesoJL.setText("Peso");

        ibanJL.setText("Iban Atleta");

        btnAnnullaJB.setText("ANNULA");
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });

        btnRegistraJB.setText("REGISTRA ATLETA");
        btnRegistraJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraJBActionPerformed(evt);
            }
        });

        idProcuratoreJL.setText("ID Procuratore");

        indirizzoJL.setText("Indirizzo");

        idClubJL.setText("ID Club");

        tblDatiClubJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Club", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatiClubJT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nazioneJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNazioneJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataNascitaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DataNascitaJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(telefonoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTelefonoJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idProcuratoreJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIDProcuratoreJTF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codiceFiscaleJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCodiceFiscaleJTF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ruoloAtletaJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputRuoloAtletaJTF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesoJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputPesoJTF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ibanJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIbanAtletaJTF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnnullaJB)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nomeJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sessoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputSessoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cognomeJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputCognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(indirizzoJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idClubJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputIdClubJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistraJB, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeJL)
                            .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indirizzoJL)
                            .addComponent(inputIndirizzoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cognomeJL)
                            .addComponent(inputCognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idClubJL)
                            .addComponent(inputIdClubJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sessoJL)
                            .addComponent(inputSessoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nazioneJL)
                            .addComponent(inputNazioneJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DataNascitaJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascitaJL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoJL)
                    .addComponent(inputTelefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codiceFiscaleJL)
                    .addComponent(inputCodiceFiscaleJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruoloAtletaJL)
                    .addComponent(inputRuoloAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoJL)
                    .addComponent(inputPesoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ibanJL)
                    .addComponent(inputIbanAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idProcuratoreJL)
                    .addComponent(inputIDProcuratoreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnnullaJB, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(btnRegistraJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*ACTION PERFOMED*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        SezioneAtletaView sezioneAtletaView = new SezioneAtletaView();
        sezioneAtletaView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed

    private void btnRegistraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraJBActionPerformed
        ControllerSportivo controllerSportivo = new ControllerSportivo();

        String nomePreso = inputNomeJTF.getText();
        String cognomePreso = inputCognomeJTF.getText();
        String sessoPreso = (String) inputSessoJTF.getSelectedItem();
        String nazionePreso = inputNazioneJTF.getText();
        java.sql.Date dataNascitaPresoSql = new java.sql.Date(DataNascitaJDC.getDate().getTime());
        String telefonoPreso = inputTelefonoJTF.getText();
        String codiceFiscalePreso = inputCodiceFiscaleJTF.getText();
        String ruoloAtletaPreso = inputRuoloAtletaJTF.getText();
        String pesoStr = inputPesoJTF.getText();
        float pesoPreso = Float.parseFloat(pesoStr);
        String ibanPreso = inputIbanAtletaJTF.getText();
        String idProcuratore = inputIDProcuratoreJTF.getText();
        String indirizzoPreso = inputIndirizzoJTF.getText();

        int idClub;
        if(inputIdClubJTF.getText().equals(""))
            idClub = 0;
        else
            idClub = Integer.parseInt(inputIdClubJTF.getText());
       
        System.out.println("IDCLUB VIEW= "+idClub);
        try {
            controllerSportivo.registraSportivo(nomePreso, cognomePreso, sessoPreso, nazionePreso, indirizzoPreso, dataNascitaPresoSql, telefonoPreso, codiceFiscalePreso, ruoloAtletaPreso, pesoPreso, idProcuratore, ibanPreso, idClub);
                } catch (ExceptionDao ex) {
            Logger.getLogger(RegistrareSportivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistraJBActionPerformed

   
    /*MAIN*/
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrareSportivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataNascitaJDC;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnRegistraJB;
    private javax.swing.JLabel codiceFiscaleJL;
    private javax.swing.JLabel cognomeJL;
    private javax.swing.JLabel dataNascitaJL;
    private javax.swing.JLabel ibanJL;
    private javax.swing.JLabel idClubJL;
    private javax.swing.JLabel idProcuratoreJL;
    private javax.swing.JLabel indirizzoJL;
    private javax.swing.JTextField inputCodiceFiscaleJTF;
    private javax.swing.JTextField inputCognomeJTF;
    private javax.swing.JTextField inputIDProcuratoreJTF;
    private javax.swing.JTextField inputIbanAtletaJTF;
    private javax.swing.JTextField inputIdClubJTF;
    private javax.swing.JTextField inputIndirizzoJTF;
    private javax.swing.JTextField inputNazioneJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JTextField inputPesoJTF;
    private javax.swing.JTextField inputRuoloAtletaJTF;
    private javax.swing.JComboBox<String> inputSessoJTF;
    private javax.swing.JTextField inputTelefonoJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nazioneJL;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JLabel pesoJL;
    private javax.swing.JLabel ruoloAtletaJL;
    private javax.swing.JLabel sessoJL;
    private javax.swing.JTable tblDatiClubJT;
    private javax.swing.JLabel telefonoJL;
    // End of variables declaration//GEN-END:variables
}
