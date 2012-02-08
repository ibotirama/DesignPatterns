package filtro.decorator;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMenorQue100 extends Filtro {

	public FiltroSaldoMenorQue100() {
		super();
	}

	public FiltroSaldoMenorQue100(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> lista = new ArrayList<Conta>();
		
		for (Conta c : contas){
			if (c.getSaldo() < 100.0){
  			  lista.add(c);
			}
		}
		
		contas.removeAll(lista);
		lista.addAll( filtraOutro(contas) );

		return lista;
	}

}
