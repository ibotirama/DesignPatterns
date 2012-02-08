package conta.state;

public class TesteConta {
	public static void main(String args[]){
		Conta conta = new Conta("1234-5", "5432-1", 100.0);
		
		System.out.println(conta);
		
		conta.deposita(100.0);
		System.out.println("Depósito.: 100.0");
		
		System.out.println(conta);
		
		conta.saque(250.0);
		System.out.println("Saque....: 250.0");
		
		System.out.println(conta);

		conta.saque(250.0);
		System.out.println("Saque....: 250.0");
		
		System.out.println(conta);

		conta.saque(50.0);
		System.out.println("Saque....:  50.0");
		
		System.out.println(conta);
	}
	
}
