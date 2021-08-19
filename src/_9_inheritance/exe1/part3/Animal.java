package _9_inheritance.exe1.part3;

public class Animal {

    protected String m_name;
    protected String m_color;

    public Animal(String name, String color) {
        super();
        m_name = name;
        m_color = color;
    }

    public Animal() {
        this("", "");
    }

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
