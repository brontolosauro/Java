package utilita.input;

import java.io.InputStreamReader; 
import java.io.BufferedReader;
import java.io.IOException;

public class Tastiera {
	public static int readInt () {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int numero;
		try {
			String numLetto = tastiera.readLine();
			numero = Integer.valueOf(numLetto).intValue();
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("errore input");
			return 1;
		}
		//System.out.println("hai inserito: "+numeriUtente[i]); 
		return numero;
	}

}
