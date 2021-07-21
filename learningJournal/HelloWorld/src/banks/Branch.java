package banks;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, transaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getName() == name) {
                return customer;
            }
        }
        return null;
    }


}
