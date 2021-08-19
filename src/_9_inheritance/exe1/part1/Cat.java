package _9_inheritance.exe1.part1;

public class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    // Override Methods
    public void whoAmI() {
        System.out.println("I'm a cat");
    }

    public void makeSound() {
        System.out.println("Meow");
    }

}
