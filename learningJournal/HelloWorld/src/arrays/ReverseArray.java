package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int[] reversedArray = new int[array.length];
        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[i] = array[counter];
            counter++;
        }
        System.out.println("Reversed Array = " + Arrays.toString(reversedArray));
    }
}
