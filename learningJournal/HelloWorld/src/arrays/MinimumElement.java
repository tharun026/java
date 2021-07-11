package arrays;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:\r");
        return scanner.nextInt();
    }

    private static int[] readElements(int noOfEntries) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements:\r");
        int[] array = new int[noOfEntries];
        for (int i = 0; i < noOfEntries; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minimumElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimumElement > array[i]) {
                minimumElement = array[i];
            }
        }
        return minimumElement;
    }
}
