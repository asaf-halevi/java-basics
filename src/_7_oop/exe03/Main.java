package _7_oop.exe03;

public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair();
        pair.setNum1(10);
        pair.setNum2(15);

        pair.printSum();

        int sum = pair.getSum();
        System.out.println("getSum returned: " + sum);

        System.out.println("The max is: " + pair.getMax());
    }
}
