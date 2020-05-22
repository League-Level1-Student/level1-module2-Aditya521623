package _03_smurf;

public class smurfRunner {

	public static void main(String[] args) {
	Smurf handySmurf = new Smurf("Mr.Handy");
	
	Smurf PapaSmurf = new Smurf("Papa");

	Smurf Smurfette = new Smurf("Smurfette");

	String name = handySmurf.getName();
	
	System.out.println(name);
	
	handySmurf.eat();

	String name2 = PapaSmurf.getName();
	
	System.out.println(name);
	


	String name3 = Smurfette.getName();
	
	System.out.println(name);


	}

}
