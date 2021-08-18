package _10_interfaces.examples.ex05_java8_default;

public class TankDriver extends Person implements IHammerUser, IDriver {

    @Override
    public void whoAmI() {
        System.out.println("I am a tank driver. I'm using a " + this.getHammerWeight() + " pound hammer");
    }

    @Override
    public int getHammerWeight() {
        return 22;
    }

    @Override
    public void turnOnEngineSequence() {
        System.out.println("Wear helmet");
        System.out.println("Turn on 24 volt switch");
        System.out.println("Turn starter switch to electric heating mode");
        System.out.println("Turn starter switch on");
    }

    //CONFLICT! Won't work if the following method isn't implemented
    @Override
    public void putInPlace() {
        IDriver.super.putInPlace();
    }
}
