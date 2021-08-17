package _10_interfaces.examples.ex01_only_implements;

public class Superman implements Flyable {

    @Override
    public void fly() {
        System.out.println("I change my outfit before I fly");
    }
}
