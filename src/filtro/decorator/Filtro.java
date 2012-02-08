package filtro.decorator;

import java.util.ArrayList;
import java.util.List;

abstract class Filtro {
	private Filtro outroFiltro;
	
	public Filtro(){}
	
	public Filtro(Filtro outroFiltro){
		this.outroFiltro = outroFiltro;
	}
	
    public abstract List<Conta> filtra(List<Conta> contas);
    
    public List<Conta> filtraOutro(List<Conta> contas){
    	if (outroFiltro == null) return new ArrayList<Conta>();
    	else return outroFiltro.filtra(contas);
    }

}