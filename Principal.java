//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

public class Principal extends javax.swing.JFrame {

  
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdentifiquacao = new javax.swing.JLabel();
        btPas = new javax.swing.JButton();
        btMot = new javax.swing.JButton();
        btSup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Inicial");

        lblIdentifiquacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblIdentifiquacao.setText("IDENTIFIQUE-SE:");

        btPas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btPas.setText("Passageiro");
        btPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPasActionPerformed(evt);
            }
        });

        btMot.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btMot.setText("Motorista");
        btMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMotActionPerformed(evt);
            }
        });

        btSup.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSup.setText("Suporte");
        btSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIdentifiquacao)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btPas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btMot, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblIdentifiquacao)
                .addGap(18, 18, 18)
                .addComponent(btPas)
                .addGap(18, 18, 18)
                .addComponent(btMot)
                .addGap(18, 18, 18)
                .addComponent(btSup)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPasActionPerformed
        GerPas.getGerPas().setVisible(true);
    }//GEN-LAST:event_btPasActionPerformed

    private void btMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMotActionPerformed
        GerMot.getGerMot().setVisible(true);
    }//GEN-LAST:event_btMotActionPerformed

    private void btSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupActionPerformed
        GerSup.getGerSup().setVisible(true);
    }//GEN-LAST:event_btSupActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMot;
    private javax.swing.JButton btPas;
    private javax.swing.JButton btSup;
    private javax.swing.JLabel lblIdentifiquacao;
    // End of variables declaration//GEN-END:variables
}
