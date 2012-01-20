package investimento;

public class Conservador implements Investimento {

	public double calculaInvestimento(Conta conta) {
		return conta.getSaldo() * 0.08; 
	}

}
