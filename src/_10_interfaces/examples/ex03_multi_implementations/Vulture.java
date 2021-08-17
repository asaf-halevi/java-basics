package _10_interfaces.examples.ex03_multi_implementations;

public class Vulture extends Animal implements Flyable, Runnable {

    public Vulture(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("I am a Vulture");
    }

    @Override
    public void eat() {
        System.out.println("I eat dead animals");
    }

    @Override
    public void run() {
        System.out.println("I run to gain speed before I fly");
    }

    @Override
    public void fly() {
        System.out.println("I fly higher than all the rest!");
    }
}
