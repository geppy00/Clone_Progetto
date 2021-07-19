
package view;

import controller.ControllerProcuratore;
import convalidazione.ControlloConvalidazione;
import convalidazione.MessageError;
import dao.DataAccessObject;
import dao.ExceptionDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import refactorCode.FinallyException;

public class PercentualiGuadagnoProcuratoreView extends javax.swing.JFrame {
    
    /*CONTROLLORE PER GESTIRE GLI ERRORI*/
    private ControlloConvalidazione controlloConvalidazione = new ControlloConvalidazione();
    private MessageError messageError = new MessageError();
    
    /*DATI IMPORTANTI*/
    private String idProcuratore;
    private ArrayList<Double> datiPagamentiClub = new ArrayList<Double>();
    private ArrayList<Double> datiPagamentiSponsor = new ArrayList<Double>();
    private ArrayList<Double> datiPagamentiEvento = new ArrayList<Double>();
        
    
    /*COSTRUTTORI*/
    public PercentualiGuadagnoProcuratoreView(String idProcuratore) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.idProcuratore = idProcuratore;
        
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLDataAttuale.setText(dtf.format(LocalDateTime.now()));
        
        
        tblDatiClubJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblDatiClubJT.getTableHeader().setOpaque(false);
        tblDatiClubJT.getTableHeader().setBackground(new Color(32, 136, 203));
        tblDatiClubJT.getTableHeader().setForeground(new Color(255,255,255));
   
        tblDatiEventiJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblDatiEventiJT.getTableHeader().setOpaque(false);
        tblDatiEventiJT.getTableHeader().setBackground(new Color(32, 136, 203));
        tblDatiEventiJT.getTableHeader().setForeground(new Color(255,255,255));
       
        tblDatiSponsorJT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblDatiSponsorJT.getTableHeader().setOpaque(false);
        tblDatiSponsorJT.getTableHeader().setBackground(new Color(32, 136, 203));
        tblDatiSponsorJT.getTableHeader().setForeground(new Color(255,255,255));
        
       
        try {
            this.stampaDatiAtltetaTbl();
        } catch (ExceptionDao ex) {
            Toolkit.getDefaultToolkit().beep();
            //JOptionPane.showMessageDialog(this, "!! ATTENZIONE !!\nERRORE FATALE PROVARE AD RIAPRIRE LA FINESTRA", "ERRORE", JOptionPane.ERROR_MESSAGE);
            messageError.showMessage(false, true, "warning","Errore Fatale Provare Ad Riaprire La Finestra" , jLabel3, jPanel2, btnCloseMessage);
        }
    }
    
    public PercentualiGuadagnoProcuratoreView() {
         
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatiClubJT = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatiSponsorJT = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatiEventiJT = new javax.swing.JTable();
        totaleGuadagnojL = new javax.swing.JLabel();
        totaleGettoniJL = new javax.swing.JLabel();
        atletaMaggiorGuadagnoJL = new javax.swing.JLabel();
        valoreContrattualeJL = new javax.swing.JLabel();
        btnAnnullaJB = new javax.swing.JButton();
        btnCalcolaJB = new javax.swing.JButton();
        totaleGuadagnoJTF = new javax.swing.JLabel();
        atletaMigliorGuadagnoJTF = new javax.swing.JLabel();
        totaleGettoniJTF = new javax.swing.JLabel();
        totaleValoreContrattualeJTF = new javax.swing.JLabel();
        jLDataAttuale = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCloseMessage = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLogoutJB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatiClubJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatiClubJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "Nome", "Cognome", "Data Nascita", "ID Contratto Club", "Club", "Valore Club"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiClubJT.setFocusable(false);
        tblDatiClubJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiClubJT.setShowVerticalLines(false);
        tblDatiClubJT.getTableHeader().setReorderingAllowed(false);
        tblDatiClubJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatiClubJTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatiClubJT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 790, 130));

        tblDatiSponsorJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatiSponsorJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "Nome", "Cognome", "Data Nascita", "ID Contratto Sponsor", "Sponsor", "Valore Sponsor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiSponsorJT.setFocusable(false);
        tblDatiSponsorJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiSponsorJT.setShowVerticalLines(false);
        tblDatiSponsorJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblDatiSponsorJT);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 790, 140));

        tblDatiEventiJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatiEventiJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Atleta", "Nome", "Cognome", "Data Nascita", "Nome Evento", "Gettone Evento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatiEventiJT.setFocusable(false);
        tblDatiEventiJT.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblDatiEventiJT.setShowVerticalLines(false);
        tblDatiEventiJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblDatiEventiJT);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 790, 150));

        totaleGuadagnojL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totaleGuadagnojL.setForeground(new java.awt.Color(255, 255, 255));
        totaleGuadagnojL.setText("Totale");
        jPanel1.add(totaleGuadagnojL, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 83, -1, -1));

        totaleGettoniJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        totaleGettoniJL.setForeground(new java.awt.Color(255, 255, 255));
        totaleGettoniJL.setText("Gettoni");
        jPanel1.add(totaleGettoniJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));

        atletaMaggiorGuadagnoJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        atletaMaggiorGuadagnoJL.setForeground(new java.awt.Color(255, 255, 255));
        atletaMaggiorGuadagnoJL.setText("Atleta Maggior Guadagno");
        jPanel1.add(atletaMaggiorGuadagnoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, -1, -1));

        valoreContrattualeJL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        valoreContrattualeJL.setForeground(new java.awt.Color(255, 255, 255));
        valoreContrattualeJL.setText("Contratti");
        jPanel1.add(valoreContrattualeJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));

        btnAnnullaJB.setBackground(new java.awt.Color(11, 58, 151));
        btnAnnullaJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnAnnullaJB.setBorder(null);
        btnAnnullaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnullaJB.setFocusPainted(false);
        btnAnnullaJB.setFocusable(false);
        btnAnnullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnullaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        btnCalcolaJB.setBackground(new java.awt.Color(46, 204, 113));
        btnCalcolaJB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCalcolaJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcolaJB.setText("Calcola");
        btnCalcolaJB.setBorder(null);
        btnCalcolaJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcolaJB.setFocusPainted(false);
        btnCalcolaJB.setFocusable(false);
        btnCalcolaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcolaJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcolaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 80, 40));

        totaleGuadagnoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        totaleGuadagnoJTF.setForeground(new java.awt.Color(46, 204, 113));
        totaleGuadagnoJTF.setText("0.000£");
        jPanel1.add(totaleGuadagnoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 130, -1));

        atletaMigliorGuadagnoJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        atletaMigliorGuadagnoJTF.setForeground(new java.awt.Color(46, 204, 113));
        jPanel1.add(atletaMigliorGuadagnoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 578, -1, -1));

        totaleGettoniJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        totaleGettoniJTF.setForeground(new java.awt.Color(46, 204, 113));
        totaleGettoniJTF.setText("0.000£");
        jPanel1.add(totaleGettoniJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 578, 90, -1));

        totaleValoreContrattualeJTF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        totaleValoreContrattualeJTF.setForeground(new java.awt.Color(46, 204, 113));
        totaleValoreContrattualeJTF.setText("0.000£");
        jPanel1.add(totaleValoreContrattualeJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 578, 120, -1));

        jLDataAttuale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDataAttuale.setForeground(new java.awt.Color(255, 255, 255));
        jLDataAttuale.setText("13/01/2023");
        jPanel1.add(jLDataAttuale, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 5, -1, -1));

        jPanel2.setBackground(new java.awt.Color(231, 76, 60));

        jLabel2.setBackground(new java.awt.Color(231, 76, 60));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_info_26px.png"))); // NOI18N

        btnCloseMessage.setBackground(new java.awt.Color(231, 76, 60));
        btnCloseMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnCloseMessage.setBorder(null);
        btnCloseMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMessage.setFocusPainted(false);
        btnCloseMessage.setFocusable(false);
        btnCloseMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseMessageActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(231, 76, 60));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseMessage)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCloseMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 790, 30));

        btnLogoutJB1.setBackground(new java.awt.Color(11, 58, 151));
        btnLogoutJB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnLogoutJB1.setBorder(null);
        btnLogoutJB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoutJB1.setFocusPainted(false);
        btnLogoutJB1.setFocusable(false);
        btnLogoutJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogoutJB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*EVENTI*/
    private void btnAnnullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaJBActionPerformed
        ProcuratoreView procuratoreView = new ProcuratoreView(this.getIdProcuratore());
        procuratoreView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnullaJBActionPerformed


    private void tblDatiClubJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatiClubJTMouseClicked
       
    }//GEN-LAST:event_tblDatiClubJTMouseClicked

    private void btnCalcolaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcolaJBActionPerformed
        int i;
        double sommaContrattiClub = 0;
        double sommaContrattiSponsor = 0;
        double sommaGettone = 0;
        ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
        
        for(i = 0; i<datiPagamentiClub.size(); i++) {
            sommaContrattiClub = sommaContrattiClub + datiPagamentiClub.get(i);
        }
        
        for(i = 0; i<datiPagamentiSponsor.size(); i++) {
            sommaContrattiSponsor = sommaContrattiSponsor + datiPagamentiSponsor.get(i);
        }
        
        double sommaTotaleContratto = ((sommaContrattiClub + sommaContrattiSponsor) * 3) / 100;
        
        
        for(i = 0; i<datiPagamentiEvento.size(); i++) {
            sommaGettone = sommaGettone + datiPagamentiEvento.get(i);
        }
        
        double sommaTotaleGettoni = (sommaGettone * 10) / 100;
        
        
        double sommaTotale = sommaTotaleContratto + sommaTotaleGettoni;
        
        
        
        totaleValoreContrattualeJTF.setText(String.valueOf(sommaTotaleContratto)+"£");
        totaleGettoniJTF.setText(String.valueOf(sommaTotaleGettoni)+"£");
        totaleGuadagnoJTF.setText(String.valueOf(sommaTotale)+"£");
        
        try {
            String nomeAtletaMigliorGuadagno = controllerProcuratore.prendiAtletaMaggiorGuadagno(this.getIdProcuratore());
            if(controlloConvalidazione.controlloAtleta(nomeAtletaMigliorGuadagno) == true)
                atletaMigliorGuadagnoJTF.setText(nomeAtletaMigliorGuadagno);
            else {
                Toolkit.getDefaultToolkit().beep();
                //JOptionPane.showMessageDialog(this, "NON E' STATO POSSIBILE RICERCARE L'ATLETA MIGLIORE\n\t\tRIPROVARE", "WARNING", JOptionPane.WARNING_MESSAGE);
                messageError.showMessage(false, true, "warning","Errore Fatale Provare Ad Riaprire La Finestra" , jLabel3, jPanel2, btnCloseMessage);
            }
        } catch (ExceptionDao ex) {
            Logger.getLogger(PercentualiGuadagnoProcuratoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCalcolaJBActionPerformed
  
    private void btnCloseMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMessageActionPerformed
        
    }//GEN-LAST:event_btnCloseMessageActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnLogoutJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJB1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnLogoutJB1ActionPerformed

    /*METODI*/
    private String prendiNomeSponsor() throws ExceptionDao {
       ControllerProcuratore controllerProcuratore = new ControllerProcuratore();
       return controllerProcuratore.prendiNomeSponsorPerContratti();
    }

  
    public void stampaDatiAtltetaTbl() throws ExceptionDao {
        PreparedStatement pStmt = null;
        Connection connection = null;
        ResultSet rs = null;
        String sql = "select atleta.codfiscale, atleta.nome, atleta.cognome, atleta.datanascita, contratto.numero_contratto, club.nomeclub, contratto.valore_contrattuale FROM contratto JOIN atleta ON contratto.idatleta=atleta.codfiscale JOIN club ON contratto.idclub=club.idclub WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"';";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
 
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String cognomeAtleta = rs.getString("cognome");
                String dataNascita = dateFormat.format(rs.getDate("datanascita"));
                String numeroContrattoClub = String.valueOf(rs.getInt("numero_contratto"));
                String nomeClub = rs.getString("nomeclub");
                String valoreContrattualeClub = String.valueOf(rs.getDouble("valore_contrattuale"));
                
                datiPagamentiClub.add(rs.getDouble("valore_contrattuale"));
                
                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta, dataNascita, numeroContrattoClub, nomeClub, valoreContrattualeClub};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiClubJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA ATLETA FALLITA "+e);
        }
        
        sql = "select atleta.codfiscale, atleta.nome, atleta.cognome, atleta.datanascita, contratto.numero_contratto, sponsor.nomesponsor, contratto.valore_contrattuale FROM contratto JOIN atleta ON contratto.idatleta=atleta.codfiscale JOIN sponsor ON contratto.idsponsor=sponsor.idsponsor WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND contratto.idclub IS NULL;";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String cognomeAtleta = rs.getString("cognome");
                String dataNascita = dateFormat.format(rs.getDate("datanascita"));
                String numeroContrattoSponsor = String.valueOf(rs.getInt("numero_contratto"));
                String nomeSponsor = rs.getString("nomesponsor");
                String valoreContrattualeSponsor = String.valueOf(rs.getDouble("valore_contrattuale"));
                
                datiPagamentiSponsor.add(rs.getDouble("valore_contrattuale"));
                
                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta, dataNascita, numeroContrattoSponsor, nomeSponsor, valoreContrattualeSponsor};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiSponsorJT.getModel();
                tblModel.addRow(tbDataAtleta);
            }
            rs.close();
            pStmt.close();
            connection.close();
        } catch(SQLException e) {
            throw new ExceptionDao("ERRORE RICERCA ATLETA FALLITA "+e);
        }
        
        sql="select atleta.codfiscale, atleta.nome, atleta.cognome, atleta.datanascita, evento.titolo, evento.gettonevalue FROM invitatti JOIN atleta ON invitatti.idatleta=atleta.codfiscale JOIN evento ON invitatti.idevento=evento.idevento WHERE atleta.codprocuratore='"+this.getIdProcuratore()+"' AND invitatti.status_presenza=1;";
        
        try {
            connection = new DataAccessObject().connectionToDatabase();
            pStmt = connection.prepareStatement(sql);
            rs = pStmt.executeQuery();
            while(rs.next()) {
                String idAtleta = rs.getString("codfiscale");
                String nomeAtleta = rs.getString("nome");
                String cognomeAtleta = rs.getString("cognome");
                String dataNascita = dateFormat.format(rs.getDate("datanascita"));
                String nomeEvento = rs.getString("titolo");
                String gettoneEvento = String.valueOf(rs.getDouble("gettonevalue"));
                
                datiPagamentiEvento.add(rs.getDouble("gettonevalue"));
                
                String tbDataAtleta[] = {idAtleta, nomeAtleta, cognomeAtleta, dataNascita, nomeEvento, gettoneEvento};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatiEventiJT.getModel();
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
                new PercentualiGuadagnoProcuratoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atletaMaggiorGuadagnoJL;
    private javax.swing.JLabel atletaMigliorGuadagnoJTF;
    private javax.swing.JButton btnAnnullaJB;
    private javax.swing.JButton btnCalcolaJB;
    private javax.swing.JButton btnCloseMessage;
    private javax.swing.JButton btnLogoutJB1;
    private javax.swing.JLabel jLDataAttuale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDatiClubJT;
    private javax.swing.JTable tblDatiEventiJT;
    private javax.swing.JTable tblDatiSponsorJT;
    private javax.swing.JLabel totaleGettoniJL;
    private javax.swing.JLabel totaleGettoniJTF;
    private javax.swing.JLabel totaleGuadagnoJTF;
    private javax.swing.JLabel totaleGuadagnojL;
    private javax.swing.JLabel totaleValoreContrattualeJTF;
    private javax.swing.JLabel valoreContrattualeJL;
    // End of variables declaration//GEN-END:variables
}
