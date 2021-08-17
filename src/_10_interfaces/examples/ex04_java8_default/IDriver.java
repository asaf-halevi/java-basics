package _10_interfaces.examples.ex04_java8_default;

public interface IDriver {

    void turnOnEngineSequence();

    default void putInPlace() {
        System.out.println("Park your vehicle");
    }
}
