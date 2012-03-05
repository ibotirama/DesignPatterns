package impostos.refactory2;

public class TestaCalculoDeImpostos {
	
	public static void main(String[] args) {
		Imposto iccc = new ICCC();
		Orcamento orcamento = new Orcamento(5000.0);
		
		System.out.println(CalculadoraDeImpostos.realizaCalculo(orcamento, iccc));
	}
}
