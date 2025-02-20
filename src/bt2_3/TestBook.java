package bt2_3;

public class TestBook {
    public static void main(String[] args) {
        // Khởi tạo danh sách tác giả
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com");
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com");

        // Tạo đối tượng Book với nhiều tác giả
        Book javaDummy = new Book("12345", "Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

        // Kiểm thử các phương thức
        javaDummy.setPrice(22.99);
        javaDummy.setQty(150);
        System.out.println(javaDummy);

        System.out.println("ISBN: " + javaDummy.getIsbn());
        System.out.println("Name: " + javaDummy.getName());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Quantity: " + javaDummy.getQty());
        System.out.println("Author Names: " + javaDummy.getAuthorNames());
    }
}

