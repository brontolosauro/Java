package exe20221026;

public class CostoTelefonata {
	
	static int calcolaDurataImponibile(int min, int sec) {
		int totSec;
		int totMin;
		
		totSec = sec + min*60 - 30;
		totMin = totSec / 60;
		//System.out.println(totMin);
		if (totSec%60 != 0) {
			totMin +=1;
		}
		
		
		return totMin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int durataMinuti = 4;
		int durataSecondi = 23;
		int durataImponibile; // in minuti
		float costoChiamata;
		float scattoRisposta = 0.15f;
		float costoMinuto = 0.24f;
		
		durataImponibile=calcolaDurataImponibile(durataMinuti, durataSecondi);
		costoChiamata = scattoRisposta + (durataImponibile)*costoMinuto;
		
		System.out.print("Costo della chiamata: ");
		System.out.format("%.2f%n", costoChiamata);
				
				

	}

}
