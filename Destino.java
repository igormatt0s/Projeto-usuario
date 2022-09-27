//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

import javax.swing.JOptionPane;

public class Destino{
	
	private String saida;
	private String chegada;

	public Destino(){
		saida = "";
		chegada = "";
	}

	public String getSaida(){
		return saida;
	}

	public String getChegada(){
		return chegada;
	}

	public void setSaida(String saida){
		this.saida = saida;
	}

	public void setChegada(String chegada){
		this.chegada = chegada;
	}
}