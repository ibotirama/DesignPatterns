package desconto;

public class DescontoPorMaisDeCincoItens implements Desconto{
	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.1;
		}
		else {return this.proximo.desconta(orcamento);}
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximo = desconto;
	}

}
