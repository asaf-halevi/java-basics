package _7_oop.examples;

public class Ex06StudentsManagingSystem {
    public static void main(String[] args) {
        Ex06StudentWithStaticVariable[] students = new Ex06StudentWithStaticVariable[4];

        students[0] = new Ex06StudentWithStaticVariable("Ramsay", "Bolton");
        students[1] = new Ex06StudentWithStaticVariable("Arya", "Stark", new Ex04Beast("Nymeria", "Direwolf"));
        students[2] = new Ex06StudentWithStaticVariable("Jaime", "Lannister");
        students[3] = new Ex06StudentWithStaticVariable("Daenerys", "Targaryen", new Ex04Beast("Drogon", "Dragon"));

        printStudentsList(students);

        System.out.println("\nCurrent number of students is: " + Ex06StudentWithStaticVariable.studentsCounter);
    }

    private static void printStudentsList(Ex06StudentWithStaticVariable[] students) {
        System.out.println("\nList of students:");
        for (Ex06StudentWithStaticVariable student : students) {
            student.printName();
        }
    }
}
