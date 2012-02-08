package impostodecorator;

public class IKCV extends TemplateDeImpostoCondicional{

	public IKCV(){
		super();
	}
	
	public IKCV(Imposto outroImposto){
		super(outroImposto);
	}

	public boolean temItemMaiorQue100ReaisNo(Orcamento orcamento){
        for (Item item: orcamento.getItens()){
            if (item.getValor() > 100.0){
                return true;
            }
        }
        return false;
    }

	
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
        System.out.println("IKCV....: 6%");
        return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
        System.out.println("IKCV....: 10%");
        return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() > 500.0 && temItemMaiorQue100ReaisNo(orcamento));
    }

}
