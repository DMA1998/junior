package algorithms.binarysearch;

import java.util.Scanner;

public class Binary {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128};
        int low = 0;
        int high = array.length - 1;
        System.out.println("Enter element of an array:");
        int requiredNumber = scanner.nextInt();
        binarySearch(array, low, high, requiredNumber);
        choose(array, low, high, requiredNumber);
    }

    private static void choose(int[] array, int low, int high, int key) {
        System.out.println();
        System.out.println("1. Stop");
        System.out.println("2. Continue");
        switch (scanner.nextInt()) {
            case 1:
                break;
            case 2:
                System.out.println("Enter element of an array:");
                binarySearch(array, low, high, scanner.nextInt());
                choose(array, low, high, key);
                break;
            default:
                System.out.println();
                System.out.println("Wrong number.Try again:");
                choose(array, low, high, key);
        }
    }

    private static int binary(int[] array, int low, int high, int key) {
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

    private static boolean isFound(int[] array, int low, int high, int key) {
        if (binary(array, low, high, key) == -1) {
            return false;
        } else {
            return true;
        }
    }

    private static void printBinary(int[] array, int low, int high, int key) {
        if (isFound(array, low, high, key)) {
            System.out.println("Element in index: " + binary(array, low, high, key));
        } else {
            System.out.println("Element was not found");
        }
    }

    private static int value(int[] array, int low, int high, int key) {
        if (isFound(array, low, high, key)) {
            int index = binary(array, low, high, key);
            int value = array[index];
            return value;
        } else {
            return -1;
        }
    }

    private static void valueOfIndex(int[] array, int low, int high, int key) {
        if (value(array, low, high, key) == -1) {
            System.out.println("Value is empty");
        } else {
            System.out.println("Value is: " + value(array, low, high, key));
        }
    }

    private static void binarySearch(int[] array, int low, int high, int key) {
        printBinary(array, low, high, key);
        valueOfIndex(array, low, high, key);
    }
}