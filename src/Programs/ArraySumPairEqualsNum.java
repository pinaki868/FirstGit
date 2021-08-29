package Programs;

public class ArraySumPairEqualsNum {
    public static void main(String args[]){
        int num = 12;
        int arr[] = {1,2,7,1,3,2,4,9,10,6,5,6};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==num){
                    System.out.println("pairs "+arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
