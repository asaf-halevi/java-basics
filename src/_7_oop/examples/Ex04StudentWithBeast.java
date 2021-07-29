package _7_oop.examples;

public class Ex04StudentWithBeast {
    long id;
    String privateName;
    String familyName;
    Ex04Beast beast;

    public Ex04StudentWithBeast() {
    }

    public Ex04StudentWithBeast(long id, String privateName, String familyName) {
        this.id = id;
        this.privateName = privateName;
        this.familyName = familyName;
    }

    public Ex04StudentWithBeast(long id, String privateName, String familyName, Ex04Beast beast) {
        this(id, privateName, familyName);
        this.beast = beast;
    }
}
