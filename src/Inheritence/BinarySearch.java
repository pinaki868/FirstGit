package Inheritence;

public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,7,9,12,15,17,22,24};
        int length = arr.length;
       int res =  binarySearch(arr,0,length-1,16);
        System.out.println("res "+res);
    }

    public static int binarySearch(int arr[],int low, int max,int search){
        while (low<=max) {
            int med = low + (max - low) / 2;
            if (arr[med] > search) {
                max = med - 1;
            }
            if (arr[med] == search) {
                return med;
            } else {
                low = med + 1;

            }
        }
        return -1;
    }
}
