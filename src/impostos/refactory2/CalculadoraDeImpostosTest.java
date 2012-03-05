package impostos.refactory2;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraDeImpostosTest {
	private Orcamento orcamento;
	private Imposto imposto;
	
	@Before
	public void setaValoresNasVariaveis(){
		orcamento = new Orcamento(5000.0);
		imposto = new ICCC();
	}
	
	
	@Test
	public void RealizaCalculo() {
		double valor = CalculadoraDeImpostos.realizaCalculo(orcamento, imposto);
		assertEquals(430.0, valor, 2);
	}

}