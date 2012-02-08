package notafiscal.observer;

import notafiscal.builder.NotaFiscal;

public class EmissorDeEmail implements AcaoAoCriarNotaFiscal {

	@Override
	public void executar(NotaFiscal nota) {
		System.out.println("[EmissorDeEmail] e-mail emitido.");
	}

}
