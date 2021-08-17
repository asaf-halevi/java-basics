package _10_interfaces.examples.ex03_multi_implementations;

public class Duck extends Animal implements Flyable, Runnable, Swimmable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("I am a Duck");
    }

    @Override
    public void eat() {
        System.out.println("I eat fish");
    }

    @Override
    public void swim() {
        System.out.println("I swim with my legs");
    }

    @Override
    public void run() {
        System.out.println("Sometimes I run");
    }

    @Override
    public void fly() {
        System.out.println("I fly quit well");
    }
}
