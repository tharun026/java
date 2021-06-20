package controlflowstatements.challenge;

public class IsPalindrome {
    public static void main(String args[]) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int numberToCheck = number;
        while(numberToCheck != 0) {
            System.out.println("number = " + numberToCheck + "; reversedNumber = " + reversedNumber);
            int digit = numberToCheck % 10;
            System.out.println(digit);
            reversedNumber = (reversedNumber * 10) + digit;
            System.out.println(reversedNumber);
            numberToCheck /= 10;
        }
        if(reversedNumber == number) {
            return true;
        }
        return false;
    }
}
