package _9_inheritance.examples.zoo2inheritance;

public class Dog extends Animal {

    public Dog(String name) {
        setName(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats meat");
    }
}
