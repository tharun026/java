package methods.challenge;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int days = (int) minutes / (60 * 24);
            int year = days / 365;
            days %= 365;
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}
