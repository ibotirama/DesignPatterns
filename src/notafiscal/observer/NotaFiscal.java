package notafiscal.observer;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	
	private List<ItemNotaFiscal> itens;
	private String razao;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private Calendar dataEmissao;
	private String observacao;

	public NotaFiscal(String razao, String cnpj, double valorBruto, double impostos, Calendar dataEmissao, List<ItemNotaFiscal>itens, String observacao){
		this.razao = razao;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.dataEmissao = dataEmissao;
		this.observacao = observacao;
		this.itens = itens;
	}

	public List<ItemNotaFiscal> getItens() {
		return itens;
	}

	public void setItens(List<ItemNotaFiscal> itens) {
		this.itens = itens;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	
	
}
