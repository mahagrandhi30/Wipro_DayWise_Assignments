package bank;

import java.util.ArrayList;
import java.util.List;

public class BankBranch {
    private String branchName;
    private List<Customer> customers = new ArrayList<>();

    public BankBranch(String branchName) {
        this.branchName = branchName;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void showAllCustomers() {
        System.out.println("Customers at " + branchName + " branch:");
        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getName() + ", ID: " + customer.getCustomerId());
            customer.showAccounts();
            System.out.println();
        }
    }
}
