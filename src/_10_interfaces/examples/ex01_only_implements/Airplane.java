package _10_interfaces.examples.ex01_only_implements;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("I use my engines to fly");
    }
}
