package _4_flow_control.exe07;

import java.util.Scanner;

/**
 * Write a java program that reads a student�s 3 exam scores.
 * Then it calculates the average of them and prints the final grade:
 * <p>
 * - if the average score >= 90: grade=A
 * - if the average score >= 70 and < 90: grade=B
 * - if the average score >= 50 and < 70: grade=C
 * - if the average score < 50: grade=F
 *
 * @author Tal Green
 */
public class Grades {

    public static void main(String[] args) {
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        double avg = 0;
        String finalGrade = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        score1 = in.nextInt();

        System.out.print("Enter score 2: ");
        score2 = in.nextInt();

        System.out.print("Enter score 3: ");
        score3 = in.nextInt();

        // Calculate the average score
        avg = (score1 + score2 + score3) / 3;

        if (avg >= 90) {
            finalGrade = "A";
        } else if (avg < 90 && avg >= 70) {
            finalGrade = "B";
        } else if (avg < 70 && avg >= 50) {
            finalGrade = "C";
        } else {
            finalGrade = "F";
        }

        System.out.println("Your avarage is " + avg + " and your final grade is: " + finalGrade);
    }

}
