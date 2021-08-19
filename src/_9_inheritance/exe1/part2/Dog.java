package _9_inheritance.exe1.part2;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    // Override Methods

    public void makeSound() {
        System.out.println("Wraf!");
    }

    public String toString() {
        return "Dog [m_name=" + m_name + ", m_color=" + m_color + "]";
    }

}
