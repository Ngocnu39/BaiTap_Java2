package bt1_6;

public class TestAccount {

    public static void main(String[] args) {

        Account account1 = new Account("A101", "Tan Ah Teck", 88);
        Account account2 = new Account("A102", "Kumar", 0);


        System.out.println(account1);
        System.out.println(account2);


        System.out.println("ID: " + account1.getAccountId());
        System.out.println("Name: " + account1.getAccountHolder());
        System.out.println("Balance: " + account1.getBalance());


        account1.credit(100);
        System.out.println(account1); // In thông tin sau khi nạp tiền


        account1.debit(50);
        System.out.println(account1); // In thông tin sau khi rút tiền


        account1.debit(200); // In ra "Amount exceeded balance"
        System.out.println(account1); // Xem thông tin tài khoản sau khi cố gắng rút


        account1.transferTo(account2, 100); // In ra "Amount exceeded balance"
        System.out.println(account1);
        System.out.println(account2);


        account1.transferTo(account2, 50);
        System.out.println(account1);
        System.out.println(account2);
    }
}

