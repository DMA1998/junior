package procedural.proc_03;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4};
        int[] second = {5, 6, 7, 8, 9};

        int[] array = arrayConnector(first,second);

        System.out.println(Arrays.toString(array));


    }

    public static int[] arrayConnector(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];

        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);

        return result;
    }
}
