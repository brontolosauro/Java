package exe20221102;

public class ProdottoMatrici {
	
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
	
	public static int[][] prodottoMatrici(int[][] a, int[][] b) {
		int[][] matriceProdotto;
		matriceProdotto = new int[a.length][b[0].length];
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b[0].length; j++) {
				for (int k=0; k<a[0].length; k++) {
					matriceProdotto[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		return matriceProdotto;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a, b, p;
		//int i,j;
		//int [][] a = new int [3][2];
		a = generaMatrice(3, 2);
		/*
		for (i=0; i<3; i++) {
			for (j=0; j<2; j++) {
				a[i][j]= (int) Math.rint(Math.random()*100);
			}
			
		}*/
		System.out.println("A=");
		stampaMatrice(a);
		System.out.println("B=");
		b = generaMatrice(2, 3);
		stampaMatrice(b);
		System.out.println("AxB=");
		p = prodottoMatrici(a, b);
		stampaMatrice(p);

	}

}
