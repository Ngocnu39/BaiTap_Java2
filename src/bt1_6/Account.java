package bt1_6;

public class Account {

    private String accountId;   // ID tài khoản
    private String accountHolder; // Tên chủ tài khoản
    private double balance;      // Số dư tài khoản

    public Account(String accountId, String accountHolder, double initialBalance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = Math.max(initialBalance, 0); // Đảm bảo số dư không âm
    }


    public String getAccountId() {
        return accountId;
    }


    public String getAccountHolder() {
        return accountHolder;
    }


    public double getBalance() {
        return balance;
    }


    public void credit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        balance += amount;
    }


    public void debit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else {
            balance -= amount;
        }
    }


    public void transferTo(Account anotherAccount, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive.");
        }
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else {
            this.debit(amount); // Rút tiền từ tài khoản này
            anotherAccount.credit(amount); // Nạp tiền vào tài khoản khác
        }
    }


    @Override
    public String toString() {
        return "Account[id=" + accountId + ",name=" + accountHolder +
                ",balance=" + balance + "]";
    }
}

