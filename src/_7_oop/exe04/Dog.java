package _7_oop.exe04;

public class Dog {
    // Class members
    private String m_breed = "";
    private String m_color = "";
    private int m_age = 0;

    // Constructors
    public Dog() {

    }

    public Dog(String breed, String color, int age) {

        m_breed = breed;
        m_color = color;
        m_age = age;
    }

    // Setters & Getters
    public String getBreed() {
        return m_breed;
    }

    public void setBreed(String breed) {
        m_breed = breed;
    }

    public String getColor() {
        return m_color;
    }

    public void setColor(String color) {
        m_color = color;
    }

    public int getAge() {
        return m_age;
    }

    public void setAge(int age) {
        m_age = age;
    }

    // Class methods

    public void bark() {
        System.out.println("Wraff!");
    }

    public void eat() {
        System.out.println("Yummy");
    }

    public void sleep() {
        System.out.println("Good night...");
    }

}
