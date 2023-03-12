package es003_gestioneGarage;

public class Automobile {
	private String marca;
	private String modello;
	private double carburanteRimanente;
	
	//costruttore
	
	public Automobile() {
		this.carburanteRimanente=10;
	}
	
	//setter & getter
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getModello() {
		return modello;
	}
	public void setCarburanteRimanente(double carburanteRimanente) {
		this.carburanteRimanente = carburanteRimanente;
	}
	public double getCarburanteRimanente() {
		return carburanteRimanente;
	}
	
	//metodi generici
	
	public void stampaAutomobile() {
		System.out.println("marca: "+ this.marca);
		System.out.println("modello: "+ this.modello);
		System.out.println("livello carburante: "+ this.carburanteRimanente);
	}
	

}
