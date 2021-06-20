package controlflowstatements.challenge;

public class SumFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int sum = number % 10;

        while(number > 9) {
            number /= 10;
        }
        sum += number;
        return sum;
    }
}
