package exe20221116_inputTastiera;

import utilita.array.Vettore;
import utilita.input.Tastiera;

public class Es005_PariDispariVettore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v;
		int nElementi=10;
		v = Vettore.generaInt1_20(nElementi);
		Vettore.stampa(v);
		int pari=0;
		int dispari=0;
		for (int item : v) {
			if (item%2 == 0) {
				pari++;
			}else {
				dispari++;
			}
		}
		System.out.print("inserisci un numero intero: ");
		int scelta = Tastiera.leggiInt();
		boolean trovato = false;
		for (int item : v) {
			if (item == scelta) {
				trovato = true;
			}
		}
		if (trovato) {
			System.out.println("il numero inserito è presente nel vettore");
		}else {
			System.out.println("il numero inserito non è presente nel vettore");
		}

	}

}
