package _10_interfaces.examples.ex02_extends_and_implements;

public class Bird extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("I use my wings to fly");
    }

    @Override
    public void eat() {
        System.out.println("I eat worms");
    }
}
