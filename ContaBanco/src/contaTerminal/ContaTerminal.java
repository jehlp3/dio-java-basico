package contaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

			System.out.println("Digite o seu nome completo: ");
			String nomeCliente = scanner.nextLine();
			
			System.out.println("Por favor, digite o número da Conta: ");
			int numConta = scanner.nextInt();
			
			System.out.println("Digite o número da Agência no formato xxx-x: ");
			String numAgencia = scanner.next();
			

			System.out.println("Digite o valor do depósito bancário: ");
			float saldo = scanner.nextFloat();
			
			System.out.println("Olá, "+nomeCliente+"! obrigado(a) por criar uma conta em nosso banco; sua agência é "+numAgencia+", conta "+numConta+" e seu saldo R$ "+saldo+" já está disponível para saque.");

		}

}
