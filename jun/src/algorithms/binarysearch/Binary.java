package algorithms.binarysearch;

public class Binary {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128};
        int low = 0;
        int high = array.length - 1;
        int requiredNumber = 4;
        int requiredNumber2 = 32;
        int falseRequiredNumber = 15;

        binarySearch(array, low, high, requiredNumber);
        System.out.println("--------------------------------");
        binarySearch(array, low, high, requiredNumber2);
        System.out.println("--------------------------------");
        binarySearch(array, low, high, falseRequiredNumber);
    }

    static int binary(int[] array, int low, int high, int key) {
        int index = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (key < array[middle]) {
                high = middle - 1;
            } else if (key > array[middle]) {
                low = middle + 1;
            } else if (key == array[middle]) {
                index = middle;
                break;
            }
        }
        return index;
    }

    static boolean isFound(int[] array, int low, int high, int key) {
        if (binary(array, low, high, key) == -1) {
            return false;
        } else {
            return true;
        }
    }

    static void printBinary(int[] array, int low, int high, int key) {
        if (isFound(array, low, high, key)) {
            System.out.println("Element in index: " + binary(array, low, high, key));
        } else {
            System.out.println("Element was not found");
        }
    }

    static int value(int[] array, int low, int high, int key) {
        if (isFound(array, low, high, key)) {
            int index = binary(array, low, high, key);
            int value = array[index];
            return value;
        } else {
            return -1;
        }
    }

    static void valueOfIndex(int[] array, int low, int high, int key) {
        if (value(array, low, high, key) == -1) {
            System.out.println("Value is empty");
        } else {
            System.out.println("Value is: " + value(array, low, high, key));
        }
    }

    static void binarySearch(int[] array, int low, int high, int key) {
        printBinary(array, low, high, key);
        valueOfIndex(array, low, high, key);
    }
}
