package _9_inheritance.examples.zoo6abstract;

public class Fish extends Animal {

    private int swimmingSpeed;

    public Fish(String name, int swimmingSpeed) {
        super(name);
        this.swimmingSpeed = swimmingSpeed;
    }

    public void eat() {
        System.out.println(this.getName() + " eats smaller fish");
    }

    public void swim() {
        System.out.println(getName() + "'s swimming speed is " + swimmingSpeed);
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
