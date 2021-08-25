package _9_inheritance.examples.zoo1simple;

public class Fish {

    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.getName() + " eats smaller fish");
    }
}
