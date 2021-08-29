package Inheritence;

public class Check {
    public static int main2(int a, int b, String what){
     switch (what){
         case "sum":
             return a+b;
         case "diff":
             return a-b;
        }
        return -1;
    }

    public static void main(String args[]){
        int result = main2(10,8,"diff");
        System.out.println("result is "+result);

    }
}
