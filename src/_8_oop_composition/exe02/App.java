package _8_oop_composition.exe02;

public class App {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(5);

        Contact c = new Contact("Gidi", "053-4651232");

        System.out.println(phoneBook);

        phoneBook.addContacat(c);

        System.out.println(phoneBook);

        phoneBook.addContacat(new Contact("Name1", "1234"));
        phoneBook.addContacat(new Contact("Name2", "222222"));
        phoneBook.addContacat(new Contact("Name3", "334444"));
        phoneBook.addContacat(new Contact("Name4", "22222222"));

        System.out.println(phoneBook);

        System.out.println(phoneBook.getName("1234"));
        System.out.println(phoneBook.getNumber("Name4"));

        phoneBook.deleteContact("Name2");
        phoneBook.getNumber("Name2");

        System.out.println(phoneBook);

    }
}
