package bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String customerId;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void showAccounts() {
        System.out.println("Accounts of " + name + ":");
        for (Account acc : accounts) {
            System.out.println("- Account Number: " + acc.accountNumber + ", Balance: ₹" + acc.checkBalance());
        }
    }
}
