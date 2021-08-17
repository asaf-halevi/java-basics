package _10_interfaces.examples.ex02_extends_and_implements;

public class Airplane extends Vehicle implements Flyable {

    @Override
    public void fly() {
        System.out.println("I use my engines to fly");
    }

    @Override
    public void useFuel() {
        System.out.println("The fuel I require is jet-fuel");
    }
}
