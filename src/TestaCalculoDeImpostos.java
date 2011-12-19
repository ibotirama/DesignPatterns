
public class TestaCalculoDeImpostos {
	
	public static void main(String[] args) {
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(5000.0);
		
		new CalculadoraDeImpostos().realizaCalculo(orcamento, iccc);
	}
}
