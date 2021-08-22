package miscellaneous;

public class RandomNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            basicRandom();
//           dice();
//           grade();
        }
//        verifyGrade();
    }

    /**
     * prints a number between 0-1
     */
    private static void basicRandom() {
        System.out.println(Math.random());
    }

    /**
     * prints a number between 1-6
     */
    private static void dice() {
        int diceResult = (int) (Math.floor(Math.random() * 6)) + 1;
        System.out.print(diceResult + " ");
    }

    /**
     * prints a number between 0-100
     */
    private static void grade() {
        int diceResult = (int) (Math.floor(Math.random() * 100)) + 1;
        System.out.print(diceResult + " ");
    }

    /**
     * prints a number between 0-100
     */
    private static void verifyGrade() {
        int diceResult;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < 10000; i++) {
            diceResult = (int) (Math.floor(Math.random() * 101));
            minValue = Math.min(minValue, diceResult);
            maxValue = Math.max(maxValue, diceResult);
        }
        System.out.println("The min random grade was: " + minValue);
        System.out.println("The max random grade was: " + maxValue);
    }

}
