package _7_oop.examples;

public class Ex03StudentsManagingSystem {
    public static void main(String[] args) {
        Ex03StudentWithMultipleConstructors[] students = new Ex03StudentWithMultipleConstructors[3];

        students[0] = new Ex03StudentWithMultipleConstructors();
        students[1] = new Ex03StudentWithMultipleConstructors(2);
        students[2] = new Ex03StudentWithMultipleConstructors(3, "Jaime", "Lannister");

        printStudentsList(students);
    }

    private static void printStudentsList(Ex03StudentWithMultipleConstructors[] students) {
        System.out.println("\nList of students:");
        for (Ex03StudentWithMultipleConstructors student : students) {
            printStudent(student);
        }
    }

    private static void printStudent(Ex03StudentWithMultipleConstructors student) {
        System.out.println("id=" + student.id + " | " + student.privateName + " " + student.familyName);
    }
}
