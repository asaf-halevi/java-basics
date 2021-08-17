package _10_interfaces.examples.ex04_java8_default;

public interface IHammerUser {

    default int getHammerWeight() {
        return 2;
    }

    default void putInPlace() {
        System.out.println("Put the hammer in the tool box");
    }
}
