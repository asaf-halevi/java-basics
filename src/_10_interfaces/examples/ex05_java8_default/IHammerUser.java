package _10_interfaces.examples.ex05_java8_default;

public interface IHammerUser {

    default int getHammerWeight() {
        return 2;
    }

    //    void putInPlace();//Adding it will break other classes (no backward compatability)

    default void putInPlace() {//The solution - some default implementation
        System.out.println("Put the hammer in the tool box");
    }
}
