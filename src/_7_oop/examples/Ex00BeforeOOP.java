package _7_oop.examples;

import java.util.Arrays;

public class Ex00BeforeOOP {

    public static void main(String[] args) {
        long[] studentId = {1, 2, 3, 4};
        String[] privateName = {"Ramsay", "Arya", "Jaime"};
        String[] familyName = {"Bolton", "Stark", "Lannister"};

        printStudentsList(studentId, privateName, familyName);
        //        sortStudentsByFamilyName(familyName);
        //        printStudentsList(studentId, privateName, familyName);
    }

    private static void printStudentsList(long[] studentId, String[] privateName, String[] familyName) {
        System.out.println("\nList of students:");
        for (int i = 0; i < studentId.length; i++) {
            System.out.println("id=" + studentId[i] + " | " + privateName[i] + " " + familyName[i]);
        }
    }

    private static void sortStudentsByFamilyName(String[] familyName) {
        Arrays.sort(familyName);
    }
}
