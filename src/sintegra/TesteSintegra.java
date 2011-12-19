package sintegra;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TesteSintegra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscal(1, "Cliente Teste");
		ItemDaNotaFiscal item1 = new ItemDaNotaFiscal("Sabão em pó", new BigDecimal(100), new BigDecimal(200));
		ItemDaNotaFiscal item2 = new ItemDaNotaFiscal("Sabão em barra", new BigDecimal(10), new BigDecimal(50));
		List<ItemDaNotaFiscal> items = new ArrayList<ItemDaNotaFiscal>();
		items.add(item1);
		items.add(item2);
		nf.setItems(items);
		
		GeradorDeArquivo gerador = new GeradorDeArquivo("sintegra.xml");
		gerador.abreArquivo();
		gerador.geraRegistro(nf, new RegistroUm());
		gerador.geraRegistro(nf, new RegistroDois());
		gerador.fechaArquivo();
	}

}
