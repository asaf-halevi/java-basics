package _7_oop.exe01;

import java.util.Scanner;

public class CarArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();

            System.out.print("Enter car type: ");
            cars[i].setType(in.nextLine());

            System.out.print("Enter car color: ");
            cars[i].setColor(in.nextLine());
        }

        // print all the cars
        for (Car car : cars) {
            System.out.println("Car: [type: " + car.getType() + ", color: " + car.getColor() + "]");
        }

    }

}
