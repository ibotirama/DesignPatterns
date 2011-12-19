package investimento;

public class RealizadorDeInvestimentos {

	public void calculaInvestimento(Conta conta, Investimento investimento){
		double retorno = investimento.calculaInvestimento(conta);
		double imposto = retorno * 0.25;
		double liquido = retorno - imposto;
		
		System.out.println("Saldo Anterior :"+conta.getSaldo());
		System.out.println("Investimento ----> "+investimento.getClass().getName());
		System.out.println("Imposto    :"+imposto);
		System.out.println("Rendimento :"+liquido);
		conta.deposito(liquido);
		System.out.println("Saldo após investimento :"+conta.getSaldo());
		System.out.println("-------------------------------------------------------");
	}

}
