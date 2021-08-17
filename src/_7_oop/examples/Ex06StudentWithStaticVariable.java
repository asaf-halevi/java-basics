package _7_oop.examples;

public class Ex06StudentWithStaticVariable {
    static int studentsCounter = 0;

    long id;
    String privateName;
    String familyName;
    Ex04Beast beast;

    public Ex06StudentWithStaticVariable() {
        id = ++studentsCounter;
    }

    public Ex06StudentWithStaticVariable(String privateName, String familyName) {
        this();
        this.privateName = privateName;
        this.familyName = familyName;
    }

    public Ex06StudentWithStaticVariable(String privateName, String familyName, Ex04Beast beast) {
        this(privateName, familyName);
        this.beast = beast;
    }

    public void printName() {
        System.out.print("My name is " + privateName + " " + familyName + " (id: " + id + ") ");
        if (beast != null) {
            System.out.print("and my beast is a " + beast.race + " called " + beast.name);
        }
        System.out.println();
    }
}
