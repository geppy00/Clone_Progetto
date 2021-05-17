
package view.registrare;

import controller.ControllerLogin;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;
import view.AdminView;


public class RegistraNuovoProfilo extends javax.swing.JFrame {


    public RegistraNuovoProfilo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /*METODI*/
    public void stampaDatiUtenteNellaTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = null;
        String opzUser = opzUserJCB.getSelectedItem().toString();
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            
            switch(opzUser) {
            case "Procuratore":
                sql = "SELECT * FROM procuratore;";
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idProcuratore = rs.getString("code_procuratore");
                    String nomeProcuratore = rs.getString("nome");
                    String indirizzoProcuratore = rs.getString("indirizzo");
                    String telefonoProcuratore = rs.getString("telefono");
                    
                    String tbDataProcuratore[] = {idProcuratore, nomeProcuratore, indirizzoProcuratore, telefonoProcuratore};
                    DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                    tblModel.addRow(tbDataProcuratore);
                }
                rs.close();
                pStmt.close();
                connection.close();
            break;
                
            case "Atleta":
                sql = "SELECT * FROM atleta;";
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idAtleta = rs.getString("codfiscale");
                    String nomeAtleta = rs.getString("nome");
                    String indirizzoAtleta = rs.getString("indirizzo");
                    String telefonoAtleta = rs.getString("telefono");
                    
                    String tbDataAtleta[] = {idAtleta, nomeAtleta, indirizzoAtleta, telefonoAtleta};
                    DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                    tblModel.addRow(tbDataAtleta);
                }
                rs.close();
                pStmt.close();
                connection.close();
            break;
                
            case "Sponsor":
                sql = "SELECT * FROM sponsor;";
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idSponsor = rs.getString("idsponsor");
                    String nomeSponsor = rs.getString("nome");
                    String indirizzoSponsor = rs.getString("indirizzo");
                    String telefonoSponsor = rs.getString("telefono");
                    
                    String tbDataSponsor[] = {idSponsor, nomeSponsor, indirizzoSponsor, telefonoSponsor};
                    DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                    tblModel.addRow(tbDataSponsor);
                }
                rs.close();
                pStmt.close();
                connection.close();
            break;
                
            case "Club":
                sql = "SELECT * FROM club;";
                pStmt = connection.prepareStatement(sql);
                rs = pStmt.executeQuery();
                while(rs.next()) {
                    String idclub = rs.getString("idclub");
                    String nomeclub = rs.getString("nomeclub");
                    String indirizzoclub = rs.getString("indirizzo");
                    String telefonoclub = rs.getString("telefono");
                    
                    String tbDataClub[] = {idclub, nomeclub, indirizzoclub, telefonoclub};
                    DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                    tblModel.addRow(tbDataClub);
                }
                rs.close();
                pStmt.close();
                connection.close();
            break;
            }
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA PAGAMENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usenameJL = new javax.swing.JLabel();
        inputUsernameJTF = new javax.swing.JTextField();
        passwordJL = new javax.swing.JLabel();
        inputPasswordJTF = new javax.swing.JTextField();
        confermaPasswordJL = new javax.swing.JLabel();
        inputConfermaPasswordJTF = new javax.swing.JTextField();
        opzUserJCB = new javax.swing.JComboBox<>();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnRegistraJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputIdCorrispondenteJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatiUtenteJT = new javax.swing.JTable();
        btnRispristinaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usenameJL.setText("Username");

        passwordJL.setText("Password");

        confermaPasswordJL.setText("Conferma Password");

        opzUserJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procuratore", "Atleta", "Sponsor", "Club", "Admin", "" }));
        opzUserJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opzUserJCBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.setToolTipText("");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        btnRegistraJB.setText("REGISTRA");
        btnRegistraJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraJBActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Corrispondente");

        tableDatiUtenteJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Indirizzo", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(tableDatiUtenteJT);

        btnRispristinaJB.setText("RIPRISTINA");
        btnRispristinaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRispristinaJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTornaIndietroJB)
                        .addGap(53, 53, 53)
                        .addComponent(btnRispristinaJB)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputIdCorrispondenteJTF))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(usenameJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputUsernameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(passwordJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputPasswordJTF))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(confermaPasswordJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputConfermaPasswordJTF))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opzUserJCB, 0, 96, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistraJB)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usenameJL)
                            .addComponent(inputUsernameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passwordJL)
                                    .addComponent(inputPasswordJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(opzUserJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confermaPasswordJL)
                            .addComponent(inputConfermaPasswordJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(inputIdCorrispondenteJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTornaIndietroJB)
                            .addComponent(btnRegistraJB)
                            .addComponent(btnRispristinaJB)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    /*ACTION PERFOMED*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        AdminView adminView = new AdminView();
        adminView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void btnRegistraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraJBActionPerformed
        ControllerLogin controllerLogin = new ControllerLogin();
        String password = inputPasswordJTF.getText();
        String confermaPassword = inputConfermaPasswordJTF.getText();
        String opzUser = opzUserJCB.getSelectedItem().toString();
        String username = inputUsernameJTF.getText();
        String idCorrispodente = inputIdCorrispondenteJTF.getText();
        boolean ripeti = false;
        
       if(!(password.equals(confermaPassword))) {
           JOptionPane.showMessageDialog(null, "ATTENZIONE PASSWORD NON COMPATIBILE");
       } else {
            try {
                boolean check = controllerLogin.registraUtenteLogin(opzUser, username, password, idCorrispodente);
                if(check == true)
                    JOptionPane.showMessageDialog(null, "REGISTRAZIONE EFFETTUATA CON SUCCESSO");
                else
                    JOptionPane.showMessageDialog(null, "!! REGISTRAZIONE FALLITA !!");
            }catch (ExceptionDao ex) {
                    Logger.getLogger(RegistraNuovoProfilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRegistraJBActionPerformed

    private void opzUserJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opzUserJCBActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
            tblModel.setRowCount(0);
            stampaDatiUtenteNellaTabella();
        } catch (ExceptionDao ex) {
            Logger.getLogger(RegistraNuovoProfilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opzUserJCBActionPerformed

    private void btnRispristinaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRispristinaJBActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
        tblModel.setRowCount(0);
    }//GEN-LAST:event_btnRispristinaJBActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraNuovoProfilo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistraJB;
    private javax.swing.JButton btnRispristinaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel confermaPasswordJL;
    private javax.swing.JTextField inputConfermaPasswordJTF;
    private javax.swing.JTextField inputIdCorrispondenteJTF;
    private javax.swing.JTextField inputPasswordJTF;
    private javax.swing.JTextField inputUsernameJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opzUserJCB;
    private javax.swing.JLabel passwordJL;
    private javax.swing.JTable tableDatiUtenteJT;
    private javax.swing.JLabel usenameJL;
    // End of variables declaration//GEN-END:variables
}
