package impostodecorator;

public abstract class Imposto {
	
	private Imposto outroImposto;

	public Imposto(){}
	
	public Imposto(Imposto outroImposto){
		this.outroImposto = outroImposto;
	}
	
	protected final double calculoDoOutroImposto(Orcamento orcamento) {
		if (this.outroImposto == null) return 0;
		
		return outroImposto.calcula(orcamento);
	}
	
	public abstract double calcula(Orcamento orcamento);
}
