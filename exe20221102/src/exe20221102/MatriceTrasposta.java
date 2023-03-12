package exe20221102;

public class MatriceTrasposta {
	
	public static int[][] generaMatrice(int righe, int colonne){
		int[][] matrice;
		matrice = new int[righe][colonne];
		for (int i=0; i<righe; i++) {
			for (int j=0; j<colonne; j++) {
				matrice[i][j]= (int) Math.rint(Math.random()*10);
			}
			
		}
		return matrice;
	}
	
	public static void stampaMatrice(int[][] matrice) {
		int i, j;
		for (i=0; i<matrice.length; i++) {
			for (j=0; j<(matrice[0].length)-1; j++) {
				System.out.format("%3d, ", matrice[i][j]);
			}
			System.out.format("%3d;%n", matrice[i][j]);
		}
	}
	
	public static int[][] traspostaMatrice(int[][] a) {
		int[][] matriceTrasposta;
		matriceTrasposta = new int[a[0].length][a.length];
		for (int i=0; i<a[0].length; i++) {
			for (int j=0; j<a.length; j++) {
				matriceTrasposta[i][j] += a[j][i];
			}
		}
		return matriceTrasposta;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a, a_t;
		a = generaMatrice(3, 3);
		System.out.println("A=");
		stampaMatrice(a);
		a_t=traspostaMatrice(a);
		System.out.println("A^-1=");
		stampaMatrice(a_t);		

	}

}
