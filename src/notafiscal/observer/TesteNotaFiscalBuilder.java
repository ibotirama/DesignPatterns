package notafiscal.observer;

import java.util.ArrayList;
import java.util.List;

import notafiscal.builder.ItemNotaFiscal;
import notafiscal.builder.NotaFiscal;


public class TesteNotaFiscalBuilder {
	
	public static void main(String[] args) {
		List<AcaoAoCriarNotaFiscal> lista = new ArrayList<AcaoAoCriarNotaFiscal>();
		lista.add(new NotaFiscalDao());
		lista.add(new EmissorDeEmail());
		lista.add(new Multiplicador(10.0));
		
		NotaFiscal nf = new NotaFiscalBuilder(lista)
		.paraRazaoSocial("Supermercado pague mais")
		.comCnpj("23.123.123/0001-12")
		.comObservacao("Observacao")
		.com(new ItemNotaFiscal("teste", 100.0)).criar();
		
		System.out.println(nf.getValorBruto());
		System.out.println(nf.getDataEmissao().getTime().toString());
	}

}
