package _9_inheritance.exe3;

import _7_oop.exe06.Employee;

public class Main {

    public static void main(String[] args) {
        Employee dani = new Employee("Dani", 2, 2000);
        TeamLeader alon = new TeamLeader("Alon", 3, 3000, 5);

        dani.WhoAmI();
        alon.WhoAmI();
        System.out.println(alon.calcMonthlySalary());
    }

}
