package methods;

public class MethodOverloading {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String args[]) {
        double cm = calcFeetAndInchesToCentimeters(7);
        System.out.println(cm);
        double cm1 = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println(cm1);
        System.out.println(getDurationString(100, 0));
        System.out.println(getDurationString(100));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if(feet >= 0 && (inches >=0 || inches <= 12)) {
            int totalInches = (feet * 12) + inches;
            return totalInches * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches >=0 || inches <= 12) {
            return inches * 2.54;
        }
        return -1;
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        minutes %= 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }
}
