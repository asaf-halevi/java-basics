package _10_interfaces.examples.ex03_multi_implementations;

public class ZooKeeperUser {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.putAnimalsInZoo();
        for (Animal animal : zooKeeper.getAnimals()) {
            animal.sayHi();
            animal.eat();
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Runnable) {
                ((Runnable) animal).run();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
            System.out.println("-----------------");
        }
    }
}
