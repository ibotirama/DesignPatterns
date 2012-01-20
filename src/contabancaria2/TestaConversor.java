package contabancaria2;

public class TestaConversor {
	public static void main(String[] args) {
		Conta conta = new Conta("Conta Salário", 1000.0);
		Requisicao req1 = new Requisicao(Formato.PORCENTO, conta);
		Requisicao req2 = new Requisicao(Formato.CSV, conta);
		Requisicao req3 = new Requisicao(Formato.XML, conta);
		
		Conversor semConversao = new SemConversao();
		Conversor conv3 = new ConversorXml(semConversao);
		Conversor conv2 = new ConversorCsv(conv3);
		Conversor conv1 = new ConversorPorcento(conv2);
		
		System.out.println("Converter PORCENTO");
		System.out.println(conv1.converter(req1));
		System.out.println("Converter CSV");
		System.out.println(conv1.converter(req2));
		System.out.println("Converter XML");
		System.out.println(conv1.converter(req3));

	}

}
