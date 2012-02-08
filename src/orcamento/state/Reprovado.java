package orcamento.state;

public class Reprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não pode receber desconto extra.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não pode ser aprovado.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não pode ser reprovado novamente.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstado(new Finalizado());
	}

}
