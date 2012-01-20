package contabancaria;

public class Conta {

	private String nomeTitula;
	private double saldo;

	public Conta(String nomeTitula, double saldo){
		this.nomeTitula = nomeTitula;
		this.saldo = saldo;
		
	}

	public String getNomeTitula() {
		return nomeTitula;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}
