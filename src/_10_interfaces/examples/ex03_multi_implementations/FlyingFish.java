package _10_interfaces.examples.ex03_multi_implementations;

public class FlyingFish extends Animal implements Swimmable, Flyable {

    public FlyingFish(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("I am a Flying Fish");
    }

    @Override
    public void eat() {
        System.out.println("I eat plankton");
    }

    @Override
    public void swim() {
        System.out.println("I swim well");
    }

    @Override
    public void fly() {
        System.out.println("I fly over water");
    }
}
