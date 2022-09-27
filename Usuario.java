//Nome: Igor Araujo de Mattos - RA: 2346443
//Engenharia da Computação - 3º periodo

public abstract class Usuario{
	
	private String nome;
	private String pag;

	protected int cpf;
	protected int tel;
	private int turno;
	
	private double km;

	private Destino destino;

//=============================================================================
	
	public Usuario(){
		
		nome = "";
		pag = "";

		cpf = 0;
		tel = 0;
		turno = 0;
		
		km = 0;

		destino = new Destino();
	}

	public abstract double calcKm(double x);

//==============================================================================

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getCpf(){
		return cpf;
	}

	public void setCpf(int cpf) throws NumNegException{
		if(cpf > 0){
			this.cpf = cpf;
		}else{
			throw new NumNegException();
		}
	}

	public int getTel(){
		return tel;
	}

	public void setTel(int tel) throws NumNegException{
		if(tel > 0){
			this.tel = tel;
		}else{
			throw new NumNegException();
		}
	}

	public String getPag(){
		return pag;
	}

	public void setPag(int x) throws FormPagException{
		switch(x){
			case 1:
			pag = "Cartao (Credito ou Debito)";
			break;
			case 2:
			pag = "Pix";
			break;
			case 3:
			pag = "Dinheiro";
			break;
		}		
		this.pag = pag;
		if(x > 3 || 1 > x){
			throw new FormPagException();
		}
	}

	public Destino getDestino(){
		return destino;
	}
	
	public void setDestino(Destino destino){
		this.destino = destino;
	}

	public int getTurno(){
		return turno;
	}

	public void setTurno(int turno) throws Num1ou2Exception{
		if(turno > 0 && 3 > turno){
			this.turno = turno;
		}else{
			throw new Num1ou2Exception();
		}
	}

	public double getKm(){
		return km;
	}

	public void setKm(double km) throws NumNegException{
		if(km > 0){
			this.km = km;
		}else{
			throw new NumNegException();
		}
	}

}