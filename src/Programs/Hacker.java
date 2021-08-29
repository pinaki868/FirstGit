package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Hacker {

    public static void main(String args[]){
        Scanner scan2 = new Scanner(System.in);
        int TestCaseCount = scan2.nextInt();
        Scanner scan = new Scanner(System.in);
       String limits = scan.nextLine();

           String limitArr[] = limits.split(" ");
        if (limitArr.length==TestCaseCount) {
           for (int j = 0; j < TestCaseCount; j++) {
              int limitVal = Integer.parseInt(limitArr[j]);
               for (int i = 1; i <= limitVal; i++) {
                   if (i%3==0 && i%5 == 0){
                       System.out.println("Multiple");
                   }
                   else if (i%3 ==0){
                       System.out.println("Three");
                   }
                   else if (i%5 ==0){
                       System.out.println("Five");
                   }
                   else {
                       System.out.println(i);
                   }
               }
           }
       }
       else{
           System.out.println("please check test case count");
       }

    }

}
