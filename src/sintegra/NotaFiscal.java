package sintegra;

import java.util.List;

public class NotaFiscal {
	private Integer numero;
	private String cliente;
	private List<ItemDaNotaFiscal> items;

	public List<ItemDaNotaFiscal> getItems() {
		return items;
	}

	public void setItems(List<ItemDaNotaFiscal> items) {
		this.items = items;
	}

	public NotaFiscal(Integer numero, String Cliente){
		this.setNumero(numero);
		this.setCliente(Cliente);
		
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCliente() {
		return cliente;
	}
}
