package _9_inheritance.exe1.part1;

public class Dog extends Animal {
    // Constructors
    public Dog() {
        super();
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    // Override Methods
    public void whoAmI() {
        System.out.println("I'm a dog");
    }

    public void makeSound() {
        System.out.println("Wraf!");
    }

}
