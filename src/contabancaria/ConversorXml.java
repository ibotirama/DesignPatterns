package contabancaria;

import java.util.Map;

public class ConversorXml extends ConversorAbstrato implements Conversor{

	private Conversor proximo;
	
	@Override
	public String converter(Requisicao requisicao) {
		if (requisicao.getFormato() == Formato.XML){
			StringBuilder sb = new StringBuilder();
			sb.append("<arquivoxml>");
			for (Map.Entry<String, String> entry : getAtributos(requisicao).entrySet()){
				sb.append("<"+entry.getKey()+">"+entry.getValue()+"</"+entry.getKey()+">");
			}
			sb.append("</arquivoxml>");
			
			return sb.toString();
		}
		else
		{
			return proximo.converter(requisicao);
		}
	}

	public void setProximo(Conversor proximo) {
		this.proximo = proximo;
	}
}
