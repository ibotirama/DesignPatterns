package notafiscal.observer;

import notafiscal.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAoCriarNotaFiscal {

	@Override
	public void executar(NotaFiscal nota) {
		System.out.println("[NotaFiscalDao] Salvo no banco.");
	}

}
