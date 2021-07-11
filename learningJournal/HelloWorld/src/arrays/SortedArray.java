package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int length) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + length + " integer values:\r");
        int[] inputArray = new int[length];
        for (int i = 0; i < length; i++) {
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedIntegers = Arrays.copyOf(array, array.length);

        for (int i = 0; i < sortedIntegers.length - 1; i++) {
            for (int j = i + 1; j < sortedIntegers.length; j ++) {
                if (i != j) {
                    if (sortedIntegers[i] < sortedIntegers[j]) {
                        int temp = sortedIntegers[i];
                        sortedIntegers[i] = sortedIntegers[j];
                        sortedIntegers[j] = temp;
                    }
                }
            }
        }
        return sortedIntegers;
    }
}
