package sintegra;

public class GeradorDeArquivo {
	private String nome;
	
	public GeradorDeArquivo(String nome) {
		super();
		this.nome = nome;
	}

	public void abreArquivo(){
		System.out.println("<abre sintegra="+nome+">");
	}
	
	public void geraRegistro(NotaFiscal notaFiscal, RegistroSintegra registro){
		System.out.println(registro.geraRegistro(notaFiscal));
	}
	
	public void fechaArquivo(){
		System.out.println("<fecha sintegra>");
	}
	
	
}
