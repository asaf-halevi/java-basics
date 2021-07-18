package _9_inheritance.exe1.part2;

public class Animal {
    // Members
    protected String m_name;
    protected String m_color;

    // Constructors
    public Animal() {

    }

    public Animal(String name, String color) {
        super();
        m_name = name;
        m_color = color;
    }

    // Getters & Setters
    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

    public String getColor() {
        return m_color;
    }

    public void setColor(String color) {
        m_color = color;
    }

    public String toString() {
        return "Animal [m_name=" + m_name + ", m_color=" + m_color + "]";
    }

    public void makeSound() {
        System.out.println("? ? ?");
    }

}
