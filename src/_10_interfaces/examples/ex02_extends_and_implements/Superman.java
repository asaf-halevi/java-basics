package _10_interfaces.examples.ex02_extends_and_implements;

public class Superman extends SuperHero implements Flyable {

    @Override
    public void fly() {
        System.out.println("I change my outfit before I fly");
    }

    @Override
    public void useSecretIdentity() {
        System.out.println("Hi, I am Clark Kent");
    }
}
