package _7_oop.examples;

public class Ex03StudentWithMultipleConstructors {
    long id;
    String privateName;
    String familyName;

    public Ex03StudentWithMultipleConstructors() {
    }

    public Ex03StudentWithMultipleConstructors(long id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Id must be positive");
        }
    }

    public Ex03StudentWithMultipleConstructors(long id, String privateName, String familyName) {
        this(id);
        this.privateName = privateName;
        this.familyName = familyName;
    }
}
