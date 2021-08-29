package Programs;

import java.util.Arrays;

public class RemoveDuplicateArrray {

    public static void main(String args[]){
        int arr[] = {1,2,1,3,1,100};
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                largest = arr[i];
            }

            if (arr[i] < smallest){
                smallest = arr[i];
            }
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            //System.out.println("this is "+arr[i]);
        }
        System.out.println("largest is "+largest+" and smallest is "+smallest);
        System.out.println(" sorted array is "+ Arrays.toString(arr));


    }

}
