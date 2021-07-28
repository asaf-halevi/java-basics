package _7_oop.examples;

public class Ex04StudentsManagingSystem {
    public static void main(String[] args) {
        Ex04StudentWithBeast[] students = new Ex04StudentWithBeast[4];

        students[0] = new Ex04StudentWithBeast(1, "Ramsay", "Bolton");
        students[1] = new Ex04StudentWithBeast(2, "Arya", "Stark", new Ex04Beast("Nymeria", "Direwolf"));
        students[2] = new Ex04StudentWithBeast(3, "Jaime", "Lannister");
        students[3] = new Ex04StudentWithBeast(4, "Daenerys ", "Targaryen", new Ex04Beast("Drogon", "Dragon"));

        printStudentsList(students);
    }

    private static void printStudentsList(Ex04StudentWithBeast[] students) {
        System.out.println("\nList of students:");
        for (Ex04StudentWithBeast student : students) {
            printStudent(student);
        }
    }

    private static void printStudent(Ex04StudentWithBeast student) {
        System.out.print("id=" + student.id + " | " + student.privateName + " " + student.familyName);
        if (student.beast != null) {
            System.out.print(" | Beast: " + student.beast.name + " (" + student.beast.race + ")");
        }
        System.out.println();
    }
}
