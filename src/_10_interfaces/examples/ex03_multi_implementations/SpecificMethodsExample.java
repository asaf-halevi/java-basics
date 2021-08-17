package _10_interfaces.examples.ex03_multi_implementations;

public class SpecificMethodsExample {

    public static void main(String[] args) {
        SpecificMethodsExample specificMethodsExample = new SpecificMethodsExample();

        Duck duck = new Duck("Donald");
        duck.sayHi();
        specificMethodsExample.makeAnimalFly(duck);
        specificMethodsExample.makeAnimalRun(duck);
        specificMethodsExample.makeAnimalSwim(duck);

        System.out.println();

        FlyingFish fish = new FlyingFish("Marta");
        fish.sayHi();
        specificMethodsExample.makeAnimalFly(fish);
//		specificMethodsExample.makeAnimalRun(fish); //Won't work
        specificMethodsExample.makeAnimalSwim(fish);
    }

    public void makeAnimalFly(Flyable animal) {
        animal.fly();
    }

    public void makeAnimalRun(Runnable animal) {
        animal.run();
    }

    public void makeAnimalSwim(Swimmable animal) {
        animal.swim();
    }

}
