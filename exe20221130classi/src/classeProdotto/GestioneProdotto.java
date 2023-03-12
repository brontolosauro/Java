package classeProdotto;

public class GestioneProdotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prodotto pc = new Prodotto(001, "notebook", "informatica", "it", 1000.00);
		Prodotto monitor = new Prodotto(002, "Monitor", "informatica", "elettronica", 299.99);
		System.out.println();
		pc.stampaProdotto();
		System.out.println();
		monitor.stampaProdotto();	

	}

}
