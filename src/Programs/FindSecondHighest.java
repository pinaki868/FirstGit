package Programs;

import java.util.Arrays;

public class FindSecondHighest {
    public static void main(String args[]){
        int arr[] = {4,10,1,8,4,6,3,12};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
