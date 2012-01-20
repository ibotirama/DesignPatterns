package relatoriotemplate;

public class ImprimirRelatorioSimples extends TemplateImpressaoDeRelatorio{

    @Override
    protected void imprimirCabecalho(Banco banco) {
        System.out.println("Nome...: " + banco.getNome());
    }

    @Override
    protected void imprimirCorpo(Banco banco) {
        for (Conta c : banco.getContas()){
            System.out.println(c.getTitular()+" - "+c.getSaldo());
        }
    }

    @Override
    protected void imprimirRodape(Banco banco) {
        System.out.println("Telefone...: "+banco.getTelefone());
    }
    
}
