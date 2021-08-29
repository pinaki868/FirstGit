package Programs;

import java.util.*;

public abstract class ListChek {

    public static void main(String args[])  {

        try{
            //MyException me = new MyException("hi ists h");
            //throw me;
            int n = 5;
            if (n>6){
                MyException myException = new MyException("n is greater than 5");
                throw myException;
            }
        }
        catch (MyException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block");
        }

    }

    public static String main2(String s){
        Map<String,String> map2 = new HashMap<>();
        String returnV = "";
        for (Map.Entry e: map2.entrySet()
        ) {
           if (e.getKey().equals(s)){
            returnV = e.getValue().toString();
            break;
           }
        }
        return returnV;
    }

    public abstract void main2();
}
