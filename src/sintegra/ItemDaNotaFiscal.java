package sintegra;

import java.math.BigDecimal;

public class ItemDaNotaFiscal {
	private String produto;
	private BigDecimal valor;
	private BigDecimal quantidade;
	
	public ItemDaNotaFiscal(String produto, BigDecimal valor, BigDecimal quantidade) {
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	
	public BigDecimal getTotal(){
		return getQuantidade().multiply(getValor());
	}
}
