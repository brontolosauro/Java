package exe20230301_scuola;

public class Docente extends Persona{
	private String materia;
	private double stipendio;	
	
	public Docente(String nome, String cognome, String materia, double stipendio) {
		super(nome, cognome);
		this.materia = materia;
		this.stipendio = stipendio;
	}
	
	public Docente(String nome, String cognome) {
		super(nome, cognome);
	}

	@Override
	public String toString() {
		return super.toString() + "Docente: [materia=" + materia + ", stipendio=" + stipendio + "]";
	}

	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	
}
