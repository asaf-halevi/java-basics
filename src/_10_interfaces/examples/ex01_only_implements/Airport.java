package _10_interfaces.examples.ex01_only_implements;

public class Airport {

    public static void main(String[] args) {
        Flyable[] flyers = new Flyable[3];
        flyers[0] = new Bird();
        flyers[1] = new Airplane();
        flyers[2] = new Superman();

        for (Flyable flyer : flyers) {
            flyer.fly();
        }
    }
}
