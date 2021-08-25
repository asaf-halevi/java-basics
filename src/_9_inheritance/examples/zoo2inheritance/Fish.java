package _9_inheritance.examples.zoo2inheritance;

public class Fish extends Animal {

    public Fish(String name) {
        setName(name);
    }

    public void eat() {

        System.out.println(this.getName() + " eats smaller fish");
    }
}
