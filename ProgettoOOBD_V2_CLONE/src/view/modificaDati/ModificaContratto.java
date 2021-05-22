
package view.modificaDati;

import dao.DataAccessObject;
import dao.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;


public class ModificaContratto extends javax.swing.JFrame {



    private String idProcuratore;
    
    /*COSTRUTTORI*/
    public ModificaContratto(String idProcuratore) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
    }
    
    public ModificaContratto() {
        
    }

    /*METODI*/
    public void stampaDatiTabella() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = null;
        String opzUser = opzProcuratoreFiltroJCB.getSelectedItem().toString();
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            
            switch(opzUser) {
                case "Contratti con CLUB":
                    sql = "SELECT * FROM contratto WHERE ;";
                    pStmt = connection.prepareStatement(sql);
                    rs = pStmt.executeQuery();
                    while(rs.next()) {
                        String idProcuratore = rs.getString("code_procuratore");
                        String nomeProcuratore = rs.getString("nome");
                        String indirizzoProcuratore = rs.getString("indirizzo");
                        String telefonoProcuratore = rs.getString("telefono");

                        String tbDataProcuratore[] = {idProcuratore, nomeProcuratore, indirizzoProcuratore, telefonoProcuratore};
                        //DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                        //tblModel.addRow(tbDataProcuratore);
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
                        //DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                        //tblModel.addRow(tbDataAtleta);
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
                        //DefaultTableModel tblModel = (DefaultTableModel)tableDatiUtenteJT.getModel();
                        //tblModel.addRow(tbDataSponsor);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiContrattoJT = new javax.swing.JTable();
        opzProcuratoreFiltroJCB = new javax.swing.JComboBox<>();
        cfAtletaJL = new javax.swing.JLabel();
        inputCfAtletaJTF = new javax.swing.JTextField();
        btnCercaJB = new javax.swing.JButton();
        btnAnnullaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatiContrattoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ATLETA", "ID Sponsor", "ID Club", "Anno Stipulazione", "Anno fine", "Valore contrattuale"
            }
        ));
        jScrollPane1.setViewportView(tblDatiContrattoJT);

        opzProcuratoreFiltroJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratti con CLUB", "Contratti con SPONSOR", "Senza Contratti" }));

        cfAtletaJL.setText("Codice Fiscale Atleta");

        btnCercaJB.setText("CERCA");

        btnAnnullaJB.setText("TORNA INDIETRO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cfAtletaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCfAtletaJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCercaJB)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAnnullaJB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(opzProcuratoreFiltroJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(opzProcuratoreFiltroJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cfAtletaJL)
                            .addComponent(inputCfAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCercaJB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(btnAnnullaJB))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*GET AND SET*/
    public String getIdProcuratore() {
        return idProcuratore;
    }

    public void setIdProcuratore(String idProcuratore) {
        this.idProcuratore = idProcuratore;
    }

    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaContratto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JLabel cfAtletaJL;
    private javax.swing.JTextField inputCfAtletaJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opzProcuratoreFiltroJCB;
    private javax.swing.JTable tblDatiContrattoJT;
    // End of variables declaration//GEN-END:variables
}
