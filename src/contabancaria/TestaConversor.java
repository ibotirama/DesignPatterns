package contabancaria;

public class TestaConversor {
	public static void main(String[] args) {
		Conta conta = new Conta("Conta Salário", 1000.0);
		Requisicao req1 = new Requisicao(Formato.PORCENTO, conta);
		Requisicao req2 = new Requisicao(Formato.CSV, conta);
		Requisicao req3 = new Requisicao(Formato.XML, conta);
		
		Conversor conv1 = new ConversorPorcento();
		Conversor conv2 = new ConversorCsv();
		Conversor conv3 = new ConversorXml();
		Conversor semConversao = new SemConversao();
		conv1.setProximo(conv2);
		conv2.setProximo(conv3);
		conv3.setProximo(semConversao);

		
		System.out.println("Converter PORCENTO");
		System.out.println(conv1.converter(req1));
		System.out.println("Converter CSV");
		System.out.println(conv1.converter(req2));
		System.out.println("Converter XML");
		System.out.println(conv1.converter(req3));

	}

}
