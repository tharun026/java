package methods;

public class ForLoop {
    public static void main(String args[]) {
        int counter = 0;
        for(int i = 1; i < 10; i++) {
            boolean isPrime = isPrime(i);
            if(isPrime) {
                counter++;
                System.out.println("Number " + i + " is a Prime Number");
            } else {
                System.out.println("Number " + i + " is not a Prime Number");
            }

            if(counter == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
