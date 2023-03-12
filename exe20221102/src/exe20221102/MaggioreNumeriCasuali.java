package exe20221102;


public class MaggioreNumeriCasuali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, maggiore;
		a = (int) Math.rint(Math.random()*50);
		b = (int) Math.rint(Math.random()*50);
		c = (int) Math.rint(Math.random()*50);
		//a = Math.random()*50;
		//b = Math.random()*50;
		//c = Math.random()*50;
		System.out.format("a=%d, b=%d, c=%d %n", a, b, c);
		
		maggiore = Math.max(a, Math.max(b, c));
		
		System.out.format("maggiore=%d %n", maggiore);

	}

}
