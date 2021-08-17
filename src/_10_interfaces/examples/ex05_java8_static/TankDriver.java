package _10_interfaces.examples.ex05_java8_static;

public class TankDriver extends Person implements IHammerUser {

    @Override
    public void whoAmI() {
        System.out.println("I am a tank driver. I'm using a " + this.getHammerWeight() + " pound hammer");
    }

    @Override
    public int getHammerWeight() {
        return 22;
    }
}
