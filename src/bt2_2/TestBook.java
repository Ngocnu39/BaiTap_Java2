package bt2_2;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

        javaDummy.setPrice(29.99);
        javaDummy.setQty(50);

        System.out.println("Book name: " + javaDummy.getName());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Quantity: " + javaDummy.getQty());

        for (Author author : javaDummy.getAuthors()) {
            System.out.println("Author: " + author.getName() + ", Email: " + author.getEmail());
        }
    }
}

