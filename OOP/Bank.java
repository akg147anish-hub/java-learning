class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 12345;
        acc.balance = 1000;

        acc.deposit(500);
        acc.withdraw(300);
        acc.displayBalance();
    }
}