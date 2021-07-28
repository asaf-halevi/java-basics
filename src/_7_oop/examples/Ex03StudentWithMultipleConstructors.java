package _7_oop.examples;

public class Ex03StudentWithMultipleConstructors {
    long id;
    String privateName;
    String familyName;

    public Ex03StudentWithMultipleConstructors() {
    }

    public Ex03StudentWithMultipleConstructors(long id, String privateName, String familyName) {
        this.id = id;
        this.privateName = privateName;
        this.familyName = familyName;
    }
}
