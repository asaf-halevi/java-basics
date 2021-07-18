package _4_flow_control.exe23;

import java.util.Scanner;

/**
 * We need to convert list of USD prices to ILS prices.
 * <p>
 * Write a Java program that reads the exchange rate and then list of 10 USD prices.
 * <p>
 * The output should be the ILS price for each USD price.
 * The output should be printed after each price.
 *
 * @author Tal Green
 */
public class FX {
    public static void main(String[] args) {
        double rate;
        double price;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter USD/ILS exchange rate: ");
        rate = in.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Please type USD price (" + i + "/10): ");
            price = in.nextDouble();
            System.out.println(price + " USD is " + price / rate + " ILS");
        }

    }

}
