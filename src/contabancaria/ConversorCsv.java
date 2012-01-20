package contabancaria;

import java.util.Map;

public class ConversorCsv extends ConversorAbstrato implements Conversor {

	private Conversor proximo;
	
	@Override
	public String converter(Requisicao requisicao) {
		if (requisicao.getFormato() == Formato.CSV){
			StringBuilder sb = new StringBuilder();
			for (Map.Entry<String, String> entry : getAtributos(requisicao).entrySet()){
				sb.append(entry.getKey()+","+entry.getValue()+",");
			}
			
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
