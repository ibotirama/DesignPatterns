package desconto;

public interface Desconto {
	public double desconta(Orcamento orcamento);
	public void setProximoDesconto(Desconto desconto);
}
