package banks;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        }
        else {
            Branch branch = new Branch(name);
            branches.add(branch);
            return true;
        }
    }

    public boolean addCustomer(String branch, String customer, double transaction) {
        Branch existingBranch =  findBranch(branch);
        if (existingBranch != null) {
            return existingBranch.newCustomer(customer, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branch, String customer, double transaction) {
        Branch existingBranch =  findBranch(branch);
        if (existingBranch != null) {
            return existingBranch.addCustomerTransaction(customer, transaction);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName() == name) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branch, boolean printTransactions) {
        Branch existingBranch = findBranch(branch);
        if (existingBranch != null) {
            System.out.println("Customer details for branch " + branch);
            for (int i = 0; i < existingBranch.getCustomers().size(); i++) {
                Customer customer = existingBranch.getCustomers().get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (printTransactions == true) {
                    System.out.println("Transactions");
                    for (int j = 0; j < customer.getTransactions().size(); j++) {
                        System.out.println("[" + ( j + 1) + "]  Amount " + customer.getTransactions().get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
