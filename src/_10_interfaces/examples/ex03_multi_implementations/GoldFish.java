package _10_interfaces.examples.ex03_multi_implementations;

public class GoldFish extends Animal implements Swimmable {

    public GoldFish(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("I am a Gold Fish");
    }

    @Override
    public void eat() {
        System.out.println("I eat Goldfish food");
    }

    @Override
    public void swim() {
        System.out.println("I swim well");
    }
}
