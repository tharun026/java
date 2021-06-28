import classes.BankAccount;

public class Hello {

    public static void main(String args[]) {
        System.out.println("Hello World!");

        int myFirstNumber = 5;
        System.out.println("My First Variable : " + myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = 6;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("My Total: " + myTotal);

        BankAccount tharun = new BankAccount();
        tharun.setAccountNumber("10001");
        tharun.setBalance(25000);
        tharun.setCustomerName("Tharun Kumar Sekar");
        tharun.setEmail("tharun026@gmail.com");
        tharun.setPhoneNumber("9500753660");

        tharun.depositFunds(2000);
        tharun.withdrawFunds(30000);
    }

}
