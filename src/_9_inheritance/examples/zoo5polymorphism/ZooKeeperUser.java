package _9_inheritance.examples.zoo5polymorphism;

public class ZooKeeperUser {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.putAnimalsInZoo();
        zooKeeper.orderAnimalsToSayHi();
        zooKeeper.feedAnimals();
    }
}
