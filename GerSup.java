//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GerSup extends javax.swing.JFrame {

    private Suporte sup;
    private static BDSuporte bdSup = new BDSuporte();
    
    private static GerSup gerSup;
    
    private GerSup() {
        initComponents();
    }
    
    public static GerSup getGerSup(){
        if(gerSup == null){
            gerSup = new GerSup();
        }
        return gerSup;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpf = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        cxTel = new javax.swing.JTextField();
        lblProtocol = new javax.swing.JLabel();
        cxProtocol = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadSup = new javax.swing.JButton();
        btConsSup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSup = new javax.swing.JTable();
        btAltSupCpf = new javax.swing.JButton();
        btExcSupCpf = new javax.swing.JButton();
        lblSuporte = new javax.swing.JLabel();
        MnBarSup = new javax.swing.JMenuBar();
        MnConsClie = new javax.swing.JMenu();
        MnAbreConsClie = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento do Suporte");

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

        lblProtocol.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProtocol.setText("Protocolo: ");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadSup.setText("Cadastrar");
        btCadSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadSupActionPerformed(evt);
            }
        });

        btConsSup.setText("Consultar pelo CPF");
        btConsSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsSupActionPerformed(evt);
            }
        });

        tblSup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Telefone", "Protocolo"
            }
        ));
        jScrollPane1.setViewportView(tblSup);

        btAltSupCpf.setText("Alterar pelo CPF");
        btAltSupCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltSupCpfActionPerformed(evt);
            }
        });

        btExcSupCpf.setText("Excluir pelo CPF");
        btExcSupCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcSupCpfActionPerformed(evt);
            }
        });

        lblSuporte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSuporte.setText("Suporte");

        MnConsClie.setText("Consultar Cliente");

        MnAbreConsClie.setText("Abrir Consulta de Cliente...");
        MnAbreConsClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAbreConsClieActionPerformed(evt);
            }
        });
        MnConsClie.add(MnAbreConsClie);

        MnBarSup.add(MnConsClie);

        setJMenuBar(MnBarSup);

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
                                        .addComponent(lblProtocol, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxNome)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cxProtocol)
                                                        .addComponent(cxTel))
                                                    .addGap(1, 1, 1)))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btCadSup)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btConsSup)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btAltSupCpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btExcSupCpf)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(lblSuporte)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSuporte)
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
                    .addComponent(cxProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProtocol))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadSup)
                    .addComponent(btConsSup)
                    .addComponent(btAltSupCpf)
                    .addComponent(btExcSupCpf))
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

    private void cxCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
       limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadSupActionPerformed
        try {
            cadastrar();
            listarTab();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btCadSupActionPerformed

    public void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel)tblSup.getModel();
        
        int posLin = 0;
        
        modelo.setRowCount(posLin);
        
        for(Suporte sup : bdSup.getBdSup()){
            modelo.insertRow(posLin, new Object []{sup.getCpf(), sup.getNome(), sup.getTel(), sup.getProtocol()});
            posLin++;
        }
        
    }
    
    private void btConsSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsSupActionPerformed
        try {
            consultar();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btConsSupActionPerformed

    private void btAltSupCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltSupCpfActionPerformed
        try{
            alterar();
            listarTab();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btAltSupCpfActionPerformed

    private void btExcSupCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcSupCpfActionPerformed
        try{
            excluir();
            listarTab();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btExcSupCpfActionPerformed

    private void MnAbreConsClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAbreConsClieActionPerformed
        ConsClie.getConsClie().setVisible(true);
    }//GEN-LAST:event_MnAbreConsClieActionPerformed

    public void excluir() throws NumNegException{
        sup = new Suporte();
        try{
            sup.setCpf(Integer.parseInt(cxCpf.getText()));
    
            sup = bdSup.consSupCpf(sup);
            if(sup != null){
                cxCpf.setText(Integer.toString(sup.getCpf()));
                cxNome.setText(sup.getNome());
                cxTel.setText(Integer.toString(sup.getTel()));
                cxProtocol.setText(Integer.toString(sup.getProtocol()));
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o atendente", "Confirmação de exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
                if(x == 0){
                    bdSup.removeSupCpf(sup);
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
        sup = new Suporte();
        try{
            sup.setCpf(Integer.parseInt(cxCpf.getText()));
    
            sup = bdSup.atualizaSupCpf(sup);
            if(sup != null){
                cxCpf.setText(Integer.toString(sup.getCpf()));
                cxNome.setText(sup.getNome());
                cxTel.setText(Integer.toString(sup.getTel()));
                cxProtocol.setText(Integer.toString(sup.getProtocol()));
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
        sup = new Suporte();
        try{
            sup.setCpf(Integer.parseInt(cxCpf.getText()));
    
            sup = bdSup.consSupCpf(sup);
            if(sup != null){
                cxCpf.setText(Integer.toString(sup.getCpf()));
                cxNome.setText(sup.getNome());
                cxTel.setText(Integer.toString(sup.getTel()));
                cxProtocol.setText(Integer.toString(sup.getProtocol()));
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
        sup = new Suporte();
        sup.setNome(cxNome.getText());
        try{
            sup.setCpf(Integer.parseInt(cxCpf.getText()));
            sup.setTel(Integer.parseInt(cxTel.getText()));
            sup.setProtocol(Integer.parseInt(cxProtocol.getText()));
            
            sup = bdSup.cadSup(sup);
            
            if(sup != null){
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
        cxProtocol.setText("");
        cxCpf.requestFocus();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerSup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnAbreConsClie;
    private javax.swing.JMenuBar MnBarSup;
    private javax.swing.JMenu MnConsClie;
    private javax.swing.JButton btAltSupCpf;
    private javax.swing.JButton btCadSup;
    private javax.swing.JButton btConsSup;
    private javax.swing.JButton btExcSupCpf;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxProtocol;
    private javax.swing.JTextField cxTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProtocol;
    private javax.swing.JLabel lblSuporte;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTable tblSup;
    // End of variables declaration//GEN-END:variables
}
