package _7_oop.examples;

public class Ex02StudentsManagingSystem {
    public static void main(String[] args) {
        Ex02StudentWithConstructor[] students = new Ex02StudentWithConstructor[3];

        //students[0] = new Ex02StudentWithConstructor();
        students[0] = new Ex02StudentWithConstructor(1, "Ramsay", "Bolton");
        students[1] = new Ex02StudentWithConstructor(2, "Arya", "Stark");
        students[2] = new Ex02StudentWithConstructor(3, "Jaime", "Lannister");

        printStudentsList(students);
    }

    private static void printStudentsList(Ex02StudentWithConstructor[] students) {
        System.out.println("\nList of students:");
        for (Ex02StudentWithConstructor student : students) {
            printStudent(student);
        }
    }

    private static void printStudent(Ex02StudentWithConstructor student) {
        System.out.println("id=" + student.id + " | " + student.privateName + " " + student.familyName);
    }
}
