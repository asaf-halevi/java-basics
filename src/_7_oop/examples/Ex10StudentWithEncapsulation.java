package _7_oop.examples;

import javax.naming.SizeLimitExceededException;

public class Ex10StudentWithEncapsulation {
    private static final int MAX_NUMBER_OF_STUDENTS = 4;

    private static int studentsCounter = 0;

    static {
        System.out.println("Hello!");
        System.out.println("You are now using " + Ex10StudentWithEncapsulation.class.getName());
    }

    public long id;
    private String privateName;
    private String familyName;
    private Ex04Beast beast;
    private boolean isGoodStudent;

    public Ex10StudentWithEncapsulation() throws SizeLimitExceededException {
        if (studentsCounter >= MAX_NUMBER_OF_STUDENTS) {
            throw new SizeLimitExceededException("No more students may be added");
        }
        id = ++studentsCounter;
    }

    public Ex10StudentWithEncapsulation(String privateName, String familyName) throws SizeLimitExceededException {
        this();
        setPrivateName(privateName);
        this.familyName = familyName;
    }

    public Ex10StudentWithEncapsulation(String privateName, String familyName, Ex04Beast beast) throws SizeLimitExceededException {
        this(privateName, familyName);
        this.beast = beast;
    }

    public static int getNumberOfStudents() {
        return studentsCounter;
    }

    public static void setStudentsCounter(int studentsCounter) {
        Ex10StudentWithEncapsulation.studentsCounter = studentsCounter;
    }

    public static int getMaxNumberOfStudents() {
        return MAX_NUMBER_OF_STUDENTS;
    }

    public long getId() {
        return id;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        if (privateName == null || privateName.length() < 2) {
            System.err.println("Invalid name");
            privateName = "NoName";
        }
        this.privateName = privateName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Ex04Beast getBeast() {
        return beast;
    }

    public void setBeast(Ex04Beast beast) {
        this.beast = beast;
    }

    public boolean isGoodStudent() {
        return isGoodStudent;
    }

    public void setGoodStudent(boolean goodStudent) {
        isGoodStudent = goodStudent;
    }

    public void printName() {
        System.out.print("My name is " + privateName + " " + familyName + " (id: " + id + ") ");
        if (beast != null) {
            System.out.print("and my beast is a " + beast.race + " called " + beast.name);
        }
        System.out.println();
    }
}
