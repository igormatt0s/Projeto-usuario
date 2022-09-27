//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDMotorista{

	private Motorista mot;

	private List<Motorista> bdMot = new ArrayList<Motorista>();
        
        public  List<Motorista> getBdMot(){
            return bdMot;
        }
	
	public Motorista cadMot(Motorista mot){
            
		if(consMotCpf(mot) == null){
			bdMot.add(mot);
			return mot;
		}
		else{
			return null;
		}
	}

	public Motorista consMotCpf(Motorista mot){	
		for(int i = 0; i < bdMot.size(); i++){
			if(mot.getCpf() == bdMot.get(i).getCpf()){
				return bdMot.get(i);
			}
		}
		return null;
	}

	public void removeMotCpf(Motorista mot){	
		bdMot.remove(mot);
	}

	public Motorista atualizaMotCpf(Motorista mot){
		for(int i = 0; i < bdMot.size(); i++){
		if(mot.getCpf() == bdMot.get(i).getCpf()){
                    String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Autalização", JOptionPane.QUESTION_MESSAGE);
                    mot.setNome(nome);
                    try{
                        int tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o NOVO numero de telefone", "Autalização", JOptionPane.QUESTION_MESSAGE));
                        mot.setTel(tel);
                    }
                    catch(NumNegException nne){
			nne.impNeg();
                    }
                    catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "O telefone deve ser um numero inteiro", "ERRO de telefone", 0);
                    }
                     try{
			int cnh = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o NOVO numero da CNH", "Autalização", JOptionPane.QUESTION_MESSAGE));
                        mot.setCnh(cnh);
                    }
                    catch(NumNegException nne){
			nne.impNeg();
                    }
                    catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "A CNH deve ser um numero inteiro", "ERRO da CNH", 0);
                    }
                    try{
			double avaliacao = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a NOVO avaliação", "Autalização", JOptionPane.QUESTION_MESSAGE));
                        mot.setAvaliacao(avaliacao);
                    }
                    catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "A CNH deve ser um numero inteiro", "ERRO da Avaliação", 0);
                    }
                    catch(Num0a5Exception n05e){
                        JOptionPane.showMessageDialog(null, "Valor valido de 0.0 a 5.0", "ERRO da Avaliação", 0);
                    }
                    String modelo = JOptionPane.showInputDialog(null, "Informe o NOVO modelo", "Autalização", JOptionPane.QUESTION_MESSAGE);
                    mot.setModelo(modelo);
                    String cor = JOptionPane.showInputDialog(null, "Informe a NOVA cor", "Autalização", JOptionPane.QUESTION_MESSAGE);
                    mot.setCor(cor);
                    String placa = JOptionPane.showInputDialog(null, "Informe a NOVA placa", "Autalização", JOptionPane.QUESTION_MESSAGE);
                    mot.setPlaca(placa);
                    bdMot.set(i, mot);
                    return bdMot.get(i);
		}
            }
            return null;
        }
}