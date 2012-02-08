package notafiscal.observer;

import notafiscal.builder.NotaFiscal;

public class Multiplicador implements AcaoAoCriarNotaFiscal {
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executar(NotaFiscal nota) {
		System.out.println("["+this.getClass().getName()+"] Multiplicando total : "+nota.getValorBruto()*this.fator);
	}

}
