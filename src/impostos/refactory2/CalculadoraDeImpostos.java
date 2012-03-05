package impostos.refactory2;

public class CalculadoraDeImpostos {
	
	public static double realizaCalculo(Orcamento orcamento, Imposto imposto){
		return imposto.calcula(orcamento);
	}
	
}
