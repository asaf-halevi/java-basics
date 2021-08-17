package _9_inheritance.examples.zoo4override;

public class Animal {//what happens if final?

	private String name;

	public Animal() { //what happens if removed?
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(this.getName() + " eats something");
	} //what happens if final?
}
