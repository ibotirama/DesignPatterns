package notafiscal.observer;

public class ItemNotaFiscalBuilder {

	private String descricao;
	private double valor;

	public ItemNotaFiscalBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public ItemNotaFiscalBuilder custando(double valor) {
		this.valor = valor;
		return this;
	}

	public ItemNotaFiscal criar() {
		return new ItemNotaFiscal(descricao, valor);
	}

}
