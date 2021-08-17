package _9_inheritance.examples.zoo5polymorphism;

public class Dog extends Animal {

    private int barkingVolume;

    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats meat");
    }

    public void bark() {
        System.out.println(getName() + "'s barking volume is " + barkingVolume);
    }

    public int getBarkingVolume() {
        return barkingVolume;
    }

    public void setBarkingVolume(int barkingVolume) {
        this.barkingVolume = barkingVolume;
    }
}
