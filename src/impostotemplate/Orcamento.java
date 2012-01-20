package impostotemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<Item> itens;

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}

	public Orcamento(){
		this.valor = 0.0;
		this.itens = new ArrayList<Item>();
	}
	
	public double getValor() {
            this.valor = 0.0;
            for (Item it : getItens()){
                this.valor += it.getValor();
            }
            return valor;
	}
}
