package Programs;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String args[]){
        int a[]= {1,2,3};
        int b[]= {4,5,6,7,1};

        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int c[] = new int[c1];

        for (int i = 0; i < c1; i++) {
            if (i < a1){
                c[i] = a[i];
            }
            else {
                c[i] = b[i-a1];
            }
        }
        System.out.println(Arrays.toString(c));

    }

}
