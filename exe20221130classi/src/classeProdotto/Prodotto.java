package classeProdotto;

public class Prodotto {
	
	private int codice;
	private String descrizione;
	private String categoria;
	private String settore;
	private double prezzo;
	
	public Prodotto (int codice, String descrizione, String categoria, String settore, double prezzo){
		this.codice = codice;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.settore = settore;
		this.prezzo = prezzo;
	}
	
	public void stampaProdotto() {
		System.out.println("codice: " +this.codice);
		System.out.println("descrizione: " +this.descrizione);
		System.out.println("categoria: " +this.categoria);
		System.out.println("categoria: " +this.settore);
		System.out.println("prezzo: " +this.prezzo);		
	}
	

}
