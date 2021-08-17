package _7_oop.examples;

import javax.naming.SizeLimitExceededException;

public class Ex08StudentsManagingSystem {
    public static void main(String[] args) throws SizeLimitExceededException {
        Ex08StudentWithStaticMethod[] students = new Ex08StudentWithStaticMethod[5];

        students[0] = new Ex08StudentWithStaticMethod("Ramsay", "Bolton");
        students[1] = new Ex08StudentWithStaticMethod("Arya", "Stark", new Ex04Beast("Nymeria", "Direwolf"));
        students[2] = new Ex08StudentWithStaticMethod("Jaime", "Lannister");
        students[3] = new Ex08StudentWithStaticMethod("Daenerys", "Targaryen", new Ex04Beast("Drogon", "Dragon"));

        printStudentsList(students);

        System.out.println("\nCurrent number of students is: " + Ex08StudentWithStaticMethod.getNumberOfStudents());//students[3].getMaxNumberOfStudents() ?
    }

    private static void printStudentsList(Ex08StudentWithStaticMethod[] students) {
        System.out.println("\nList of students:");
        for (Ex08StudentWithStaticMethod student : students) {
            student.printName();
        }
    }
}
