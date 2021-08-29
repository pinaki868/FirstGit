package Programs;

public class CheckArrayEquals {
    public static void main(String args[]) {
        int a[] = {1, 2, 3};
        int b[] = {1, 2, 2};

        if (a.length==b.length){
            for (int i = 0; i < a.length; i++) {
                if (a[i]!=b[i]){
                    System.out.println("hi");
                }
            }
        }
    }
}
