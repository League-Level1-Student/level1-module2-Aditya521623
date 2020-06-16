package _06_minion;

public class Minion {

	private String name;
	private int eyes;
	private String color;
	private String master;

	Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	String getName() {
		return this.name;
	}

	int getEyes() {
		return this.eyes;
	}

	String getColor() {
		return this.color;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public Object getMaster() {

		return this.master;
	}

}