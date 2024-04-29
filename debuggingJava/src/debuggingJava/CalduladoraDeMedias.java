package debuggingJava;

import java.util.Iterator;
import java.util.Scanner;

public class CalduladoraDeMedias {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

		double media = calculadoraMediaDaTurma(alunos, scan);

		System.out.println("Média da turma " +  media);
	}

	public static double calculadoraMediaDaTurma(String[] alunos, Scanner scanner) {
		double soma = 0;
		for (String aluno : alunos) {
			System.out.println("Nota do aluno:"+ aluno);
			double nota = scanner.nextDouble();
			soma += nota;
		}
		return soma / alunos.length;
	}
}
