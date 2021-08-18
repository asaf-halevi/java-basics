package _10_interfaces.examples.ex07_java9_private;

public class FrenchCook implements ICookingWithPrivateMethods {

    public static void main(String[] args) {
        FrenchCook jeanPaul = new FrenchCook();
        jeanPaul.makeVegetableSoup();
        System.out.println();
        jeanPaul.boilEggs(2);
    }
}
