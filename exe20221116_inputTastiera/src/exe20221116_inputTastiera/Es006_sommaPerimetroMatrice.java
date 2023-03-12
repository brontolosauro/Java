package exe20221116_inputTastiera;

import utilita.array.Matrice;

public class Es006_sommaPerimetroMatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int righe=5;
		int colonne=5;
		int[][] mtx = Matrice.generaInt(righe, colonne);
		Matrice.stampa(mtx);
		int somma=0;
		for (int i=0; i<colonne; i++) {
			somma += mtx[0][i];
		}
		for (int i=1; i<righe; i++) {
			somma += mtx[i][colonne-1];
		}
		for (int i=0; i<colonne-1; i++) {
			somma += mtx[righe-1][i];
		}
		for (int i=1; i<righe-1; i++) {
			somma += mtx[i][0];
		}
				
		System.out.println("somma elementi perimetro: "+somma);
		
		
		
		

	}

}
