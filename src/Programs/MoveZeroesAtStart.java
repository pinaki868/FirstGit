package Programs;

import java.util.Arrays;

public class MoveZeroesAtStart {
    public static void main(String args[]){
        int arr[] = {1,0,9,6,0,4};
        int n = arr.length;
        int counter = 0;
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i]!=0){
              arr2[n-i-1] = arr[i];
            }
        }
        System.out.println("result is"+ Arrays.toString(arr2));

    }
}
