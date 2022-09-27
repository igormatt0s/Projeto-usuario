//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

public class Motorista extends Usuario implements Calc{
	
	private int cnh;
	private double avaliacao;
	private String modelo;
	private String cor;
	private String placa;

	public Motorista(){
		cnh = 0;
		avaliacao = 0;
		modelo = "";
		cor = "";
		placa = "";
	}

	//polimorfismo sobrescrita
	public double calcKm(double x){
		double c = 0;
		c = x * 0.40;
		return c;
	}

	public double calcularDia(){
		double valor = calcKm(getKm());
		return valor;
	}

	//polimorfismo sobrescrita
	public double calcularNoite(){
		double valor = calcKm(getKm()) * 0.25;
		double taxa = calcKm(getKm()) + valor;
		return taxa;
	}

	public int getCnh(){
		return cnh;
	}

	public double getAvaliacao(){
		return avaliacao;
	}

	public String getModelo(){
		return modelo;
	}

	public String getCor(){
		return cor;
	}

	public String getPlaca(){
		return placa;
	}

	public void setCnh(int cnh) throws NumNegException{
		if(cnh > 0){
			this.cnh = cnh;
		}else{
			throw new NumNegException();
		}
	}

	public void setAvaliacao(double avaliacao) throws Num0a5Exception{
		if(0 > avaliacao || avaliacao > 5){
			throw new Num0a5Exception();
		}
		this.avaliacao = avaliacao;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public void setPlaca(String placa){
		this.placa = placa;
	}

}