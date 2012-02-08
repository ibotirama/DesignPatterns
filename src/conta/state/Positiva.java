package conta.state;

public class Positiva implements EstadoDaConta {

	@Override
	public void saque(Conta conta, double valor) {
		// Aqui s� permite sacar mais que tem pois sen�o como ficaria negativo ?
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
		throw new RuntimeException("A conta j� est� positiva.");
	}

	public String toString(){
		return this.getClass().getName();
	}
}
