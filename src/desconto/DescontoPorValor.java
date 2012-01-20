package desconto;

public class DescontoPorValor implements Desconto {

	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		if ( orcamento.getValor() > 500.0){
			return orcamento.getValor() * 0.07;
		}	
		else{
			return this.proximo.desconta(orcamento);
		}	
	}

	@Override
	public void setProximoDesconto(Desconto desconto){ 
		this.proximo = desconto;
	}

}
