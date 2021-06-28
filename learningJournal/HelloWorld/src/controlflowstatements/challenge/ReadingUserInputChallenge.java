package controlflowstatements.challenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = 10;
        int count = 1;
        int sum = 0;
        while(count <= number) {
            System.out.println("Enter Number" + count + " : ");
            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                int currentNumber = scanner.nextInt();
                scanner.nextLine();
                sum += currentNumber;
            } else {
                System.out.println("Type a valid number");
                scanner.nextLine();
                continue;
            }
            count++;
        }
        scanner.close();
        System.out.println("Sum of Numbers: " + sum);
    }
}
