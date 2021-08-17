package _10_interfaces.examples.ex01_only_implements;

public class Bird implements Flyable {

    private int numberOfWings;

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = Math.min(numberOfWings, MAX_NUMBER_OF_WINGS);
    }

    @Override
    public void fly() {
        System.out.println("I use my wings to fly");
    }
}
