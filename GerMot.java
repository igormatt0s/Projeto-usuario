//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerMot extends javax.swing.JFrame {
    
    private Motorista mot;
    private static BDMotorista bdMot = new BDMotorista();
    
    private static GerMot gerMot;

    private GerMot() {
        initComponents();
    }
    
    public static GerMot getGerMot(){
        if(gerMot == null){
            gerMot = new GerMot();
        }
        return gerMot;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        btCadMot = new javax.swing.JButton();
        btConsMot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMot = new javax.swing.JTable();
        btAltMotCpf = new javax.swing.JButton();
        btExcMotCpf = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        cxTel = new javax.swing.JTextField();
        lblCnh = new javax.swing.JLabel();
        cxCnh = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        lblAvaliacao = new javax.swing.JLabel();
        cxAvaliacao = new javax.swing.JTextField();
        lblVeiculo = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        cxModelo = new javax.swing.JTextField();
        cxCor = new javax.swing.JTextField();
        cxPlaca = new javax.swing.JTextField();
        lblMotorista = new javax.swing.JLabel();
        MnBarMot = new javax.swing.JMenuBar();
        MnCalcPad = new javax.swing.JMenu();
        MnAbreCalcPad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento do Motorista");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadMot.setText("Cadastrar");
        btCadMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadMotActionPerformed(evt);
            }
        });

        btConsMot.setText("Consultar pelo CPF");
        btConsMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsMotActionPerformed(evt);
            }
        });

        tblMot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Telefone", "CNH", "Avaliação", "Modelo", "Cor", "Placa"
            }
        ));
        jScrollPane1.setViewportView(tblMot);

        btAltMotCpf.setText("Alterar pelo CPF");
        btAltMotCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltMotCpfActionPerformed(evt);
            }
        });

        btExcMotCpf.setText("Excluir pelo CPF");
        btExcMotCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcMotCpfActionPerformed(evt);
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

        lblCnh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCnh.setText("CNH:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lblAvaliacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAvaliacao.setText("Avaliação:");

        cxAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAvaliacaoActionPerformed(evt);
            }
        });

        lblVeiculo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblVeiculo.setText("Veiculo");

        lblModelo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblModelo.setText("Modelo:");

        lblCor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCor.setText("Cor:");

        lblPlaca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPlaca.setText("Placa:");

        cxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCorActionPerformed(evt);
            }
        });

        cxPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPlacaActionPerformed(evt);
            }
        });

        lblMotorista.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMotorista.setText("Motorista");

        MnCalcPad.setText("Calcular Viagem Padrão");

        MnAbreCalcPad.setText("Abrir Calcular Viagem Padrão...");
        MnAbreCalcPad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAbreCalcPadActionPerformed(evt);
            }
        });
        MnCalcPad.add(MnAbreCalcPad);

        MnBarMot.add(MnCalcPad);

        setJMenuBar(MnBarMot);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblTel)
                                                .addComponent(lblNome)))
                                        .addComponent(lblCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCnh, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAvaliacao, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCor, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblVeiculo)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cxPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cxCor, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cxModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblMotorista)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cxCnh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cxTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(1, 1, 1))))
                                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(btCadMot)
                                    .addGap(18, 18, 18)
                                    .addComponent(btConsMot)
                                    .addGap(18, 18, 18)
                                    .addComponent(btAltMotCpf)
                                    .addGap(18, 18, 18)
                                    .addComponent(btExcMotCpf))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMotorista)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblVeiculo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCor)
                    .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsMot)
                    .addComponent(btCadMot)
                    .addComponent(btAltMotCpf)
                    .addComponent(btExcMotCpf))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btCadMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadMotActionPerformed
        try {
            cadastrar();
            listarTab();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadMotActionPerformed

    private void btConsMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsMotActionPerformed
        try {
            consultar();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsMotActionPerformed

    private void btAltMotCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltMotCpfActionPerformed
        try{
            alterar();
            listarTab();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAltMotCpfActionPerformed

    private void btExcMotCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcMotCpfActionPerformed
        try{
            excluir();
            listarTab();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExcMotCpfActionPerformed

    private void cxCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void cxAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAvaliacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAvaliacaoActionPerformed

    private void cxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCorActionPerformed

    private void cxPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPlacaActionPerformed

    private void MnAbreCalcPadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAbreCalcPadActionPerformed
        TarifaPadrao.getTarPad().setVisible(true);
    }//GEN-LAST:event_MnAbreCalcPadActionPerformed

    public void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel)tblMot.getModel();
        
        int posLin = 0;
        
        modelo.setRowCount(posLin);
        
        for(Motorista mot : bdMot.getBdMot()){
            modelo.insertRow(posLin, new Object []{mot.getCpf(), mot.getNome(), mot.getTel(), mot.getCnh(), mot.getAvaliacao(), mot.getModelo(), mot.getCor(), mot.getPlaca()});
            posLin++;
        }
        
    }                                          

    public void excluir() throws NumNegException{
        mot = new Motorista();
        try{
            mot.setCpf(Integer.parseInt(cxCpf.getText()));
    
            mot = bdMot.consMotCpf(mot);
            if(mot != null){
                cxCpf.setText(Integer.toString(mot.getCpf()));
                cxNome.setText(mot.getNome());
                cxTel.setText(Integer.toString(mot.getTel()));
                cxCnh.setText(Integer.toString(mot.getCnh()));
                cxAvaliacao.setText(Double.toString(mot.getAvaliacao()));
                cxModelo.setText(mot.getModelo());
                cxCor.setText(mot.getCor());
                cxPlaca.setText(mot.getPlaca());
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o atendente", "Confirmação de exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
                if(x == 0){
                    bdMot.removeMotCpf(mot);
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
        mot = new Motorista();
        try{
            mot.setCpf(Integer.parseInt(cxCpf.getText()));
    
            mot = bdMot.atualizaMotCpf(mot);
            if(mot != null){
                cxCpf.setText(Integer.toString(mot.getCpf()));
                cxNome.setText(mot.getNome());
                cxTel.setText(Integer.toString(mot.getTel()));
                cxCnh.setText(Integer.toString(mot.getCnh()));
                cxAvaliacao.setText(Double.toString(mot.getAvaliacao()));
                cxModelo.setText(mot.getModelo());
                cxCor.setText(mot.getCor());
                cxPlaca.setText(mot.getPlaca());
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
        mot = new Motorista();
        try{
            mot.setCpf(Integer.parseInt(cxCpf.getText()));
    
            mot = bdMot.consMotCpf(mot);
            if(mot != null){
                cxCpf.setText(Integer.toString(mot.getCpf()));
                cxNome.setText(mot.getNome());
                cxTel.setText(Integer.toString(mot.getTel()));
                cxCnh.setText(Integer.toString(mot.getCnh()));
                cxAvaliacao.setText(Double.toString(mot.getAvaliacao()));
                cxModelo.setText(mot.getModelo());
                cxCor.setText(mot.getCor());
                cxPlaca.setText(mot.getPlaca());
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
        mot = new Motorista();
        mot.setNome(cxNome.getText());
        try{
            mot.setCpf(Integer.parseInt(cxCpf.getText()));
            mot.setTel(Integer.parseInt(cxTel.getText()));
            mot.setCnh(Integer.parseInt(cxCnh.getText()));
            mot.setAvaliacao(Double.parseDouble(cxAvaliacao.getText()));
            mot.setModelo(cxModelo.getText());
            mot.setCor(cxCor.getText());
            mot.setPlaca(cxPlaca.getText());
            
            mot = bdMot.cadMot(mot);
            
            if(mot != null){
                JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso", "Cadastro concluido", 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Ja existe um atendente com este CPF!", "ERRO de cadastro", 0);
                limpar();
            }
        }
        catch(Num0a5Exception n05e){
            JOptionPane.showMessageDialog(null, "Valor valido de 0.0 a 5.0", "ERRO da Avaliação", 0);
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
        cxCnh.setText("");
        cxAvaliacao.setText("");
        cxModelo.setText("");
        cxCor.setText("");
        cxPlaca.setText("");
        cxCpf.requestFocus();
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerMot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnAbreCalcPad;
    private javax.swing.JMenuBar MnBarMot;
    private javax.swing.JMenu MnCalcPad;
    private javax.swing.JButton btAltMotCpf;
    private javax.swing.JButton btCadMot;
    private javax.swing.JButton btConsMot;
    private javax.swing.JButton btExcMotCpf;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAvaliacao;
    private javax.swing.JTextField cxCnh;
    private javax.swing.JTextField cxCor;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPlaca;
    private javax.swing.JTextField cxTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblCnh;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotorista;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JTable tblMot;
    // End of variables declaration//GEN-END:variables
}
