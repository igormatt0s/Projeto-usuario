//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerPas extends javax.swing.JFrame {
    
    private Passageiro pas;
    private static BDPassageiro bdPas = new BDPassageiro();
    
    private static GerPas gerPas;

    private GerPas() {
        initComponents();
    }
    
    public static GerPas getGerPas(){
        if(gerPas == null){
            gerPas = new GerPas();
        }
        return gerPas;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        btCadPas = new javax.swing.JButton();
        btConsPas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPas = new javax.swing.JTable();
        btAltPasCpf = new javax.swing.JButton();
        btExcPasCpf = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        cxTel = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        cxIdade = new javax.swing.JTextField();
        lblPassageiro = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        MnBarPas = new javax.swing.JMenuBar();
        MnCalcVia = new javax.swing.JMenu();
        MnAbreCalcVia = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento do Passageiro");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadPas.setText("Cadastrar");
        btCadPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadPasActionPerformed(evt);
            }
        });

        btConsPas.setText("Consultar pelo CPF");
        btConsPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsPasActionPerformed(evt);
            }
        });

        tblPas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Telefone", "Idade"
            }
        ));
        jScrollPane1.setViewportView(tblPas);

        btAltPasCpf.setText("Alterar pelo CPF");
        btAltPasCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltPasCpfActionPerformed(evt);
            }
        });

        btExcPasCpf.setText("Excluir pelo CPF");
        btExcPasCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcPasCpfActionPerformed(evt);
            }
        });

        lblCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCpf.setText("CPF: ");

        cxCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setText("Nome: ");

        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        lblTel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTel.setText("Tel.: ");

        lblIdade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblIdade.setText("Idade:");

        lblPassageiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPassageiro.setText("Passageiro");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        MnCalcVia.setText("Calcular Viagem");

        MnAbreCalcVia.setText("Abri Calcular Viagem...");
        MnAbreCalcVia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAbreCalcViaActionPerformed(evt);
            }
        });
        MnCalcVia.add(MnAbreCalcVia);

        MnBarPas.add(MnCalcVia);

        setJMenuBar(MnBarPas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btLimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btSair))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblTel)
                                                .addComponent(lblNome)))
                                        .addComponent(lblCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblIdade, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxNome)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cxIdade)
                                                        .addComponent(cxTel))
                                                    .addGap(1, 1, 1)))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btCadPas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btConsPas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btAltPasCpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btExcPasCpf)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(lblPassageiro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPassageiro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(cxTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadPas)
                    .addComponent(btConsPas)
                    .addComponent(btAltPasCpf)
                    .addComponent(btExcPasCpf))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadPasActionPerformed
        try {
            cadastrar();
            listarTab();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadPasActionPerformed

    private void btConsPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsPasActionPerformed
        try {
            consultar();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsPasActionPerformed

    private void btAltPasCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltPasCpfActionPerformed
        try{
            alterar();
            listarTab();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAltPasCpfActionPerformed

    private void btExcPasCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcPasCpfActionPerformed
        try{
            excluir();
            listarTab();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExcPasCpfActionPerformed

    private void cxCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void MnAbreCalcViaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAbreCalcViaActionPerformed
        TarifaViagem.getTarifa().setVisible(true);
    }//GEN-LAST:event_MnAbreCalcViaActionPerformed

    public void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel)tblPas.getModel();
        
        int posLin = 0;
        
        modelo.setRowCount(posLin);
        
        for(Passageiro pas : bdPas.getBdPas()){
            modelo.insertRow(posLin, new Object []{pas.getCpf(), pas.getNome(), pas.getTel(), pas.getIdade()});
            posLin++;
        }
        
    }
    
     public void excluir() throws NumNegException{
        pas = new Passageiro();
        try{
            pas.setCpf(Integer.parseInt(cxCpf.getText()));
    
            pas = bdPas.consPasCpf(pas);
            if(pas != null){
                cxCpf.setText(Integer.toString(pas.getCpf()));
                cxNome.setText(pas.getNome());
                cxTel.setText(Integer.toString(pas.getTel()));
                cxIdade.setText(Integer.toString(pas.getIdade()));
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o atendente", "Confirmação de exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
                if(x == 0){
                    bdPas.removePasCpf(pas);
                    JOptionPane.showMessageDialog(null, "Atendente excluido com sucesso", "Exclusão do atendente", 1);
                    limpar();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Nao existe atendente com este CPF", "CPF inexistente", 0);
                limpar();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um numero inteiro", "ERRO de CPF", 0);
            cxCpf.setText("");
            cxCpf.requestFocus();
        }
        catch(NumNegException nne){
            nne.impNeg();
        }
    }
    
    public void alterar() throws NumNegException{
        pas = new Passageiro();
        try{
            pas.setCpf(Integer.parseInt(cxCpf.getText()));
    
            pas = bdPas.atualizaPasCpf(pas);
            if(pas != null){
                cxCpf.setText(Integer.toString(pas.getCpf()));
                cxNome.setText(pas.getNome());
                cxTel.setText(Integer.toString(pas.getTel()));
                cxIdade.setText(Integer.toString(pas.getIdade()));
                JOptionPane.showMessageDialog(null, "Dados do atendente atualizados com sucesso", "Atualização de Dados", 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Nao existe atendente com este CPF", "CPF inexistente", 0);
                limpar();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um numero inteiro", "ERRO de CPF", 0);
            cxCpf.setText("");
            cxCpf.requestFocus();
        }
        catch(NumNegException nne){
            nne.impNeg();
        }
    }
 
    public void consultar() throws NumNegException{
        pas = new Passageiro();
        try{
            pas.setCpf(Integer.parseInt(cxCpf.getText()));
    
            pas = bdPas.consPasCpf(pas);
            if(pas != null){
                cxCpf.setText(Integer.toString(pas.getCpf()));
                cxNome.setText(pas.getNome());
                cxTel.setText(Integer.toString(pas.getTel()));
                cxIdade.setText(Integer.toString(pas.getIdade()));
                JOptionPane.showMessageDialog(null, "Confirme os dados do atendente", "Confirmacao de Dados", 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Nao existe atendente com este CPF", "CPF inexistente", 0);
                limpar();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um numero inteiro", "ERRO de CPF", 0);
            cxCpf.setText("");
            cxCpf.requestFocus();
        }
        catch(NumNegException nne){
            nne.impNeg();
        }
        
    }
    
    public void cadastrar() throws NumNegException{
        pas = new Passageiro();
        pas.setNome(cxNome.getText());
        try{
            pas.setCpf(Integer.parseInt(cxCpf.getText()));
            pas.setTel(Integer.parseInt(cxTel.getText()));
            pas.setIdade(Integer.parseInt(cxIdade.getText()));
            
            pas = bdPas.cadPas(pas);
            
            if(pas != null){
                JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso", "Cadastro concluido", 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Ja existe um atendente com este CPF!", "ERRO de cadastro", 0);
                limpar();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Os valores devem ser numeros inteiros", "ERRO de letras", 0);
            limpar();
        }
        catch(NumNegException nne){
            nne.impNeg();
        }
        
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        cxCpf.setText("");
        cxNome.setText("");
        cxTel.setText("");
        cxIdade.setText("");
        cxCpf.requestFocus();
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerPas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnAbreCalcVia;
    private javax.swing.JMenuBar MnBarPas;
    private javax.swing.JMenu MnCalcVia;
    private javax.swing.JButton btAltPasCpf;
    private javax.swing.JButton btCadPas;
    private javax.swing.JButton btConsPas;
    private javax.swing.JButton btExcPasCpf;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPassageiro;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTable tblPas;
    // End of variables declaration//GEN-END:variables
}
