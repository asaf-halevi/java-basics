package _8_oop_composition.exe01;

public class App {
    public static void main(String[] args) {
        Address add1 = new Address("Tel-Aviv", "Bugrashov", "22A", "5344222");
        Address add2 = new Address("Rishon", "Saharov", "1", "88557743");

        Date date1 = new Date(3, 8, 2018);
        Date date2 = new Date(5, 8, 2018);

        System.out.println(add1);
        System.out.println(add2);

        System.out.println(date1);
        System.out.println(date2);

        Letter letter1 = new Letter(add1, add2, date1, date2);
        System.out.println(letter1);

        Letter letter2 = new Letter(
                new Address("Hfifa", "Bugrashov", "22A", "5344222"),
                new Address("Tel-Aviv", "Bugrashov", "22A", "5344222"),
                new Date(10, 5, 2018),
                new Date(22, 5, 2018)
        );
        System.out.println(letter2);

    }

}
