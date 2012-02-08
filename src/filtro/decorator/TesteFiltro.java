package filtro.decorator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TesteFiltro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		
		Calendar hoje = GregorianCalendar.getInstance();
		Calendar anoPassado = GregorianCalendar.getInstance();
		anoPassado.set(GregorianCalendar.YEAR, 2011);
		
		contas.add(new Conta("Pedro", "0104-1 Ibotirama", "1234-4 Barreiras", 11, anoPassado));
		contas.add(new Conta("Humberto", "1234-1 Barreiras", "4321-1234 Barreiras", 1000000.0, hoje));
		contas.add(new Conta("Lucas", "2133-1 Barreiras", "5222-12 Barreiras", 500.0, hoje));
		contas.add(new Conta("Paulo", "2234-1 Barreiras", "5321-12 Barreiras", 1000000.0, hoje));
		contas.add(new Conta("Diego", "2233-1 Barreiras", "5322-13 Barreiras", 500.0, anoPassado));
		
		Filtro filtro = new FiltroSaldoMenorQue100(new FiltroSaldoMaiorQue500Mil(new FiltroDataMesCorrente()));

		for (Conta c : filtro.filtra(contas)){
			System.out.println("Conta : "+c);
		}
	}

}
