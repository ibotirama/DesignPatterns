package impostotemplate;

public class IKCV extends TemplateDeImpostoCondicional{

    public boolean temItemMaiorQue100ReaisNo(Orcamento orcamento){
        for (Item item: orcamento.getItens()){
            if (item.getValor() > 100.0){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        System.out.println("IKCV....: 6%");
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        System.out.println("IKCV....: 10%");
        return orcamento.getValor() * 0.10;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() > 500.0 && temItemMaiorQue100ReaisNo(orcamento));
    }
    
}
