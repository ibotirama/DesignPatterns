package notafiscal.builder;


import notafiscal.observer.ItemNotaFiscal;
import notafiscal.observer.ItemNotaFiscalBuilder;
import notafiscal.observer.NotaFiscal;


public class TesteNotaFiscalBuilder {
	
	public static void main(String[] args) {
		ItemNotaFiscalBuilder itemNFBuilder = new ItemNotaFiscalBuilder();
		itemNFBuilder.comDescricao("Sabão em pó")
		.custando(100.0);
		ItemNotaFiscal item1 = itemNFBuilder.criar(); 
		
		NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
		notaFiscalBuilder.paraRazaoSocial("Supermercado pague mais")
		.comCnpj("23.123.123/0001-12")
		.comObservacao("Observacao")
		.com(item1);
		
		NotaFiscal nf = notaFiscalBuilder.criar();
		
		System.out.println(nf.getValorBruto());
		System.out.println(nf.getDataEmissao().getTime().toString());
	}

}
