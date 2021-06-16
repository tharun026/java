package primitivedatatypes;

public class DataTypes {

    public static void main(StringLiteral args[]) {
        int maximumIntegerNumber = Integer.MAX_VALUE;
        int minimumIntegerNumber = Integer.MIN_VALUE;
        System.out.println("minimumIntegerNumber = " + minimumIntegerNumber);
        System.out.println("maximumIntegerNumber = " + maximumIntegerNumber);
        //overflow
        System.out.println("Busted MAX value = " + (maximumIntegerNumber + 1));
        
        //byte
        byte minimumByteNumber = Byte.MIN_VALUE;
        byte maximumByteNumber = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Number: " + minimumByteNumber);
        System.out.println("Maximum Byte Number: " + maximumByteNumber);

        //short
        short minimumShortNumber = Short.MIN_VALUE;
        short maximumShortNumber = Short.MAX_VALUE;

        System.out.println("Minimum Short Number: " + minimumShortNumber);
        System.out.println("Maximum Short Number: " + maximumShortNumber);

        //long
        long minimumLongNumber = Long.MIN_VALUE;
        long maximumLongNumber = Long.MAX_VALUE;

        System.out.println("Minimum Long Number: " + minimumLongNumber);
        System.out.println("Maximum Long Number: " + maximumLongNumber);

        byte myByteValue = (byte) (minimumByteNumber / 2);
        short myShortValue = (short) (minimumShortNumber / 2);

        //challenge
        byte myByteNumber = 125;
        short myShortNumber = 30000;
        int myIntNumber = 2_000_000_000;
        long myLongNumber = (50000 + 10 * (myByteNumber + myShortNumber + myIntNumber));
        short myShortTotal= (short) (50000 + 10 *
                (myByteNumber + myShortNumber + myIntNumber));
        System.out.println("My Long Number: " + myLongNumber);
        System.out.println("My Short Total: " + myShortTotal);
    }
}
