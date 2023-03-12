package exe20221116_inputTastiera;

import java.util.*;
import utilita.input.Tastiera;

public class MassimoDi3Numeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> nmbr = new Vector<Integer>();
		int inserimenti = 3;
		for (int i=0; i<inserimenti; i++) {
			System.out.print("inserisci un numero: ");
			nmbr.add(Tastiera.leggiInt());
		}
		System.out.println("massimo: "+Collections.max(nmbr));
		
	}

}
