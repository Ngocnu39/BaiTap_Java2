package bt2_1;

public class TestMain {
        public static void main(String[] args) {
            Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
            System.out.println(ahTeck);

            Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
            System.out.println(dummyBook);

            dummyBook.setPrice(29.95);
            dummyBook.setQty(28);

            System.out.println("Tên sách: " + dummyBook.getName());
            System.out.println("Giá sách: " + dummyBook.getPrice());
            System.out.println("Số lượng: " + dummyBook.getQty());
            System.out.println("Tác giả: " + dummyBook.getAuthor());

            System.out.println("Tên tác giả: " + dummyBook.getAuthorName());
            System.out.println("Email tác giả: " + dummyBook.getAuthorEmail());
            System.out.println("Giới tính tác giả: " + dummyBook.getAuthorGender());

            Book anotherBook = new Book("More Java",
                    new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
            System.out.println(anotherBook);
        }
    }


