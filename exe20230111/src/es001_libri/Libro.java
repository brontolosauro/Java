package es001_libri;

public class Libro {
	
	private String titolo;
	private String autore;
	private int noPagine;
	
	public Libro() {
		
	}
	public Libro(String titolo, String autore, int noPagine) {
		//super();
		this.titolo = titolo;
		this.autore = autore;
		this.noPagine = noPagine;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
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
	
	
	

}
