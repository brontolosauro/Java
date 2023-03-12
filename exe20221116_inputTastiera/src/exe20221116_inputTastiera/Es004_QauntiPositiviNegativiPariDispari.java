package exe20221116_inputTastiera;

import utilita.input.Tastiera;

public class Es004_QauntiPositiviNegativiPariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dummy;
		int pari = 0;
		int dispari = 0;
		int positivi = 0;
		int negativi = 0;
		System.out.print("inserisci un numero intero[0 per terminare]: ");
		dummy = Tastiera.leggiInt();
		
		while (dummy!=0) {// ha un un proprio scope!!!!	
			
			
			if (dummy>0) {
				positivi++;
			}else {
				negativi++;
			}
			if ((dummy%2) == 0) {
				pari++;
			}else {
				dispari++;
			}	
			System.out.print("inserisci un numero [0 per terminare]: ");
			dummy = Tastiera.leggiInt();
		}
		System.out.println("pari: "+ (pari));
		System.out.println("dispari: "+ (dispari));
		System.out.println("positivi: "+ positivi);
		System.out.println("negativi: "+ (negativi));
		//System.out.println(2.2%2);

	}

}
