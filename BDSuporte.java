//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDSuporte{

	private Suporte sup;

	private List<Suporte> bdSup = new ArrayList<Suporte>();
        
        public  List<Suporte> getBdSup(){
            return bdSup;
        }
	
	public Suporte cadSup(Suporte sup){

		if(consSupCpf(sup) == null){
			bdSup.add(sup);
			return sup;
		}
		else{
			return null;
		}
	}

	public Suporte consSupCpf(Suporte sup){	
		for(int i = 0; i < bdSup.size(); i++){
			if(sup.getCpf() == bdSup.get(i).getCpf()){
				return bdSup.get(i);
			}
		}
		return null;
	}

	public void removeSupCpf(Suporte sup){	
		bdSup.remove(sup);
	}

	public Suporte atualizaSupCpf(Suporte sup){
            
            for(int i = 0; i < bdSup.size(); i++){
		if(sup.getCpf() == bdSup.get(i).getCpf()){
                    String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Autalização", JOptionPane.QUESTION_MESSAGE);
                    sup.setNome(nome);
                    try{
                        int tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o NOVO numero de telefone", "Autalização", JOptionPane.QUESTION_MESSAGE));
                        sup.setTel(tel);
                    }
                    catch(NumNegException nne){
			nne.impNeg();
                    }
                    catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "O telefone deve ser um numero inteiro", "ERRO de telefone", 0);
                    }
                     try{
			int prot = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o NOVO numero do protocolo", "Autalização", JOptionPane.QUESTION_MESSAGE));
                        sup.setProtocol(prot);
                    }
                    catch(NumNegException nne){
			nne.impNeg();
                    }
                    catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "O protocolo deve ser um numero inteiro", "ERRO de protocolo", 0);
                    }
                    bdSup.set(i, sup);
                    return bdSup.get(i);
		}
            }
            return null;
        }
}