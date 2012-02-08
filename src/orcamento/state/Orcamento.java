package orcamento.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;
	private double desconto;
	private List<Item> itens;
	private EstadoOrcamento estado;

	public EstadoOrcamento getEstado() {
		return estado;
	}

	public void setEstado(EstadoOrcamento estado) {
		this.estado = estado;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}

	public Orcamento(double valor){
		this();
		this.valor = valor;
	}
	
	public Orcamento(){
		this.valor = 0.0;
		this.itens = new ArrayList<Item>();
		this.estado = new EmAprovacao();
	}
	
	public double getValor() {
            this.valor = 0.0;
            for (Item it : getItens()){
                this.valor += it.getValor();
            }
            return valor - (valor * getDesconto());
	}
	
	public void aplicaDescontoExtra(){
		if (getDesconto() > 0) throw new RuntimeException("Você não pode aplicar mais de um desconto extra !");
		
		estado.aplicaDescontoExtra(this);
	}
	
	public void aprova(){
		estado.aprova(this);
	}
	
	public void reprova(){
		estado.reprova(this);
	}
	
	public void finaliza(){
		estado.finaliza(this);
	}

}
