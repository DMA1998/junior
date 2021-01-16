package algorithms.binarysearch2;

public class Binary2 {

    public static void main(String[] args) {
        int[] array = {2,3,4,10,40};
        int n = array.length - 1;
        int key = 10;
        int result = binarySearch(array,0,n - 1, key);

        if(result == -1) {
            System.out.println("Element was not found");
        }else {
            System.out.println("Element found at index: " + result);
        }
    }

   static int binarySearch(int[] array, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the
            // middle itself
            if (array[mid] == key)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (array[mid] > key)
                return binarySearch(array, low, mid - 1, key);

            // Else the element can only be present
            // in right subarray
            return binarySearch(array, mid + 1, high, key);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}