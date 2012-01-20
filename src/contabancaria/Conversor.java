package contabancaria;

public interface Conversor {
	public String converter(Requisicao requisicao);
	public void setProximo(Conversor conv);
}
