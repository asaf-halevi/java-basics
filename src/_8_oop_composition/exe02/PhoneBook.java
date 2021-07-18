package _8_oop_composition.exe02;

public class PhoneBook {

    private static final int DEFAULT_CAPACITY = 10;
    private Contact[] contacts;

    public PhoneBook(int capacity) {
        this.contacts = new Contact[capacity];
    }

    public PhoneBook() {
        this(DEFAULT_CAPACITY);
    }

    public void addContacat(Contact newContact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = newContact;
                return;
            }
        }
        throw new RuntimeException("Phone book is full - Cannot add new contact");
    }

    public String getName(String number) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getNumber().equals(number)) {
                return contacts[i].getName();
            }
        }
        return null;
    }

    public String getNumber(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equals(name)) {
                return contacts[i].getNumber();
            }
        }
        return null;
    }

    public void deleteContact(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equals(name)) {
                contacts[i] = null;
                System.out.println("Contact [" + name + "] deleted");
                return;
            }
        }
        System.out.println("Contact [" + name + "] could not be found");
    }

    @Override
    public String toString() {
        String res = "Contacts:\n";
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                continue;
            }
            res += contacts[i] + "\n";

        }
        return res;

    }
}
