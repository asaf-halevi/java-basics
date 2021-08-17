package _10_interfaces.examples.ex05_java8_static;

public interface IHammerUser {

    static void howToUseHammers() {
        System.out.println("Hold the hammer tightly");
        System.out.println("Lift the hammer upwards");
        System.out.println("Hit hard with the hammer!");
    }

    default int getHammerWeight() {
        return 2;
    }
}
