
package view;

import model.Club;

public class ClubView extends javax.swing.JFrame {

    
    public void visuallizzaDatiTabella() {
        
    }
    
    public ClubView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        visualizzaAtletiJT = new javax.swing.JTable();
        filtriJL = new javax.swing.JLabel();
        btnAtletiPagatiJB = new javax.swing.JButton();
        btnAtletiNonPagatiJB = new javax.swing.JButton();
        btnLogoutJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visualizzaAtletiJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cognome", "Sesso", "Nazione", "Indirizzo", "Data Nascita", "Telefono", "Codice Fiscale", "Ruolo Atleta", "Peso", "ID Procuratore", "Iban Atleta", "ID Club"
            }
        ));
        jScrollPane1.setViewportView(visualizzaAtletiJT);

        filtriJL.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        filtriJL.setText("FILTRI");

        btnAtletiPagatiJB.setText("ATLETI PAGATI");

        btnAtletiNonPagatiJB.setText("Atleti non pagati");

        btnLogoutJB.setText("LOGOUT");
        btnLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtriJL)
                    .addComponent(btnAtletiPagatiJB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLogoutJB)
                        .addComponent(btnAtletiNonPagatiJB)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filtriJL)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtletiPagatiJB)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtletiNonPagatiJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogoutJB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutJBActionPerformed
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutJBActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClubView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtletiNonPagatiJB;
    private javax.swing.JButton btnAtletiPagatiJB;
    private javax.swing.JButton btnLogoutJB;
    private javax.swing.JLabel filtriJL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable visualizzaAtletiJT;
    // End of variables declaration//GEN-END:variables
}
