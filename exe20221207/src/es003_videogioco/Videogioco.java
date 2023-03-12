package es003_videogioco;

import utilita.input.Tastiera;

public class Videogioco {
	
	private String titolo;
	private String piattaforma;
	private String tipo;
	private double prezzo;
	
	
	public Videogioco() {
		System.out.println("Inserisci i dati relativi al gioco:");
		System.out.print("titolo: ");
		this.titolo = Tastiera.leggiString();
		System.out.print("piattaforma: ");
		this.piattaforma = Tastiera.leggiString();
		System.out.print("tipo: ");
		this.tipo = Tastiera.leggiString();
		System.out.print("prezzo: ");
		this.prezzo = Tastiera.leggiDouble();
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getPiattaforma() {
		return piattaforma;
	}
	public void setPiattaforma(String piattaforma) {
		this.piattaforma = piattaforma;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double gerPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public void stampaDettagli() {
		System.out.println(titolo);
		System.out.println(piattaforma);
		System.out.println(tipo);
		System.out.println(prezzo+"€");
	}
	public void sconto10() {
		this.prezzo *= 0.10;
	}

}
