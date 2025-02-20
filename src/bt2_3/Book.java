package bt2_3;
import java.util.Arrays;

public class Book {
    private String isbn;
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String isbn, String name, Author[] authors, double price) {
        this.isbn = isbn;
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String isbn, String name, Author[] authors, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (Author author : authors) {
            names.append(author.getName()).append(", ");
        }
        return names.substring(0, names.length() - 2);
    }

    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + ",authors=" + Arrays.toString(authors) +
                ",price=" + price + ",qty=" + qty + "]";
    }
}

