package exe20221026;

public class CostoViaggio {
	
	static float consumoGasolio(int km) {
		float litri100km = 3.2f;
		float gasolioLitro = 1.432f;
		
		return (km/100)*litri100km*gasolioLitro;
		
	}
	
	static float pedaggio(int km) {
		float pedaggio10km = 1.2f;
		
		
		return (km/10)*pedaggio10km;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lunghezzaViaggio = 750;
		float costoViaggio;
		
		costoViaggio = consumoGasolio(lunghezzaViaggio) + pedaggio(lunghezzaViaggio/3*2);
		//System.out.println(costoViaggio);
		System.out.print("costo del viaggio: ");
		System.out.format("%.2f%n", costoViaggio);
	}
}
