package primitivedatatypes;

public class FloatAndDouble {

    public static void main(StringLiteral args[]) {

        float minimumFloatNumber = Float.MIN_VALUE;
        float maximumFloatNumber = Float.MAX_VALUE;
        System.out.println("Minimum Float Number: " + minimumFloatNumber);
        System.out.println("Maximum Float Number: " + maximumFloatNumber);

        double minimumDoubleNumber = Double.MIN_VALUE;
        double maximumDoubleNumber = Double.MAX_VALUE;
        System.out.println("Minimum Double Number: " + minimumDoubleNumber);
        System.out.println("Maximum Double Number: " + maximumDoubleNumber);

        float myFloatNumber = 5f;
        float myFloatNumber2 = 5;
        double myDoubleNumber = 5d;
        double myDoubleNumber2 = 5;

        System.out.println("myDoubleNumber2 = " + myDoubleNumber2);
        System.out.println("myDoubleNumber = " + myDoubleNumber);
        System.out.println("myFloatNumber2 = " + myFloatNumber2);
        System.out.println("myFloatNumber = " + myFloatNumber);
        
        float myFloatNumber3 = 5 / 3f;
        System.out.println("myFloatNumber3 = " + myFloatNumber3);
        double myDoubleNumber3 = 5 / 3d;
        System.out.println("myDoubleNumber3 = " + myDoubleNumber3);

        //challennge
        int pounds = 1;
        double kilogram = 0.45359237 * pounds;
        System.out.println("kilogram = " + kilogram);

        //char and boolean
        char myCharacterValue = 'D';
        System.out.println("myCharacterValue = " + myCharacterValue);
        char myCharacterValue2 = '\u0044';
        System.out.println("myCharacterValue2 = " + myCharacterValue2);
        char myCharacterValue3 = '\u00A9';
        System.out.println("myCharacterValue3 = " + myCharacterValue3);
        
        boolean isStudentAbove18 = true;
        System.out.println("isStudentAbove18 = " + isStudentAbove18);

    }
}
