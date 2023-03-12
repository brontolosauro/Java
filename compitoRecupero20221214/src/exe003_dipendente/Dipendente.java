package exe003_dipendente;

public class Dipendente {
	
	private String nome;
	private double stipendio;
	private boolean specializzato;
	
	public Dipendente(String nome, double stipendio) {
		this.nome = nome;
		this.stipendio = stipendio;
	}
	
	public void aumentaStipendio(int percent) {
		if (percent>=10 && percent<=50) {
			double aumento = this.stipendio * percent/100.0;
			this.stipendio += aumento;
			
		}else {
			System.out.println("hai inserito un valore fuori dai limiti. aumento non applicato.");
		}
	}

	public void specializzatoSi() {
		this.specializzato = true;
	}
	
	public void specializzatoNo() {
		this.specializzato = false;
	}
	
	public void stampaDipendente() {
		System.out.print(this.nome+", "+this.stipendio+", ");
		if (specializzato) {
			System.out.println("specializzato.");
		}else {
			System.out.println("non specializzato.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getStipendio() {
		return stipendio;
	}


	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public boolean isSpecializzato() {
		return specializzato;
	}

	public void setSpecializzato(boolean specializzato) {
		this.specializzato = specializzato;
	}
	
	
	
	

}
