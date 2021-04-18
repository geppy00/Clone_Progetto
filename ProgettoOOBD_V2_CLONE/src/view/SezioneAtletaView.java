
package view;

import view.registrare.RegistrareSportivo;


public class SezioneAtletaView extends javax.swing.JFrame {

    public SezioneAtletaView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sezSportivoJL = new javax.swing.JLabel();
        btnAggiungiSportivoJB = new javax.swing.JButton();
        btnEliminaSportivoJB = new javax.swing.JButton();
        btnAggiornaSportivoJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sezSportivoJL.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        sezSportivoJL.setText("SEZIONE SPORTIVO");

        btnAggiungiSportivoJB.setText("AGGIUNGI SPORTIVO");
        btnAggiungiSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiungiSportivoJBActionPerformed(evt);
            }
        });

        btnEliminaSportivoJB.setText("ELIMINA SPORTIVO");
        btnEliminaSportivoJB.setToolTipText("");

        btnAggiornaSportivoJB.setText("AGGIORNA SPORTIVO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(sezSportivoJL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAggiungiSportivoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(btnEliminaSportivoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btnAggiornaSportivoJB)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sezSportivoJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAggiungiSportivoJB, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnAggiornaSportivoJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminaSportivoJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAggiungiSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiungiSportivoJBActionPerformed
        RegistrareSportivo registraSportivo = new RegistrareSportivo();
        registraSportivo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggiungiSportivoJBActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SezioneAtletaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiornaSportivoJB;
    private javax.swing.JButton btnAggiungiSportivoJB;
    private javax.swing.JButton btnEliminaSportivoJB;
    private javax.swing.JLabel sezSportivoJL;
    // End of variables declaration//GEN-END:variables
}
