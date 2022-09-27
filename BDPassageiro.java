//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDPassageiro{

	private Passageiro pas;

	private List<Passageiro> bdPas = new ArrayList<Passageiro>();
        
        public  List<Passageiro> getBdPas(){
            return bdPas;
        }

	public Passageiro cadPas(Passageiro pas){

		if(consPasCpf(pas) == null){
			bdPas.add(pas);
			return pas;
		}
		else{
			return null;
		}
	}

	public Passageiro consPasCpf(Passageiro pas){	
		for(int i = 0; i < bdPas.size(); i++){
			if(pas.getCpf() == bdPas.get(i).getCpf()){
				return bdPas.get(i);
			}
		}
		return null;
	}

	public void removePasCpf(Passageiro pas){	
		bdPas.remove(pas);
	}

	public Passageiro atualizaPasCpf(Passageiro pas){
                for(int i = 0; i < bdPas.size(); i++){
		if(pas.getCpf() == bdPas.get(i).getCpf()){
                    String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Autalização", JOptionPane.QUESTION_MESSAGE);
                    pas.setNome(nome);
                    try{
                        int tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o NOVO numero de telefone", "Autalização", JOptionPane.QUESTION_MESSAGE));
                        pas.setTel(tel);
                    }
                    catch(NumNegException nne){
			nne.impNeg();
                    }
                    catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "O telefone deve ser um numero inteiro", "ERRO de telefone", 0);
                    }
                     try{
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a NOVA idade", "Autalização", JOptionPane.QUESTION_MESSAGE));
                        pas.setIdade(idade);
                    }
                    catch(NumNegException nne){
			nne.impNeg();
                    }
                    catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "A CNH deve ser um numero inteiro", "ERRO da CNH", 0);
                    }
                    bdPas.set(i, pas);
                    return bdPas.get(i);
		}
            }
            return null;
        }
}