package _10_interfaces.examples.ex06_java9_private;

public class FrenchCook implements ICookingWithoutPrivateMethods {

    public static void main(String[] args) {
        FrenchCook jeanPaul = new FrenchCook();
        jeanPaul.makeVegetableSoup();
    }
}
