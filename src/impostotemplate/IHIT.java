package impostotemplate;

public class IHIT extends TemplateDeImpostoCondicional{

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        System.out.println("IHIT....: 1% * nItens");
        return orcamento.getValor() * (orcamento.getItens().size() * 0.01);
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        System.out.println("IHIT....: 13% + R$ 100.00");
        return (orcamento.getValor() * 0.13) + 100.0;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        for (Item item1 : orcamento.getItens()){
            int count = 0;
            for (Item item2 : orcamento.getItens()){
                if (item1.getNome() == item2.getNome()){
                    count++;
                }
            }
            System.out.println(item1.getNome()+" = "+count);
            if (count >= 2) return true; else count = 0; 
        }
        
        return false;
    }
    
}
