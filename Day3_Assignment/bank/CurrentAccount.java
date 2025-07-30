package bank;

public class CurrentAccount extends Account implements BankOperations {
    private final double OVERDRAFT_LIMIT = 10000.0;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        addTransaction("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (balance - amount >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            addTransaction("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Cannot withdraw. Overdraft limit of ₹" + OVERDRAFT_LIMIT + " exceeded.");
        }
    }
}
