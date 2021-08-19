package _9_inheritance.examples.book_store;

import java.util.Objects;

public class Book {

    public static final double POSTAGE = 2;
    private static int bookCounter = 0;
    private static double sellBalance = 0;
    private String isbn;
    private String name;
    private String language;
    private String author;
    private double price;
    private double discount;
    private boolean isAvailable;
    private boolean isDeliveryRequired;

    public Book(String isbn, String name, String language, String author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.language = language;
        this.author = author;
        if (price <= 0) {
            throw new IllegalArgumentException("Illegal price value!");
        } else {
            this.price = price;
        }
        bookCounter++;
        this.isAvailable = true;
    }

    public Book() {
        bookCounter++;
        this.isAvailable = true;
    }

    public static int getBookCounter() {
        return bookCounter;
    }

    public static double getSellingBalance() {
        return sellBalance;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getAuthor() {
        return author;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isDeliveryRequired() {
        return isDeliveryRequired;
    }

    public void setDeliveryRequired(boolean deliveryRequired) {
        this.isDeliveryRequired = deliveryRequired;
    }

    public double getPrice() {
        double total = price;
        if (this.discount > 0) {
            total = price * discount;
        }
        if (isDeliveryRequired) {
            total += POSTAGE;
        }
        return total;
    }

    public void sellBook() {
        this.isAvailable = false;
        bookCounter--;
        sellBalance += this.getPrice();
    }

    /*public String toString() {
        return this.name;
    }*/

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", isAvailable=" + isAvailable +
                ", isDeliveryRequired=" + isDeliveryRequired +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Double.compare(book.getPrice(), getPrice()) == 0 &&
                Double.compare(book.getDiscount(), getDiscount()) == 0 &&
                isAvailable() == book.isAvailable() &&
                isDeliveryRequired() == book.isDeliveryRequired() &&
                Objects.equals(getIsbn(), book.getIsbn()) &&
                Objects.equals(getName(), book.getName()) && Objects.equals(getLanguage(), book.getLanguage()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn(), getName(), getLanguage(), getAuthor(), getPrice(), getDiscount(), isAvailable(), isDeliveryRequired());
    }

    /*@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Book)) {
            return false;
        }

        Book a = (Book) obj;
        return Double.compare(price, a.price) == 0 &&
                isbn.equals(a.isbn) &&
                name.equals(a.name) &&
                language.equals(a.language) &&
                author.equals(a.author);
    }*/

}
