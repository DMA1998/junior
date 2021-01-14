package algorithms.binarysearch;

import java.util.Arrays;

public class Binary {
    private final static int REQUIRED_NUMBER = 4;

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int low = array[0];
        int high = array[array.length - 1];
        int c = binarySearch(array,REQUIRED_NUMBER,low,high);

        System.out.println(c);


    }

    public static int binarySearch(int[] sortedArray, int requiredNumber, int first, int last) {
        int result = 0;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (requiredNumber > sortedArray[middle]) {
                first = middle + 1;
            } else if (requiredNumber < sortedArray[middle]) {
                last = middle - 1;
            } else if (requiredNumber == sortedArray[middle]) {
                result = middle;
                break;
            }
        }
        return result;
    }
}

