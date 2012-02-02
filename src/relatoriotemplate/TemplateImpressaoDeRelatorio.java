package relatoriotemplate;

public abstract class TemplateImpressaoDeRelatorio implements ImprimirRelatorio{
    
    @Override
    public void imprimir(Banco banco){
        imprimirCabecalho(banco);
        imprimirCorpo(banco);
        imprimirRodape(banco);
    }
    
    protected abstract void imprimirCabecalho(Banco banco);
    protected abstract void imprimirCorpo(Banco banco);
    protected abstract void imprimirRodape(Banco banco);    
}
