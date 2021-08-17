package _10_interfaces.examples.ex06_java9_private;

public interface ICookingWithPrivateMethods {

    default void boilEggs(int numberOfEggs) {
        System.out.println("Put " + numberOfEggs + " eggs in the pot");
        boilWater(5);
        System.out.println("Turn off the stove");
    }

    default void makeVegetableSoup() {
        System.out.println("Put vegetables in the pot");
        boilWater(60);
        System.out.println("Turn off the stove");
    }

    private void boilWater(int minutes) {//may be static as well
        System.out.println("Fill the pot with water");
        System.out.println("Turn on the stove");
        System.out.println("Wait until the water boils");
        System.out.println("Lower the heat");
        System.out.println("Wait " + minutes + " minutes");
    }
}
