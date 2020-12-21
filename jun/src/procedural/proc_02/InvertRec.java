package procedural.proc_02;

import java.util.Arrays;

public class InvertRec {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] forSwap = {3,7,2,5};
        swap(forSwap,forSwap[1],forSwap[2]);
    }


    public static void run() {
        System.out.println("cannot run final method");
    }

    public static void swap(int[] array,int fst,int sec) {

        int temp = array[fst];
        array[fst] = array[sec];
        array[sec] = temp;

        System.out.println(Arrays.toString(array));
    }


    public static void invertion(int[] array) {
        for (int i = array.length / 2; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " -> ");
        loopInverted(array);
        System.out.print(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void loopInverted(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void invertedRecursive(int[] array, int k) {
        if (k < array.length / 2) {
            int temp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = temp;
            invertedRecursive(array, k + 1);
        }
    }
}
