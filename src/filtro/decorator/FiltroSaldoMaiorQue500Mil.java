package filtro.decorator;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMaiorQue500Mil extends Filtro {

	public FiltroSaldoMaiorQue500Mil() {
		super();
	}

	public FiltroSaldoMaiorQue500Mil(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> lista = new ArrayList<Conta>();
		
		for (Conta c : contas){
			if (c.getSaldo() > 500000.0){
				lista.add(c);
			}
		}
		
		contas.removeAll(lista);
		lista.addAll(filtraOutro(contas));

		return lista;
	}

}
