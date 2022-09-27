//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConsClie extends javax.swing.JFrame {

    private Suporte sup;
    
    private static ConsClie consClie;
    
    public static ConsClie getConsClie(){
        if(consClie == null){
            consClie = new ConsClie();
        }
        return consClie;
    }
    
    private ConsClie(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        cxChegada = new javax.swing.JTextField();
        lblConsultaCliente = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        lblCadastro = new javax.swing.JLabel();
        cxCadastro = new javax.swing.JTextField();
        lblClassificacao = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        lblSaida = new javax.swing.JLabel();
        cxSaida = new javax.swing.JTextField();
        btCons = new javax.swing.JButton();
        lblChegada = new javax.swing.JLabel();
        radCliPad = new javax.swing.JRadioButton();
        radCliVip = new javax.swing.JRadioButton();
        lblKm = new javax.swing.JLabel();
        cxKm = new javax.swing.JTextField();
        lblFormPag = new javax.swing.JLabel();
        radCartao = new javax.swing.JRadioButton();
        radPix = new javax.swing.JRadioButton();
        radDinheiro = new javax.swing.JRadioButton();
        lblTurno = new javax.swing.JLabel();
        radDia = new javax.swing.JRadioButton();
        radNoite = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblConsultaCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblConsultaCliente.setText("Consultar Cliente");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lblCadastro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCadastro.setText("Nº Cadastro:");

        cxCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCadastroActionPerformed(evt);
            }
        });

        lblClassificacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblClassificacao.setText("Classificação:");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lblSaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSaida.setText("Local de saída:");

        btCons.setText("Consultar");
        btCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsActionPerformed(evt);
            }
        });

        lblChegada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblChegada.setText("Local de chegada:");

        buttonGroup1.add(radCliPad);
        radCliPad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radCliPad.setText("Cliente Padrão");
        radCliPad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCliPadActionPerformed(evt);
            }
        });

        buttonGroup1.add(radCliVip);
        radCliVip.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radCliVip.setText("Cliente Vip");

        lblKm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKm.setText("Distância da rota percorrida (Km):");

        cxKm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cxKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxKmActionPerformed(evt);
            }
        });

        lblFormPag.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFormPag.setText("Forma de pagamento:");

        buttonGroup2.add(radCartao);
        radCartao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radCartao.setText("Cartão (Débito ou Crédito)");
        radCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCartaoActionPerformed(evt);
            }
        });

        buttonGroup2.add(radPix);
        radPix.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radPix.setText("Pix");

        buttonGroup2.add(radDinheiro);
        radDinheiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radDinheiro.setText("Dinheiro");

        lblTurno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTurno.setText("Turno da viagem:");

        buttonGroup3.add(radDia);
        radDia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radDia.setText("Dia");

        buttonGroup3.add(radNoite);
        radNoite.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radNoite.setText("Noite");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSaida)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(lblClassificacao))
                                .addComponent(lblCadastro, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblChegada)
                            .addComponent(lblKm)
                            .addComponent(lblFormPag)
                            .addComponent(lblTurno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radDia)
                                .addGap(27, 27, 27)
                                .addComponent(radNoite))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cxSaida, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxKm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radCartao)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radCliPad)
                                            .addGap(18, 18, 18)
                                            .addComponent(radCliVip))
                                        .addComponent(radPix)
                                        .addComponent(radDinheiro))
                                    .addComponent(cxChegada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(cxCadastro, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btLimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btSair)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblConsultaCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btCons)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblConsultaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastro)
                    .addComponent(cxCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClassificacao)
                    .addComponent(radCliPad)
                    .addComponent(radCliVip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaida)
                    .addComponent(cxSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChegada)
                    .addComponent(cxChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKm)
                    .addComponent(cxKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormPag)
                    .addComponent(radCartao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radPix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radDinheiro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radDia)
                    .addComponent(radNoite)
                    .addComponent(lblTurno))
                .addGap(28, 28, 28)
                .addComponent(btCons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void cxCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCadastroActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsActionPerformed
        try {
            consultar();
            limpar();
        }
        catch (NumNegException ex) {
            Logger.getLogger(GerSup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FormPagException ex) {
            Logger.getLogger(ConsClie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Num1ou2Exception ex) {
            Logger.getLogger(ConsClie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsActionPerformed

    private void radCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCartaoActionPerformed

    private void cxKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxKmActionPerformed

    private void radCliPadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCliPadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCliPadActionPerformed

    public void consultar() throws NumNegException, FormPagException, Num1ou2Exception{
        sup = new Suporte();
        
        sup.getDestino().setSaida(cxSaida.getText());
        sup.getDestino().setChegada(cxChegada.getText());
        try{
            sup.setCadastro(Integer.parseInt(cxCadastro.getText()));
            sup.setKm(Integer.parseInt(cxKm.getText()));
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Os valores devem ser numeros inteiros", "ERRO de letras", 0);
            limpar();
        }
        catch(NumNegException nne){
            nne.impNeg();
        }
        if(radCliPad.isSelected() == true){
            sup.setCliente(2);
        }
        if(radCliVip.isSelected() == true){
            sup.setCliente(1);
        }
        if(radCartao.isSelected() == true){
            sup.setPag(1);
        }
        if(radPix.isSelected() == true){
            sup.setPag(2);
        }
        if(radDinheiro.isSelected() == true){
            sup.setPag(3);
        }
        if(radDia.isSelected() == true){
            sup.setTurno(1);
        }
        if(radNoite.isSelected() == true){
            sup.setTurno(2);
        }
        
        if(sup.getTurno() == 1){
            JOptionPane.showMessageDialog(null,
                    "Diferenca da taxa paga pelo Cliente Vip e pelo Cliente Padrao por km rodado: $"+new DecimalFormat(".##").format(sup.calcKm(sup.getKm()))+"\nO "
                            + "cliente Padrão pagou $"+new DecimalFormat(".##").format(sup.calcularDia())+" a mais do que o Cliente Vip.", "Diferença paga entre "
                                    + "o Clliente Padrão e o Cliente Vip dia", 1);
        }

	if(sup.getTurno() == 2){
            JOptionPane.showMessageDialog(null, "Diferenca da taxa paga pelo Cliente Vip e pelo Cliente Padrao por km rodado: "
                    + "$"+new DecimalFormat(".##").format(sup.calcKm(sup.getKm()))+"\nO cliente Padrão pagou "
                            + "$"+new DecimalFormat(".##").format(sup.calcularNoite())+" a mais do que o Cliente Vip.", "Diferença paga entre o Clliente "
                                    + "Padrão e o Cliente Vip noite", 1);
        }
        
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        cxCadastro.setText("");
        cxChegada.setText("");
        cxSaida.setText("");
        cxKm.setText("");
        radCliPad.setSelected(false);
        radCliVip.setSelected(false);
        radCartao.setSelected(false);
        radPix.setSelected(false);
        radDinheiro.setSelected(false);
        radDia.setSelected(false);
        radNoite.setSelected(false);
        cxCadastro.requestFocus();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsClie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCons;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField cxCadastro;
    private javax.swing.JTextField cxChegada;
    private javax.swing.JTextField cxKm;
    private javax.swing.JTextField cxSaida;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblChegada;
    private javax.swing.JLabel lblClassificacao;
    private javax.swing.JLabel lblConsultaCliente;
    private javax.swing.JLabel lblFormPag;
    private javax.swing.JLabel lblKm;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JRadioButton radCartao;
    private javax.swing.JRadioButton radCliPad;
    private javax.swing.JRadioButton radCliVip;
    private javax.swing.JRadioButton radDia;
    private javax.swing.JRadioButton radDinheiro;
    private javax.swing.JRadioButton radNoite;
    private javax.swing.JRadioButton radPix;
    // End of variables declaration//GEN-END:variables
}
