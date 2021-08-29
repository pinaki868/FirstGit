package Programs;

public class LeapYear {

    public LeapYear(){
        System.out.println("hi this is class name "+this.getClass().getName());
    }

    public static void main(String args[]){
        new LeapYear();
        int n = 1600;

        if (n%400==0){
            System.out.println("Number is leap year");
        }

        else if(n%4==0 && n%100!=0){
            System.out.println("Number is leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

    }

}
