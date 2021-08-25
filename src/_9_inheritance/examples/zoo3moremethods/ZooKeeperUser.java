package _9_inheritance.examples.zoo3moremethods;

public class ZooKeeperUser {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.putAnimalsInZoo();
        zooKeeper.feedAnimals();

        System.out.println();

        zooKeeper.dog.setBarkingVolume(5);
        zooKeeper.dog.bark();

        zooKeeper.fish.setSwimmingSpeed(2);
        zooKeeper.fish.swim();

        zooKeeper.spider.setWebStrength(10);
        zooKeeper.spider.castWeb();
    }
}
