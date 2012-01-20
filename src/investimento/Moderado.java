package investimento;

import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public double calculaInvestimento(Conta conta) {
		return conta.getSaldo() * calculaPercentual();
	}
	
	public static double calculaPercentual(){
		Random r = new Random();
		double numeroAleatorio = r.nextDouble();
		return (numeroAleatorio <= 0.50 ? 2.5: 0.07);
	}

}
