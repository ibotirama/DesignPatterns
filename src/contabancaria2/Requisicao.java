package contabancaria2;

public class Requisicao {
	private Conta conta;
	private Formato formato;
	
	public Requisicao(Formato formato, Conta conta){
		this.formato = formato;
		this.conta = conta;
	}
	
	public Formato getFormato(){
		return this.formato;
	}
	
	public Conta getConta() {
		return conta;
	}
}
