package exe20230301_scuola;

public class Studente extends Persona{
	private String matricola;
	private double votoMedio;
	
	public Studente(String nome, String cognome, String matricola, double votoMedio) {
		super(nome, cognome);
		this.matricola = matricola;
		this.votoMedio = votoMedio;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Studente [matricola=" + matricola + ", votoMedio=" + votoMedio + "]";
	}

	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public double getVotoMedio() {
		return votoMedio;
	}
	public void setVotoMedio(double votoMedio) {
		this.votoMedio = votoMedio;
	}
	
	
	
}
