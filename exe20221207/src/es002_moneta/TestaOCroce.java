package es002_moneta;

public class TestaOCroce {
	
	private static Moneta miaMoneta = new Moneta();
	private static Giocatore pippoGiocatore = new Giocatore();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lanci = 5;
		for (int i = 0; i < 5; i++) {
			//System.out.println(pippoGiocatore.getScelta());
			miaMoneta.lancia();
			System.out.println(miaMoneta.getFaccia());
			if (miaMoneta.getFaccia() == pippoGiocatore.getScelta()) {
				pippoGiocatore.assegnaPunto();				
			}
			System.out.println(pippoGiocatore.getPunteggio());
			
		}
		if (pippoGiocatore.getPunteggio()>(lanci/2)) {
			System.out.println("hai vinto!");
		}else {
			System.out.println("il banco vince!");
		}
		
	}

}
