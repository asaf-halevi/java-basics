package _7_oop.examples;

public class Ex05StudentWithBeastAndMethods {
    long id;
    String privateName;
    String familyName;
    Ex04Beast beast;

    public Ex05StudentWithBeastAndMethods() {
    }

    public Ex05StudentWithBeastAndMethods(long id, String privateName, String familyName) {
        this.id = id;
        this.privateName = privateName;
        this.familyName = familyName;
    }

    public Ex05StudentWithBeastAndMethods(long id, String privateName, String familyName, Ex04Beast beast) {
        this.id = id;
        this.privateName = privateName;
        this.familyName = familyName;
        this.beast = beast;
    }

    public void printName() {
        System.out.print("My name is " + privateName + " " + familyName + " (id: " + id + ") ");
        if (beast != null){
            System.out.print("and my beast is a " + beast.race + " called " + beast.name);
        }
        System.out.println();
    }
}
