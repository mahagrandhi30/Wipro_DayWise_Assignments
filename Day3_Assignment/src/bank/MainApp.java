package bank;

public class MainApp {
    public static void main(String[] args) {
        BankBranch branch = new BankBranch("Hyderabad");

        Customer c1 = new Customer("Ravi", "C001");
        Account sa1 = new SavingsAccount("SA1001", 2000);
        c1.addAccount(sa1);

        Customer c2 = new Customer("Priya", "C002");
        Account ca1 = new CurrentAccount("CA2001", 5000);
        c2.addAccount(ca1);

        sa1.deposit(1000);
        sa1.withdraw(500);
        ca1.withdraw(6000);
        sa1.transfer(ca1, 700);

        branch.addCustomer(c1);
        branch.addCustomer(c2);

        branch.showAllCustomers();
    }
}
