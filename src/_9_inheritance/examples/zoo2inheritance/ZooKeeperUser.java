package _9_inheritance.examples.zoo2inheritance;

public class ZooKeeperUser {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.putAnimalsInZoo();
        zooKeeper.feedAnimals();
    }
}
