package _10_interfaces.examples.ex03_multi_implementations;

public class Tiger extends Animal implements Swimmable, Runnable {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("I am a Tiger");
    }

    @Override
    public void eat() {
        System.out.println("I eat other animals");
    }

    @Override
    public void swim() {
        System.out.println("I can swim when I have to");
    }

    @Override
    public void run() {
        System.out.println("I run very well");
    }
}
