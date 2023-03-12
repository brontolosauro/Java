package es002_classeMatematica;

import utilita.input.Tastiera;

public class MenuMatematica {
	
	public static void stampaMenu() {
		System.out.println("Scegliere una delle seguenti opzioni: ");
		System.out.println("1) massimo (a,b)");
		System.out.println("2) minimo (a,b)");
		System.out.println("3) fattoriale n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stampaMenu();
		//int scelta;
		//scelta = Tastiera.leggiInt();
		switch (Tastiera.leggiInt()) {
		case 1: {
			int a, b;
			System.out.print("inserisci a: ");
			a=Tastiera.leggiInt();
			System.out.print("inserisci b: ");
			b=Tastiera.leggiInt();
			System.out.println("il maggiore dei due è: " +Matematica.max(a, b));		
			break;
		}
		case 2: {
			int a, b;
			System.out.print("inserisci a: ");
			a=Tastiera.leggiInt();
			System.out.print("inserisci b: ");
			b=Tastiera.leggiInt();
			System.out.println("il minore dei due è: " +Matematica.min(a, b));		
			break;
		}
		case 3: {
			int n;
			System.out.print("inserisci n: ");
			n=Tastiera.leggiInt();
			System.out.println("n!= " +Matematica.fattoriale(n));		
			break;
		}

		}

	}

}
