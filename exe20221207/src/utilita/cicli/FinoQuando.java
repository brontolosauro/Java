package utilita.cicli;

import utilita.input.Tastiera;

public class FinoQuando {
	
	public static boolean continuareS() {
		System.out.print("continuare?[S/n]");
		switch (Tastiera.leggiString().toLowerCase()) {
		case "n": {
			return false;
		}
		default:
			return true;
		}
	}

}
