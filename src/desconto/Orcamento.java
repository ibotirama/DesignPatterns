package desconto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private final double valor;
	private final List<Item> itens;

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}

	public Orcamento(double valor){
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}
	
	public double getValor() {
		return valor;
	}
	
}
