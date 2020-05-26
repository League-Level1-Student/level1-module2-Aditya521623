package _03_smurf;

public class smurfRunner {

	public static void main(String[] args) {
		Smurf handySmurf = new Smurf("Handy Smurf");

		Smurf PapaSmurf = new Smurf("Papa Smurf");

		Smurf Smurfette = new Smurf("Smurfette");

		String name = handySmurf.getName();

		System.out.println(name);

		handySmurf.eat();

		String name2 = PapaSmurf.getName();

		System.out.println(name2);

		System.out.println("Papa Smurf has " + PapaSmurf.getHatColor());

		String name3 = Smurfette.getName();

		System.out.println(name3);

		System.out.println("Smurfette is a " + Smurfette.isGirlOrBoy());

	}

}
