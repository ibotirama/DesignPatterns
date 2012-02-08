package impostodecorator;

public class ICPP extends TemplateDeImpostoCondicional {

	public ICPP(){super();}
	
	public ICPP(Imposto outroImposto){super(outroImposto);}
	
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
        System.out.println("ICPP....: 5%");
        return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
        System.out.println("ICPP....: 7%");
        return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0){
			return true;
		}
		
		return false;
	}

	
}
