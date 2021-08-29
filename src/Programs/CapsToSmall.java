package Programs;

import java.util.ArrayList;
import java.util.List;

public class CapsToSmall {
    public static void main(String args[]){
        String str = "ABCuytG";
        char c[] = str.toCharArray();
        List<Character> list = new ArrayList<>();
        StringBuilder sbl = new StringBuilder();

        for (Character c2: c
             ) {

            if (Character.isLowerCase(c2)){
             //   list.add(Character.toUpperCase(c2));
                sbl.append(Character.toUpperCase(c2));

            }

            if (Character.isUpperCase(c2)){
              //  list.add(Character.toLowerCase(c2));
                sbl.append(Character.toLowerCase(c2));
            }

        }

        System.out.println("output is "+sbl.toString());


    }

}
