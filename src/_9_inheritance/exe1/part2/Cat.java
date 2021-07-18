package _9_inheritance.exe1.part2;

public class Cat extends Animal {
    // Constructors
    public Cat() {
        super();
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    // Override Methods
    public void makeSound() {
        System.out.println("Meow");
    }

    public String toString() {
        return "Cat [m_name=" + m_name + ", m_color=" + m_color + "]";
    }
}
