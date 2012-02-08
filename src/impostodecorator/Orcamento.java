package impostodecorator;

import java.util.Collections;
import java.util.List;


public class Orcamento {
	private final double valor;
	private List<Item> itens;

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}

	public Orcamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
	
}
