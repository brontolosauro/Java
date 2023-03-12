package gestioneContravvenzioni;

import java.util.Vector;

import utilita.input.Tastiera;

public class Vigile {
	//---ATTRIBUTI---
	private String nome;
	private String matricola;
	private Vector<Contravvenzione> listaContravvenzioni;
	
	//---COSTRUTTORI---
	public Vigile() {
		System.out.println("---Inserimento dati Vigile");
		System.out.print("inserisci il nome del vigile: ");
		this.setNome(Tastiera.leggiString());
		System.out.print("inserisci matricola: ");
		this.setMatricola(Tastiera.leggiString());
		listaContravvenzioni = new Vector<Contravvenzione>();		
	}
	
	//---METODI---
	//---come da specifiche UML---
	public void effettuaContravvenzione() {
		/*la contravvenzione viene istanziata nel momento in cui
		viene invocato il metodo; prima non avrebbe senso*/
		Contravvenzione c = new Contravvenzione();
		this.listaContravvenzioni.add(c);		
	}
	
	public void eliminaContravvenzione(Contravvenzione c) {
		this.listaContravvenzioni.remove(c);		
	}
	
	//---SETTER & GETTER---
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Vector<Contravvenzione> getListaContravvenzioni() {
		return listaContravvenzioni;
	}

	public void setListaContravvenzioni(Vector<Contravvenzione> listaContravvenzioni) {
		this.listaContravvenzioni = listaContravvenzioni;
	}

	@Override
	public String toString() {
		return "Vigile [nome=" + nome + ", matricola=" + matricola + 
				", listaContravvenzioni=" + listaContravvenzioni
				+ "]";
	}//TODO sono curioso di vedere in che modo viene stampata la lista delle contravvenzioni
	
	
	
	
	
	

}
