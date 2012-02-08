package notafiscal.builder;

public class ItemNotaFiscal {
	private String descricao;
	private double valor;
	
	public ItemNotaFiscal(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
