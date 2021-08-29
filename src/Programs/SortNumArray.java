package Programs;

import java.util.Arrays;

public class SortNumArray {
    int arr[] = {5,8,3,7,6,4};
    int n = arr.length;

    public void sort(){

        for (int i = 0; i < n-1; i++) {
             if (arr[i]>arr[i+1]){
                int p = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = p;
              i = -1;
            }
        }
        System.out.println("Array is"+ Arrays.toString(arr));
    }

    public static void main(String args[]){
        SortNumArray sot = new SortNumArray();
        sot.sort();

    }

}
