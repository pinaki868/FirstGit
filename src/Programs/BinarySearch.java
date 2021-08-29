package Programs;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[]) {
        System.out.println("hi this is running");
        int dArray[] = {1, 3, 5, 7, 2, 9, 11, 15, 6, 8,11};
        int search = 11;
        int sortedArray[] = sortedArray(dArray);
        System.out.println("Sorted array is "+ Arrays.toString(sortedArray));
        int index = binarySearch(sortedArray,0,sortedArray.length-1,search );
        System.out.println("expected value is "+index);
    }

    public static int[] sortedArray(int arr[]) {
        int sorted[] = arr;
        for (int i = 0; i < sorted.length-1; i++) {
            if (sorted[i] > sorted[i + 1]) {
                int temp = sorted[i];
                sorted[i] = sorted[i + 1];
                sorted[i + 1] = temp;
                i = -1;
            }
        }
        return sorted;
    }

    public static int binarySearch(int arr[], int low, int high, int search) {

        while (low <= high) {
            int med = low + (high - low) / 2;
            if (arr[med] == search) {
                return med;
            }
            if (arr[med] > search) {
                high = med - 1;
            } else {
                low = med + 1;
            }

        }
        return -1;
    }
}
