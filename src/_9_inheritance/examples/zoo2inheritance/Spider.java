package _9_inheritance.examples.zoo2inheritance;

public class Spider extends Animal {

    public Spider(String name) {
        setName(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats flies");
    }

}
