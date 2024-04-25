package java_anatomia_classes;

public class Operadores {

	public static void main(String[] args) {
		String nomeCompleto = "Linguagem" + " Java";
		System.out.println(nomeCompleto);

		String concatenacao = "?";
		
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+1; 
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+"1";
		System.out.println(concatenacao);
		
		concatenacao = 1+"1+1+1";
		System.out.println(concatenacao);
		
		concatenacao = "1"+(1+1+1);
		System.out.println(concatenacao);	
		System.out.println("--------");
		
		int numero = 5;
		System.out.println(- numero); //Não afeta a variável principal
		System.out.println(numero);
		numero = - numero;  //Afeta a variável principal
		System.out.println(numero);
		//Agora o número é negativo
		numero = numero * -1;
		System.out.println(numero);
		//Voltou a ser positivo
		System.out.println("--------");
		
		int newNumero = 5;
		System.out.println(++ newNumero); //incremento
		System.out.println(newNumero);
		System.out.println("--------");
		
		boolean variavel = true;
		System.out.println( !variavel);
		System.out.println(variavel); 
		variavel = !variavel;
		System.out.println(variavel);
		System.out.println("--------");
		
		int a=5, b=5;
		boolean resultado = true;
		if (a==b) {
			resultado = true;
		}else {
			resultado = false;
		}
		System.out.println(resultado);
		
		int c=5, d=6;
		boolean novoResultado = c==d ? true : false;
		System.out.println(novoResultado);
		System.out.println("--------");
		
		int numero1 = 4, numero2 = 3;
		boolean ehVerdadeiro = numero1 == numero2;
		System.out.println(numero1+" e igual ao número "+numero2+" ? " +ehVerdadeiro);

		ehVerdadeiro = numero1 > numero2;
		System.out.println(numero1+" é maior "+numero2+" ? " +ehVerdadeiro);
		System.out.println("--------");
	
		String nome1 = "Maria", nome2 = new String("Maria");
		System.out.println("Comparação de Strings ou objetos");
		System.out.println(nome1 == nome2);
		System.out.println(nome2.equals(nome2)); //para objetos ou Strings utiliza-se equals
		System.out.println("--------");
		
		boolean condicao1 = true, condicao2 = false;
		if(condicao1 && condicao2) {
			System.out.println("As condições: "+condicao1+" e "+condicao2+ " são verdadeiras");
		}else if(condicao1 || condicao2){
			System.out.println("Uma das condições: "+condicao1+" e "+condicao2+ " é verdadeira");
		}
		else {
			System.out.println("Fim");
		}

	}

}
