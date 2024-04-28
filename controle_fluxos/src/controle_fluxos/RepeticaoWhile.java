package controle_fluxos;

import java.util.concurrent.ThreadLocalRandom;

public class RepeticaoWhile {

	public static void main(String[] args) {
		// while, enquanto uma condição for válida o programa é executado.

		double mesada = 50.0;
		while (mesada > 0) {
			double valorDoce = valorAleatorio();
			
			  if (valorDoce > mesada) { 
				  valorDoce = mesada;
			  }
			 
			System.out.println("Doce de valor: R$ " + String.format("%.2f", valorDoce) + " adicionado ao carrinho");
			mesada = mesada - valorDoce;
		}
		System.out.println("Mesada: " + mesada);
		System.out.println("Joãozinho gastou toda a sua mesada em doces!");

	}

	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8); // Valor aleatório entre 2 e 8
	}
}
