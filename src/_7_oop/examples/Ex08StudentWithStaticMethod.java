package _7_oop.examples;

import javax.naming.SizeLimitExceededException;

public class Ex08StudentWithStaticMethod {
    static final int MAX_NUMBER_OF_STUDENTS = 4;

    static int studentsCounter = 0;

    long id;
    String privateName;
    String familyName;
    Ex04Beast beast;

    public Ex08StudentWithStaticMethod() throws SizeLimitExceededException {
        if (studentsCounter >= MAX_NUMBER_OF_STUDENTS) {
            throw new SizeLimitExceededException("No more students may be added");
        }
        id = ++studentsCounter;
    }

    public Ex08StudentWithStaticMethod(String privateName, String familyName) throws SizeLimitExceededException {
        this();
        this.privateName = privateName;
        this.familyName = familyName;
    }

    public Ex08StudentWithStaticMethod(String privateName, String familyName, Ex04Beast beast) throws SizeLimitExceededException {
        this(privateName, familyName);
        this.beast = beast;
    }

    public static int getNumberOfStudents() {
        return studentsCounter;
    }

    public void printName() {
        System.out.print("My name is " + privateName + " " + familyName + " (id: " + id + ") ");
        if (beast != null) {
            System.out.print("and my beast is a " + beast.race + " called " + beast.name);
        }
        System.out.println();
    }
}
