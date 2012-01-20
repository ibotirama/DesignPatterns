package desconto;

public class TestaDesconto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(400.0);
		orcamento.adicionaItem(new Item("LAPIS", 100.0));
		orcamento.adicionaItem(new Item("CANETA", 100.0));
		
		Desconto d1 = new DescontoPorMaisDeCincoItens();
		Desconto d2 = new DescontoPorValor();
		Desconto d3 = new DescontoPorVendaCasada();
		
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(new SemDesconto());
		
		System.out.println("Desconto .... :"+d1.desconta(orcamento));

	}

}