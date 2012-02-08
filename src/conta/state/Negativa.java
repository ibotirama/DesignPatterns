package conta.state;

public class Negativa implements EstadoDaConta {

	@Override
	public void saque(Conta conta, double valor) {
		throw new RuntimeException("Conta negativa, saques n�o permitidos.");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo()+(valor * 0.98));
		
		if (conta.getSaldo() > 0){
			this.positiva(conta);
		}
	}

	@Override
	public void negativa(Conta conta) {
		throw new RuntimeException("Esta conta j� est� negativa.");
	}

	@Override
	public void positiva(Conta conta) {
		conta.setEstado(new Positiva());
	}

	public String toString(){
		return this.getClass().getName();
	}
}
