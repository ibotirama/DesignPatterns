package impostodecorator;


public class ICMS extends TemplateDeImpostoCondicional {

	public ICMS(){super();}
	
	public ICMS(Imposto outroImposto){
		super(outroImposto);
	}
	
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return 0;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return false;
	}

}
