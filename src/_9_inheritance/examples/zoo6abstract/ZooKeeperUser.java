package _9_inheritance.examples.zoo6abstract;

public class ZooKeeperUser {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.putAnimalsInZoo();
        zooKeeper.feedAnimals();
        for (Animal animal : zooKeeper.getAnimals()) {
            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            } else if (animal instanceof Spider) {
                ((Spider) animal).castWeb();
            }
        }
    }
}
