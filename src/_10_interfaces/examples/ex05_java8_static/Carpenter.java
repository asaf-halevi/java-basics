package _10_interfaces.examples.ex05_java8_static;

public class Carpenter extends Person implements IHammerUser {

    @Override
    public void whoAmI() {
        System.out.println("I am a carpenter. I'm using a " + this.getHammerWeight() + " pound hammer");
        IHammerUser.howToUseHammers();
    }
}
