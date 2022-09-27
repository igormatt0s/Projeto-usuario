//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import javax.swing.JOptionPane;

public class NumNegException extends Exception{

        public void impNeg(){
                JOptionPane.showMessageDialog(null, "Os valores devem ser numeros positivos! Maiores que zero!", "ERRO de números negativos", -1);
        }

}