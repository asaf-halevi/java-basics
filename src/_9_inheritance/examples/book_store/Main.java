package _9_inheritance.examples.book_store;

public class Main {
    public static void main(String[] args) {
        Book ilansBook = new Book("0141036133", "Animal Farm", "EN", "George Orwell", 6.8);
        Book ilansNewBook = new Book("0141036133", "Animal Farm", "EN", "George Orwell", 6.8);
        Book oritsBook = new Book("1250316774", "Red, White & Royal Blue", "EN", "Casey McQuiston", 15.63);

        System.out.println(ilansBook);
        System.out.println(oritsBook);

        if (ilansBook.equals(ilansNewBook)) {
            System.out.println("we are the same");
        } else {
            System.out.println("Im not the same book");
        }

//        System.out.println(ilansBook.equals(ilansBook));
//        System.out.println(ilansBook.equals(Book.class.getClass()));
//
//        System.out.println(ilansBook);
//        if (ilansBook.equals(ilansNewBook)) {
//            System.out.println("equal book");
//        } else {
//            System.out.println("non equal book");
//        }
    }
}
