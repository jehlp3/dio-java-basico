package controle_fluxos;

public class CondicionalEncadeada {

	public static void main(String[] args) {
		// + de 2 condições

		float nota = (float) 8;
		System.out.println("Nota do aluno: " + nota);

		if (nota >= 7) {
			System.out.println("Aprovado!");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Em recuperação");
		} else {
			System.out.println("Reprovado");
		}

	}
}
