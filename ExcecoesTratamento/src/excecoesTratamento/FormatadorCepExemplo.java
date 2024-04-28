package excecoesTratamento;

public class FormatadorCepExemplo {

	public static void main(String[] args) {
		
		try {
			String cepFormatado = formatarCep("1234568");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			System.out.println("O cep não corresponde com as regras de negócio");
		}
		

	}
	static String formatarCep(String cep) throws CepInvalidoException{
		if(cep.length() != 8)
			throw new CepInvalidoException();
		
		return "12345-678";
	}

}
