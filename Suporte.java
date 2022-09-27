//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

public class Suporte extends Usuario implements Calc{
	
	private int protocol;
	private int cadastro;
	private String cliente;

	public Suporte(){
		protocol = 0;
		cadastro = 0;
		cliente = "";
	}

	//polimorfismo sobrescrita
	public double calcKm(double x){
		double c = 0;
		c = x * 0.05;
		return c;
	}

	public double calcularDia(){
		double valor = calcKm(getKm());
		return valor;
	}

	//polimorfismo sobrescrita
	public double calcularNoite(){
		double valor = calcKm(getKm()) * 0.05;
		double taxa = calcKm(getKm()) + valor;
		return taxa;
	}

	public int getProtocol(){
		return protocol;
	}

	public int getCadastro(){
		return cadastro;
	}

	public String getCliente(){
		return cliente;
	}

	public void setProtocol(int protocol) throws NumNegException{
		if(protocol > 0){
			this.protocol = protocol;
		}else{
			throw new NumNegException();
		}
	}

	public void setCadastro(int cadastro) throws NumNegException{
		if(cadastro > 0){
			this.cadastro = cadastro;
		}else{
			throw new NumNegException();
		}
	}

	public void setCliente(int w) throws Num1ou2Exception{
		if(w == 1){
			cliente = "Cliente Vip";
			this.cliente = cliente;
		}else if(w == 2){
			cliente = "Cliente Padrao";
			this.cliente = cliente;
		}else{
			throw new Num1ou2Exception();
		}
	}

}