package _7_exceptions.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex01CheckExceptionReadFileWithFinally {
    public static void main(String[] args) {
        try {
            printTextFile();
        } catch (IOException e) {
            System.err.println("An exception occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("\nThis line will be executed regardless if an exception was caught or not");
        }
    }

    private static void printTextFile() throws IOException {
        FileReader file = new FileReader("./resources/a.txt");//change to b.txt and see what happens...
        BufferedReader fileInput = new BufferedReader(file);

        String line;
        while ((line = fileInput.readLine()) != null) {
            System.out.println(line);
        }

        fileInput.close();
    }
}
