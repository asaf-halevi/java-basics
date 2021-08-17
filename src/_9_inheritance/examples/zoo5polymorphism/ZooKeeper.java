package _9_inheritance.examples.zoo5polymorphism;

public class ZooKeeper {

	private static final int NUMBER_OF_ANIMALS = 3;

	private final Animal[] animals;

	public ZooKeeper() {
		animals = new Animal[NUMBER_OF_ANIMALS];
	}

	public void putAnimalsInZoo() {
		//parent can hold a child
		animals[0] = new Dog("Skipper");
		animals[1] = new Fish("Dagi");
		animals[2] = new Spider("Moris");

		//Dog dog = new Animal("Rick");//child cannot hold a parent
	}

	public void orderAnimalsToSayHi() {
		animals[0].sayHi();
		animals[1].sayHi();
		animals[2].sayHi();

		//even better...
//		for (Animal animal : animals){
//			animal.sayHi();
//		}
	}

	public void feedAnimals() {
		//Why won't it work?
//		for (Animal animal : animals){
//			animal.eat();
//		}

		//We have to use casting!
		((Dog) animals[0]).eat();
		((Fish) animals[1]).eat();
		((Spider) animals[2]).eat();


		//What's wrong here?
//		((Dog)animals[2]).eat();


//		for (Animal animal : animals){
//			if (animal instanceof Dog) {
//				((Dog) animal).eat();
//			} else if (animal instanceof Dog) {
//				((Fish) animal).eat();
//			} else if (animal instanceof Dog) {
//				((Spider) animal).eat();
//			}
//		}
	}
}
