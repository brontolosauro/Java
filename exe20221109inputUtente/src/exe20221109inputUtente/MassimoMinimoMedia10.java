package exe20221109inputUtente;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import utilita.array.*;

public class MassimoMinimoMedia10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int[] numeriUtente;
		numeriUtente = new int[10];
		for (int i=0; i<numeriUtente.length; i++) {
			System.out.print("inserisci un numero: ");
			try {
				String numLetto = tastiera.readLine();
				numeriUtente[i] = Integer.valueOf(numLetto).intValue();
			}
			catch (IOException e) {
				// TODO: handle exception
				System.out.println("errore input");
				return;
			}
			System.out.println("hai inserito: "+numeriUtente[i]);
		}
		Vettore.stampa(numeriUtente);
		System.out.println("valore massimo: "+Vettore.massimo(numeriUtente));
		System.out.println("valore minimo: "+Vettore.minimo(numeriUtente));
		System.out.println("media elementi: "+Vettore.media(numeriUtente));
	}

}
