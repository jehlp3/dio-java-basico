package smartTv;

public class SmartTv {
	
	boolean estaLigada = false;
	int canal = 1;
	int volume = 5;
	
	public void ligarTv() {
		estaLigada = true;
	}
	public void desligarTv() {
		estaLigada = false;
	}
	public void aumentarVolumeTv() {
		volume++;
		System.out.println("O volume foi aumentado para "+volume);
	}
	public void diminuirVolumeTv() {
		volume--;
		System.out.println("O volume foi diminuído para "+volume);
	}
	public void aumentarCanalTv() {
		canal--;
		System.out.println("O canal foi alterado para "+canal);
	}
	public void diminuirCanalTv() {
		canal--;
		System.out.println("O canal foi alterado para "+canal);
	}
	public void mudarCanalTvPara(int novoCanal) {
		canal = novoCanal;
		System.out.println("O canal foi alterado para "+canal);
	}
	
}
