package _02_sea_creature;

public class seaCreatureRunner {

	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		
		SeaCreature squidward = new SeaCreature("Squidward");

		SeaCreature Patrick = new SeaCreature("Patrick");
		
		String name = spongebob.getName();
		
		System.out.println(name);
		
		spongebob.eat();
		
		spongebob.laugh();
		
		
String name2 = squidward.getName();
		
		System.out.println(name2);
		
		squidward.eat();
		
		squidward.laugh();

String name3 = Patrick.getName();
		
		System.out.println(name3);
		
		Patrick.eat();
		
		Patrick.laugh();


		
	}

}
