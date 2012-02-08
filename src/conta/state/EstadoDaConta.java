package conta.state;

public interface EstadoDaConta {
	
	public void saque(Conta conta, double valor);
	public void deposita(Conta conta, double valor);
	
	void negativa(Conta conta);
	void positiva(Conta conta);
}
