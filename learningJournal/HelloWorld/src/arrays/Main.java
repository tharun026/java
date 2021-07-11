package arrays;

public class Main {
    public static void main(String args[]) {
        int[] inputArray = SortedArray.getIntegers(5);
        SortedArray.printArray(inputArray);
        int[] sortedArray = SortedArray.sortIntegers(inputArray);
        SortedArray.printArray(sortedArray);

        int[] array = {1,2,3,4,5};
        ReverseArray.reverse(array);
     }
}
