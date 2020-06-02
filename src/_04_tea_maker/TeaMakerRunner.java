package _04_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {

		TeaBag tea = new TeaBag("mint");

		Kettle kettle = new Kettle();

		Cup cup = new Cup();

		kettle.boil();

		kettle.getWater().isHot();		
		cup.makeTea(tea, kettle.getWater());

	}

}
