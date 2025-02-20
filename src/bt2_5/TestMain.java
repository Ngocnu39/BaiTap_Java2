package bt2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Alice", 'f');
        System.out.println(c1);

        Account acc1 = new Account(1001, c1, 500.0);
        System.out.println(acc1);

        acc1.deposit(200);
        System.out.println("After deposit: " + acc1);

        acc1.withdraw(100);
        System.out.println("After withdrawal: " + acc1);

        acc1.withdraw(700);
        System.out.println("After trying to withdraw too much: " + acc1);
    }
}

