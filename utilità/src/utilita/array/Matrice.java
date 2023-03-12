package utilita.array;

public class Matrice {
	
	public static int[][] generaInt(int righe, int colonne){
		int[][] matrice;
		matrice = new int[righe][colonne];
		for (int i=0; i<righe; i++) {
			for (int j=0; j<colonne; j++) {
				matrice[i][j]= (int) Math.rint(Math.random()*10);
			}
			
		}
		return matrice;
	}
	
	public static void stampa(int[][] matrice) {
		int i, j;
		for (i=0; i<matrice.length; i++) {
			System.out.print("| ");
			for (j=0; j<(matrice[0].length)-1; j++) {
				System.out.format("%3d, ", matrice[i][j]);
			}
			System.out.format("%3d |%n", matrice[i][j]);
		}
	}

}
