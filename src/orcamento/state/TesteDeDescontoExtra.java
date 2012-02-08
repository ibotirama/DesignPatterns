package orcamento.state;

public class TesteDeDescontoExtra {
	
	public static void main(String args[])
	{
		Orcamento reforma = new Orcamento();
		reforma.adicionaItem(new Item("Um Item qualquer", 500.0));
		
		reforma.aplicaDescontoExtra();
		
		System.out.println("Valor ..... : "+reforma.getValor()+", Desconto .... : "+reforma.getDesconto());
		
		reforma.aprova();

		reforma.aplicaDescontoExtra();
		
		System.out.println("Valor ..... : "+reforma.getValor()+", Desconto .... : "+reforma.getDesconto());
		
		reforma.finaliza();

		reforma.aplicaDescontoExtra();
		
		System.out.println("Valor ..... : "+reforma.getValor()+", Desconto .... : "+reforma.getDesconto());
	}
	
}
