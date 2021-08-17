package _9_inheritance.examples.zoo6abstract;

public abstract class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHi() {
		System.out.println("Hi, my name is " + name);
	}

	public abstract void eat();
}
