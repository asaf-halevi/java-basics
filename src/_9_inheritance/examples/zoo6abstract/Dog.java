package _9_inheritance.examples.zoo6abstract;

public class Dog extends Mammal {

    private int barkingVolume;

    public Dog(String name, int barkingVolume) {
        super(name);
        this.barkingVolume = barkingVolume;
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
