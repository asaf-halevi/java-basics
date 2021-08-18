package _10_interfaces.examples.ex07_java9_private;

public interface ICookingWithoutPrivateMethods {

    default void boilEggs(int numberOfEggs) {
        System.out.println("Put " + numberOfEggs + " eggs in the pot");
        System.out.println("Fill the pot with water");
        System.out.println("Turn on the stove");
        System.out.println("Wait until the water boils");
        System.out.println("Lower the heat");
        System.out.println("Wait 5 minutes");
        System.out.println("Turn off the stove");
    }

    default void makeVegetableSoup() {
        System.out.println("Put vegetables in the pot");
        System.out.println("Fill the pot with water");
        System.out.println("Turn on the stove");
        System.out.println("Wait until the water boils");
        System.out.println("Lower the heat");
        System.out.println("Wait 60 minutes");
        System.out.println("Turn off the stove");
    }
}
