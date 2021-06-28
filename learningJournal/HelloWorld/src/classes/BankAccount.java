package classes;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int amount) {
        balance += amount;
        System.out.println("Hi " + customerName + "! Your balance is " + balance);
    }

    public void withdrawFunds(int amount) {
        if(amount > balance) {
            System.out.println("Hi " + customerName + "! The amount you want to withdraw " + amount +
                    " is higher than your current balance " + balance);
        } else {
            balance -= amount;
            System.out.println("Hi " + customerName + "! Money successfully withdrawn. Your current balance is " + balance);
        }
    }
}


