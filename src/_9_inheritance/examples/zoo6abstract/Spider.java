package _9_inheritance.examples.zoo6abstract;

public class Spider extends Animal {

	private int webStrength;

	public Spider(String name, int webStrength) {
		super(name);
		this.webStrength = webStrength;
	}

	public void eat() {
		System.out.println(this.getName() + " eats flies");
	}

	public void castWeb() {
		System.out.println(getName() + "'s web's strength is " + webStrength);
	}

	public int getWebStrength() {
		return webStrength;
	}

	public void setWebStrength(int webStrength) {
		this.webStrength = webStrength;
	}

}
