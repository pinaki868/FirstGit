package Programs;

import java.util.Arrays;

public class ShiftZeroesToEnd {
    public static void main(String args[]) {
        int unsorted[] = {1, 2, 3, 0, 2, 0, 8, 0, 9, 11, 0};

        System.out.println(Arrays.toString(shift(unsorted)));
    }

    public static int[] shift(int array[]) {

        if (array.length == 1) {
            return array;
        }
        int counter = 0;
        int array3[] = new int[array.length];
        for (int p : array
        ) {
            if (p != 0) {
                array3[counter] = p;
                counter++;

            }


        }
        return array3;

    }
}
