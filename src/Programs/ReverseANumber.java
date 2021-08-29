package Programs;

public class ReverseANumber {

    public int reverse(int number){
    int rev=0;
           while (number>0) {

               int p = number % 10;
               rev = rev *10 + p  ;
               number = number/10;
           }
    return rev;
    }

    public static void main(String args[]){

        ReverseANumber ran = new ReverseANumber();
        int a = ran.reverse(1234);
        System.out.println("reverse of the number is "+a);

    }


}
