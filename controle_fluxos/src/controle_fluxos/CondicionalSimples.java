package controle_fluxos;

public class CondicionalSimples {

	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 10.0;
		System.out.println("Saldo da conta:    " + saldo);
		System.out.println("Valor solicitado: (" + valorSolicitado + ")");

		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Saldo atualizado:  " + saldo);
		}
		/*
		 * else { System.out.println("Saldo insuficiente para o valor solicitado."); }
		 */
	}

}
