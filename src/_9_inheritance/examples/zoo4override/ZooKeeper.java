package _9_inheritance.examples.zoo4override;

public class ZooKeeper {
	Dog dog;
	Fish fish;
	Spider spider;

	public void putAnimalsInZoo() {
		dog = new Dog("Skipper");
		fish = new Fish("Dagi");
		spider = new Spider("Moris");
	}

	public void feedAnimals() {
		dog.eat();
		fish.eat();
		spider.eat();
	}
}
