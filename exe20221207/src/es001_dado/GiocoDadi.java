package es001_dado;

import utilita.cicli.FinoQuando;

public class GiocoDadi {
	
	private static Dado mioDado = new Dado();
	private static Dado dadoPC = new Dado();
	
	public static void vincitore() {
		if (mioDado.getFaccia() > dadoPC.getFaccia()) {
			System.out.println("mioDado vince!");			
		}else if (mioDado.getFaccia()==dadoPC.getFaccia()) {
			System.out.println("è un pareggio!");
		}else {
			System.out.println("dadoPC vince!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continua = true;
		while (continua) {
			System.out.println("lancio i dadi...");
			mioDado.lancia();
			dadoPC.lancia();
			System.out.print("mioDado: ");
			mioDado.stampaFaccia();
			System.out.print("dadoPC: ");
			dadoPC.stampaFaccia();
			vincitore();
			continua = FinoQuando.continuareS();
		}
		

	}

}
