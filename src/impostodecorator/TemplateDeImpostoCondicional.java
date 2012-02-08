package impostodecorator;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	public TemplateDeImpostoCondicional(){super();}
	public TemplateDeImpostoCondicional(Imposto outroImposto)
	{
		super(outroImposto);
	}
	
	
	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
		else
		{
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
