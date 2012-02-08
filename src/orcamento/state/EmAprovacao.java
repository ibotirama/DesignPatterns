package orcamento.state;

public class EmAprovacao implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setDesconto(0.05);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstado(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstado(new Reprovado());
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação não podem ir diretamente para finalizado !");
	}

}
