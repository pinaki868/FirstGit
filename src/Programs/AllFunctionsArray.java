package Programs;

import java.util.*;

public class AllFunctionsArray {

    public static void removeDuplicate(int arr3[]){
    //Set set = new HashSet<Integer>();
        int len = arr3.length;
        int coun = 0;
        int t[] = new int[len];
        for (int i = 0; i < arr3.length-1; i++) {
            for (int j = i+1; j < arr3.length; j++) {
                if (arr3[i]==arr3[j]){
                    System.out.println(arr3[i]);
                   // t[coun] = arr3[i];
                    //coun++;
                }
            }
            }
       // System.out.println("set is "+Arrays.toString(t));
    }

    public static void countDuplicates(int arr4[]){
        Map<Integer,Integer> map = new HashMap();
        int count[] = arr4;
        for (Integer i: count
             ) {
            if (!map.containsKey(i)){
                map.put(i,1);
            }
            else {
                map.put(i,(map.get(i))+1);
            }

        }
        for (Map.Entry entry: map.entrySet()
             ) {
            System.out.println("key value is "+entry.getKey()+" "+entry.getValue());
        }
    }

    public static int[] sortArray(int arr2[]){
        int arr[]=arr2;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]){
        int arr[] = {2,1,5,1,3,3};
        //countDuplicates(arr);
        removeDuplicate(arr);
        //int sortedArr[] = sortArray(arr);
        //System.out.println(Arrays.toString(sortedArr));
    }
}
