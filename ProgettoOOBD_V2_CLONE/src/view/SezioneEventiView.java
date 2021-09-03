
package view;

import java.awt.Color;
import java.awt.Frame;
import view.elimina.EliminaEvento;
import view.registrare.RegistraEventoSponsor;

public class SezioneEventiView extends javax.swing.JFrame {

    private String idSponsor;
    
    /*COSTRUTTORI*/
    public SezioneEventiView(String idSponsor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idSponsor = idSponsor;
        
        this.setVisible(true);
    }

    public SezioneEventiView() {
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCreaEventoJB = new javax.swing.JButton();
        btnElencoEventiJB = new javax.swing.JButton();
        btnCancellaEventoJB = new javax.swing.JButton();
        btnPartecipantiJB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnTornaIndietroJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 58, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreaEventoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnCreaEventoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCreaEventoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCreaEventoJB.setText("Crea Evento");
        btnCreaEventoJB.setActionCommand("Procutore");
        btnCreaEventoJB.setBorder(null);
        btnCreaEventoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreaEventoJB.setFocusPainted(false);
        btnCreaEventoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreaEventoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreaEventoJBMouseExited(evt);
            }
        });
        btnCreaEventoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaEventoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreaEventoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, 80));

        btnElencoEventiJB.setBackground(new java.awt.Color(1, 180, 245));
        btnElencoEventiJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnElencoEventiJB.setForeground(new java.awt.Color(255, 255, 255));
        btnElencoEventiJB.setText("Visualizza Evento");
        btnElencoEventiJB.setBorder(null);
        btnElencoEventiJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElencoEventiJB.setFocusable(false);
        btnElencoEventiJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElencoEventiJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElencoEventiJBMouseExited(evt);
            }
        });
        btnElencoEventiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElencoEventiJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnElencoEventiJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 250, 80));

        btnCancellaEventoJB.setBackground(new java.awt.Color(1, 180, 245));
        btnCancellaEventoJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancellaEventoJB.setForeground(new java.awt.Color(255, 255, 255));
        btnCancellaEventoJB.setText("Delete Evento");
        btnCancellaEventoJB.setBorder(null);
        btnCancellaEventoJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancellaEventoJB.setFocusable(false);
        btnCancellaEventoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancellaEventoJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancellaEventoJBMouseExited(evt);
            }
        });
        btnCancellaEventoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancellaEventoJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancellaEventoJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 250, 80));

        btnPartecipantiJB.setBackground(new java.awt.Color(1, 180, 245));
        btnPartecipantiJB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPartecipantiJB.setForeground(new java.awt.Color(255, 255, 255));
        btnPartecipantiJB.setText("Elenco Dei Participanti");
        btnPartecipantiJB.setBorder(null);
        btnPartecipantiJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPartecipantiJB.setFocusable(false);
        btnPartecipantiJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPartecipantiJBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPartecipantiJBMouseExited(evt);
            }
        });
        btnPartecipantiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartecipantiJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnPartecipantiJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 250, 80));

        btnClose.setBackground(new java.awt.Color(11, 58, 151));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_multiply_32px_1.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setFocusPainted(false);
        btnClose.setFocusable(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, 40));

        btnTornaIndietroJB.setBackground(new java.awt.Color(11, 58, 151));
        btnTornaIndietroJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_left_32px_2.png"))); // NOI18N
        btnTornaIndietroJB.setBorder(null);
        btnTornaIndietroJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTornaIndietroJB.setFocusPainted(false);
        btnTornaIndietroJB.setFocusable(false);
        btnTornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndietroJBActionPerformed(evt);
            }
        });
        jPanel1.add(btnTornaIndietroJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sponsor System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_subtract_32px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreaEventoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreaEventoJBMouseEntered
        btnCreaEventoJB.setBackground(new Color(34,87,191));
        btnCreaEventoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnCreaEventoJBMouseEntered

    private void btnCreaEventoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreaEventoJBMouseExited
        btnCreaEventoJB.setBackground(new Color(1,180,245));
        btnCreaEventoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnCreaEventoJBMouseExited

    private void btnCreaEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaEventoJBActionPerformed
        RegistraEventoSponsor registraEventoSponsor = new RegistraEventoSponsor(this.getIdSponsor());
        registraEventoSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCreaEventoJBActionPerformed

    private void btnElencoEventiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElencoEventiJBMouseEntered
        btnElencoEventiJB.setBackground(new Color(34,87,191));
        btnElencoEventiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnElencoEventiJBMouseEntered

    private void btnElencoEventiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElencoEventiJBMouseExited
        btnElencoEventiJB.setBackground(new Color(1,180,245));
        btnElencoEventiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnElencoEventiJBMouseExited

    private void btnElencoEventiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElencoEventiJBActionPerformed
       ElencoEventiView elencoEventiView = new ElencoEventiView(this.getIdSponsor());
        elencoEventiView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnElencoEventiJBActionPerformed

    private void btnCancellaEventoJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancellaEventoJBMouseEntered
        btnCancellaEventoJB.setBackground(new Color(34,87,191));
        btnCancellaEventoJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnCancellaEventoJBMouseEntered

    private void btnCancellaEventoJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancellaEventoJBMouseExited
        btnCancellaEventoJB.setBackground(new Color(1,180,245));
        btnCancellaEventoJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnCancellaEventoJBMouseExited

    private void btnCancellaEventoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellaEventoJBActionPerformed
        EliminaEvento eliminaEvento = new EliminaEvento(this.getIdSponsor());
        eliminaEvento.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancellaEventoJBActionPerformed

    private void btnPartecipantiJBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPartecipantiJBMouseEntered
        btnPartecipantiJB.setBackground(new Color(34,87,191));
        btnPartecipantiJB.setForeground(new Color(231,231,231));
    }//GEN-LAST:event_btnPartecipantiJBMouseEntered

    private void btnPartecipantiJBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPartecipantiJBMouseExited
        btnPartecipantiJB.setBackground(new Color(1,180,245));
        btnPartecipantiJB.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnPartecipantiJBMouseExited

    private void btnPartecipantiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartecipantiJBActionPerformed
        ElencoPartecipantiSponsor elencoPartecipantiSponsor = new ElencoPartecipantiSponsor(this.getIdSponsor());
        elencoPartecipantiSponsor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPartecipantiJBActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnTornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndietroJBActionPerformed
        SponsorView sponsorView = new SponsorView(this.getIdSponsor());
        sponsorView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTornaIndietroJBActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    
    /*GET AND SET*/
    public String getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(String idSponsor) {
        this.idSponsor = idSponsor;
    }
    
    /*MAIN*/
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneEventiView().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancellaEventoJB;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreaEventoJB;
    private javax.swing.JButton btnElencoEventiJB;
    private javax.swing.JButton btnPartecipantiJB;
    private javax.swing.JButton btnTornaIndietroJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
