package investimento;

import java.util.Random;

public class Arrojado implements Investimento {

	@Override
	public double calculaInvestimento(Conta conta) {
		return conta.getSaldo() * calculaPercentual();
	}

	public double calculaPercentual(){
		double percentual = new Random().nextDouble();
		double retorno = 0.0;
		
		if (percentual <= 0.20){
			retorno = 0.05;  
		}
		else if (percentual > 0.20 && percentual <= 0.30){
			retorno = 0.03;
		}
		else if (percentual >= 0.50){
			retorno = 0.06;
		}
		
		return retorno;
	}


}
