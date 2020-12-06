package procedural.lesson_01;

import java.util.Arrays;

public class Arrayz {

    public static void main(String[] args) {
        int[] test = {};
        int[] array = {1, 2, 3};
        int[][] doubleArray = {{1,2}, {3,4}, {5,6}};
        int[][] doubleArrayEmpty = {};

        System.out.println("empty array: " + Arrays.toString(test));
        System.out.println("fill array: " + Arrays.toString(array));
        System.out.println("double array Arrays.toString " + Arrays.toString(doubleArray));
        System.out.println("double array Arrays.deepToString: " + Arrays.deepToString(doubleArray));
        System.out.println("double empty array Arrays.deepToString: " + Arrays.deepToString(doubleArrayEmpty));
    }


}
