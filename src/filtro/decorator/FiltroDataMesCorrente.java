package filtro.decorator;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class FiltroDataMesCorrente extends Filtro {
	
	public FiltroDataMesCorrente() {
		super();
	}

	public FiltroDataMesCorrente(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> lista = new ArrayList<Conta>();
		
		int mes = new GregorianCalendar().get(GregorianCalendar.MONTH);
		int ano = new GregorianCalendar().get(GregorianCalendar.YEAR);
		
		for (Conta c : contas){
			if (c.getDataAbertura().get(GregorianCalendar.MONTH) == mes &&
				c.getDataAbertura().get(GregorianCalendar.YEAR) == ano){
					lista.add(c);
			}
		}
		
		contas.removeAll(lista);
		lista.addAll(filtraOutro(contas));
		
		return lista;
	}

}
