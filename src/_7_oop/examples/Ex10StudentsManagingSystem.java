package _7_oop.examples;

import javax.naming.SizeLimitExceededException;

public class Ex10StudentsManagingSystem {
    public static void main(String[] args) throws SizeLimitExceededException {
        System.out.println("Welcome to " + Ex10StudentsManagingSystem.class.getName());

        Ex10StudentWithEncapsulation[] students = new Ex10StudentWithEncapsulation[4];

        System.out.println("Beginning to enlist students\n");

        students[0] = new Ex10StudentWithEncapsulation("ra", "Bolton");
        students[0].id = 0;
        students[1] = new Ex10StudentWithEncapsulation("Arya", "Stark", new Ex04Beast("Nymeria", "Direwolf"));
        students[2] = new Ex10StudentWithEncapsulation("Jaime", "Lannister");
        students[3] = new Ex10StudentWithEncapsulation("Daenerys", "Targaryen", new Ex04Beast("Drogon", "Dragon"));

        printStudentsList(students);

        System.out.println("\nCurrent number of students is: " + Ex10StudentWithEncapsulation.getNumberOfStudents());
    }

    private static void printStudentsList(Ex10StudentWithEncapsulation[] students) {
        System.out.println("\nList of students:");
        for (Ex10StudentWithEncapsulation student : students) {
            student.printName();
        }
    }
}
