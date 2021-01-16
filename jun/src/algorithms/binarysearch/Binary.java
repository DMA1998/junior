package algorithms.binarysearch;

public class Binary {

    private static final int KEY = 4;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int first = array[0];
        int last = array[array.length - 1];
        int result = binarySearch(array, first, last,KEY);

        System.out.println(result);
    }

    public static int binarySearch(int[] sortedArray, int first, int last, int key) {
        int index = -1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (key > sortedArray[middle]) {
                first = middle + 1;
            } else if (key < sortedArray[middle]) {
                last = middle - 1;
            } else if (key == sortedArray[middle]) {
                index = middle;
                break;
            }
        }
        return index;
    }
}

