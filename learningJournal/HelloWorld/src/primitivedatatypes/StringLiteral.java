package primitivedatatypes;

public class StringLiteral {

    public static void main(String args[]) {

        String myString = "This is Tharun.";
        System.out.println("myString = " + myString);
        myString = myString + " I am from Chennai.";
        System.out.println("myString = " + myString);
        myString = myString + "\u00A9 2021";
        System.out.println("myString = " + myString);

        //challenge
        double myDoubleValue = 20.00d;
        double myDoubleValue2 = 80.00d;
        double myDoubleTotal = (myDoubleValue + myDoubleValue2) * 100.00d;
        System.out.println("myDoubleTotal = " + myDoubleTotal);
        double myRemainder = myDoubleTotal % 40.00d;
        System.out.println("myRemainder = " + myRemainder);
        boolean isZero = (myRemainder == 0) ? true : false;
        System.out.println("isZero = " + isZero);

        if(!isZero) {
            System.out.println("Got some remainder");
        }

    }
}
