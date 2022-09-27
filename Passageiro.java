//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import javax.swing.JOptionPane;

public class Passageiro extends Usuario implements Calc{
	
	private int acompanhantes;
	private int idade;
	private int bagagem;

	public Passageiro(){
		acompanhantes = 0;
		idade = 0;
		bagagem = 0;
	}

	//polimorfismo sobrescrita
	public double calcKm(double y){
		double c = 0;
		c = y * 0.35;
		return c;
	}

	public double calcularDia(){
		double valor = calcKm(getKm());
		return valor;
	}

	//polimorfismo sobrescrita
	public double calcularNoite(){
		double valor = calcKm(getKm()) * 0.2;
		double taxa = calcKm(getKm()) + valor;
		return taxa;
	}

	//polimorfismo sobrecarga
	public double calcularDia(int getBagagem){
		double valor = calcKm(getKm()) + (getBagagem * 0.7);
		return valor;
	}

	//polimorfismo sobrecarga
	public double calcularNoite(int getBagagem){
		double valor = calcKm(getKm()) * 0.2;
		double taxa = calcKm(getKm()) + valor + (getBagagem * 0.7);
		return taxa;
	}

	public int getAcompanhantes(){
		return acompanhantes;
	}

	public void setAcompanhantes(int acompanhantes) throws Max3Exception, NumNegException{
		if(acompanhantes > 3){
			throw new Max3Exception();
		}else if(0 > acompanhantes){
			throw new NumNegException();
		}else{
			this.acompanhantes = acompanhantes;
		}
	}
	
	public int getIdade(){
		return idade;
	}

	public void setIdade(int idade) throws NumNegException{
		if(idade > 0){
			if(idade < 18){
                                JOptionPane.showMessageDialog(null, "Menor de idade nao podera viajar desacompanhado de um responsavel.", "Alerta!", 0);
			}
			this.idade = idade;
		}else{
			throw new NumNegException();
		}
	}
	
	public int getBagagem(){
		return bagagem;
	}

	public void setBagagem(int bagagem) throws NumNegException{
		if(bagagem >= 0){
			if(bagagem == 0){
				System.out.println("\nSem bagagem");
			}
			this.bagagem = bagagem;
		}else{
			throw new NumNegException();
		}
	}

}