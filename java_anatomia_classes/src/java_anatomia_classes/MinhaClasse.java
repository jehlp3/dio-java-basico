package java_anatomia_classes;

public class MinhaClasse {
	public static void main (String [] args){
		/* método main
		 * void não retorna nada apenas executa
		 * main - nome do método
		 * () parâmetros
		 * String - tipo
		 * [] determina um array
		 * args - parâmetros ou argumentos 
		 * {} corpo do método*/
	
		System.out.println("Hello World");
		
		final String BR = "Brasil"; //final define que a variável não pode ser alterada
		
		String meuNome = "Jessica";
		int anoDeFabricacao = 2022;
		boolean ehVerdadeiro = true;
		
		String primeiroNome = "Jessica";
		String segundoNome = "Peixoto";
		String nomeCompleto = nomeCompleto(primeiroNome , segundoNome);
		
		System.out.println(nomeCompleto);
		
	}
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
		
	}
	
	
}
