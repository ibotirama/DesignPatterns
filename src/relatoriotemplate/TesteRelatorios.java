package relatoriotemplate;

/**
 *
 * @author Pedro Henrique
 */
public class TesteRelatorios {
    public static void main(String[] args) {
        Banco bp = new Banco("Banco do Pedrao S/A", "Av. Ex-Combatentes, S/N, Centro, Ibotirama-BA", "77-3698-1515", "ouvidoria@bp.com.br");
        bp.adicionaConta(new Conta("Eu mesmo", "1234-5", "5432-1", 100.0));
        
        new ImprimirRelatorioComplexo().imprimir(bp);
        new ImprimirRelatorioSimples().imprimir(bp);
    }
}
