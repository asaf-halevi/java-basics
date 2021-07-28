package _7_oop.examples;

public class Ex01StudentsManagingSystem {
    public static void main(String[] args) {
        Ex01Student[] students = new Ex01Student[3];

        students[0] = new Ex01Student();
        students[0].id = 1;
        students[0].privateName = "Ramsay";
        students[0].familyName = "Bolton";

        students[1] = new Ex01Student();
        students[1].id = 2;
        students[1].privateName = "Arya";
        students[1].familyName = "Stark";

        students[2] = new Ex01Student();
        students[2].id = 3;
        students[2].privateName = "Jaime";
        students[2].familyName = "Lannister";

        printStudentsList(students);
    }

    private static void printStudentsList(Ex01Student[] students) {
        System.out.println("\nList of students:");
        for (Ex01Student student : students) {
            printStudent(student);
        }
    }

    private static void printStudent(Ex01Student student) {
        System.out.println("id=" + student.id + " | " + student.privateName + " " + student.familyName);
    }
}
