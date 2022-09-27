//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TarifaViagem extends javax.swing.JFrame {

    private Passageiro pas;
    
    private static TarifaViagem tarifa;
    
    public static TarifaViagem getTarifa(){
        if(tarifa == null){
            tarifa = new TarifaViagem();
        }
        return tarifa;
    }
    
    private TarifaViagem() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxChegada = new javax.swing.JTextField();
        lblKm = new javax.swing.JLabel();
        lblValViag = new javax.swing.JLabel();
        cxKm = new javax.swing.JTextField();
        lblFormPag = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        radCartao = new javax.swing.JRadioButton();
        lblAcompanhantes = new javax.swing.JLabel();
        cxAcompanhantes = new javax.swing.JTextField();
        lblBagagem = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        lblSaida = new javax.swing.JLabel();
        radPix = new javax.swing.JRadioButton();
        radDinheiro = new javax.swing.JRadioButton();
        lblTurno = new javax.swing.JLabel();
        cxSaida = new javax.swing.JTextField();
        radDia = new javax.swing.JRadioButton();
        btCons = new javax.swing.JButton();
        radNoite = new javax.swing.JRadioButton();
        lblChegada = new javax.swing.JLabel();
        cxBagagem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblKm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKm.setText("Distância da rota percorrida (Km):");

        lblValViag.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblValViag.setText("Valor da Viagem");

        cxKm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cxKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxKmActionPerformed(evt);
            }
        });

        lblFormPag.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFormPag.setText("Forma de pagamento:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        radCartao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radCartao.setText("Cartão (Débito ou Crédito)");
        radCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCartaoActionPerformed(evt);
            }
        });

        lblAcompanhantes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAcompanhantes.setText("Qtd. Acompanhantes:");

        cxAcompanhantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAcompanhantesActionPerformed(evt);
            }
        });

        lblBagagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBagagem.setText("Qtd. Bagagens:");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lblSaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSaida.setText("Local de saída:");

        radPix.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radPix.setText("Pix");

        radDinheiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radDinheiro.setText("Dinheiro");

        lblTurno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTurno.setText("Turno da viagem:");

        radDia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radDia.setText("Dia");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCons)
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSaida)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(lblBagagem))
                                .addComponent(lblAcompanhantes, javax.swing.GroupLayout.Alignment.TRAILING))
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
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btLimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btSair))
                                .addComponent(cxSaida, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxKm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radCartao)
                                        .addComponent(radPix)
                                        .addComponent(radDinheiro))
                                    .addGap(36, 36, 36))
                                .addComponent(cxChegada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(cxAcompanhantes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cxBagagem, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblValViag)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblValViag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAcompanhantes)
                    .addComponent(cxAcompanhantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBagagem)
                    .addComponent(cxBagagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxKmActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void radCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCartaoActionPerformed

    private void cxAcompanhantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAcompanhantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAcompanhantesActionPerformed

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
        } catch (Max3Exception ex) {
            Logger.getLogger(TarifaViagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsActionPerformed

     public void consultar() throws NumNegException, FormPagException, Num1ou2Exception, Max3Exception{
        pas = new Passageiro();
        
        pas.getDestino().setSaida(cxSaida.getText());
        pas.getDestino().setChegada(cxChegada.getText());
        try{
            pas.setAcompanhantes(Integer.parseInt(cxAcompanhantes.getText()));
            pas.setBagagem(Integer.parseInt(cxBagagem.getText()));
            pas.setKm(Integer.parseInt(cxKm.getText()));
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Os valores devem ser numeros inteiros", "ERRO de letras", 0);
            limpar();
        }
        catch(NumNegException nne){
            nne.impNeg();
        }
        if(radCartao.isSelected() == true){
            pas.setPag(1);
        }
        if(radPix.isSelected() == true){
            pas.setPag(2);
        }
        if(radDinheiro.isSelected() == true){
            pas.setPag(3);
        }
        if(radDia.isSelected() == true){
            pas.setTurno(1);
        }
        if(radNoite.isSelected() == true){
            pas.setTurno(2);
        }
        
        if(pas.getTurno() == 1){
            JOptionPane.showMessageDialog(null, "Valor da taxa da viagem por km rodado Cliente Vip: $"+new DecimalFormat(".##").format(pas.calcKm(pas.getKm()))+"\nValor "
                    + "da viagem de dia Cliente Vip: $"+new DecimalFormat(".##").format(pas.calcularDia())+"\nValor da viagem com o adicional das bagagens: "
                            + "$"+new DecimalFormat(".##").format(pas.calcularDia(pas.getBagagem())), "Valor da viagem de Dia", 1);
        }

	if(pas.getTurno() == 2){
            JOptionPane.showMessageDialog(null, "Valor da taxa da viagem por km rodado Cliente Vip: $"+new DecimalFormat(".##").format(pas.calcKm(pas.getKm()))+"\nValor "
                    + "da viagem de dia Cliente Vip: $"+new DecimalFormat(".##").format(pas.calcularNoite())+"\nValor da viagem com o adicional das bagagens: "
                            + "$"+new DecimalFormat(".##").format(pas.calcularNoite(pas.getBagagem())), "Valor da viagem de Noite", 1);
        }
        
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        cxAcompanhantes.setText("");
        cxChegada.setText("");
        cxSaida.setText("");
        cxKm.setText("");
        cxBagagem.setText("");
        radCartao.setSelected(false);
        radPix.setSelected(false);
        radDinheiro.setSelected(false);
        radDia.setSelected(false);
        radNoite.setSelected(false);
        cxAcompanhantes.requestFocus();
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarifaViagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCons;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAcompanhantes;
    private javax.swing.JTextField cxBagagem;
    private javax.swing.JTextField cxChegada;
    private javax.swing.JTextField cxKm;
    private javax.swing.JTextField cxSaida;
    private javax.swing.JLabel lblAcompanhantes;
    private javax.swing.JLabel lblBagagem;
    private javax.swing.JLabel lblChegada;
    private javax.swing.JLabel lblFormPag;
    private javax.swing.JLabel lblKm;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblValViag;
    private javax.swing.JRadioButton radCartao;
    private javax.swing.JRadioButton radDia;
    private javax.swing.JRadioButton radDinheiro;
    private javax.swing.JRadioButton radNoite;
    private javax.swing.JRadioButton radPix;
    // End of variables declaration//GEN-END:variables
}
