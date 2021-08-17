package _10_interfaces.examples.ex03_multi_implementations;

public class ZooKeeper {

    private static final int NUMBER_OF_ANIMALS = 5;

    private final Animal[] animals;

    public ZooKeeper() {
        animals = new Animal[NUMBER_OF_ANIMALS];
    }

    public void putAnimalsInZoo() {
        animals[0] = new Duck("Donald");
        animals[1] = new Tiger("Lily");
        animals[2] = new GoldFish("Nemo");
        animals[3] = new Vulture("Snow");
        animals[4] = new FlyingFish("Pearl");
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
