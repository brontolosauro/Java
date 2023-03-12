package exe002_libro;

public class Libro {
	
	private String titolo;
	private double prezzo;
	private String autore;
	private int noPagine;
	
	public Libro() {
		// TODO Auto-generated constructor stub
		
	}	

	public Libro(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
	}
	
	public Libro(String titolo, double prezzo, String autore, int noPagine) {
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.autore = autore;
		this.noPagine = noPagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getNoPagine() {
		return noPagine;
	}

	public void setNoPagine(int noPagine) {
		this.noPagine = noPagine;
	}
	
	public void infoLibro() {
		System.out.println("titolo: " + this.titolo);
		System.out.println("autore: " + this.autore);
		System.out.println("numero pagine: " + this.noPagine);
		System.out.println("prezzo: " + this.prezzo);
		
	}
	
	

}
