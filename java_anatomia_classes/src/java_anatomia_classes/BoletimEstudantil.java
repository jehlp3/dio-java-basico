package java_anatomia_classes;

public class BoletimEstudantil {

	public static void main(String[] args) {
		int mediaFinal = 5;
		if (mediaFinal < 4) {
			System.out.println("REPROVADO");
		} else if (mediaFinal > 4 && mediaFinal < 6) {
			System.out.println("EM RECUPERAÇÃO");
		} else {
			System.out.println("APROVADO!");
		}
		//ctrl+shift+f para indentar no Eclipse
	}
}