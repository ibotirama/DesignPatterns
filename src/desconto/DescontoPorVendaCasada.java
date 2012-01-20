package desconto;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto desconto;

	@Override
	public double desconta(Orcamento orcamento) {
        if ( existe("LAPIS", orcamento) && existe("CANETA", orcamento) ){
        	return orcamento.getValor() * 0.05;
        }
        else{
    		return this.desconto.desconta(orcamento);
        }
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
	    for (Item item : orcamento.getItens()) {
	        if(item.getNome().equals(nomeDoItem)) return true;
	    }
	    return false;
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

}