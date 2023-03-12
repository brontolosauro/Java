package es001_dado;

public class Dado {	
	
	private int faccia;
	
	public int getFaccia() {
		return faccia;
	}
	
	public void lancia() {
		this.faccia = (int) Math.rint(Math.random()*7+1);
	}
	
	public void stampaFaccia() {
		System.out.println(this.faccia);		
	}
		
}


