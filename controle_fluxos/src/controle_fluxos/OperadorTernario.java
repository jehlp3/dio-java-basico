package controle_fluxos;

public class OperadorTernario {

	public static void main(String[] args) {
		int nota = 4;

		String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Em Recuperação" : "Reprovado";
		System.out.println(resultado);

	}

}
