
public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double percentual = 0.0;
		double acrescimo = 0.0;
		percentual = descobrePercentual(orcamento, percentual);
		
		if (orcamento.getValor() > 3000.0){
			acrescimo = 30.0;
		}
			
		return (orcamento.getValor() * percentual) + acrescimo;
	}

	private double descobrePercentual(Orcamento orcamento, double percentual) {
		if (orcamento.getValor() < 1000.0){
			percentual = 0.05;  
		}
		else if (orcamento.getValor() > 1000.0 && orcamento.getValor() <= 3000.0){
			percentual = 0.07;
		}
		else if (orcamento.getValor() > 3000.0){
			percentual = 0.08;
		}
		return percentual;
	}

}
