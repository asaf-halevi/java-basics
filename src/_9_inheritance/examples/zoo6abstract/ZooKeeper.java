package _9_inheritance.examples.zoo6abstract;

public class ZooKeeper {

	private static final int NUMBER_OF_ANIMALS = 3;

	private final Animal[] animals;

	public ZooKeeper() {
		animals = new Animal[NUMBER_OF_ANIMALS];
	}

	public void putAnimalsInZoo() {
		//animals[0] = new Animal("Morty");//won't work
		animals[0] = new Dog("Skipper", 2);
		animals[1] = new Fish("Dagi", 7);
		animals[2] = new Spider("Moris", 5);
	}

	public void orderAnimalsToSayHi() {
		for (Animal animal : animals) {
			animal.sayHi();
		}
	}

	public void feedAnimals() {
		for (Animal animal : animals) {
			animal.eat();
		}
	}

	public Animal[] getAnimals() {
		return animals;
	}
}
