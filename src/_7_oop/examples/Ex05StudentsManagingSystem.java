package _7_oop.examples;

public class Ex05StudentsManagingSystem {
    public static void main(String[] args) {
        Ex05StudentWithBeastAndMethods[] students = new Ex05StudentWithBeastAndMethods[4];

        students[0] = new Ex05StudentWithBeastAndMethods(1, "Ramsay", "Bolton");
        students[1] = new Ex05StudentWithBeastAndMethods(2, "Arya", "Stark", new Ex04Beast("Nymeria", "Direwolf"));
        students[2] = new Ex05StudentWithBeastAndMethods(3, "Jaime", "Lannister");
        students[3] = new Ex05StudentWithBeastAndMethods(4, "Daenerys", "Targaryen", new Ex04Beast("Drogon", "Dragon"));

        printStudentsList(students);
    }

    private static void printStudentsList(Ex05StudentWithBeastAndMethods[] students) {
        System.out.println("\nList of students:");
        for (Ex05StudentWithBeastAndMethods student : students) {
            student.printName();
        }
    }
}
