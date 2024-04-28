package controle_fluxos;

public class RepeticaoForArrays {

	public static void main(String[] args) {
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("O(a) aluno(a) no índice " + i + " é: " + alunos[i]);
		}

		// for/each (forma abreviada)
		for (String aluno : alunos) {
			System.out.println("Nome do aluno: " + aluno);

		}

	}

}
