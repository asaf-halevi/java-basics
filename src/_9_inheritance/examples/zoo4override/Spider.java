package _9_inheritance.examples.zoo4override;

public class Spider extends Animal {//overrides eat but also calls super

	private int webStrength;

	public Spider(String name) {
		setName(name);
	}

	public void eat() {
		super.eat();
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
