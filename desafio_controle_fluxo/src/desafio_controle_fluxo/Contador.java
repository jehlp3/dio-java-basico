package desafio_controle_fluxo;

import java.util.Scanner;
import java.util.Locale;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		int parametroUm = 0;
		int parametroDois = 0;

		boolean parametrosValidados = false;

		do {
			try {
				if (!parametrosValidados) {
					System.out.println("Digite o primeiro parâmetro:");
					parametroUm = terminal.nextInt();

					parametrosValidados = true;
				}

				System.out.println("Digite o segundo parâmetro:");
				parametroDois = terminal.nextInt();

				if (parametroDois > parametroUm) {
					break;
				} else {
					throw new ParametrosInvalidosException();
				}

			} catch (Exception exception) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro. Tente novamente:");
			}
		} while (true); // Loop enquanto o parametroDois for menor que parametroUm

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}

		terminal.close(); //Boa prática - encerrar o scanner para liberação de recursos
	}

	static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois > parametroUm) {
			int contagem = parametroDois - parametroUm;
			int auxPosicao = 1;
			for (int i = parametroUm; i < parametroDois; i++) {
				System.out.println("Imprimindo o " + auxPosicao + "º número:  " + i);
				auxPosicao++;
			}
			return contagem;
		} else {
			throw new ParametrosInvalidosException();
		}
	}
}
