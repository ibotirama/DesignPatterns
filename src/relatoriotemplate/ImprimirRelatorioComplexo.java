package relatoriotemplate;

import java.util.Calendar;

/**
 *
 * @author Pedro Henrique
 */
public class ImprimirRelatorioComplexo extends TemplateImpressaoDeRelatorio{

    @Override
    protected void imprimirCabecalho(Banco banco) {
        System.out.println("Nome...: " + banco.getNome()+", Endereço...: "+banco.getEndereco()+", Telefone...: "+banco.getTelefone());
    }

    @Override
    protected void imprimirCorpo(Banco banco) {
        for (Conta c : banco.getContas()){
            System.out.println(c.getTitular()+" - "+c.getAgencia()+" - "+c.getNumero()+" - "+c.getSaldo());
        }
    }

    @Override
    protected void imprimirRodape(Banco banco) {
        System.out.println("e-mail...: " + banco.getEmail()+", Data...: "+Calendar.getInstance().getTime());
    }
    
}
