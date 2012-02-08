package notafiscal.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import notafiscal.builder.ItemNotaFiscal;
import notafiscal.builder.NotaFiscal;

public class NotaFiscalBuilder {
	
	private String razao;
	private List<ItemNotaFiscal> itens;
	private String cnpj;
	private double valorBruto;
	private double imposto;
	private Calendar dataEmissao;
	private String observacao;
	private List<AcaoAoCriarNotaFiscal> listaDeAcoes;

	public NotaFiscalBuilder(){
		dataEmissao = GregorianCalendar.getInstance();
		this.itens = new ArrayList<ItemNotaFiscal>();
		this.listaDeAcoes = new ArrayList<AcaoAoCriarNotaFiscal>();
	}
	
	public NotaFiscalBuilder(List<AcaoAoCriarNotaFiscal> acoes){
		this();
		this.listaDeAcoes = acoes;
	}
	
	public NotaFiscalBuilder paraRazaoSocial(String razao){
		this.razao = razao;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj){
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data){
		this.dataEmissao = data;
		return this;
	}

	public NotaFiscalBuilder comObservacao(String observacao){
		this.observacao = observacao;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemNotaFiscal item1) {
		this.itens.add(item1);
		this.valorBruto += item1.getValor();
		this.imposto += item1.getValor() * 0.05;
		
		return this;
	}
	
	public NotaFiscal criar(){
		
		NotaFiscal nf = new NotaFiscal(razao, cnpj, valorBruto, imposto, dataEmissao, itens, observacao);
		
		for (AcaoAoCriarNotaFiscal acao : listaDeAcoes){
			acao.executar(nf);
		}
		
		return nf;
	}
	
}
