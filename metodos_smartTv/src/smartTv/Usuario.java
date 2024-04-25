package smartTv;

public class Usuario {

	public static void main(String[] args) throws Exception{

		SmartTv smartTv = new SmartTv();
		System.out.println("TV ligada? "+smartTv.estaLigada);
		System.out.println("Canal atual: "+smartTv.canal);
		System.out.println("Volume atual: "+smartTv.volume);
		
		smartTv.ligarTv();
		System.out.println("Novo status -> TV ligada? "+smartTv.estaLigada);
		
		smartTv.desligarTv();
		System.out.println("Novo status -> TV ligada? "+smartTv.estaLigada);
		
		smartTv.aumentarVolumeTv();
		smartTv.aumentarVolumeTv();
		smartTv.aumentarVolumeTv();
		System.out.println("Novo volume da TV -> "+smartTv.volume);
		
		smartTv.diminuirVolumeTv();
		smartTv.diminuirVolumeTv();
		System.out.println("Novo volume da TV -> "+smartTv.volume);
		
		smartTv.mudarCanalTvPara(7);
		System.out.println("Canal atual "+smartTv.canal);
	}

}
