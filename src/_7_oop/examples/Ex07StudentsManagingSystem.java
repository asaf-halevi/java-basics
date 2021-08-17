package _7_oop.examples;

import javax.naming.SizeLimitExceededException;

public class Ex07StudentsManagingSystem {
    public static void main(String[] args) throws SizeLimitExceededException {
        Ex07StudentWithStaticFinal[] students = new Ex07StudentWithStaticFinal[5];

        students[0] = new Ex07StudentWithStaticFinal("Ramsay", "Bolton");
        students[1] = new Ex07StudentWithStaticFinal("Arya", "Stark", new Ex04Beast("Nymeria", "Direwolf"));
        students[2] = new Ex07StudentWithStaticFinal("Jaime", "Lannister");
        students[3] = new Ex07StudentWithStaticFinal("Daenerys", "Targaryen", new Ex04Beast("Drogon", "Dragon"));
        students[4] = new Ex07StudentWithStaticFinal("Robert", "Baratheon");

        printStudentsList(students);

        System.out.println("\nCurrent number of students is: " + Ex07StudentWithStaticFinal.studentsCounter);
    }

    private static void printStudentsList(Ex07StudentWithStaticFinal[] students) {
        System.out.println("\nList of students:");
        for (Ex07StudentWithStaticFinal student : students) {
            student.printName();
        }
    }
}
