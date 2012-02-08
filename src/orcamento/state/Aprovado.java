package orcamento.state;

public class Aprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setDesconto(0.02);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser aprovados novamente !");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados !");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstado(new Finalizado());
	}

}
