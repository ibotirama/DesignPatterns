package sintegra;

public class RegistroDois implements RegistroSintegra {

	@Override
	public String geraRegistro(NotaFiscal notaFiscal) {
		StringBuilder sb = new StringBuilder();
		sb.append("<registro numero=2>");
		for (ItemDaNotaFiscal item : notaFiscal.getItems()){
			sb.append("<item numero="+item.getProduto()+">");
			sb.append("<total value='"+item.getTotal().toString()+"' />");
			sb.append("</item>");
		}
		sb.append("</registro>");
		return sb.toString();
	}

}
