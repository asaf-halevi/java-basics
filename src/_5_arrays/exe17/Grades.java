package _5_arrays.exe17;

import java.util.Scanner;

/**
 * At a school, each class have 2 exams. The final grade is the highest score between the 2 exams.
 * <p>
 * Write a Java program the reads the number of students in a class then reads the grades of the first exam to an array �grade1�.
 * Then it reads the grades of the second exam to an array �grades2.
 * <p>
 * The program will fill another array �finalGrade� with the final grade for each student.
 * <p>
 * The output should be the 2 grades for each student and the final grade for each student.
 *
 * @author Tal Green
 */
public class Grades {

    public static void main(String[] args) {
        int numOfStudents;
        double[] grade1;
        double[] grade2;
        double[] finalGrades;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of students on the class: ");
        numOfStudents = in.nextInt();

        grade1 = new double[numOfStudents];
        grade2 = new double[numOfStudents];
        finalGrades = new double[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Please type 2 grades for student " + (i + 1) + "/" + numOfStudents + ":");
            grade1[i] = in.nextDouble();
            grade2[i] = in.nextDouble();

            finalGrades[i] = Math.max(grade1[i], grade2[i]); // find the max grade
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " grades: " + grade1[i] + ", " + grade2[i]);
            System.out.println("Final grade: " + finalGrades[i]);
        }
    }

}
