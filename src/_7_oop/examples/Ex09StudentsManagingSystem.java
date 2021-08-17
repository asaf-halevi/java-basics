package _7_oop.examples;

import javax.naming.SizeLimitExceededException;

public class Ex09StudentsManagingSystem {
    public static void main(String[] args) throws SizeLimitExceededException {
        System.out.println("Welcome to " + Ex09StudentsManagingSystem.class.getName());

        Ex09StudentWithStaticBlock[] students = new Ex09StudentWithStaticBlock[4];

        System.out.println("Beginning to enlist students\n");

        students[0] = new Ex09StudentWithStaticBlock("Ramsay", "Bolton");
        students[1] = new Ex09StudentWithStaticBlock("Arya", "Stark", new Ex04Beast("Nymeria", "Direwolf"));
        students[2] = new Ex09StudentWithStaticBlock("Jaime", "Lannister");
        students[3] = new Ex09StudentWithStaticBlock("Daenerys", "Targaryen", new Ex04Beast("Drogon", "Dragon"));

        printStudentsList(students);

        System.out.println("\nCurrent number of students is: " + Ex09StudentWithStaticBlock.getNumberOfStudents());//students[3].getMaxNumberOfStudents() ?
    }

    private static void printStudentsList(Ex09StudentWithStaticBlock[] students) {
        System.out.println("\nList of students:");
        for (Ex09StudentWithStaticBlock student : students) {
            student.printName();
        }
    }
}
