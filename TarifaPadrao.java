//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TarifaPadrao extends javax.swing.JFrame {

    private Motorista mot;
    
    private static TarifaPadrao tarPad;
    
    public static TarifaPadrao getTarPad(){
        if(tarPad == null){
            tarPad = new TarifaPadrao();
        }
        return tarPad;
    }
    
    private TarifaPadrao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        lblSaida = new javax.swing.JLabel();
        lblKm = new javax.swing.JLabel();
        radPix = new javax.swing.JRadioButton();
        lblValPad = new javax.swing.JLabel();
        radDinheiro = new javax.swing.JRadioButton();
        cxKm = new javax.swing.JTextField();
        lblTurno = new javax.swing.JLabel();
        lblFormPag = new javax.swing.JLabel();
        cxSaida = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        radDia = new javax.swing.JRadioButton();
        radCartao = new javax.swing.JRadioButton();
        btCons = new javax.swing.JButton();
        radNoite = new javax.swing.JRadioButton();
        lblChegada = new javax.swing.JLabel();
        cxChegada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lblSaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSaida.setText("Local de saída:");

        lblKm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKm.setText("Distância da rota percorrida (Km):");

        radPix.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radPix.setText("Pix");

        lblValPad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblValPad.setText("Valor Padrão da Viagem");

        radDinheiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radDinheiro.setText("Dinheiro");

        cxKm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cxKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxKmActionPerformed(evt);
            }
        });

        lblTurno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTurno.setText("Turno da viagem:");

        lblFormPag.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFormPag.setText("Forma de pagamento:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        radDia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radDia.setText("Dia");

        radCartao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radCartao.setText("Cartão (Débito ou Crédito)");
        radCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCartaoActionPerformed(evt);
            }
        });

        btCons.setText("Consultar Valor da Viagem");
        btCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsActionPerformed(evt);
            }
        });

        radNoite.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radNoite.setText("Noite");

        lblChegada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblChegada.setText("Local de chegada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblValPad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSaida)
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cxSaida, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxKm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radCartao)
                                        .addComponent(radPix)
                                        .addComponent(radDinheiro))
                                    .addGap(36, 36, 36))
                                .addComponent(cxChegada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btCons)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblValPad)
                .addGap(18, 18, 18)
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
                .addGap(30, 30, 30)
                .addComponent(btCons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
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

    private void cxKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxKmActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void radCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCartaoActionPerformed

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
        } catch (Max3Exception ex) {
            Logger.getLogger(TarifaViagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsActionPerformed

    public void consultar() throws NumNegException, FormPagException, Num1ou2Exception, Max3Exception{
        mot = new Motorista();
        
        mot.getDestino().setSaida(cxSaida.getText());
        mot.getDestino().setChegada(cxChegada.getText());
        try{
            mot.setKm(Integer.parseInt(cxKm.getText()));
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Os valores devem ser numeros inteiros", "ERRO de letras", 0);
            limpar();
        }
        catch(NumNegException nne){
            nne.impNeg();
        }
        if(radCartao.isSelected() == true){
            mot.setPag(1);
        }
        if(radPix.isSelected() == true){
            mot.setPag(2);
        }
        if(radDinheiro.isSelected() == true){
            mot.setPag(3);
        }
        if(radDia.isSelected() == true){
            mot.setTurno(1);
        }
        if(radNoite.isSelected() == true){
            mot.setTurno(2);
        }
        
        if(mot.getTurno() == 1){
            JOptionPane.showMessageDialog(null, "\nValor da taxa padrao da viagem por km rodado: $"+new DecimalFormat(".##").format(mot.calcKm(mot.getKm()))+"\nValor "
                    + "padrao da viagem de dia: $"+new DecimalFormat(".##").format(mot.calcularDia()), "Valor da viagem Padrão de Dia", 1);
        }

	if(mot.getTurno() == 2){
            JOptionPane.showMessageDialog(null, "\nValor da taxa padrao da viagem por km rodado: $"+new DecimalFormat(".##").format(mot.calcKm(mot.getKm()))+"\nValor "
                    + "padrao da viagem de dia: $"+new DecimalFormat(".##").format(mot.calcularNoite()), "Valor da viagem Padrão de Dia", 1);
        }
        
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        cxChegada.setText("");
        cxSaida.setText("");
        cxKm.setText("");
        radCartao.setSelected(false);
        radPix.setSelected(false);
        radDinheiro.setSelected(false);
        radDia.setSelected(false);
        radNoite.setSelected(false);
        cxSaida.requestFocus();
    }
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarifaPadrao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCons;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxChegada;
    private javax.swing.JTextField cxKm;
    private javax.swing.JTextField cxSaida;
    private javax.swing.JLabel lblChegada;
    private javax.swing.JLabel lblFormPag;
    private javax.swing.JLabel lblKm;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblValPad;
    private javax.swing.JRadioButton radCartao;
    private javax.swing.JRadioButton radDia;
    private javax.swing.JRadioButton radDinheiro;
    private javax.swing.JRadioButton radNoite;
    private javax.swing.JRadioButton radPix;
    // End of variables declaration//GEN-END:variables
}
