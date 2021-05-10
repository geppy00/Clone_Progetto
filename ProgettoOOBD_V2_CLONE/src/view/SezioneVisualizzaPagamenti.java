
package view;

import controller.ControllerClub;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.awt.Toolkit;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Club;
import model.Stipendio;
import refactorCode.FinallyException;
import view.elimina.EliminaClub;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import view.registrare.RegistraClub;

public class SezioneVisualizzaPagamenti extends javax.swing.JFrame {
    
    private String[] tbData;
    private String idClub;
    
    public void visualizzaTuttiPagamenti() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String sql = "SELECT * FROM stipendio WHERE idclub="+this.getIdClub()+";";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idStipendio = Integer.toString(rs.getInt("idstipendio"));
                String valoreStipendio = Double.toString(rs.getDouble("val_stipendio"));
                
                String statusPagamento;
                if(rs.getInt("status_pagamento") == 1)
                    statusPagamento = "Pagato";
                else
                    statusPagamento = "NON Pagato";
                
                String dataPagamento = dateFormat.format(rs.getDate("data_pagamento"));
                String idAtleta = rs.getString("idatleta");
                String idClub = Integer.toString(rs.getInt("idclub"));
                
                //Array di stringhe per inserire i dati nella jtable
                String tbData[]= {idStipendio, valoreStipendio, statusPagamento, dataPagamento, idAtleta, idClub};
                DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiPagamentiJB.getModel();
                //Aggiungiamo ogni stringa dell'array nella jtable
                tblModel.addRow(tbData);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA PAGAMENTO FALLITA "+e);
        }
        
        finally{
            FinallyException finallyException = new FinallyException();
            finallyException.finallyException();
        }
    }
    
    
    /*COSTRUTTORI*/
    public SezioneVisualizzaPagamenti(String idClub) {
        initComponents();
        this.idClub = idClub;
        //visualizzaTuttiPagamenti();
        try {
            visualizzaTuttiPagamenti();
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezioneVisualizzaPagamenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
    }
    
    public SezioneVisualizzaPagamenti() {  
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        visualizzaDatiPagamentiJB = new javax.swing.JTable();
        filtriJL = new javax.swing.JLabel();
        idAtletaJL = new javax.swing.JLabel();
        inputIdAtletaJTF = new javax.swing.JTextField();
        btnCercaAtletaJB = new javax.swing.JButton();
        dataPagamentoJL = new javax.swing.JLabel();
        inputDataPagamentoJDC = new com.toedter.calendar.JDateChooser();
        btnCercaDataPagamentoJB = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();
        btnRipristinaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visualizzaDatiPagamentiJB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pagamento", "Importo", "Status Pagamento", "Data Pagamento", "ID Atleta", "ID Mittente"
            }
        ));
        jScrollPane1.setViewportView(visualizzaDatiPagamentiJB);

        filtriJL.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        filtriJL.setText("FILTRI");

        idAtletaJL.setText("ID Atleta");

        btnCercaAtletaJB.setText("CERCA");
        btnCercaAtletaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaAtletaJBActionPerformed(evt);
            }
        });

        dataPagamentoJL.setText("Data Pagamento");

        inputDataPagamentoJDC.setDateFormatString("yyyy-MM-dd");

        btnCercaDataPagamentoJB.setText("CERCA");
        btnCercaDataPagamentoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaDataPagamentoJBActionPerformed(evt);
            }
        });

        btnTornaIndietroJB.setText("TORNA INDIETRO");
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });

        btnRipristinaJB.setText("RIPRISTINA");
        btnRipristinaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRipristinaJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(filtriJL))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(dataPagamentoJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputDataPagamentoJDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idAtletaJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIdAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCercaAtletaJB)
                            .addComponent(btnCercaDataPagamentoJB)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTornaIndietroJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(btnRipristinaJB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCercaDataPagamentoJB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filtriJL)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idAtletaJL)
                                    .addComponent(inputIdAtletaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCercaAtletaJB))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dataPagamentoJL)
                                    .addComponent(inputDataPagamentoJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTornaIndietroJB)
                            .addComponent(btnRipristinaJB)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /*METODI (ACTION PERFOMED)*/
    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        SezionePagamentoView sezionePagamentoView = new SezionePagamentoView(this.getIdClub());
        sezionePagamentoView.setVisible(true);
        this.setVisible(false);
    }                                                  

    private void btnCercaAtletaJBActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        String idAtleta = inputIdAtletaJTF.getText();
        ControllerClub controllerClub = new ControllerClub();
        ArrayList<Stipendio> datiStipendio = new ArrayList<Stipendio>();
        
        try {
            datiStipendio = controllerClub.cercaPagamentiAtleta(idAtleta, Integer.parseInt(this.getIdClub()));
            if(datiStipendio != null) {
                DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiPagamentiJB.getModel();
                tblModel.setRowCount(0);
                datiStipendio.forEach((Stipendio stipendio) -> {
                    tblModel.addRow(new Object[]{
                        stipendio.getIdStipendio(),
                        stipendio.getValoreStipendio(),
                        stipendio.getStatusPagamento(),
                        stipendio.getDataPagamento(),
                        stipendio.getIdAtleta(),
                        stipendio.getIdClub()
                    });
                    visualizzaDatiPagamentiJB.setModel(tblModel);
                });
            }
            else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "!! ERRORE !!\nNON E' STATO POSSIBILE RICAVARE TUTTI I PAGAMENTI");
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezioneVisualizzaPagamenti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                

    private void btnCercaDataPagamentoJBActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        java.sql.Date dataPagamento = new java.sql.Date(inputDataPagamentoJDC.getDate().getTime());
        ControllerClub controllerClub = new ControllerClub();
        ArrayList<Stipendio> datiStipendio = new ArrayList<Stipendio>();
        
        try {
            datiStipendio = controllerClub.cercaPagamentiDataPagamento(dataPagamento, Integer.parseInt(this.getIdClub()));
            if(datiStipendio != null) {
                DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiPagamentiJB.getModel();
                tblModel.setRowCount(0);
                datiStipendio.forEach((Stipendio stipendio) -> {
                    tblModel.addRow(new Object[]{
                        stipendio.getIdStipendio(),
                        stipendio.getValoreStipendio(),
                        stipendio.getStatusPagamento(),
                        stipendio.getDataPagamento(),
                        stipendio.getIdAtleta(),
                        stipendio.getIdClub()
                    });
                    visualizzaDatiPagamentiJB.setModel(tblModel);
                });
            }
            else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "!! ERRORE !!\nNON E' STATO POSSIBILE RICAVARE TUTTI I PAGAMENTI");
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezioneVisualizzaPagamenti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                       

    private void btnRipristinaJBActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiPagamentiJB.getModel();
            tblModel.setRowCount(0);
            visualizzaTuttiPagamenti();
        } catch (ExceptionDao ex) {
            Logger.getLogger(SezioneVisualizzaPagamenti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                               

    //METODO PER VISUALIZZARE TUTTI I PAGAMENTI EFFETTUATI NON FUNZIONANTE PERCHE STAMPA SOLO L'ULTIMO PAGAMENTO
    /*public void visualizzaTuttiPagamenti() {  
        ControllerClub controllerClub = new ControllerClub();
        ArrayList<Stipendio> datiStipendio = new ArrayList<Stipendio>();
        
        try {
            datiStipendio = controllerClub.cercaTuttiPagamenti(Integer.parseInt(this.getIdClub()));
            if(datiStipendio != null) {
                DefaultTableModel tblModel = (DefaultTableModel)visualizzaDatiPagamentiJB.getModel();
                tblModel.setRowCount(0);
                datiStipendio.forEach((Stipendio stipendio) -> {
                    tblModel.addRow(new Object[]{
                        stipendio.getIdStipendio(),
                        stipendio.getValoreStipendio(),
                        stipendio.getStatusPagamento(),
                        stipendio.getDataPagamento(),
                        stipendio.getIdAtleta(),
                        stipendio.getIdClub()
                    });
                   
                    visualizzaDatiPagamentiJB.setModel(tblModel);
                });
            }
            else
                JOptionPane.showMessageDialog(null, "!! ERRORE !!\nNON E' STATO POSSIBILE RICAVARE TUTTI I PAGAMENTI");
        }catch (ExceptionDao ex) {
            Logger.getLogger(EliminaClub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
     /*GET AND SET*/
    public String getIdClub() {
        return idClub;
    }

    public void setIdClub(String idClub) {
        this.idClub = idClub;
    }
    
    public String[] getTbData() {
        return tbData;
    }

    public void setTbData(String[] tbData) {
        this.tbData = tbData;
    }
    
    
    /*MAIN*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneVisualizzaPagamenti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCercaAtletaJB;
    private javax.swing.JButton btnCercaDataPagamentoJB;
    private javax.swing.JButton btnRipristinaJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel dataPagamentoJL;
    private javax.swing.JLabel filtriJL;
    private javax.swing.JLabel idAtletaJL;
    private com.toedter.calendar.JDateChooser inputDataPagamentoJDC;
    private javax.swing.JTextField inputIdAtletaJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable visualizzaDatiPagamentiJB;
    // End of variables declaration                   
}
