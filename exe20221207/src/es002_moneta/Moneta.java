package es002_moneta;


public class Moneta {
	
	private boolean faccia;
	
	public void lancia() {
		if (Math.random()>=0.5) {
			this.faccia = true;
		}else {
			this.faccia = false;
		}
	}

	public String getFaccia() {
		if (faccia) {
			return "croce";
		}else {
			return "testa";
		}
	}

}
