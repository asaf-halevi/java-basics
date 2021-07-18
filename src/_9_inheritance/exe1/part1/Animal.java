package _9_inheritance.exe1.part1;

public class Animal {
    // Members
    private String m_name;
    private String m_color;

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

    public void whoAmI() {
        System.out.println("Im generic Animal");
    }

    public void makeSound() {
        System.out.println("? ? ?");
    }

}
