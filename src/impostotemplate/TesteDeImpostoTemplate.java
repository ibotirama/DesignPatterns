package impostotemplate;

public class TesteDeImpostoTemplate {

	public static void main(String[] args) {
		Orcamento orca = new Orcamento();
                orca.adicionaItem(new Item("Sabao", 100.0));
                orca.adicionaItem(new Item("Refri", 200.0));

                ICPP icpp = new ICPP();
                IKCV ikcv = new IKCV();
                IHIT ihit = new IHIT();
                
                System.out.println("ICPP.....:"+icpp.calcula(orca));
                System.out.println("IKCV.....:"+ikcv.calcula(orca));
                System.out.println("IHIT.....:"+ihit.calcula(orca));
	}

}
