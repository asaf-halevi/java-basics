package _7_oop.exe01;

public class CarFactory {
    public static void main(String[] args) {
        // Create red Mazda 3
        Car mazda;
        mazda = new Car();
        mazda.setType("Mazda 3");
        mazda.setColor("Red");

        // Create white Subaro justy
        Car subaro = new Car();
        subaro.setType("Subaro Justy");
        subaro.setColor("White");

        // Print the type and color of the 2 cars
        System.out.println("Mazda: " + mazda.getType() + ", " + mazda.getColor());
        System.out.println("Subaro: " + subaro.getType() + ", " + subaro.getColor());

    }

}
