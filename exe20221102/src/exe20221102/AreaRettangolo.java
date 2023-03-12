package exe20221102;

public class AreaRettangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base, altezza, area;
		base = (float) Math.random()* 100;
		altezza = (float) Math.random()* 100;
		area = base * altezza;
		System.out.println("dato un rettangolo di base " + base + "e altezza " + altezza);
		System.out.println("la sua area risulta " + area);

	}

}
