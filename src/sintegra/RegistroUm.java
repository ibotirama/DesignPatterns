package sintegra;

/* 
 * Esta classe apenas ilustra uma forma de fazer, não utilizei exemplos que reflitam
 * registros reais, mesmo porque não tive tempo de estudar os registros :-)
 * */

public class RegistroUm implements RegistroSintegra {

	@Override
	public String geraRegistro(NotaFiscal notaFiscal) {
		StringBuilder sb = new StringBuilder();
		sb.append("<registro numero=1>");
		sb.append("<notafiscal numero="+notaFiscal.getNumero().toString()+">");
		sb.append("<cliente value='"+notaFiscal.getCliente()+"' />");
		sb.append("</notafiscal>");
		sb.append("</registro>");
		return sb.toString();
	}

}
