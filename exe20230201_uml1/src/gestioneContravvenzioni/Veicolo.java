package gestioneContravvenzioni;

import utilita.input.Tastiera;

public class Veicolo {
	private String targa;
	private int potenza;
	private String tipo;
	
	public Veicolo() {
		System.out.print("inserisci targa veicolo: ");
		this.setTarga(Tastiera.leggiString());
		System.out.print("inserisci potenza: ");
		this.setPotenza(Tastiera.leggiInt());
		System.out.print("inserisci tipo veicolo: ");
		this.setTipo(Tastiera.leggiString());
	}
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public int getPotenza() {
		return potenza;
	}
	public void setPotenza(int potenza) {
		this.potenza = potenza;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Veicolo [targa=" + targa + ", potenza=" + potenza + ", tipo=" 
			+ tipo + "]";
	}
	
	
	

}
