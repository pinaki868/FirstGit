package Programs;

import java.util.Arrays;

public class MergeTwoArraysSameSorted {
    public static void main(String args[]){
        int[] a = {1,2,3,4};
        int[] b = {1,5,6};
        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        for (int i = 0; i < c1; i++) {
            if (i<a1){
                c[i] = a[i];
            }
            else {
                c[i] = b[i-a1];
            }
        }
        System.out.println(Arrays.toString(c));

        for (int i = 0; i < c1-1;i++){
            for (int j = 0; j < c1-i-1; j++) {
                if (c[j]>c[j+1]){
                    int temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}