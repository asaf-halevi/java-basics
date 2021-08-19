package _9_inheritance.examples.book_store;

public class BookFactory {
    public static void main(String[] args) {
        Book book1 = new Book("0141036233", "Animal Farm", "EN", "George Orwell", 6.8);
        Book book2 = new Book("0141036133", "Animal Farm", "EN", "George Orwell", 6.8);
        Book book3 = new Book("1250316774", "Red, White & Royal Blue", "EN", "Casey McQuiston", 15.63);
        Book book4 = new Book("9781847941831", "Atomic Habits", "EN", "James Clear", 19);

        /*System.out.println("this is my book: " + book1);
        System.out.println("this is my book: " + book2);
        System.out.println("this is my book: " + book4);*/

        if (book1.equals(book2)) {
            System.out.println("same book");
        } else {
            System.out.println("we are not the same");
        }

    }
}
