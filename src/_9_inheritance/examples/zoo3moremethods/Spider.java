package _9_inheritance.examples.zoo3moremethods;

public class Spider extends Animal {

	private int webStrength;

	public Spider(String name) {
		setName(name);
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
