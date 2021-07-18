package _7_oop.exe06;

public class Main {
    public static void main(String[] args) {
        Employee gidi = new Employee();
        gidi.setName("Gidi");
        gidi.setBasicSalary(1000);

        gidi.WhoAmI();
        System.out.println(gidi.calcMonthlySalary());

        Employee dani = new Employee("Dani", 2, 2000);

        dani.WhoAmI();
    }

}
