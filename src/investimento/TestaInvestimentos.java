package investimento;

public class TestaInvestimentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposito(100.0);
		
		RealizadorDeInvestimentos r = new RealizadorDeInvestimentos();
		r.calculaInvestimento(conta, new Moderado());
		r.calculaInvestimento(conta, new Conservador());
		r.calculaInvestimento(conta, new Arrojado());
	}

}
