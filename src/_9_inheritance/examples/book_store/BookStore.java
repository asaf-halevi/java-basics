package _9_inheritance.examples.book_store;

public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book("0141036133", "Animal Farm", "EN", "George Orwell", 6.8);
        Book book2 = new Book("9781847941831", "Atomic Habits", "EN", "James Clear", 19);
        Book book3 = new Book("1250316774", "Red, White & Royal Blue", "EN", "Casey McQuiston", 15.63);

        System.out.println(Book.getBookCounter());
        System.out.println(Book.getSellingBalance());
        System.out.println("The price of " + book1.getName() + " is: " + book1.getPrice());
        book1.setDiscount(0.8);
        System.out.println("The price of Book1 is: " + book1.getPrice());
        book1.setDeliveryRequired(true);
        System.out.println("The price of Book1 is: " + book1.getPrice());

        book1.sellBook();
        System.out.println(Book.getBookCounter());
        System.out.println(Book.getSellingBalance());
    }
}
