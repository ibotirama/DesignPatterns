package conta.state;

public class Positiva implements EstadoDaConta {

	@Override
	public void saque(Conta conta, double valor) {
		// Aqui só permite sacar mais que tem pois senão como ficaria negativo ?
		conta.setSaldo(conta.getSaldo()-valor);

		if (conta.getSaldo() < valor){
			this.negativa(conta);
		}
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo()+(valor * 0.95));
	}

	@Override
	public void negativa(Conta conta) {
		conta.setEstado(new Negativa());
	}

	@Override
	public void positiva(Conta conta) {
		throw new RuntimeException("A conta já está positiva.");
	}

	public String toString(){
		return this.getClass().getName();
	}
}
