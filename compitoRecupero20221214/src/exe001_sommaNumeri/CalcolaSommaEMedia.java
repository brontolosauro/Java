package exe001_sommaNumeri;


import utilita.input.Tastiera;

public class CalcolaSommaEMedia {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double infLimit = 50;
		double supLimit = 75;
		
		double somma = 0;
		double media;
		double num;
		int qTy=0;
		
		do {
			System.out.println("inserisci un numero (0 per uscire): ");
			num = Tastiera.leggiDouble();
			if (num>=infLimit && num<=supLimit) {
				somma += num;
				qTy++;
			}
		} while (num != 0);
		
		media = somma/qTy;
		
		System.out.println("somma numeri inseriti: "+somma);
		System.out.println("media numeri inseriti: "+media);

	}

}
