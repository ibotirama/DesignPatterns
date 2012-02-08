package notafiscal.builder;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import notafiscal.observer.ItemNotaFiscal;
import notafiscal.observer.NotaFiscal;

public class NotaFiscalBuilder {
	
	private String razao;
	private List<ItemNotaFiscal> itens;
	private String cnpj;
	private double valorBruto;
	private double imposto;
	private Calendar dataEmissao;
	private String observacao;

	public NotaFiscalBuilder(){
		dataEmissao = GregorianCalendar.getInstance();
		this.itens = new ArrayList<ItemNotaFiscal>();
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
		return new NotaFiscal(razao, cnpj, valorBruto, imposto, dataEmissao, itens, observacao);
	}
	
}
