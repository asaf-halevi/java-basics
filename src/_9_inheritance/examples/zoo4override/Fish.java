package _9_inheritance.examples.zoo4override;

public class Fish extends Animal {//does not override eat

    private int swimmingSpeed;

    public Fish(String name) {
        setName(name);
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
