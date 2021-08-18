package _10_interfaces.examples.ex01_only_implements;

public interface Flyable {//No constructor! Objects cannot be instantiated, just like abstract classes
    int MAX_NUMBER_OF_WINGS = 6; //considered public static final!

    void fly(); //considered public abstract! Cannot be final!
}
